(ns pokemones.core
  (:require [clj-http.client :as client]))

(declare codigo-paralelizable)

(defn -main []
  (let [consulta (client/get "https://pokeapi.co/api/v2/pokemon-species?limit=100" {:as :json})
        cuerpo (:body consulta)
        resultados (:results cuerpo)
        direcciones (map :url resultados)
        pokemones (time (doall (codigo-paralelizable direcciones)))]
    (do (run! println pokemones) (shutdown-agents))))

(defn codigo-paralelizable [direcciones]
  (pmap #(-> %
            (client/get ,,, {:as :json})
            :body ,,,
            (select-keys ,,, [:name :shape])) direcciones))

(ns futuros.core)

(def total-numbers 100)
(def thread-count 4)

(defn sum-range [start end]
  (reduce + (range start (inc end))))

(defn -main []
  (let [range-size (int (/ total-numbers thread-count))
        starts (mapv #(inc (* % range-size)) (range thread-count))
        ends (conj (mapv dec (rest starts)) total-numbers)
        futures (map #(future (sum-range %1 %2)) starts ends)
        total-sum (reduce + (map deref futures))]
    (println "La suma total de números del 1 al" total-numbers "es:" total-sum)
    (shutdown-agents)))

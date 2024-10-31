(ns actualizacionmal.core)

(def counter 0)

(defn increment []
  (def counter (inc counter)))

(defn -main []
  (let [t1 (Thread. (fn [] (dotimes [_ 10000] (increment))))
        t2 (Thread. (fn [] (dotimes [_ 10000] (increment))))]
    (.start t1)
    (.start t2)
    (.join t1)
    (.join t2)
    (println counter)))


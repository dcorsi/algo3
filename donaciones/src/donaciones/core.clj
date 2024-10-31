(ns donaciones.core)

(def total-donado (ref 0))
(def cant-donaciones (ref 0))

(defn -main []
  (let [donantes-threads (doall
                        (map (fn [_]
                               (Thread. (fn []
                                          (dosync
                                            (alter total-donado + 10000)
                                            (alter cant-donaciones inc)))))
                             (range 9)))
        total-thread (Thread. (fn []
                                (print (str "Se recolectaron $" @total-donado " en total!\n"))))
        promedio-thread (Thread. (fn []
                                  (when (pos? @cant-donaciones)
                                    (print (str "Donación promedio: $"
                                                (double (/ @total-donado @cant-donaciones)) "\n")))))]
    (doseq [t donantes-threads] (.start t))
    (doseq [t donantes-threads] (.join t))

    (.start total-thread)
    (.join total-thread)

    (.start promedio-thread)
    (.join promedio-thread)))

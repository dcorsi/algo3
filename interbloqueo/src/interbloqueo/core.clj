(ns interbloqueo.core)

(def recurso-l (Object.))
(def recurso-m (Object.))

(defn hilo-a []
  (Thread.
    (fn []
      (locking recurso-l
        (print "Hilo A: Adquirió recurso L\n")(flush)
        (Thread/sleep 2000)
        (print "Hilo A: Esperando por recurso M\n")(flush)
        (locking recurso-m
          (print "Hilo A: Adquirió recurso M\n")(flush))))))

(defn hilo-b []
  (Thread.
    (fn []
      (locking recurso-m
        (print "Hilo B: Adquirió recurso M\n")(flush)
        (Thread/sleep 2000)
        (print "Hilo B: Esperando por recurso L\n")(flush)
        (locking recurso-l
          (print "Hilo B: Adquirió recurso L\n")(flush))))))

(defn -main []
  (let [thread-a (hilo-a)
        thread-b (hilo-b)]
    (.start thread-a)
    (.start thread-b)))

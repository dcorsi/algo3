(ns alternancia.core)

(defn -main []
  (let [my-thread (Thread.
                    (fn []
                      (dotimes [i 10]
                        (print "Hello from new thread\n"))))]
    (.start my-thread)
    (dotimes [i 10]
      (print "Hello from main thread\n"))
    (.join my-thread)
    (print "Bye from main thread\n")))

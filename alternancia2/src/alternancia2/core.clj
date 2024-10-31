(ns alternancia2.core)

(defn -main []
  (let [candado (Object.)
        my-thread (Thread.
                    (fn []
                      (locking candado
                        (dotimes [i 10]
                          (print "Hello from new thread\n")))))]
    (.start my-thread)
    (locking candado
      (dotimes [i 10]
        (print "Hello from main thread\n")))
    (.join my-thread)
    (print "Bye from main thread\n")))

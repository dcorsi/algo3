(ns ejemploThreads.core)

(defn -main []
  (let [my-task (fn [] (println "Hello from new thread") (flush))
        my-thread (Thread. my-task)]
    (.start my-thread)
    (println "Hello from main thread")
    (flush)
    (.join my-thread)
    (println "Bye from main thread")
    (flush)))

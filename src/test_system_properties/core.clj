(ns test-system-properties.core
  (:use [clojure.tools.logging])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
(info "Info")
(debug "debug")
  (println "Hello, World!"))

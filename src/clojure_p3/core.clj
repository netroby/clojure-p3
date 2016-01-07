(ns clojure-p3.core
  (:gen-class))

(defn addTwo
  [a b]
  (+ a b))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!" (addTwo 15 16)))

(defn hello
  [name]
  (println "Hello " name "!"))
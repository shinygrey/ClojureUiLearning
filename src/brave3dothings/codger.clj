(ns brave3dothings.codger)
(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))
(defn codger-speak
  [& whippersnappers]
  (println (map codger-communication whippersnappers)))

(defn no-params
  []
  "I take no parameters!")

(defn one-param
  [x]
  (str "I take one parameter: " x))

(defn two-params
  [x y]
  (println
    (str "First I do " x " then i do " y)))

(str "It was the panda " "in the library " "with a dust buster")

(defn hello [] (println "Hi, World!"))

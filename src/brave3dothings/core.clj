(ns brave3dothings.core
  (:gen-class)
  (:import
    (brave3dothings PiratePhrases)
    (brave3Java One)
    (java.util Date)
    [javax.swing JFrame JLabel JButton]
    [java.awt.event WindowListener]
  )
)

(use 'brave3dothings.codger)
;(require 'brave3dothings.codger)
;(refer 'brave3dothings.codger)



(defn swing []
  (let [frame (JFrame. "Greg frame")
        label (JLabel. "Exit on close")
        button (JButton. "Click Me!")
        ]
    (doto button (.setSize 100 50))
    (doto frame
      (.setSize 300 300)
      (.add label)
      (.add button)
      (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
      ;(.addWindowListener (proxy [WindowListener] [] (windowClosing [evt] (println "Whoop"))))
      (.setVisible true)
      )
  )
)


(defn -main [& args]
  ;(println (System/getProperty "java.version"))
  ;(println (System/getProperty "user.dir"))
  ;(println (Date.))
  ;(PiratePhrases/goodbye)
  ;(One/Speak)
  ;(codger-speak "Billy" "Anne-Marie" "The Incredible Bulk")
  (swing)

  )

;(ns swing (:import [javax.swing JFrame JLabel JButton] [java.awt.event WindowListener]))

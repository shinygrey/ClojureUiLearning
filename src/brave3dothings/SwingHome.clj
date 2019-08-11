(ns brave3dothings.SwingHome
  (:gen-class)
  (:import
    [javax.swing JFrame JLabel JButton JPanel]
    [java.awt.event WindowListener]
    [java.awt GridBagLayout Insets GridBagConstraints]
    )
  )

;https://stuartsierra.com/2010/01/05/taming-the-gridbaglayout

(defmacro set-grid! [constraints field value]
  `(set! (. ~constraints ~(symbol (name field)))
         ~(if (keyword? value)
            `(. GridBagConstraints
                ~(symbol (name value)))
            value)))

(defmacro grid-bag-layout [container & body]
  (let [c (gensym "c")
        cntr (gensym "cntr")]
    `(let [~c (new GridBagConstraints)
           ~cntr ~container]
       ~@(loop [result '() body body]
           (if (empty? body)
             (reverse result)
             (let [expr (first body)]
               (if (keyword? expr)
                 (recur (cons `(set-grid! ~c ~expr
                                          ~(second body))
                              result)
                        (next (next body)))
                 (recur (cons `(.add ~cntr ~expr ~c)
                              result)
                        (next body)))))))))

(def panel
  (doto (JPanel. (GridBagLayout.))
    (grid-bag-layout
      :fill :BOTH, :insets (Insets. 15 15 15 15)
      :gridx 0, :gridy 0
      (JButton. "One")
      :gridy 1
      (JButton. "Two")
      :gridx 1, :gridy 0, :gridheight 2
      (JButton. "Three"))))

(def formStart
  (doto (JFrame. "GridBagLayout Test")
    (.setContentPane panel)
    (.pack)
    (.setVisible true)))


(defn formStart2 []
  (let [frame (JFrame. "Greg frame")
        panel1 (JPanel.)
        label (JLabel. "Exit on close")
        button1 (JButton. "Click Me!")
        ]
    (doto button1 (.setSize 100 50))
    (doto frame
      (.setSize 300 300)
      (.add label)
      (.add button1)
      (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
      ;(.addWindowListener (proxy [WindowListener] [] (windowClosing [evt] (println "Whoop"))))
      (.setVisible true)
      )
    )
  )

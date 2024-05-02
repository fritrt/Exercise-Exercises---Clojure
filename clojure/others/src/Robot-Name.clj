(ns robot-name)

(def rand-num (int (rand 999)))

(defn rand-str [len]
  (apply str (take len (repeatedly #(char (+ (rand 26) 65))))))

(defn robot []
   ;; <- arglist goes here
  ;; your code goes here
  )


(defn robot-name [robot] ;; <- arglist goes here
      ;; your code goes here
  (str (rand-str 2) (str rand-num)))



(defn reset-name [robot] ;; <- arglist goes here
  ;; your code goes here
  )




(ns raindrops)

(defn sound [num]
  (if
    (= 0 (mod num 3)) "Pling"
    (= 0 (mod num 5)) "Plang"
    (= 0 (mod num 7)) "Plong"
    :else (str num)))

(defn convert [num] ;; <- arglist goes here
      ;; your code goes here
  (sound))

(convert 9)
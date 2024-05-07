(ns grains)

(defn square [num] ;; <- arglist goes here
    ;; your code goes here
  (bigint (.pow 2M (dec num))))

(defn square2
  [n]
  (bigint (.pow 2M (dec n))))
(square2 64)
(square 64)

(defn total [num]  ;; <- arglist goes here
    ;; your code goes here
  (apply + (map (square2 (range 1 num)))))

(total 64)
(ns collatz-conjecture)

(defn collatz [num] ;; <- arglist goes here
  ;; your code goes here
  (if (<= num 0)
    (throw (IllegalArgumentException. "Input must be greater than 1"))
    (loop [x num 
           cnt 0]
      (if (> x 1) 
        (recur 
         (if (even? x) 
           (/ x 2)
           (+ (* 3 x) 1))
         (inc cnt))
        cnt))))





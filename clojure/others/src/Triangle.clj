(ns triangle)

(defn is-valid? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (cond
    (and (not= 0 a) (not= 0 b) (not= 0 c))
    (and (>= (+ b c) a) (>= (+ c a) b) (>= (+ a b) c))
    :else false))

(is-valid? 0 0 0)
(and (not= 0 0) (not= 0 0) (not= 0 0))
(and (>= (+ 1 1) 1) (>= (+ 1 1) 1) (>= (+ 1 1) 1))

(defn equilateral? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (if (true? (is-valid? a b c))
    (and (= a b) (= b c) (= a c))
    false))
(equilateral? 0.5 0.5 0.5)
(defn isosceles? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (if (true? (is-valid? a b c))
    (or (= a b) (= b c) (= a c))
    false))
(isosceles? 1 4 4)


(defn scalene? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (if (true? (is-valid? a b c))
     (cond
       (isosceles? a b c) false
       (equilateral? a b c) false
       :else true)
    false))

(scalene? 5 4 6)
(scalene? 7 3 2)
(scalene? 4 4 3)
(ns complex-numbers
  (:import [java.lang Math]))

(defn real [[a b]] ;; <- arglist goes here
  ;; your code goes here
  a)

(defn imaginary [[a b]] ;; <- arglist goes here
  ;; your code goes here
  b)

(defn abs [[a b]] ;; <- arglist goes here
  ;; your code goes here
  (Math/sqrt (+ (Math/pow a 2) (Math/pow b 2))))

(defn conjugate [[a b]] ;; <- arglist goes here
  ;; your code goes here
    [a (- b)])



(defn add [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here 
  [(+ a c) (+ b d)])

(add [1 0] [2 0])
(defn sub [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
  [(- a c) (- b d)])
(sub [0 1] [0 2])

(defn mul [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
  [(- (* a c) (* b d))
   (+ (* b c) (* a d))])

(defn mul [[a b] [c d]]
  [(- (* a c) (* b d))
   (+ (* b c) (* a d))])
(mul [1 2] [3 4])

(defn div [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
  [(/ (+ (* a c) (* b d)) (+ (Math/pow c 2) (Math/pow d 2)))
   (/ (- (* b c) (* a d)) (+ (Math/pow c 2) (Math/pow d 2)))])



(Math/pow 3 2)
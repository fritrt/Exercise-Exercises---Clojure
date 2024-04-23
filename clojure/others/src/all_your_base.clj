(ns all-your-base)

(defn digits [n]
  (when (pos? n)
    (concat (digits (quot n 10))
            [(mod n 10)])))


#_(defn convert [n] ;; <- arglist goes here
  ;; your code goes here
  (reduce + (fn [a b] (Math/pow a b)) digits))



(ns armstrong-numbers)

(defn digits [n]
  (when (pos? n)
    (concat (digits (quot n 10))
            [(mod n 10)])))


(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here
  (let [n (count (digits num))] 
    (= num (int (reduce + (map #(Math/pow % n) (digits num)))))
  ))

(armstrong? 153)
(armstrong? 9)
(armstrong? 1)
(armstrong? 154)


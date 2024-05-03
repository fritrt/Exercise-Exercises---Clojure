(ns sum-of-multiples)

(defn multiples [item level]
  (take-while #(< % level) (iterate #(+ % item) item)))


(defn sum-of-multiples [items level] ;; <- arglist goes here
      ;; your code goes here
  (reduce + (set (mapcat #(multiples % level) items))))


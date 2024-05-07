(ns change)

(defn check [num]
  (cond
    (>= num 100) 100
    (and (< num 100) (> num 25)) 25
    (and (< num 25) (> num 10)) 10
    (and (< num 10) (> num 5)) 5
    :else 1))

(defn issue [num] ;; <- arglist goes here
  ;; your code goes here
  (let [new-num (- num (check num))]
    (reduce (map ((check num) new-num)))))

(issue 40)
(recur)



(check 40)
(check 15)
(check 5)



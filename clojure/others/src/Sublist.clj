(ns sublist)

(defn classify [list1 list2] ;; <- arglist goes here
      ;; your code goes here
  )

(def A [1, 2, 3])
(def B [1, 2, 3, 4, 5])

(= (count A) (count B))
(map #(= %1 %2) A B)
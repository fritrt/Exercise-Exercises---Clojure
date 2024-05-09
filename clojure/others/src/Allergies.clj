(ns allergies)

(def items
  {1 :eggs, 2 :peanuts, 4 :shellfish, 8 :strawberries,
   16 :tomatoes, 32 :chocolate, 64 :pollen, 128 :cats})


(defn allergies [num] ;; <- arglist goes here
  ;; your code goes here
  (if (zero? num)
    []
    [(get items num)]))

(allergies 2)

(bit-and 3 1)

(defn allergic-to? [] ;; <- arglist goes here
  ;; your code goes here
  )



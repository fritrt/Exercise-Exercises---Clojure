(ns strain)

(defn retain [action range] ;; <- arglist goes here
      ;; your code goes here
  (filter #(action %) range))
(map (fn [k] even? (range 6)) )
(map 
 (fn [bool value]
   (assoc)) even? (range 6))

(defn discard [action range] ;; <- arglist goes here
  ;; your code goes here
  (filter #(action %) range))



(defn create-even-map [m]
  (reduce (fn [acc [k v]]
            (if (even? k)
              (assoc acc k v)
              acc))
          {}
          m))


(create-even-map {1 2 3 4 5})

(def even-map (create-even-map my-map))


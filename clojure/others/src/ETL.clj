(ns etl
   (:require [clojure.string :refer [lower-case]]))

 (defn transform [source] ;; <- arglist goes here
  ;; your code goes here
   (into {}
         (for [[score ltrs] source 
               ltr
               ltrs]
           [(lower-case ltr) score])))
 
 (transform {1 ["WORLD"]})
 (transform {2 ["WORLD" "GSCHOOLERS"]})

  (defn transform2 [source] ;; <- arglist goes here
   ;; your code goes here 
    (let [[k v] source]
      (into {} (lower-case v) (k))))

 
 (transform2 {1 ["WORLD"]})

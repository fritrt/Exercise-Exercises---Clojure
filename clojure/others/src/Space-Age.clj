(ns space-age)

(defn on-mercury [num] ;; <- arglist goes here
  ;; your code goes here
  (* num (* (/ 1 31557600) (/ 1 0.2408467))))

(defn on-venus [] ;; <- arglist goes here
  ;; your code goes here
  (* num (* (/ 1 31557600) (/ 1 0.61519726))))

(defn on-earth [num] ;; <- arglist goes here
      ;; your code goes here
  (* num (/ 1 31557600)))

(defn on-mars [] ;; <- arglist goes here
  ;; your code goes here
  (* num (* (/ 1 31557600) (/ 1 1.8808158))))

(defn on-jupiter [] ;; <- arglist goes here
  ;; your code goes here
  (* num (* (/ 1 31557600) (/ 1 11.862615))))

(defn on-saturn [] ;; <- arglist goes here
  ;; your code goes here
  (* num (* (/ 1 31557600) (/ 1 29.447498))))

(defn on-uranus [] ;; <- arglist goes here
  ;; your code goes here
  (* num (* (/ 1 31557600) (/ 1 84.016846))))

(defn on-neptune [] ;; <- arglist goes here
  ;; your code goes here
  (* num (* (/ 1 31557600) (/ 1 164.79132))))

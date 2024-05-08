(ns leap)

(defn check-div-400 [year]
  (if (= 0 (mod year 400))
    true
    false))

(defn check-div-4 [year]
  (if (= 0 (mod year 4))
    true
    false))


(defn leap-year? [year] ;; <- argslist goes here
  ;; your code goes here
  (if (= 0 (mod year 100))
    (check-div-400 year)
    (check-div-4 year)))

(leap-year? 1996)

(defn leap-year?2 [year]
  (cond
    (zero? (mod year 400)) true
    (zero? (mod year 100)) false
    (zero? (mod year 4)) true
    :else false
    ))
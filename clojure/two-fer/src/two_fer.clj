(ns two-fer)

(defn two-fer [& [name]]
  (if name
    (str "One for " name ", one for me.")
    "One for you, one for me."))

(two-fer)"

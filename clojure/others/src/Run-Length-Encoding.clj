(ns run-length-encoding
  (:require [clojure.string :as str]))

(defn frequency [plain-text]
  (map (fn [[k v]] (str v k)) (frequencies (str/split plain-text #""))))
(frequency "XXXXYZ")
(defn no-repetition [plain-text]
  (every? identity (map (fn [[_ v]] (= 1 v)) (frequencies (str/split plain-text #"")))))

(frequencies (str/split "XXXXYZ" #""))
(no-repetition "XXXXYZ")
(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (cond
    (empty? plain-text) plain-text
    (no-repetition plain-text) plain-text
    :else (apply str (frequency plain-text))))

(run-length-encode "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB")
(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text])

(reduce-kv)


(ns run-length-encoding
  (:require [clojure.string :as str]))

(defn frequency [plain-text]
  (mapcat (fn [[k v]] (str k v)) (frequencies (str/split plain-text #""))))


(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (apply str (frequency plain-text)))

(run-length-encode "XYZ")
(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text])

(reduce-kv)


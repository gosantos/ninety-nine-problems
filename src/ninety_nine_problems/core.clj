(ns ninety-nine-problems.core)

(defn get-last-element [list]
  (case (count list)
    0 []
    1 (nth list 0)
    (get-last-element (rest list))))

(defn get-last-two-elements [list]
  (case (count list)
    0 []
    1 []
    2 list
    (get-last-two-elements (rest list))))

(defn find-k-element [list k]
  (case k
    1 (first list)
    (find-k-element (rest list) (- k 1))))
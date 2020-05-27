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

(defn list-size [list]
  (case list
    [] 0
    (+ 1 (list-size (rest list)))))

(defn reverse-list [list]
  (case list
    [] []
    (concat (reverse-list (rest list)) [(first list)])))

(defn palindrome [list]
  (= list (reverse-list list)))

(defn my-flatten [list]
  (if (empty? list)
    []
    (if (vector? (first list))
      (concat (my-flatten (first list)) (my-flatten (rest list)))
      (concat (vector (first list)) (my-flatten (rest list))))))
(ns ninety-nine-problems.core)

(defn last-element-from-a-list [list]
  (case (count list)
    0 []
    1 (nth list 0)
    (last-element-from-a-list (rest list))
    ))

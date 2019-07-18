(ns app.core
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as stest]))

(s/def ::add-spec (s/fspec :args (s/cat :n pos?)
                           :ret number?))
; this also works in clojure
; (def add-spec (s/fspec :args (s/cat :n pos?)
;                       :ret number?))
; (s/def add2 add-spec)

(s/def add2 ::add-spec)
(defn add2 [n]
  (+ n 2))

(s/fdef add3
  :args (s/cat :n pos?)
  :ret number?)
(defn add3 [n]
  (+ n 3))

(stest/instrument)

; does not throw exception with wrong argument
(add2 0)

; throws exception
(add3 0)

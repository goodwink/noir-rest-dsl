(ns noir-rest-dsl.core
  (:use [noir.core :only [defpage]]))

(defmacro get [path args & body]
  `(defpage [:get ~path] ~args ~@body))

(defmacro post [path args & body]
  `(defpage [:post ~path] ~args ~@body))

(defmacro put [path args & body]
  `(defpage [:put ~path] ~args ~@body))

; (defmacro resource [base-path & body]
;   `)
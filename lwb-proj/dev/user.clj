(ns user
  (:require clojure.tools.namespace.repl
            clojure.test
            [clojure.repl :refer :all]
            [proto-repl.saved-values]
            prc))

(defn reset []
  (clojure.tools.namespace.repl/refresh))

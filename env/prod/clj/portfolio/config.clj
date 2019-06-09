(ns portfolio.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[portfolio started successfully]=-"))
   :middleware identity})

(ns clojurescript-ohpointone.core
  (:use noir.core)
  (:require [noir.server :as server]
            [noir.response :as response]))

;; We just start the server here, not even declaring any views.
;;
;;

(defn -main []
  (server/start 8888))

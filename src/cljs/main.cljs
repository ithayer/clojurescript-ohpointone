(ns clojurescript-ohpointone.search
  (:require [jayq.core :as jq])
  (:use [jayq.core :only [$]]))

;; Equivalent to 
;;
;;   $("#btn").click(function() { alert("Hi!"); });
;; 

(jq/bind ($ "#btn") :click (fn [] (js/alert "Hi!")))
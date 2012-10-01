(defproject clojurescript-ohpointone "0.0.1-SNAPSHOT"
  :description "A minimal ClojureScript project."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [noir "1.3.0-beta10"]
                 [jayq "0.1.0-alpha3"]]
  :plugins      [[lein-cljsbuild "0.2.7"]]
  :source-path "src/clj"
  :cljsbuild {:builds
              [{:source-path "src/cljs"
                :compiler {:output-to "resources/public/main.js"
                           ;; If you want to see the generated JS, use:
                           ;;   :optimizations :simple
                           ;;   :pretty-print :true
                           ;;
                           :optimizations :advanced
                           :pretty-print false
                           :externs ["externs/jquery.js"]
                           }}]}
  :main clojurescript-ohpointone.core)


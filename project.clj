(defproject paul931224/reagent-hickory-modified "0.3.8"
  :description "an enhancement of using hickory to generate reagent style hiccup"
  :url "https://github.com/zjhmale/reagent-hickory"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [org.jsoup/jsoup "1.9.2"]
                 [viebel/codox-klipse-theme "0.0.1"]
                 [quoin "0.1.2" :exclusions [org.clojure/clojure]]
                 [org.clojure/clojurescript "1.7.170"]
                 [speclj "3.3.1"]
                 [com.keminglabs/cljx "0.6.0"]]

  :plugins [[lein-cljsbuild "1.1.1"]]

  :cljsbuild {:builds
              {:app {:source-paths   ["src"]
                     :compiler       {:output-to     "target/hickory.js"}}}}


  :source-paths ["src"])

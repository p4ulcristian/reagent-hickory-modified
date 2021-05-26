(ns reagent-hickory.hickory.utils
  (:require
    [clojure.string :as string]
    [goog.string :as gstring]))
;;
;; Data
;;

(def void-element
  "Elements that don't have a meaningful <tag></tag> form."
  #{:area :base :br :col :command :embed :hr :img :input :keygen :link :meta
    :param :source :track :wbr})

(def unescapable-content
  "Elements whose content should never have html-escape codes."
  #{:script :style})

;;
;; String utils
;;


(defn starts-with
  [^String s ^String prefix]
  (goog.string.startsWith s prefix))

(defn lower-case-keyword [s]
  (-> s string/lower-case keyword))

(defn render-doctype [name publicid systemid]
  (str "<!DOCTYPE " name
       (when (not-empty publicid)
         (str " PUBLIC \"" publicid "\""))
       (when (not-empty systemid)
         (str " \"" systemid "\""))
       ">"))

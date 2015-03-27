(ns metadactyl.service.util
  (:use [clojure-commons.core :only [remove-nil-vals]]
        [metadactyl.transformers :only [string->long]])
  (:require [clojure.string :as string])
  (:import [java.util UUID]))

(defn- app-sorter
  [sort-field sort-dir]
  (partial sort-by
           (keyword sort-field)
           (if (and sort-dir (= (string/upper-case sort-dir) "DESC"))
             #(compare %2 %1)
             #(compare %1 %2))))

(defn sort-apps
  [res {:keys [sort-field sort-dir]}]
  (if sort-field
    (update-in res [:apps] (app-sorter sort-field sort-dir))
    res))

(defn apply-offset
  [res params]
  (let [offset (string->long (:offset params "0"))]
    (if (pos? offset)
      (update-in res [:apps] (partial drop offset))
      res)))

(defn apply-limit
  [res params]
  (let [limit (string->long (:limit params "0"))]
    (if (pos? limit)
      (update-in res [:apps] (partial take limit))
      res)))

(defn uuid?
  [s]
  (or (instance? UUID s)
      (re-find #"\A\p{XDigit}{8}(?:-\p{XDigit}{4}){3}-\p{XDigit}{12}\z" s)))

(defn default-search-params
  [params default-sort-field deault-sort-dir]
  (remove-nil-vals
   {:limit          (string->long (:limit params "0"))
    :offset         (string->long (:offset params "0"))
    :sort-field     (keyword (:sort-field params default-sort-field))
    :sort-dir       (keyword (:sort-dir params default-sort-dir))
    :filter         ()
    :include-hidden}))

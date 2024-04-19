(ns teodorlu.slidesbb
  (:require
   [babashka.process :as process]
   [clojure.string :as str]))

(defn ^:private -fzf
  "Choose a thing with fzf

  (fzf [\"apples\" \"pears\" \"pizza\")
  ;; => \"apples\"     ; depending on the user's choice!

  returns nil on failure."
  [choices]
  (let [fzf-result (process/shell {:out :string
                                   :in (str/join "\n" choices)
                                   :continue true}
                                  "fzf")]
    (when (= 0 (:exit fzf-result))
      (str/trim (:out fzf-result)))))

;; slideshow as a function

(defn present [{:keys [root]}]

  )

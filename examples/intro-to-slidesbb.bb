#!/usr/bin/env bb

;; To run from the root of this repo,
;;
;;     (cd examples && bb intro-to-slidesbb.bb)

;; dep for slideshow lib
;; in case you don't just copy the code
(require '[babashka.deps :as deps])
(deps/add-deps '{:deps {io.github.teodorlu/slidesbb {:local/root ".."}}})

;; (I recommend just copying the code, slidesbb is just an encapsulated idea,
;; you might want to tweak how it behaves)

(println "works")

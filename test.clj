
(def test-address
  {:street-address "123 Test Lane"
   :city "Testerville"
   :state "TX"})

  ((fn [[x y] {:keys [street-address city state]}]
    (clojure.string/join ", " (cons (str x " " y) [street-address city state])))
    ["Test" "Testerson"] test-address)


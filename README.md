A minimal example to demonstrates that fspec can't be referred as function spec in clojurescript.

Clojurescript:
* Run: ```clj --main cljs.main --compile app.core --repl```
* Open devtools and see that there is only exception thrown for add3 but not add2

Clojure:
* Run: ```clj src/app/core.cljc```
* You will see an exception for add2

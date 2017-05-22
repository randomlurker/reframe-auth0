# reframe-auth0

A [re-frame](https://github.com/Day8/re-frame) application designed to demonstrate authentication using [Auth0](https://auth0.com/)

Associated tutorials:
- [Part 1](http://randomlurker.eu/clojurescript/re-frame/2017/05/22/re-frame-auth0-authentication.html)
## Development Mode

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Production Build


To compile clojurescript to javascript:

```
lein clean
lein cljsbuild once min
```

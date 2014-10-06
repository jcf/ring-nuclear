# Ring-Nuclear

[![Build Status](https://travis-ci.org/listora/ring-nuclear.svg?branch=master)](https://travis-ci.org/listora/ring-nuclear)

Ring middleware that constantly throws.

This middleware adds a route to your middleware stack that will produce an
exception every time a user visits `/nuclear`.

We use this to enable us to test exceptional circumstances in staging and
production systems, and activate the middleware based on the presence of a
environment variable.

## Installation

Add the following dependency to your `project.clj`:

    [listora/ring-nuclear "0.1.0"]

## License

Copyright © 2014 Listora

Released under the MIT license, same as Ring.

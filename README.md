[![Build Status](https://secure.travis-ci.org/neuland/jade4j-coffeescript-filter.png?branch=master)](http://travis-ci.org/neuland/jade4j-coffeescript-filter)

# A CoffeeScript Filter for Jade4J

See [neuland/jade4j](https://github.com/neuland/jade4j#api-filters) for more information.

## Example

index.jade

```
div
  :coffeescript
    a = ->
      console.log "hallo", "welt"
```

output


```html
<div>
	<script type="text/javascript">
		(function() {
		  var a;
		  a = function() {
		    return console.log("hallo", "welt");
		  };
		}).call(this);
	</script>
</div>
```

## Usage

### via Maven

We are using Github for Maven hosting. Just add this repository ...

```xml
<repositories>
  <repository>
    <id>jade4j-coffeescript-filter-releases</id>
    <url>https://github.com/neuland/jade4j-coffeescript-filter/raw/master/releases</url>
  </repository>
</repositories>
```

... and dependency definitions to your `pom.xml`.

```xml
<dependency>
  <groupId>de.neuland</groupId>
  <artifactId>jade4j-coffeescript-filter</artifactId>
  <version>0.2.0</version>
</dependency>
```

## Author

Michael Geers / [naltatis](https://github.com/naltatis)

Special thanks to [yeungda/jcoffeescript](https://github.com/yeungda/jcoffeescript) for the CoffeeScript Java wrapper.

## License

The MIT License

Copyright (C) 2012 [neuland Büro für Informatik](http://www.neuland-bfi.de/), Bremen, Germany

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
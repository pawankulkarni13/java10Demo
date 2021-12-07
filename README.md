### Java Release Schedule
Every SiX Months Java version rollout happens
Java 10 - March 2018
Support is for six months on feature releases.
Long Term Support marked as LTS. Support will be for 3 years for such candidate version released.

The new pattern of the Version number is:

$FEATURE.$INTERIM.$UPDATE.$PATCH


### Type Reference

var is not a keyword. Works for Local variable.

There is no runtime overhead in using var.

The type of the variable is still inferred at compile time and cannot be changed later.

`var n;` // Error - does not work. No initializer here.

`var list = null` //Error - initializer is 'null'

Use var when code is more readable.
Avoid var in stream pipelines.

More Style Guide on usage of var -
https://openjdk.java.net/projects/amber/guides/lvti-style-guide

`var custList = new ArrayList<>();`
This would create a custList object of List<Object\>

`var custList = new ArrayList<Customer>();`
This would create a Customer ArrayList object for us.

### Unmodifiable Collections
List, Set and Map 'I' now have "copyOf" static method.
This method returns unmodifiable copy of respective collection.

Any modifications to collection would result in UnsupportedOperationException during runtime.

Remember Collectors.toList() ? or Collectors.toSet()
Collectors now has another method to collect a Stream into unmodifiable collection.
toUnmodifiableList()

So how is it different then Collections.unmodifiableList() ? Refer the test method for example in CopyListTest.java


### Optional orElseThrow()
Optional and its derived classes now have a new static method.
orElseThrow()
This NoSuchElementException if no value is present during the stream pipeline execution.

### Other Features
#### Container Awareness
JVMs are now aware of being run in a Docker container.
#### Performance Improvements
#### Root Certs
#### Command Line Tools and Options Removal
javah has been removed and with new java - java -h can be used.
java -Xprofoption has been removed. This was used to profile and send output to stdout. new java - jmap tool can be used.

#### API changes
#### GC updates
#### Thread Local handshakes


Links
https://openjdk.java.net/projects/jdk/10/
```groovy
def myMethod(String param) {
  if (param == null) {
    return "Null input"
  } else if (param.length() == 0) {
    return "Empty input"
  } else {
    return "Input: "+param
  }
}

println myMethod(null) //Output: Null input
println myMethod("") // Output: Empty input
println myMethod("Hello") //Output: Input: Hello
```
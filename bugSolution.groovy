```groovy
def myMethod(String param) {
  if (param == null) {
    return "Null input"
  } else if (param.isEmpty()) {
    return "Empty input"
  } else {
    return "Input: "+param
  }
}

println myMethod(null) //Output: Null input
println myMethod("") // Output: Empty input
println myMethod("Hello") //Output: Input: Hello

//Alternatively using the Elvis operator and the safe navigation operator
def myMethod2(String param) {
  return param?.length() == 0 ? "Empty input" : param ?: "Null input"
}

println myMethod2(null) //Output: Null input
println myMethod2("") // Output: Empty input
println myMethod2("Hello") //Output: Hello
```
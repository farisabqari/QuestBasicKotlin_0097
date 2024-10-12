package com.example.pam_097


fun withoutParameter() {
    println("= without Parameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

// default parameter value
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}
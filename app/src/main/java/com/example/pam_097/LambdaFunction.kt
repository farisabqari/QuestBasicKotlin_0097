package com.example.pam_097

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main(){
    uppercaseString("Hallo")
    println({ string: String -> string.uppercase()}("Hallo"))

}
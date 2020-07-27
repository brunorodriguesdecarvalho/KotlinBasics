/*Write a program that reads four integer numbers from one line and prints them each in a new line. In the input, numbers are separated by one or more spaces.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val num4 = scanner.nextInt()
    println(num1)
    println(num2)
    println(num3)
    println(num4)
}
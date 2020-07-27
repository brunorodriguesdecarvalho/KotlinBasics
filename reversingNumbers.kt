/*

Write a program that reads a three-digit number, reverses the order of its digits, and outputs a new number.

*/


import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val read = scanner.nextInt()
    val u = read%1000/100
    val d = read%100/10
    val c = read%10
    print(c)
    print(d)
    print(u)
}
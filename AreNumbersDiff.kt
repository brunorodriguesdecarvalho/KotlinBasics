/*

Write a program that reads three numbers and checks if they all are different (i.e. no number equals to any other).

The program is to output true or false.

*/

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val res = (num1 != num2 && num2 != num3 && num1 != num3)
    print(res)
}
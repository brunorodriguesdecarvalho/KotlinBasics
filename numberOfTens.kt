/*

There is a non-negative integer N (0 ≤ N ≤ 1000000). Find the number of tens in it (i.e. next to last digit of the number). If there is no next to last digit, you can consider that the number of tens equals to zero.

*/


import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val read = scanner.nextInt()
    val res = read%100/10
    println(res)
}
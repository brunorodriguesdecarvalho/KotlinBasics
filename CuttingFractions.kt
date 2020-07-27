/*Write a program that cuts the fractional part of a number.

Use Double as the input type and Long as the result type since a value can be quite large.

*/


import java.util.*

fun main(args: Array<String>) {
    val magic = 2_000_000_000
    val giant = 3_000_000_000
    val x0 = magic
    val x01 = giant
    val x1 = 100L - magic
    val x2 = magic + magic + 1
    val x3 = giant - magic
    val x4 = (magic + giant) % 10

    println(x0)
    println(x01)
    println(x1)
    println(x2)
    println(x2)
    println(x4)

}
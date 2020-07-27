/*There are the values of the two moments in time on the same day: hours, minutes and seconds for each of the time moments. It is known that the second moment in time happened not earlier than the first one. Find how many seconds passed between these two moments of time.

Input data format

The program gets the input of the three integers: hours, minutes, seconds, defining the first moment of time and three integers that define the second moment time.

Output data format

Output the number of seconds between these two moments of time.
*/


import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val m1 = scanner.nextInt()
    val s1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val m2 = scanner.nextInt()
    val s2 = scanner.nextInt()

    val t1 = (h1*60*60) + (m1*60) + s1
    val t2 = (h2*60*60) + (m2*60) + s2

    val dif = t2-t1
    println(dif)
}
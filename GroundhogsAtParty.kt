/*

Groundhogs like to throw fun parties, and at their parties, they like to eat Reeses peanut butter cups. But not too many Reeses or they will feel sick! A successful groundhog party should have between 10 and 20 Reeses peanut butter cups, inclusive unless it is the weekend. In this case they need 15 to 25 Reeses peanut butter cups, inclusive.

Write a Kotlin program that reads two values:

the first is the number of Reeses peanut butter cups;
the second is a boolean representing whether it is the weekend.
The program must print the boolean value that tells us whether the party is successful.


Sample Input: 
5 true 

Sample Output: 
false 

Sample Input: 
16 false 

Sample Output: 
true 
*/

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val potes = scanner.nextInt()
    val fds: Boolean = scanner.nextBoolean()
    val minfds = 15
    val maxfds = 25
    val minweek = 10
    val maxweek = 20

    val testeMinFDS = potes >= minfds
    val testeMaxFDS = potes <= maxfds
    val testeMinWeek = potes >= minweek
    val testeMaxWeek = potes <= maxweek

    val testissimo = (!fds && testeMinWeek && testeMaxWeek) || (fds && testeMinFDS && testeMaxFDS)
    print(testissimo)
}



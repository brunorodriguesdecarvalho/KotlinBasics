/*In a country, far, far away, elections to the National Assembly is coming soon. This country has one specific feature which is the population grows very fast every year.

You need to write a program that calculates how many people are to be selected to the National Assembly in this elections. The country uses the cube root relationship between the population and assembly size. The fractional number is rounded down not to take an extra person.

The input data of the program is an integer value describing the current population of the country. The output is the recommended size of the Nation Assembly.

Use Math.cbrt(val: Double) function to calculate the cube root of a number. Though, keep in mind, it takes Double and returns Double.*/


import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val pop = scanner.nextInt().toDouble()
    val dep = Math.cbrt(pop).toInt()
    println(dep)
}
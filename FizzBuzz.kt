import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val in1 = scanner.nextInt()
    val in2 = scanner.nextInt()

    for (i in in1..in2) {
        if(i%3==0 && i%5==0) println("FizzBuzz")
        else if(i%3==0) println("Fizz")
        else if(i%5==0) println("Buzz")
        else println(i)
    }
}
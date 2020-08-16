import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val in1:Long = scanner.nextLong()
    val in2:Long = scanner.nextLong()
    var res:Long = 1

    for(i in in1 until in2) {
        res *= i
    }
    print(res)
}
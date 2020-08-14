import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    val r1 = (x > -15) && (x <= 12)
    val r2 = (x > 14) && (x < 17)
    val r3 = x >= 19
    if(r1||r2||r3) print("True") else print("False")
}
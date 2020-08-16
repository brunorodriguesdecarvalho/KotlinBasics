import java.util.Scanner

fun sum(arg1:Int, arg2:Int, arg3:Int): Int {
    return arg1 + arg2 + arg3
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}
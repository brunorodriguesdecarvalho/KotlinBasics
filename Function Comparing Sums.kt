import java.util.*

fun isGreater(arg1:Int, arg2:Int, arg3:Int, arg4:Int):Boolean{
    return (arg1 + arg2) > (arg3 + arg4)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val parts = scanner.nextInt()
    var Large = 0
    var Small = 0
    var Perfect = 0
    repeat(parts) {
        val nota = scanner.nextInt()
        if (nota == 1) Large += 1
        else if (nota == -1) Small += 1
        else if (nota == 0) Perfect += 1
    }
    print("$Perfect $Large $Small")
}
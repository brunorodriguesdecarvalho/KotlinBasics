import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val limA:Int = scanner.nextInt()
    val limB:Int = scanner.nextInt()
    val inN:Int = scanner.nextInt()
    var contador = 0

    for (i:Int in limA..limB) {
        if(i%inN==0) contador++
    }
    println(contador)
}

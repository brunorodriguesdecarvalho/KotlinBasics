import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val students = scanner.nextInt()
    var inD = 0
    var inC = 0
    var inB = 0
    var inA = 0
    repeat(students){
        val nota = scanner.nextInt()
        if (nota==2) {inD += 1}
        else if (nota==3) inC += 1
        else if (nota==4) inB += 1
        else if (nota==5) inA += 1
    }
    print("" + inD + " " + inC + " " + inB + " " + inA)
}
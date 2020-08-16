import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val qtd = scanner.nextInt()
    var check = "no change"
    var ant = 0
    var act = 0

    for (i in 1 .. qtd) {
        var input = scanner.nextInt()
        if (i==1){
            ant = input
        } else {
            act = input
            if(act>ant) check = "YES"
            else check = "NO"
        }
    }

    print(check)

}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val io1 = scanner.next().first()
    val io2 = scanner.next().first()
    val io1min = (io1 - 32)
    val io2min = (io2 - 32)
    val io1max = (io1 + 32)
    val io2max = (io2 + 32)

    if( io1 == io2 || io1min == io2 || io1max == io2 || io1 == io2min || io1min == io2min || io1max == io2min || io1 == io2max || io1min == io2max || io1max == io2max ) {
        print("true")
    } else { print("false") }
}
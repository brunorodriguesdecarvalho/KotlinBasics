import java.util.Scanner

fun isVowel(arg:Char):Boolean{
    val checkA = (arg == '\u0041') || (arg == '\u0061')
    val checkE = (arg == '\u0045') || (arg == '\u0065')
    val checkI = (arg == '\u0049') || (arg == '\u0069')
    val checkO = (arg == '\u004F') || (arg == '\u006F')
    val checkU = (arg == '\u0055') || (arg == '\u0075')

    return checkA || checkE || checkI || checkO || checkU
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}
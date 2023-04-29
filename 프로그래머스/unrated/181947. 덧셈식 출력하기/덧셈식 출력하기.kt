fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    val sum = a + b
    println("$a + $b = $sum")
}
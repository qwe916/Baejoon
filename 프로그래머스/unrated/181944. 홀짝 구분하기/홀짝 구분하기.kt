fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    
    when(a % 2){
        0 -> print("$a is even")
        else -> print("$a is odd")
    }
}
fun main(args: Array<String>) {
    val s1 = readLine()!!
    val chars = s1.toCharArray()
    for (i in chars.indices) {
        val c = chars[i]
        if (c.isLowerCase()) {
            chars[i] = c.toUpperCase()
        } else if (c.isUpperCase()) {
            chars[i] = c.toLowerCase()
        }
    }
    print(String(chars)) 
}
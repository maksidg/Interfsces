fun main() {
    var a = 8
    var b = 5
    when {
        a != b -> {
            val c = a
            a = b
            b = c
        }
    }
    println("a: $a, b: $b")
}

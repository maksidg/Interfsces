fun main() {
    val a: Float = 3.6f
    val b = when {
        a > 0 -> Math.round(a)
        else -> println("Число отрицательное или равно нулю")
    }
    println(b)
}
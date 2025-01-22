fun main() {
    val time = 13
    when(time){
        in 0 .. 5 -> println("$time - Раннее утро")
        in 6 .. 11 -> println("$time - Утро")
        in 12 .. 17 -> println("$time - День")
        in 18 .. 20 -> println("$time - Вечер")
        in 20 .. 23 -> println("$time - Поздний вечер")
        else -> println("Такого времени нет")
    }
}
fun main () {
    val numbers = listOf(4, 45, -2, 8)
    var positive = 0
    for (number in numbers)
        if (number > 0){
           positive++
        }
    println(positive)
    }


fun main(){
    val a : Double = 3.6
    val b : Double = 4.8
    val action = 1
    if (action == 1){
        val c = a + b
        println(c)
    }else if (action == 2){
        val c = a - b
        println(c)
    }else if (action == 3){
        val c = a * b
        println(c)
    }else if (action == 4){
        val c = a / b
        println(c)
    }else{
        println("Ошибка, не такого действия.")
    }
}
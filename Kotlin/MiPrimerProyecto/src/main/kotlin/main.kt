///const val PI = 3.1419
fun main(args: Array<String>) {
    /*println("Hello World!")
    var money = 10
    println(money)
    money = 5
    println(money)
    val name = "Laura"
    //name = "Kike"
    println(name)
    println(PI)

    val boolean = true
    val numberLarge = 3L
    val double = 2.7182
    val float = 1.1f

    val firstValue = 20
    val secondValue = 10
    val thirdValue = firstValue - secondValue
    println(thirdValue)

    val lastName = "Uribe"
    val myName = "kike"
    val completeName = "My Name is  $lastName $myName"
    println(completeName)*/
    /* val name = "ma"
     if (name.isNotEmpty()) println("name.length : ${name.length}")
     else println("isEmpty")

     /** IF **/
     val message = if (name.length > 4) {
         "name large"
     } else if (name.isEmpty()) {
         "isEmpty"
     } else {
         "name no large"
     }
     println(message)*/
    /*val nameColor = "Carmesi"

    when (nameColor){
        "Amarrillo" -> println("Amarrillo")
        "Rojo","Carmesi" -> println("Rojo")
        else -> println("Erorr")
    }
    val code = 200
    when(code){
        in 200..299 ->  println("entre 200..299")
        in 400..500 ->  println("entre 400..500")
        else -> println("Erorr")
    }
    val ShoesSize = 41
    val message = when(ShoesSize){
        41,43 -> "Yes is hear"
        42,44 -> "There is almost no"
        45 -> "There is not"
        else -> "There is not"
    }
    println(message)*/

    /*var accountant = 0
    while (accountant > 0) {
        println("The value is $accountant")
        accountant--
    }
    do {
        println("Generating random number")
        val number = (0..100).random()
        println("number random.....$number")
    } while (number > 50)*/

    val listFruit = listOf("Apple", "Pear", "Peach", "Mango")
    for (fruit in listFruit) println("eat $fruit")
    listFruit.forEach { fruit -> println("forEach eat $fruit") }
    val charCharacters: List<Int> = listFruit.map { fruit -> fruit.length }
    println("charCharacters eat $charCharacters")
    val filterList: List<Int> = charCharacters.filter { char -> char > 4 }
    println("filterList eat $filterList")
}
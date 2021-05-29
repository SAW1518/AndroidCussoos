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
    /* val listFruit = listOf("Apple", "Pear", "Peach", "Mango")
     for (fruit in listFruit) println("eat $fruit")
     listFruit.forEach { fruit -> println("forEach eat $fruit") }
     val charCharacters: List<Int> = listFruit.map { fruit -> fruit.length }
     println("charCharacters eat $charCharacters")
     val filterList: List<Int> = charCharacters.filter { char -> char > 4 }
     println("filterList eat $filterList")*/
    /*
    val name: String? = null
    println(name?.length)
    try {
        throw NullPointerException("Errror aocurrdo nulll")
        name!!.length
    } catch (excepcion: NullPointerException) {
        println("Error")
    } finally {
        println("Error Close app ")
    }
    val firstVal = 10
    val secondVal = 0
    val res: Int = try {
        firstVal / secondVal
    } catch (exception: Exception) {
        0
    }
    println(res)*/
/*
    val name : String? = null
    val crName : Int = name?.length ?: 0
    println(crName)
    */
    /*
    //no mutable
    val listName = listOf("Juan", "Kike", "Cail")
    println(listName)

    val EntryList = mutableListOf<String>()
    EntryList.add("JUAN")
    println(EntryList)

    val valGet = EntryList.get(0)
    println(valGet)
    val valGetWhitOperator = EntryList[0]
    println(valGetWhitOperator)
    val firstValueList: String? = EntryList.firstOrNull()
    println(firstValueList)
    EntryList.removeAt(0)
    println(EntryList)
    EntryList.add("Enrique")
    EntryList.removeIf { char -> char.length > 3 }
    println(EntryList)
    val  myArray = arrayListOf(1,2,3,4)
    //BIT CODE
    println("Array $myArray")
    //To list
    println("Array ${myArray.toList()}")*/
/*
    // Order List
    val numbers = listOf(132321, 232, 265, 456, 524)
    val sorted = numbers.sorted()
    val sortedDescending = numbers.sortedDescending()
    val sortedBy = numbers.sortedBy { number -> number < 50 }
    val sortedRandom = numbers.shuffled()
    val sortedReverse = numbers.reversed()
    val numbersMap = numbers.map { number -> "number $number" }
    val numbersFilter = numbers.filter { number -> number > 400 }
    println(sorted)
    println(sortedDescending)
    println(sortedBy)
    println(sortedRandom)
    println(sortedReverse)
    println(numbersMap)
    println(numbersFilter)
*/

/*
    //NOT mutable
    val ageHero = mapOf(
        "IronMan" to 35,
        "SpiderMan" to 23,
        "Capitan America" to 99,
    )
    println(ageHero)
//YES mutable
    val ageHeroMutable = mutableMapOf(
        "IronMan" to 35,
        "SpiderMan" to 23,
        "Capitan America" to 99,
    )
    println(ageHeroMutable)
    ageHeroMutable["Wonder Woman"] = 45 //or ageHeroMutable.put("Wonder Woman", 45)
    println(ageHeroMutable)
    val ageIronMan = ageHeroMutable["IronMan"]
    println(ageIronMan)
    ageHeroMutable.remove("Wonder Woman")
    println(ageHeroMutable)
    println(ageHeroMutable.keys)
    println(ageHeroMutable.values)*/


}
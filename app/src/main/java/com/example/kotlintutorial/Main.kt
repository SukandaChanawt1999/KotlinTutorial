fun main(args: Array<String>){
//    val lives = 0
//    var isGameOver = (lives < 1)
//    println(isGameOver)
//    if (isGameOver ){
//        println("Game over!")
//    }else{
//        println("You're still alive!")
//    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("age is $age")

    val message: String
    if (age < 18){
        message = "You're too young to vote"
    }else if (age == 100){
        message = "Congratulations"
    }else{
        message = "You can vote"
    }
    println(message)

}
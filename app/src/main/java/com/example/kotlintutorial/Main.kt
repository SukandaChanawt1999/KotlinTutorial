fun main(args: Array<String>){
    val lives = 3
    var isGameOver = (lives < 1)
    println(isGameOver)
    if (isGameOver ){
        println("Game over!")
    }else{
        println("You're still alive!")
    }


}
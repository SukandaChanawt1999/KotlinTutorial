fun main(args: Array<String>){
    val lives = 3
    var isGameOver = (lives < 1)
    if (isGameOver ){
        println("Game over!")
    }else{
        println("You're still alive!")
    }


}
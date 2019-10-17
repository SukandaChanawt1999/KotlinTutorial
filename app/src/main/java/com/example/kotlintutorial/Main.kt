import com.example.kotlintutorial.Player

fun main(args: Array<String>){
    val tim = Player("Tim")
//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)
    tim.show()

    val louise = Player("Louise",5)
    louise.level = 5
    louise.show()

}
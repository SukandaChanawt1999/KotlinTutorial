
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.kotlintutorial.Enemy
import com.example.kotlintutorial.Troll


@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){

    val enemy= Enemy("test enemy",10,3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    print(enemy)

    val uglyTroll = Troll("Ugly Troll",27,1)
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)
}

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.kotlintutorial.Troll
import com.example.kotlintutorial.Vampyre


@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)
}
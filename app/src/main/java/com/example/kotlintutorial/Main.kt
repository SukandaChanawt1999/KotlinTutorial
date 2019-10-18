
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.kotlintutorial.Enemy


@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){

    val enemy= Enemy("test enemy",10,3)
    println(enemy)

}
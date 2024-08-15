import com.lucaspowered.base_physics_simulation.Vector2
import com.lucaspowered.base_physics_simulation.World
import com.lucaspowered.base_physics_simulation.shapes.Circle
import com.raylib.Jaylib.BLACK
import kotlin.math.sin

fun main(){
    val myWorld = World("Hello Circle")
    val myCircle = Circle(BLACK, 25, Vector2(myWorld.width/2, myWorld.height/2))

    myCircle.equation {t -> Vector2(myWorld.width / 2, sin(t as Double) * 100 + myWorld.height / 2)}

    myWorld += myCircle
    myWorld.run()
}
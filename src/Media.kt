import java.util.Date

abstract class Media (
    val titre: String,
    val date: String,
) {
    abstract fun afficher()
}
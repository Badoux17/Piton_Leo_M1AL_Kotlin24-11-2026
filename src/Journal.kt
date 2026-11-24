import java.util.Date

//Class Journal qui héritent de la classe abstrat Media et de l'interface Consultable
class Journal(titre : String, date : String) : Media(titre,date) , Consultable   {

    override fun consulter() {
        println("Le journal '$titre' du '$date' est consulté sur place.")
    }

    override fun afficher() {
        println("- Journal : Titre = '$titre', Date='$date'");
    }

}
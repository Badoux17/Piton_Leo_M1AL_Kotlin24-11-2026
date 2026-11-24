import java.util.Date

class Journal(titre : String, date : String) : Media(titre,date) , Consultable   {

    override fun consulter() {
        println("Le journal '$titre' du '$date' est consulté sur place.")
    }

    override fun afficher() {
        println("- Journal : Titre = '$titre', Date='$date'");
    }

}
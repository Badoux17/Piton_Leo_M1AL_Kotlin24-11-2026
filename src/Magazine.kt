import java.util.Date

class Magazine(titre : String, date : String, private var numero : String) : Media(titre,date), Consultable {

    override fun consulter() {
        println("Le magazine '$titre', numéro '$numero' est consulté sur place.")
    }

    override fun afficher() {
        println("- Magazine : Titre = '$titre', Numéro ='$numero', Date =''$date'");
    }

}
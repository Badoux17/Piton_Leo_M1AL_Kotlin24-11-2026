import java.util.Date


//Class Magazine qui héritent de la classe abstrat Media et de l'interface Consultable
class Magazine(titre : String, date : String, private var numero : String) : Media(titre,date), Consultable {

    override fun consulter() {
        println("Le magazine '$titre', numéro '$numero' est consulté sur place.")
    }

    override fun afficher() {
        println("- Magazine : Titre = '$titre', Numéro ='$numero', Date =''$date'");
    }

}
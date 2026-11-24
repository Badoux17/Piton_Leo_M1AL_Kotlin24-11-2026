
//Class DVD qui héritent de la classe abstrat Media et de l'interface Empruntable
class DVD( titre: String, private var duree: Int, private var genre: String, date: String) : Media(titre, date), Empruntable {

    override fun emprunter(){
        println("Le DVD '$titre' a été emprunté.")
    }

    override fun retourner(){
        println("Le DVD '$titre' a été retourné.")
    }

    override fun afficher() {
        println("- DVD : Titre = '$titre', Duree ='$duree', Genre ='$genre' , Date='$date'");
    }
}
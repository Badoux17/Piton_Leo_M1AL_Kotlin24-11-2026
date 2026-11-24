
//Class EnregistrementAudio qui héritent de la classe abstrat Media et de l'interface Empruntable
class EnregistrementAudio(titre : String, private var duree : Int, private var genre : String,date : String) : Media(titre,date) , Empruntable {
    override fun emprunter() {
        println("L'enregistrement audio '$titre' a été emprunté.")
    }

    override fun retourner() {
        println("L'enregistrement audio '$titre' a été retourné.")
    }

    override fun afficher() {
        println("- Enregistrement Audio : Titre = '$titre', Duree ='$duree', Genre ='$genre' , Date='$date'");
    }

}
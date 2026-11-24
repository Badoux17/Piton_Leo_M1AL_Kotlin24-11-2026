import java.util.Date

class Livre(titre : String,private var auteur : String, private var editeur : String,date : String) : Media(titre,date) , Empruntable{

    override fun emprunter() {
        println("Le livre '$titre' de $auteur a été emprunté")
    }

    override fun retourner() {
        println("Le livre '$titre' de $auteur a été retourné.")
    }

    override fun afficher(){
        println("- Livre : Titre = '$titre', Auteur ='$auteur', Editeur =''$editeur' , Date='$date'");
    }

}
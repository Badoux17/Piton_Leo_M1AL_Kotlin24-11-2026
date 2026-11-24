import javax.print.attribute.standard.JobHoldUntil
import kotlin.reflect.typeOf


// Class Bibliothèque avec un total de 9 fonctions chacune très utiles au bon fonctionnement du Menu Interactif
class Bibliotheque(){

    private var collection = ArrayList<Media>()
    private val emprunts = ArrayList<Media>()

    fun ajouter(media: Media) {
        collection.add(media)
    }
    fun emprunter(media: Media) {
        if(!emprunts.contains(media) && media is Empruntable ){
            media.emprunter();
            emprunts.add(media)
        }
        else{
            println("-> ERREUR emprunt sur '${media.titre}'")
        }

    }
    fun retourner(media: Media) {
        if(emprunts.contains(media) && media is Empruntable){
            media.retourner()
            emprunts.remove(media)
        }
        else{
            println("-> ERREUR retour sur '${media.titre}'")
        }
    }
    fun consulter(media: Media) {
        if(media is Consultable) {
            media.consulter()
        }
        else{
            println("-> ERREUR consultation sur '${media.titre}'")
        }
    }
    fun afficherEmprunts(){
        println("Emprunts en cours: ")
        for (media in emprunts) {
            media.afficher()
        }
    }
    fun rechercheMedia(titreR : String){
        if(collection.find {it.titre.equals(titreR)} == null){
            println("Aucun média trouvé avec le titre '$titreR'.")
        }
        else{
            println("Le média '${titreR}' est bien dans la bibliothèque.")
        }
    }
    fun retourMedia(titreR : String) : Media?{
        var media = collection.find {it.titre.equals(titreR)};
        if(media != null){
            return media
        }
        else{
            return null
        }
    }
    fun afficherLivreEmpruntables(){
        println("Livre Non Emprunt en cours: ")
        for(media in collection){
            if(media in emprunts){ }
            else{
                media.afficher()
            }
        }
    }
    fun statistiques(){
        val compteurs = mutableMapOf<String, Int>()
        for(media in collection){
            if(media is Livre){
                if (compteurs.containsKey("Livre")){
                    compteurs["Livre"] = compteurs["Livre"]!! + 1
                }
                else{
                    compteurs["Livre"] = 1
                }
            }
            if(media is DVD){
                if (compteurs.containsKey("DVD")){
                    compteurs["DVD"] = compteurs["DVD"]!! + 1
                }
                else{
                    compteurs["DVD"] = 1
                }
            }
            if(media is Journal){
                if (compteurs.containsKey("Journal")){
                    compteurs["Journal"] = compteurs["Journal"]!! + 1
                }
                else{
                    compteurs["Journal"] = 1
                }
            }
            if(media is Magazine){
                if (compteurs.containsKey("Magazine")){
                    compteurs["Magazine"] = compteurs["Magazine"]!! + 1
                }
                else{
                    compteurs["Magazine"] = 1
                }
            }
            if(media is EnregistrementAudio){
                if (compteurs.containsKey("EnregistrementAudio")){
                    compteurs["EnregistrementAudio"] = compteurs["EnregistrementAudio"]!! + 1
                }
                else{
                    compteurs["EnregistrementAudio"] = 1
                }
            }
        }
        println(compteurs);
    }

}
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
    }
    fun retourner(media: Media) {
        if(emprunts.contains(media) && media is Empruntable){
            media.retourner()
            emprunts.remove(media)
        }
    }
    fun consulter(media: Media) {
        if(media is Consultable) {
            media.consulter()
        }
    }
    fun afficherEmprunts(){
        for (media in emprunts) {
            println("Emprunts en cours: ")
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
    fun afficherLivreEmpruntables(){
        for(media in collection){
            println("Livre Non Emprunt en cours: ")
            if(media in emprunts){ }
            else{
                media.afficher()
            }
        }
    }
    fun statistiques(){
        for(media in collection){

        }
    }
}
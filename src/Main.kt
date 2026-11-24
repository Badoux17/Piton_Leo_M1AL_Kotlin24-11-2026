//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Ajout des medias
    val bibliotheque = Bibliotheque()
    val magazine = Magazine("National Geographic", "2026-10-28", "10")
    val journal = Journal("Le Monde", "2026-10-28")
    val enregistrementAudio = EnregistrementAudio("Beethoven - Symphonie No.9", 960, "Classical", "1967-01-01")
    val dvd = DVD("Inception", 8880, "Action", "2010-01-01") /*2h 28m*/
    val livre = Livre("1984", "George Orwell", "Gallimard", "1972-01-01")

    // Ajout dans la biblio
    bibliotheque.ajouter(magazine)
    bibliotheque.ajouter(journal)
    bibliotheque.ajouter(enregistrementAudio)
    bibliotheque.ajouter(dvd)
    bibliotheque.ajouter(livre)


    //Test demandé
    bibliotheque.emprunter(dvd)
    bibliotheque.emprunter(livre)
    bibliotheque.consulter(magazine)
    bibliotheque.consulter(journal)
    bibliotheque.emprunter(enregistrementAudio)
    bibliotheque.afficherEmprunts()
    bibliotheque.retourner(dvd)
    bibliotheque.retourner(livre)
    bibliotheque.afficherEmprunts()

    //BONUS

    var applicationEnCours = true;

    while (applicationEnCours) {
        println("---------MENU---------")
        println("1. Afficher les emprunts en cours")
        println("2. Afficher les livres empruntables")
        println("3. Emprunter un média")
        println("4. Retourner un média")
        println("5. Consulter un média sur place")
        println("6. Statistiques")
        println("7. Quitter")
        print("Votre choix (1-7) : ")
        val choix = readln()
        when (choix) {
            "1" -> {
                bibliotheque.afficherEmprunts()
            }
            "2" -> {
                bibliotheque.afficherLivreEmpruntables()
            }
            "3" -> {
                print("Entrez le titre du média à emprunter : ")
                val titre = readln()
                val media = bibliotheque.retourMedia(titre)
                if (media != null) {
                    bibliotheque.emprunter(media);
                    println("Le media '$titre' a été emprunté");
                }
                else{
                    println("Impossible d'emprunter ce media il n'est pas dispo ou ne peut pas être emprunté");
                }
            }
            "4" -> {
                print("Entrez le titre du média à retourner :")
                val titre = readln()
                val media = bibliotheque.retourMedia(titre)
                if (media != null) {
                    bibliotheque.retourner(media)
                    println("Le media '$titre' a été retourner");
                }
                else{
                    println("Impossible d'emprunter ce media il n'est pas dispo ou ne peut pas être retourné");
                }
            }
            "5" -> {
                print("Entrez le titre du média à consulter :")
                val titre = readln()
                val media = bibliotheque.retourMedia(titre)
                if (media != null) {
                    bibliotheque.consulter(media)
                }
                else{
                    println("Impossible d'emprunter ce media il n'est pas dispo ou ne peut pas être consulter");
                }
            }
            "6" -> {
                bibliotheque.statistiques()
            }
            "7" -> {
                println("Au revoir !")
                applicationEnCours = false
            }
            else -> {
                println("Choix invalide. Veuillez taper un chiffre entre 1 et 7.")
            }
        }
    }
}

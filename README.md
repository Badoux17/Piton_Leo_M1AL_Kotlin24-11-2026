Notre objectif est de concevoir un Sytème de Gestion de Bibliothèque en Kotlin.
On a du concevoir 3 couches : Métier , Accès aux Données et Présentation.

La couche Métier est composé d'une classe Média qui est une classe Abstraite qui possède 2 attributs titre et date.
On va avoir aussi 2 interfaces Empruntable et Consultable qui posséderont chacune des fonctions à définir sur les classes filles.

La couche accès aux données, avec une classe Bibliothèque avec toutes les fonctions de la gestion de notre "collection" de media.
On aura un total de 8 fonctions toutes utiles pour le bon fonctionnement de notre mini projet.

Et la couche Présentation qui est notre main qui nous permettra de tester et d'ajouter des médias dans notre bibliothèque.
Cela nous permettra donc de bien simuler une bibiliothèque.

Les 8 fonctions sont: ajouter,emprunter,retourner,consulter,afficherEmprunts,rechercheMedia,afficherLivreEmpruntables et statistiques pour la classe Bibliothèque.
Le reste des objets qui vont hériter de la méthode abstrait de Media (afficher()) et certain objets auront soient les fonctions emprunter&retourner (si ils ont hérité de l'interface Empruntable) ou la fonction consulter() (si ils ont hérité de l'interface Consultable).

-> Le Menu interactif fonctionne bien !
Plusieurs options dans un petit menu interactif : 
1 -> Afficher les emprunts en cours (afficherEmprunts())
2 -> Afficher les livres empruntables (afficherLivreEmpruntables())
3 -> Emprunter un média (emprunter())
4 -> Retourner un média (retourner())
5 -> Consulter un média sur place (consulter())
6 -> Affichage des Statistiques(statistiques())
7 -> Sortie/Exit

J'ai essayé d'apporter le plus de tests et de vérifications avant chaque action tout en gardant une bonne lisibilité du code, commentaires, et bonnes pratiques tout au long de mon project.

Piton Léo M1AL.

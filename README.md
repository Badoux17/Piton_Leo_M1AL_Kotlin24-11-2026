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

Construction en cours d'un menu interactif (bonus n°4).

Piton Léo M1AL.

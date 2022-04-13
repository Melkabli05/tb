POO: JAVA
TP1
=============================================================
Exercice 1
1. Soit la classe « Etudiant » définie comme suit :
2. Définissez trois constructeurs. Un constructeur qui permet d'initialiser :
    le nom ;
    le nom et le prénom ;
    le nom, le prénom et le cne.
3. Utilisez la classe « TestEtudiant » pour les tests :
   Remarque : Si nécessaire, ajoutez des méthodes et des attributs.
4. Créez trois objets de types étudiants :
    pour le premier, initialiser juste le nom ;
    pour le deuxième, initialiser le nom et le prénom ;
    pour le troisième, initialiser le nom, le prénom et le cne.
4. Créez un objet de type étudiant qui utilise les données du troisième étudiant.
5. Ajoutez à la classe « Etudiant » :
    trois attributs (note1, note2 et note3).
    trois attributs (inscrModule1, inscrModule2 et inscrModule3) de types boolean.
   c lass Etudiant {
   private String nom , prenom , cne ;
   int numExam ; // numero d ' examen
   //Acompleter
   }
   public class TestEtudian t {
   public static void main ( String [ ] args ) {
   // Acompleter
   }
   }
   POO: JAVA
   TP1
   =============================================================
    une méthode « moyenne » qui permet de calculer la moyenne des notes selon
   l'inscription aux modules.
    une méthode « mention » qui permet d'afficher la mention. Si l'étudiant est inscrit
   dans 3 modules, la méthode affichera la mention, sinon elle affichera le message
   "Etudiant non inscrit dans 3 modules".
6. Dans la classe TestEtudiant:
    le premier est inscrit dans 3 modules ;
    le troisième étudiant est inscrit dans les modules M1 et M2 ;
    le quatrième étudiant est inscrit dans les modules M1 et M3.
7. Saisissez les notes des étudiants 1 et 3 et afficher la moyenne correspondante à
   chacun d'eux.
8. Modifiez la classe Etudiant pour que le numéro d'examen soit initialisé de façon automatique. Le
   premier étudiant aura le numéro 1, le deuxième 2 et ainsi de suite.
9. Dans la classe « TestEtudiant », affichez le nombre d'étudiants inscrits.
   Exercice 3
1. Créez la classe Cercle qui contient :
    les attributs privés de type double x et y (centre du cercle). Par défaut, ils sont
   initialisés à zéro ;
    les attributs privés de type double rayon, diamètre et surface ;
    un constructeur qui initialise le rayon et calcule les autres attributs ;
    la méthode setRayon qui calcule aussi les valeurs de diamètre et de surface ;
    les méthodes getRayon, getDiametre et getSurface.
    la méthode deplacerCentre qui permet de déplacer le centre (contient deux
   paramètres) ;
    la méthode afficherCentre qui permet d'afficher le centre du cercle.
2. Testez la classe Cercle dans la classe TestCercle :
   (a) Créez un cercle de rayon saisi au clavier et affichez les informations concernant
   le cercle.
   (b) Créez un cercle de rayon égale au diamètre du cercle précédent et affichez les
   informations concernant le cercle.
   (c) Modifiez le rayon du deuxième cercle (rayon=3) et affichez les informations
   concernant le cercle.
   (d) Déplacer le centre du deuxième cercle de (2, 2) ;
   (e) Affichez le nouveau centre du deuxième cercle.

# GARDIEN

## Description
Gardien est un projet de simulation où un ou plusieurs gardiens patrouillent sur une grille carrée pour attraper des intrus, 
en tenant compte d'obstacles variés affectant leur vision et leur déplacement. Les gardiens doivent agir intelligemment pour 
capturer les intrus dynamiques, dans un environnement connu mais avec une visibilité limitée.

## Fonctionnalités
- **Génération de grille** personnalisables (taille, densité d'obstacles, nombre de personnages...).
- **Détection et poursuite** des intrus dans le champ de vision.
- **Planification du chemin** optimal pour attraper les intrus.
- **Mode patrouille aléatoire** lorsque aucun intrus n'est repéré.
- **Prise de contrôle manuelle** du gardien par l'utilisateur.
- **Mode communication** avec coordination des gardiens pour optimiser la capture.

## Prérequis
- Java SE 8 ou supérieur

## Technologies
- JFreeChart
- Log4j

## Utilisation
1. **Téléchargement du projet**
Téléchargez les fichiers sources depuis le dépôt GitHub :  
   [https://github.com/AirSoks/CY_Guard](https://github.com/AirSoks/CY_Guard)
2. **Importation dans Eclipse**  
- Ouvrez Eclipse.
- Allez dans `File` > `Import` > `Existing Projects into Workspace`.
- Sélectionnez le dossier du projet que vous venez de télécharger.
- Cliquez sur `Finish` pour importer le projet.
3. **Exécution de la simulation**  
- Localisez la classe `TestGame.java` dans le projet.
- Faites un clic droit dessus puis choisissez `Run As` > `Java Application`.
- L'interface graphique (GUI) s'ouvrira automatiquement.
4. **Fonctionnalités disponibles via la barre de menu**  
- **Start** : Démarrer la simulation.
- **Pause** : Mettre en pause la simulation.
- **Restart** : Réorganiser les gardiens et intrus aléatoirement sur la carte.
- **Rebuild** : Générer une nouvelle carte avec des obstacles placée différemment.
- **Options** : Modifier les paramètres de la simulation (taille de la grille, nombre de gardiens, nombre d'intrus, etc.).
- **Affichage** : Personnaliser l'affichage visuel (zones de vision, chemins calculés, etc.).

## Documentation
- Le rapport du projet est disponible en plusieurs formats :
  - Dans le dossier "doc" du projet, code source au format LaTeX.
  - Le fichier "Rapport_GARDIEN.pdf", au format pdf.

## Développement
- Dépôt GitHub : [https://github.com/AirSoks/CY_Guard]

## Auteurs
- COSTA Mathéo, L2-C19
- AMMARI Meanouer, L2-C19
- ZURKHANG Tenzin, L2-C19

## Contact
Pour toute question ou suggestion, veuillez contacter :
- matheo.costa4@etu.cyu.fr
- ammari.menaouer@etu.cyu.fr
- tenzin-rigsang.zurkhang@etu.cyu.fr

## Licence
© 2025 Gardien

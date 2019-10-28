# fluentlenium-testing
Squelette de projet [FluentLenium](https://fluentlenium.com/) + [Database Rider](https://database-rider.github.io/database-rider/)
pour tests sur IHM avec contrôle de base de données.

## Prérequis

- [Maven](https://maven.apache.org/)
- [OpenJDK 11+](https://jdk.java.net/)
- [Chrome](https://www.google.com/intl/fr_fr/chrome/)

## Installation

- Selenium requiert le téléchargement de drivers spécifiques qui permettent de contrôler le 
navigateur. Pour Chrome, les drivers sont disponibles sur la page [ChromeDriver - WebDriver for Chrome](https://chromedriver.chromium.org/downloads).

- Télécharger le driver correspondant à votre version de Chrome, et placez le dans le dossier `drivers` du projet.

- Les tests peuvent être lancés comme n'importe quels tests JUnit, via Eclipse, IntelliJ IDEA ou en ligne de commande
maven.

- Pour lancer les tests sous Eclipse, il est nécessaire d'ajouter l'option de JVM suivante:

```
-Dwebdriver.chrome.driver=drivers/chromedriver.exe
```

```
mvn test
```

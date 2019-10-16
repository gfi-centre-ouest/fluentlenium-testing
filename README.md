# fluentlenium-testing
Squelette de projet FluentLenium pour les tests sur IHM

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

```
mvn test
```

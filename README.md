# Java Sandbox

Ce repository me sert de bac à sable pour mon apprentissage de Java, vous y trouverez essentiellement du cour et des petits exercices.  

## La compilation et l'éxecution en Java

### La compilation en Java

La compilation en java est le processus qui va convertir notre code source (celui que nous, développeur, écrivons) et le transformer en code intermédiaire appelé bytecode. Ce dernier est alors stocké dans un fochier '.class'. 

La commande pour effectuer cette compilation est :

```
javac NomDuFichier.java
```

### L'éxecution 

C'est la Java Virtual Machine (JVM) qui est responsable de l'éxecution en java, on lance l'éxecution via la commande :

```
java NomDuFichier
```

La JVM va alors interpréter le bytecode et le traduire en instructions machines compréhensible par le système d'exploitation. Cela rend Java indépendant de la plateforme, puisque seul le bytecode est interprété.

À noter que pendant l'exécution, la JVM gère automatiquement la mémoire grâce au Garbage Collector, qui récupère l'espace mémoire inutilisé.

### Avantage de cette architecture

Cette architecture revète plusieurs avantage. Premièrement, grâce au bytecode et à la JVM, un programme Java peut s'exécuter sur n'importe quel système qui dispose d'une JVM (philosophie "Write Once, Run Anywhere"). Ensuite, JVM utilise des optimisations comme la compilation Just-In-Time (JIT) pour améliorer les performances à l'exécution. Enfin la JVM inclut des vérifications de bytecode pour prévenir certains types d'erreurs ou d'attaques.

## Programmation orientée objet 

### Les grands principes


### Définitions importantes

**Classe :**  
C'est un modèle ou un plan qui définit les **propriétés** (attributs) et les **comportements** (méthodes) que peuvent avoir les objets créés à partir de cette classe.

**Objet :**  
Une fois qu'une classe est définie, on peut créer des **objets** concrets, appelés **instances** de la classe. Chaque objet possède ses propres valeurs pour les attributs définis par la classe.

**Instance :**  
Une instance est un **objet concret** créé à partir d'une classe. Elle représente un exemplaire unique de la classe en mémoire.

**Attributs :**  
Ce sont les variables définies dans une classe, représentant les caractéristiques ou les propriétés associées aux objets créés à partir de cette classe.

**Méthodes :**  
Ce sont les **fonctions définies au sein d'une classe**, qui décrivent les actions ou comportements que les objets de cette classe peuvent exécuter.

**Constructeur :**  
C'est une **méthode spéciale** définie dans une classe, utilisée pour initialiser un nouvel objet (instance). Elle attribue souvent des valeurs initiales aux attributs ou exécute des opérations nécessaires lors de la création d'un objet. 

**Implémentation :**  
C'est le processus de **traduction des spécifications** fonctionnelles et techniques en code source exécutable. En programmation orientée objet, cela inclut également l'ajout des détails de fonctionnement aux méthodes définies dans une classe ou une interface.

**Interface :**  
C'est un **contrat** qui définit un ensemble de méthodes que les classes qui implémentent cette interface doivent obligatoirement fournir. Contrairement à l'héritage classique, une interface ne contient pas d'implémentation, uniquement des définitions de méthodes.

**Méthode abstraite :**  
C'est une **méthode définie dans une classe abstraite ou une interface**, sans corps (implémentation). Elle ne contient que la signature (nom, paramètres et type de retour). Les classes dérivées doivent fournir une implémentation pour ces méthodes.

### SOLID

**SOLID** est un acronyme représentant cinq principes fondamentaux de la POO popularisé par Robert C. Martin (Uncle Bob), ces derniers visent à rendre le code plus modulaire, plus facile à tester et à étendre. 

#### S pour Single Responsibility Principle – Principe de responsabilité unique

Simplement ce principe veut qu'une classe, une méthode ou un attribut ne soit jamais responsable que d'une chose à la fois. 

#### O pour Open/Closed Principle – Principe ouvert/fermé

Une classe doit être ouverte à l'extention mais pas à la modification. Cela signifie qu'on doit pouvoir ajouter de nouvelles fonctionnalités sans modifier le code existant. Cela peut être réalisé en utilisant des interfaces, des classes abstraites ou des mécanismes comme le polymorphisme.

#### L pour Liskov Substitution Principle – Principe de substitution de Liskov

L’idée c’est que, par exemple, le comportement d’une méthode héritée dans une sous-classe doit pouvoir se substituer à celui de la classe parente, il ne doit donc pas changer le comportement d’origine. Les sous-classes vont par exemple calculer une aire différemment pour un carré ou un triangle mais dans la finalité, on calcule toujours une aire. 

#### I pour Interface Segregation Principle – Principe de ségrégation des interfaces

Très simplement, ce principe vise à réglementer la création d'interface. En effet, lorsque l'on crée une interface, on doit se contenter de ce qui sera strictement nécessaire dans les classes qui vont l'implémenter. L'idée est de privilégier plusieurs petites interfaces spécifiques et ciblées plutôt qu'une interface "lourde". On peut aussi imaginer une interface principale avec des comportements minimaux et plusieurs autres interfaces qui cont venir couvrir des aspects non-partagés par tout nos objets.

#### D pour Dependency Inversion Principle – Principe d'inversion des dépendances

Les abstractions ne doivent pas dépendre des détails, les détails doivent dépendre des abstractions. Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau, les deux doivent dépendre d'abstractions. 

Par exemple, une classe FactureService qui envoie des factures ne devrait pas directement dépendre d'une implémentation comme EmailService. Elle devrait dépendre d'une abstraction (par exemple une interface NotificationService), qui peut être implémentée de différentes manières (email, SMS, etc.).
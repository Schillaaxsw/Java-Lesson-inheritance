# Java-Lesson-inheritance
Ereditarieta' in Java

Il codice [MyCar.java](https://github.com/Prof-Matteo-Palitto-Peano/Java-Lesson-inheritance/blob/master/MyCar.java) vuole illustrare i concetti legati all'ereitarieta' in Java.

## Architettura del Codice
* La SUPER-CLASSE **Veicolo**
* La SOTTO-CLASSE **Auto** che eredita dalla classe **Veicolo** tutte le sue variabili e tutte i suoi metodi
* Nel **main** viene instanziato l'oggetto **myFastCar** di tipo **Auto**

## Concetti evidenziati
* Tutte le variabili e tutti i metodi della SUPER-CLASSE vengono ereditati dall SOTTO-CLASSE
* Le varibili PRIVATE della super classe NON sono accessibili direttamente dall SOTTO-CLASSE
* Le variabili non PRIVATE della SUPER-CLASSE sono accessibili alla SOTTO-CLASSE **solo** se appartengono allo stesso PACKAGE
* Le variabili PROTECTED sono accessibili direttamente **anche

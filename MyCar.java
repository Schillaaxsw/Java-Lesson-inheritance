// SUPER classe che sara' usata da una sotto-classe 
class Veicolo {
    // nRuote numero di ruote e' una variabile privata e non e' accessebile nemmeno dalle sotto-classi
    private int nRuote = 16;
    // Le seguenti variabili sono accessibili da tutte le classi appartenenti allo stesso package
    // quindi anche alle sotto-classi, MA solo se appartengono allo stesso package
    String costruttore = "Ferrovie Dello Stato";
    String suono = "Tuut, tuut!";
    // La seguente variabile e' una variabile PROTECTED ed e' visibile da tutte le variabili appartenenti allo stesso
    // package e a TUTTE le sotto-classi (anche quelle non appartenenti allo stesso package)
    protected String tipo = "Trenino";
  
    // Costruttore senza argomenti viene richiamato automaticamente 
    Veicolo() {
        System.out.println("Veicolo " + tipo + " " + costruttore);
    }
    
    // Costruttore con argomenti deve essere richiamato appositamente dal costruttore della sotto-classe
    // per poter essere eseguito con la sintassi "super(argomenti);"
    Veicolo(String suono) {
        this.suono = suono;
        System.out.println("Veicolo " + tipo + " " + costruttore);
    }
    
    // metodo "setter" per la variabile PRIVATE
    void setRuote(int n) {
        this.nRuote = n;
    }
    
    // metodo "getter" per la variabile PRIVATE
    int getRuote() {
        return this.nRuote;
    }

    // metodo della super classe
    public void honk() {
        System.out.println(suono);
    }
}

// sotto-classe Auto che estende la super-classe Veicolo
// eredita tutte le variabili e i metodi della super-classe
class Auto extends Veicolo {
    // variabili che appartengono solo alla sotto-classe Auto
    String modello = "Alfa";
    String nome = "Giulia";
    
    // Costruttore della sotto-classe Auto
    Auto() {
        // Per poter eseguire il costruttore della super-classe con argomenti lo devo richiamare in modo esplicito
        super("Beep, Beep!");
        System.out.println("Auto " + modello + "-" + nome);
        // Il compilatore darebbe errore se provassi ad usare direttamente la variabile PRIVATE della super-classe
        //super.nRuote = 6;
        // Posso accedere alla variabile PRIVATE usando il metodo "setter" 
        super.setRuote(4);
        // Posso accedere alle variabili non PRIVATE direttamete perche' sotto-classe appartiene allo stesso package
        // Il compilatore darebbe errore se questa sottoclasse non appartenesse allo stesso package della super-classe
        super.costruttore = "FCA";
        // Potrei accedere alla variabile PROTECTED direttamente anche se la sotto-classe e la super-classe appartenessero
        // a due packages diversi
        super.tipo = "Berlina";
    }
    
    
}

public class MyCar extends Auto {
  public static void main(String[] args) {
    Auto myFastCar = new Auto();
    myFastCar.honk();
    System.out.println(myFastCar.tipo + " " + myFastCar.modello  + " ha " + myFastCar.getRuote() + " ruote");
  }
}


package busineslogic;

import entities.Showroom;

/**
 * Qui vogliamo mettere tutti i metodi static void che andiamo poi a richiamare nel metodo main
 * dell' eseguibile. in particolare ci occupiamo qui della lettura da csv.
 * Utilizziamo la tecnica del doppio csv, uno con solo i dati propri dello showroom e uno invece per 
 * i dati dei mobili,
 * Inoltre contiene come proprietà static lo showroom che viene riempito,   in maniera che tutti i meotdi possano accedervi in qualcisasi momento.
 * 
 */
public class ShowroomLogic 
{

    private static Showroom showroom;

    /**
     * questo è il metodo che dovrà riempire lo showroom leggenendo da csv (predetvi filereader d aun progetto vecchio)
     */
    public static void fillShowroom(){}

    /**
     * da richiamare al fondo di add e remove. aggiorna il file csv come mostrato nel progetto esempio
     */
    public static void refreshfiles() {
       }

       /**
        * chiede i dati ad un utente di un mobile e lo aggiunge ala showroom
        */
    public static void add() {
    }

    /**
     * stampa tutti i dati dello showroom e dei suoi mobili
     */
    public static void print() {
    }

    /**
     * stampa tutti i mobili e rimuove quello scelto dall'utente
     */
    public static void remove() {
       }

       /**
        * stampa solo i mobili esposti
        */
    public static void printExposition() {
    }




}

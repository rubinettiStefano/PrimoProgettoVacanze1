package entities;

/**
 * Questa è una Entity, vale a dire una classe il cui scopo è rappresentare qualcosa di esistente nel mondo reale 
 * dentro il nostro programma. Prende anche il nome di classe modello o classe Tipo. In particolare vi invito a concentrarvi
 * su questo ultimo termine, poichè ne esplica in maniera molto forte l'utilizzo in java.
 * Piccolo excursus. Java nasce conoscendo del mondo solo 8 cose, gli 8 tipi primitivi. questo è il realta sufficiente
 * per poter creare ogni cosa, ma obbliga i programmatori a fare grossi salti logici quando vogliono rappresentare
 * qualcosa del mondo. Per noi esseri umani una Data è una Data, non sono 3 numeri interi a caso, e vogliamo sia così anche
 * per il programma per facilitarci la vita. per questo motivio creaiamo queste classi, per aggiungere TIPI a java
 * Ora Java conosce e sa come è fatto un mobile, e possiamo parlare la stessa lingua.
 * 
 * In generale un Tipo definisce due cose: STATO  e COMPORTAMENTO
 * con STATO  si intende il contenuto informativo di un oggetto, vale a dire i valori di tutte le proprietà in un dato momento
 * con COMPORTAMENTO si intende ciò che sa fare/calcolare, vale a dire i metodi.
 * 
 * Un mobile ha nel suo stato:
 * prezzoBase
 * materiale
 * colore
 * tipo
 * peso 
 * 
 * controlare con i setter che le proprietà vengano impostate solo quando hanno un valore accettabile, in particolare
 * per materiale: plastica,legno,acciaio,vetro
 * per tipo: cucina,armadio,letto,comodino
 * 
 * 2 metodi, 
 *  prezzoFinale(), che viene calcolato con il prezzobase moltiplicato per
 *      1 se materiale è plastica
 *      1.25 se legno
 *      1.5 se acciaio
 *      2 se vetro     
 */
public class Mobile 
{


    

}

package entities;

import java.util.ArrayList;

/*
    Showroom è sempre una entità, ma in questo caso prende il mode di classe aggregatrice, poichè lavora sui 
    dati di tanti oggetti, tanti mobili in questo caso specifico.
    Come proprietà fondamentale, ma assolitamente non l'unica, possiede una lista di Mobili, e la maggior
    parte dei metodi o la modificheranno o andranno ad estrapolare dati da essa.


    Completate la classe con getter e setter e il corpo dei metodi che ho scritto
 */
public class Showroom 
{
    //ecco qui la star
    private ArrayList<Mobile> mobili = new ArrayList<>();
    //altre proprietà
    private String nome,indirizzo;
    private double pesoMax;


    /*
     * metodo classico che aggiunge il singolo elmento passato come parametro alla lista
     */
    public void addMobile(Mobile m)
    {}

        /*
     * metodo classico che rimuove il singolo elmento passato come parametro alla lista
     */
    public void removeMobile(Mobile m)
    {}

    /*
     * metodo classico che aggiunge il singolo elmento passato come parametro alla lista
     */
    public ArrayList<Mobile> listaEsposizione()
    {
        return null;
        //deve restituire una lista contente solo i mobili esponibili tra quelli nela lista totale
        //un mobile è esponibile se è al di sotto del paso massimo consentito nello showroom e NON è un letto di vetro
    }



}

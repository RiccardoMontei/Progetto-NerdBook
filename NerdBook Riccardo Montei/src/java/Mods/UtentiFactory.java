/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mods;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class UtentiFactory {
    private static UtentiFactory singleton;
    
    public static UtentiFactory getInstance()
    {
        if(singleton == null)
            singleton = new UtentiFactory();
        return singleton;
    }
    
    private ArrayList<Utenti> utenti = new ArrayList<Utenti>();
    
    private UtentiFactory()
    {
        
        Utenti utente1 = new Utenti();
        utente1.setCognome("Cognome");
        utente1.setId(1);
        utente1.setNome("Utente 1");
        utente1.setData("24/04/2017");
        utente1.setPass("password1");
        utente1.setUrlimmagineprofilo("img/ok.png");
        utente1.setFrase("Il tempo è estremamente fragile come struttura, qualsiasi deviazione, per quanto piccola può provocare un cataclisma.");
        
        Utenti utente2 = new Utenti();
        utente2.setCognome("Cognome");
        utente2.setId(2);
        utente2.setNome("Utente 2");
        utente2.setData("24/04/2017");
        utente2.setPass("password2");
        utente2.setUrlimmagineprofilo("img/ok.png");
        utente2.setFrase("Peter, mi sbagliavo, non è troppo tardi! Puoi salvare entrambi i mondi, possiamo ricominciare daccapo. Stavolta dovrai semplicemente compiere una scelta diversa, e se qualcosa andasse storto, Olivia sarebbe la nostra ancora di salvezza...");
        
        Utenti utente3 = new Utenti();
        utente3.setCognome("Cognome");
        utente3.setId(3);
        utente3.setNome("Utente 3");
        utente3.setData("24/04/2017");
        utente3.setPass("password3");
        utente3.setUrlimmagineprofilo("img/ok.png");
        utente3.setFrase("Sono il comandante Shepard e questo è il mio negozio preferito sulla Cittadella.");
        
        Utenti incompleto = new Utenti();
        incompleto.setId(4);
        incompleto.setNome("Incompleto");
        incompleto.setPass("password");
        incompleto.setCognome(null);
        incompleto.setUrlimmagineprofilo("img/ok.png");
        incompleto.setFrase("Ehilà! Sto utilizzando NerdBook.");
        
        Utenti vuoto = new Utenti();
        vuoto.setId(5);
        vuoto.setNome("Vuoto");
        vuoto.setPass("password");
        vuoto.setCognome(null);
        vuoto.setUrlimmagineprofilo("img/ok.png");
        vuoto.setFrase(null);
        
       
        utenti.add(utente1);
        utenti.add(utente2);
        utenti.add(utente3);
        utenti.add(incompleto);
        utenti.add(vuoto);
    }
    public Utenti getUserById(int id)
    {
        //sintassi for da vedere
        //scorrere la lista di utenti
        for(Utenti u : this.utenti)
        {
            if(u.getId() == id)
                return u;
        }
        return null;
        //confrontare l'id dell'utente con quello del parametro
    }
    public Utenti getUserByName(String n)
    {
        for(Utenti u : this.utenti)
        {
            if(u.getNome().equals(n))
                return u;
        }
        return null;
    }
    public List getUserList()
    {
        return utenti;
    }
    
}

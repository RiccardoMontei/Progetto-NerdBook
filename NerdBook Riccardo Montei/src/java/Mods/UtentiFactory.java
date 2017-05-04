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
        utente1.setCognome("");
        utente1.setId(1);
        utente1.setNome("");
        utente1.setData("");
        utente1.setPass("");
        utente1.setUrlimmagineprofilo("");
        utente1.setFrase("");
        
        Utenti utente2 = new Utenti();
        utente2.setCognome("");
        utente2.setId(2);
        utente2.setNome("");
        utente2.setData("");
        utente2.setPass("");
        utente2.setUrlimmagineprofilo("");
        utente2.setFrase("");
        
        Utenti utente3 = new Utenti();
        utente3.setCognome("");
        utente3.setId(3);
        utente3.setNome("");
        utente3.setData("");
        utente3.setPass("");
        utente3.setUrlimmagineprofilo("");
        utente3.setFrase("");
        
        Utenti incompleto = new Utenti();
        incompleto.setId(4);
        incompleto.setNome("Incompleto");
        incompleto.setPass("");
        incompleto.setCognome(null);
        incompleto.setUrlimmagineprofilo("");
        incompleto.setFrase("");
        
        Utenti vuoto = new Utenti();
        vuoto.setId(5);
        vuoto.setNome("Vuoto");
        vuoto.setPass("");
        vuoto.setCognome(null);
        vuoto.setUrlimmagineprofilo("");
        vuoto.setFrase(null);
        
       
        utenti.add(utente1);
        utenti.add(utente2);
        utenti.add(utente3);
        utenti.add(incompleto);
        utenti.add(vuoto);
    }
    public Utenti getUserById(int id)
    {
       
        for(Utenti u : this.utenti)
        {
            if(u.getId() == id)
                return u;
        }
        return null;
        
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

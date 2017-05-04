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
public class GruppiFactory {
     private static GruppiFactory singleton;
      public static GruppiFactory getInstance()
    {
        if(singleton == null)
            singleton = new GruppiFactory();
        return singleton;
        
    }
     private ArrayList<Gruppi> gruppi = new ArrayList<Gruppi>();
     private GruppiFactory()
    {
        Gruppi gruppo1 = new Gruppi();
        gruppo1.setNome("Primo gruppo");
        gruppo1.setDescrizione("Anime & Manga");
        gruppo1.setFondatore(UtentiFactory.getInstance().getUserByName("Utente 1"));
        gruppo1.setId(1);
        gruppo1.setUrlimmagineprofilo("");
        
        Gruppi gruppo2 = new Gruppi();
        gruppo2.setNome("Secondo Gruppo");
        gruppo2.setDescrizione("Metin2");
        gruppo2.setFondatore(UtentiFactory.getInstance().getUserByName("Utente 2"));
        gruppo2.setId(2);
        gruppo2.setUrlimmagineprofilo("");
        
        Gruppi gruppo3 = new Gruppi();
        gruppo3.setNome("Terzo Gruppo");
        gruppo3.setDescrizione("COD 4 Lan");
        gruppo3.setFondatore(UtentiFactory.getInstance().getUserByName("Utente 3"));
        gruppo3.setId(3);
        gruppo3.setUrlimmagineprofilo("");
        
        gruppi.add(gruppo1);
        gruppi.add(gruppo2);
        gruppi.add(gruppo3);
    }
 public Gruppi getGroupById(int id)
    {
        for(Gruppi g : this.gruppi)
        {
            if(g.getId() == id)
                return g;
        }
        return null;
       
    }
    public Gruppi getGroupByName(String n)
    {
        for(Gruppi g : this.gruppi)
        {
            if(g.getNome().equals(n))
                return g;
        }
        return null;
    }
    public List getGroupList()
    {
        return gruppi;
    }
}

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
public class PostFactory {
      
    private static PostFactory singleton;
   
    public static PostFactory getInstance()
    {
        if(singleton == null)
            singleton = new PostFactory();
        return singleton;
    }
   
    private ArrayList<Post> post = new ArrayList<Post>();
   
    private PostFactory()
    {
        
        Post post1 = new Post();
        post1.setAutore(UtentiFactory.getInstance().getUserByName("Utente 1"));
        post1.setContenuto("Ciao raggaaa :)");
        post1.setId(1);
        post1.setGruppo(null); 
        post1.setDestinatario(null);
        
        Post post2 = new Post();
        post2.setAutore(UtentiFactory.getInstance().getUserByName("Utente 2"));
        post2.setContenuto("");
        post2.setId(2);
        post2.setGruppo(null); 
        post2.setDestinatario(null);
        
        Post post3 = new Post();
        post3.setAutore(UtentiFactory.getInstance().getUserByName("Utente 3"));
        post3.setContenuto("");
        post3.setId(3);
        post3.setGruppo(null);
        post3.setDestinatario(null);
        
        Post post4 = new Post();
        post4.setAutore(UtentiFactory.getInstance().getUserByName("Utente 1"));
        post4.setContenuto("");
        post4.setId(4);
        post4.setGruppo(GruppiFactory.getInstance().getGroupByName("Primo Gruppo")); 
        post4.setDestinatario(null);
        
        Post post5 = new Post();
        post5.setAutore(UtentiFactory.getInstance().getUserByName("Utente 2"));
        post5.setContenuto("");
        post5.setId(5);
        post5.setGruppo(GruppiFactory.getInstance().getGroupByName("Secondo Gruppo")); 
        post5.setDestinatario(null);
        
        post.add(post1);
        post.add(post2);
        post.add(post3);
        post.add(post4);
        post.add(post5);
    }
    public Post getPostById(int id)
    {
        
        for(Post p : this.post)
        {
            if(p.getId() == id)
                return p;
        }
        return null;
        
    }
    public List getPostByUser(Utenti u)
    {
        List<Post> l = new ArrayList<Post>();
       
        for(Post elemento:post)
            if(elemento.getGruppo() == null && elemento.getDestinatario() == null)
                if(elemento.getAutore().equals(u))
                    l.add(elemento);
        return l;
        
    }
    public List getPostByDest(Utenti u)
    {
        List<Post> l = getPostByUser(u);
        if(l == null)
            l = new ArrayList<Post>();
        
        for(Post elemento:post)
            if(elemento.getDestinatario() != null)
                if(elemento.getDestinatario().equals(u))
                    l.add(elemento);
        return l;
      
    }
    public List getPostByGroup(Gruppi g)
    {
         List<Post> l = new ArrayList<Post>();
       
        for(Post elemento:post)
        {
            if(elemento.getGruppo() != null)
            {
                if(elemento.getGruppo().equals(g))
                    l.add(elemento);
            }
        }
        return l;
        
    }
}

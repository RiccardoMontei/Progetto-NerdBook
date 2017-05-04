/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mods;

/**
 *
 * @author Pc
 */
public class Post {
    private Utenti autore;
    private String contenuto;
    private int id;
    private Gruppi gruppo;
    private Utenti destinatario;

    /**
     * @return the autore
     */
    public Utenti getAutore() {
        return autore;
    }

    /**
     * @param autore the autore to set
     */
    public void setAutore(Utenti autore) {
        this.autore = autore;
    }

    /**
     * @return the contenuto
     */
    public String getContenuto() {
        return contenuto;
    }

    /**
     * @param contenuto the contenuto to set
     */
    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the gruppo
     */
    public Gruppi getGruppo() {
        return gruppo;
    }

    /**
     * @param gruppo the gruppo to set
     */
    public void setGruppo(Gruppi gruppo) {
        this.gruppo = gruppo;
    }

    /**
     * @return the destinatario
     */
    public Utenti getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(Utenti destinatario) {
        this.destinatario = destinatario;
    }
     public Post()
    {
        autore = null;
        contenuto = "";
        id = 0;
        gruppo = null;
        destinatario = null;
    }
}

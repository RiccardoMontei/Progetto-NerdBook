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
public class Gruppi {
    private String nome;
    private String descrizione; 
    private Utenti fondatore;
    private int id;
    private String urlimmagineprofilo;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the descrizione to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * @return the fondatore
     */
    public Utenti getFondatore() {
        return fondatore;
    }

    /**
     * @param fondatore the fondatore to set
     */
    public void setFondatore(Utenti fondatore) {
        this.fondatore = fondatore;
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
     * @return the urlimmagineprofilo
     */
    public String getUrlimmagineprofilo() {
        return urlimmagineprofilo;
    }

    /**
     * @param urlimmagineprofilo the urlimmagineprofilo to set
     */
    public void setUrlimmagineprofilo(String urlimmagineprofilo) {
        this.urlimmagineprofilo = urlimmagineprofilo;
    }
    public Gruppi()
    {
        nome = "";
        descrizione = "";
        fondatore = null;
        id = 0;
        urlimmagineprofilo = "";
    }
    @Override
    public boolean equals(Object g) {
        if(g == null) return false;
        if (g instanceof Gruppi)
            if (this.getId() == ((Gruppi)g).getId()) return true;
        return false;
    }
}

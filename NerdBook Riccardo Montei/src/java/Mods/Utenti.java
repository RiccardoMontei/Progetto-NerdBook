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
public class Utenti {
    private int id;
    private String nome;
    private String cognome;
    private String urlimmagineprofilo;
    private String data;
    private String pass;
    private String frase;

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
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
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

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }


    /**
     * @return the frase
     */
    public String getFrase() {
        return frase;
    }

    /**
     * @param frase the frase to set
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public Utenti()
    {
        id = 0;
        cognome = "";
        nome = "";
        urlimmagineprofilo= "";
        data = "";
        pass = "";
        frase = null;
    }
   
    public boolean equals(Object u) {
        if(u == null) return false;
        if (u instanceof Utenti)
            if (this.getId() == ((Utenti)u).getId()) return true;
        return false;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.bean.prova;

/**
 *
 * @author Vinicius
 */
public class alternativa {
    public String texto = "";
    /**
     * Define se é a alternativa correta
     */
    public boolean correta = false;

    public boolean isCorreta() {
        return correta;
    }

    public void setCorreta(boolean correta) {
        this.correta = correta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
   
}

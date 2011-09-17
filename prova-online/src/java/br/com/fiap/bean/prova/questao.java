/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.bean.prova;

import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class questao {
    private String enunciado = "";
    private ArrayList<alternativa> alternativas = new ArrayList<alternativa>();
    /**
     * Define quanto essa questão vale na prova.
     */
    public double peso;

    public ArrayList<alternativa> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(ArrayList<alternativa> alternativas) {
        this.alternativas = alternativas;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}

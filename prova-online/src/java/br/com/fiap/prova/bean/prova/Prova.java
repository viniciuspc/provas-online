/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.bean.prova;

import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class Prova {
    private ArrayList<Questao> questoes = new ArrayList<Questao>();

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }
    
    
}

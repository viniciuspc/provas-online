/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.teste;

import br.com.fiap.prova.bean.prova.alternativa;
import br.com.fiap.prova.bean.prova.prova;
import br.com.fiap.prova.bean.prova.questao;
import br.com.fiap.prova.bean.usuarios.usuario;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class populaObjetos {
    private ArrayList<usuario> usuarios = new ArrayList<usuario>();
    private ArrayList<questao> questoes = new ArrayList<questao>();
    private ArrayList<alternativa> alternativas = new ArrayList<alternativa>();
    private ArrayList<alternativa> alternativas1 = new ArrayList<alternativa>();
    private ArrayList<alternativa> alternativas2 = new ArrayList<alternativa>();
    private ArrayList<alternativa> alternativas3 = new ArrayList<alternativa>();
    
    private prova p = new prova();

    
    public ArrayList<alternativa> getAlternativas() {
        alternativa a1 = new alternativa();
        a1.setTexto("1");
        this.alternativas.add(a1);
        
        alternativa a2 = new alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas.add(a2);
        
        alternativa a3 = new alternativa();
        a3.setTexto("3");
        this.alternativas.add(a3);
        
        alternativa a4 = new alternativa();
        a4.setTexto("4");
        this.alternativas.add(a4);
        
        alternativa a5 = new alternativa();
        a5.setTexto("5");
        this.alternativas.add(a5);
        
        return this.alternativas;
    }

    public ArrayList<alternativa> getAlternativas1() {
         alternativa a1 = new alternativa();
        a1.setTexto("1");
        this.alternativas1.add(a1);
        
        alternativa a2 = new alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas1.add(a2);
        
        alternativa a3 = new alternativa();
        a3.setTexto("3");
        this.alternativas1.add(a3);
        
        alternativa a4 = new alternativa();
        a4.setTexto("4");
        this.alternativas1.add(a4);
        
        alternativa a5 = new alternativa();
        a5.setTexto("5");
        this.alternativas1.add(a5);
        
        return this.alternativas1;
    }

    public ArrayList<alternativa> getAlternativas2() {
        alternativa a1 = new alternativa();
        a1.setTexto("1");
        this.alternativas2.add(a1);
        
        alternativa a2 = new alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas2.add(a2);
        
        alternativa a3 = new alternativa();
        a3.setTexto("3");
        this.alternativas2.add(a3);
        
        alternativa a4 = new alternativa();
        a4.setTexto("4");
        this.alternativas2.add(a4);
        
        alternativa a5 = new alternativa();
        a5.setTexto("5");
        this.alternativas2.add(a5);
        
        return this.alternativas2;
    }

    public ArrayList<alternativa> getAlternativas3() {
        alternativa a1 = new alternativa();
        a1.setTexto("1");
        this.alternativas3.add(a1);
        
        alternativa a2 = new alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas3.add(a2);
        
        alternativa a3 = new alternativa();
        a3.setTexto("3");
        this.alternativas3.add(a3);
        
        alternativa a4 = new alternativa();
        a4.setTexto("4");
        this.alternativas3.add(a4);
        
        alternativa a5 = new alternativa();
        a5.setTexto("5");
        this.alternativas3.add(a5);
        return alternativas3;
    }
    
    

    public prova getP() {
        this.p.setQuestoes(this.getQuestoes());
        return p;
    }

    public ArrayList<questao> getQuestoes() {
        questao q = new questao();
        q.setEnunciado("Quanto é 1+1?");
        q.setPeso(2.5);
        q.setAlternativas(this.getAlternativas());
        this.questoes.add(q);
        
        questao q1 = new questao();
        q1.setEnunciado("Quanto é 1+1?");
        q1.setPeso(2.5);
        q1.setAlternativas(this.getAlternativas1());
        this.questoes.add(q1);
        
        questao q2 = new questao();
        q2.setEnunciado("Quanto é 1+1?");
        q2.setPeso(2.5);
        q2.setAlternativas(this.getAlternativas2());
        this.questoes.add(q2);
        
        questao q3 = new questao();
        q3.setEnunciado("Quanto é 1+1?");
        q3.setPeso(2.5);
        q3.setAlternativas(this.getAlternativas3());
        this.questoes.add(q3);
        
        return this.questoes;
    }

    public ArrayList<usuario> getUsuarios() {
        usuario u = new usuario();
        u.setLogin("vinicius");
        u.setSenha("123456");
        u.setNome("Vinicius Pasqualini");
        u.setTipo(3);
        
        usuario u1 = new usuario();
        u1.setLogin("renan");
        u1.setSenha("123456");
        u1.setNome("Renan Benedicto");
        u1.setTipo(3);
        
        usuario u2 = new usuario();
        u2.setLogin("leonardo");
        u2.setSenha("123456");
        u2.setNome("Leonardo da Silva Romeiro");
        u2.setTipo(3);
        
        usuario u3 = new usuario();
        u3.setLogin("jonatas");
        u3.setSenha("123456");
        u3.setNome("Jonatas");
        u3.setTipo(3);
        
        this.usuarios.add(u);
        this.usuarios.add(u1);
        this.usuarios.add(u2);
        this.usuarios.add(u3);
        
        return this.usuarios;
    }
    
    
    
    
}

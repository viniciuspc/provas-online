/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.teste;

import br.com.fiap.prova.bean.prova.Alternativa;
import br.com.fiap.prova.bean.prova.Prova;
import br.com.fiap.prova.bean.prova.Questao;
import br.com.fiap.prova.bean.usuarios.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class populaObjetos {
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Questao> questoes = new ArrayList<Questao>();
    private ArrayList<Alternativa> alternativas = new ArrayList<Alternativa>();
    private ArrayList<Alternativa> alternativas1 = new ArrayList<Alternativa>();
    private ArrayList<Alternativa> alternativas2 = new ArrayList<Alternativa>();
    private ArrayList<Alternativa> alternativas3 = new ArrayList<Alternativa>();
    
    private Prova p = new Prova();

    
    public ArrayList<Alternativa> getAlternativas() {
        Alternativa a1 = new Alternativa();
        a1.setTexto("1");
        this.alternativas.add(a1);
        
        Alternativa a2 = new Alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas.add(a2);
        
        Alternativa a3 = new Alternativa();
        a3.setTexto("3");
        this.alternativas.add(a3);
        
        Alternativa a4 = new Alternativa();
        a4.setTexto("4");
        this.alternativas.add(a4);
        
        Alternativa a5 = new Alternativa();
        a5.setTexto("5");
        this.alternativas.add(a5);
        
        return this.alternativas;
    }

    public ArrayList<Alternativa> getAlternativas1() {
         Alternativa a1 = new Alternativa();
        a1.setTexto("1");
        this.alternativas1.add(a1);
        
        Alternativa a2 = new Alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas1.add(a2);
        
        Alternativa a3 = new Alternativa();
        a3.setTexto("3");
        this.alternativas1.add(a3);
        
        Alternativa a4 = new Alternativa();
        a4.setTexto("4");
        this.alternativas1.add(a4);
        
        Alternativa a5 = new Alternativa();
        a5.setTexto("5");
        this.alternativas1.add(a5);
        
        return this.alternativas1;
    }

    public ArrayList<Alternativa> getAlternativas2() {
        Alternativa a1 = new Alternativa();
        a1.setTexto("1");
        this.alternativas2.add(a1);
        
        Alternativa a2 = new Alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas2.add(a2);
        
        Alternativa a3 = new Alternativa();
        a3.setTexto("3");
        this.alternativas2.add(a3);
        
        Alternativa a4 = new Alternativa();
        a4.setTexto("4");
        this.alternativas2.add(a4);
        
        Alternativa a5 = new Alternativa();
        a5.setTexto("5");
        this.alternativas2.add(a5);
        
        return this.alternativas2;
    }

    public ArrayList<Alternativa> getAlternativas3() {
        Alternativa a1 = new Alternativa();
        a1.setTexto("1");
        this.alternativas3.add(a1);
        
        Alternativa a2 = new Alternativa();
        a2.setTexto("2");
        a2.setCorreta(true);
        this.alternativas3.add(a2);
        
        Alternativa a3 = new Alternativa();
        a3.setTexto("3");
        this.alternativas3.add(a3);
        
        Alternativa a4 = new Alternativa();
        a4.setTexto("4");
        this.alternativas3.add(a4);
        
        Alternativa a5 = new Alternativa();
        a5.setTexto("5");
        this.alternativas3.add(a5);
        return alternativas3;
    }
    
    

    public Prova getP() {
        this.p.setQuestoes(this.getQuestoes());
        return p;
    }

    public ArrayList<Questao> getQuestoes() {
        Questao q = new Questao();
        q.setEnunciado("Quanto é 1+1?");
        q.setPeso(2.5);
        q.setAlternativas(this.getAlternativas());
        this.questoes.add(q);
        
        Questao q1 = new Questao();
        q1.setEnunciado("Quanto é 1+1?");
        q1.setPeso(2.5);
        q1.setAlternativas(this.getAlternativas1());
        this.questoes.add(q1);
        
        Questao q2 = new Questao();
        q2.setEnunciado("Quanto é 1+1?");
        q2.setPeso(2.5);
        q2.setAlternativas(this.getAlternativas2());
        this.questoes.add(q2);
        
        Questao q3 = new Questao();
        q3.setEnunciado("Quanto é 1+1?");
        q3.setPeso(2.5);
        q3.setAlternativas(this.getAlternativas3());
        this.questoes.add(q3);
        
        return this.questoes;
    }

    public ArrayList<Usuario> getUsuarios() {
        Usuario u = new Usuario();
        u.setLogin("vinicius");
        u.setSenha("123456");
        u.setNome("Vinicius Pasqualini");
        u.setTipo(3);
        
        Usuario u1 = new Usuario();
        u1.setLogin("renan");
        u1.setSenha("123456");
        u1.setNome("Renan Benedicto");
        u1.setTipo(3);
        
        Usuario u2 = new Usuario();
        u2.setLogin("leonardo");
        u2.setSenha("123456");
        u2.setNome("Leonardo da Silva Romeiro");
        u2.setTipo(3);
        
        Usuario u3 = new Usuario();
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

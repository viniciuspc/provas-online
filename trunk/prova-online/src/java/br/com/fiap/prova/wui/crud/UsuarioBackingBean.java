package br.com.fiap.prova.wui.crud;


import br.com.fiap.prova.bean.usuarios.Usuario;
import br.com.fiap.prova.dao.DaoUsuario;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Leo
 */

@ManagedBean(name="usuarioCadastro")
@SessionScoped
public class UsuarioBackingBean {
    private Usuario u = new Usuario();
    
    private ArrayList<String> listaTipos = new ArrayList<String>();
    private String tipoSelecionado = "";

    public UsuarioBackingBean() {
        listaTipos.add("Aluno");
        listaTipos.add("Professor");
        listaTipos.add("Administrador");
    }

    
    
    public ArrayList<String> getListaTipos() {
        
        return listaTipos;
    }

    public void setListaTipos(ArrayList<String> listaTipos) {
        this.listaTipos = listaTipos;
    }

    public String getTipoSelecionado() {
        return tipoSelecionado;
    }
    
    public void setTipoSelecionado(String tipoSelecionado) {
        this.tipoSelecionado = tipoSelecionado;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    public ArrayList<Usuario> listarUsuarios(){
        return new DaoUsuario().listarUsuarios();
    }
    
    public String cadastrarUsuario(){
         
        if(this.tipoSelecionado.equals("Aluno")){
            this.u.setTipo(1);
        } else if(this.tipoSelecionado.equals("Professor")){
            this.u.setTipo(2);
        } else if(this.tipoSelecionado.equals("Administrador"))
            this.u.setTipo(3);
        
        DaoUsuario dao = new DaoUsuario();
        
        dao.cadastraUsuario(u);
        
        u = new Usuario();
        
        return null;
    }
}

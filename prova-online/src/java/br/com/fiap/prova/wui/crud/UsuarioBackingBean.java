package br.com.fiap.prova.wui.crud;


import br.com.fiap.prova.bean.usuarios.Usuario;
import br.com.fiap.prova.dao.DaoUsuario;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sun.misc.UCDecoder;

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
    private Usuario tmp = new Usuario();

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
    
    private Usuario usuarioEdicao = new Usuario();
    public boolean ativarEdicao(Usuario avaliado){
        return avaliado != null && avaliado.getId() == usuarioEdicao.getId();
    }
    
    public String editar(Usuario selecao){
        copia(this.tmp,selecao);
        
        
        usuarioEdicao = selecao;
        return null;
    }
    
    public String salvar(Usuario u){
        new DaoUsuario().atualizarUsuario(u);
        this.usuarioEdicao = new Usuario();
        return null;
    }
    
    public String excluir(Usuario u){
        new DaoUsuario().deletarUsuario(u);
        return null;
    }
    
    public String cancelar(Usuario u){
        copia(u,tmp);
        this.usuarioEdicao = new Usuario();
        return null;
    }
    
    public void copia(Usuario tmp, Usuario selecao){
        tmp.setId(selecao.getId());
        tmp.setLogin(selecao.getLogin());
        tmp.setNome(selecao.getNome());
        tmp.setSenha(selecao.getSenha());
        tmp.setTipo(selecao.getTipo());
        tmp.setTipoDescricao(selecao.getTipoDescricao());
    }
}

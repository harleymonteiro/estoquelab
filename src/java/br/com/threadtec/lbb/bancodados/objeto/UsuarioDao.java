/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Usuario;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class UsuarioDao  extends DAO<Usuario> {
    
    public UsuarioDao(){
        super(Usuario.class);
    }
    
    public Usuario salvar(Usuario user){
        return super.salvar(user);
    }
    
    public List<Usuario> buscarUsuario(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_idusuario", id);
        return super.buscarObjetos(Usuario.BUSCAR_ID, parametros);
    }
    
    public List<Usuario> buscarUsuarioNome(String email){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_nome", email);
        return super.buscarObjetos(Usuario.BUSCAR_NOME, parametros);
    }
    
    public List<Usuario> buscarUsuarioLogin(String login){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_login", login);
        return super.buscarObjetos(Usuario.BUSCAR_LOGIN, parametros);
    }
    
    public List<Usuario> buscarUsuarioLoginSenha(String login, String senha){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_login", login);
        parametros.put("_senha", senha);
        return super.buscarObjetos(Usuario.BUSCAR_LOGIN_SENHA, parametros);
    }
    
    public List<Usuario> buscarIdUsuarioSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Usuario> buscarTodos(){
        return super.buscarObjetos(Usuario.BUSCAR_TODOS, null);
    }
    
    public void apagar(Usuario user){
        super.apagar(user);
    }
    
    public Usuario alterar(Usuario user){
        return super.alterar(user);
    }
    
    public Usuario pegaUsuario(List<Usuario> lUsuario){                
        return super.buscarObjeto(lUsuario);
    }
    
}

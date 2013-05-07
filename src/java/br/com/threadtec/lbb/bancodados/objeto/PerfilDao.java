/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Perfil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class PerfilDao  extends DAO<Perfil> {
    
    public PerfilDao(){
        super(Perfil.class);
    }
    
    public Perfil salvar(Perfil user){
        return super.salvar(user);
    }
    
    public List<Perfil> buscarPerfil(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Perfil.BUSCAR_ID, parametros);
    }
    
    public List<Perfil> buscarIdPerfilSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Perfil> buscarTodos(){
        return super.buscarObjetos(Perfil.BUSCAR_TODOS, null);
    }
    
    public void apagar(Perfil user){
        super.apagar(user);
    }
    
    public Perfil alterar(Perfil user){
        return super.alterar(user);
    }
    
    public Perfil pegaPerfil(List<Perfil> lPerfil){
        Perfil user = null;
        if(lPerfil!=null)
            if(!lPerfil.isEmpty())
                for(Perfil oPerfil : lPerfil)
                    user = oPerfil;
        
        return user;
    }
    
}

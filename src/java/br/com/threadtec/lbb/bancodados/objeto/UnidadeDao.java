/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Unidade;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class UnidadeDao  extends DAO<Unidade> {
    
    public UnidadeDao(){
        super(Unidade.class);
    }
    
    public Unidade salvar(Unidade user){
        return super.salvar(user);
    }
    
    public List<Unidade> buscarUnidade(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Unidade.BUSCAR_ID, parametros);
    }
    
    public List<Unidade> buscarIdUnidadeSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Unidade> buscarTodos(){
        return super.buscarObjetos(Unidade.BUSCAR_TODOS, null);
    }
    
    public void apagar(Unidade user){
        super.apagar(user);
    }
    
    public Unidade alterar(Unidade user){
        return super.alterar(user);
    }
    
    public Unidade pegaUnidade(List<Unidade> lUnidade){
        Unidade user = null;
        if(lUnidade!=null)
            if(!lUnidade.isEmpty())
                for(Unidade oUnidade : lUnidade)
                    user = oUnidade;
        
        return user;
    }
    
}

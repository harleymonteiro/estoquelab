/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Estoque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class EstoqueDao  extends DAO<Estoque> {
    
    public EstoqueDao(){
        super(Estoque.class);
    }
    
    public Estoque salvar(Estoque user){
        return super.salvar(user);
    }
    
    public List<Estoque> buscarEstoque(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Estoque.BUSCAR_ID, parametros);
    }
    
    public List<Estoque> buscarIdEstoqueSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Estoque> buscarTodos(){
        return super.buscarObjetos(Estoque.BUSCAR_TODOS, null);
    }
    
    public void apagar(Estoque user){
        super.apagar(user);
    }
    
    public Estoque alterar(Estoque user){
        return super.alterar(user);
    }
    
    public Estoque pegaEstoque(List<Estoque> lEstoque){
        Estoque user = null;
        if(lEstoque!=null)
            if(!lEstoque.isEmpty())
                for(Estoque oEstoque : lEstoque)
                    user = oEstoque;
        
        return user;
    }
    
}

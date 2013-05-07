/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.TipoMovimento;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class TipoMovimentoDao  extends DAO<TipoMovimento> {
    
    public TipoMovimentoDao(){
        super(TipoMovimento.class);
    }
    
    public TipoMovimento salvar(TipoMovimento user){
        return super.salvar(user);
    }
    
    public List<TipoMovimento> buscarTipoMovimento(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(TipoMovimento.BUSCAR_ID, parametros);
    }
    
    public List<TipoMovimento> buscarIdTipoMovimentoSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<TipoMovimento> buscarTodos(){
        return super.buscarObjetos(TipoMovimento.BUSCAR_TODOS, null);
    }
    
    public void apagar(TipoMovimento user){
        super.apagar(user);
    }
    
    public TipoMovimento alterar(TipoMovimento user){
        return super.alterar(user);
    }
    
    public TipoMovimento pegaTipoMovimento(List<TipoMovimento> lTipoMovimento){
        TipoMovimento user = null;
        if(lTipoMovimento!=null)
            if(!lTipoMovimento.isEmpty())
                for(TipoMovimento oTipoMovimento : lTipoMovimento)
                    user = oTipoMovimento;
        
        return user;
    }
    
}

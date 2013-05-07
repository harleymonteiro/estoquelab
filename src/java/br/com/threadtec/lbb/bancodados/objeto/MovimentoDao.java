/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Movimento;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class MovimentoDao  extends DAO<Movimento> {
    
    public MovimentoDao(){
        super(Movimento.class);
    }
    
    public Movimento salvar(Movimento user){
        return super.salvar(user);
    }
    
    public List<Movimento> buscarMovimento(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Movimento.BUSCAR_ID, parametros);
    }
    
    public List<Movimento> buscarData(Date data){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_data", data);
        return super.buscarObjetos(Movimento.BUSCAR_DATA, parametros);
    }
    
    public List<Movimento> buscarIdMovimentoSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Movimento> buscarTodos(){
        return super.buscarObjetos(Movimento.BUSCAR_TODOS, null);
    }
    
    public void apagar(Movimento user){
        super.apagar(user);
    }
    
    public Movimento alterar(Movimento user){
        return super.alterar(user);
    }
    
    public Movimento pegaMovimento(List<Movimento> lMovimento){
        Movimento user = null;
        if(lMovimento!=null)
            if(!lMovimento.isEmpty())
                for(Movimento oMovimento : lMovimento)
                    user = oMovimento;
        
        return user;
    }
    
}

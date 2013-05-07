/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.TipoValidacao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class TipoValidacaoDao  extends DAO<TipoValidacao> {
    
    public TipoValidacaoDao(){
        super(TipoValidacao.class);
    }
    
    public TipoValidacao salvar(TipoValidacao user){
        return super.salvar(user);
    }
    
    public List<TipoValidacao> buscarTipoValidacao(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(TipoValidacao.BUSCAR_ID, parametros);
    }
    
    public List<TipoValidacao> buscarIdTipoValidacaoSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<TipoValidacao> buscarTodos(){
        return super.buscarObjetos(TipoValidacao.BUSCAR_TODOS, null);
    }
    
    public void apagar(TipoValidacao user){
        super.apagar(user);
    }
    
    public TipoValidacao alterar(TipoValidacao user){
        return super.alterar(user);
    }
    
    public TipoValidacao pegaTipoValidacao(List<TipoValidacao> lTipoValidacao){
        TipoValidacao user = null;
        if(lTipoValidacao!=null)
            if(!lTipoValidacao.isEmpty())
                for(TipoValidacao oTipoValidacao : lTipoValidacao)
                    user = oTipoValidacao;
        
        return user;
    }
    
}

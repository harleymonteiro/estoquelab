/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.NotaFiscal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class NotaFiscalDao  extends DAO<NotaFiscal> {
    
    public NotaFiscalDao(){
        super(NotaFiscal.class);
    }
    
    public NotaFiscal salvar(NotaFiscal user){
        return super.salvar(user);
    }
    
    public List<NotaFiscal> buscarNotaFiscal(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(NotaFiscal.BUSCAR_ID, parametros);
    }
    
    public List<NotaFiscal> buscarIdLote(int idlote){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_indicadorLote", idlote);
        return super.buscarObjetos(NotaFiscal.BUSCAR_IDLOTE, parametros);
    }
    
    public List<NotaFiscal> buscarIdNotaFiscalSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<NotaFiscal> buscarTodos(){
        return super.buscarObjetos(NotaFiscal.BUSCAR_TODOS, null);
    }
    
    public void apagar(NotaFiscal user){
        super.apagar(user);
    }
    
    public NotaFiscal alterar(NotaFiscal user){
        return super.alterar(user);
    }
    
    public NotaFiscal pegaNotaFiscal(List<NotaFiscal> lNotaFiscal){
        NotaFiscal user = null;
        if(lNotaFiscal!=null)
            if(!lNotaFiscal.isEmpty())
                for(NotaFiscal oNotaFiscal : lNotaFiscal)
                    user = oNotaFiscal;
        
        return user;
    }
    
}

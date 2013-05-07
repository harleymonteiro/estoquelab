/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Lote;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class LoteDao  extends DAO<Lote> {
    
    public LoteDao(){
        super(Lote.class);
    }
    
    public Lote salvar(Lote user){
        return super.salvar(user);
    }
    
    public List<Lote> buscarLote(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Lote.BUSCAR_ID, parametros);
    }
    
    public List<Lote> buscarLoteNotaFiscal(String nf){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_nf", nf);
        return super.buscarObjetos(Lote.BUSCAR_NOTAFISCAL, parametros);
    }
    
    public List<Lote> buscarLoteNumero(String numero){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_numero", numero);
        return super.buscarObjetos(Lote.BUSCAR_NUMERO, parametros);
    }
 
    public List<Lote> buscarLoteValidade(Date validade){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_validade", validade);
        return super.buscarObjetos(Lote.BUSCAR_VALIDADE, parametros);
    }    
    
    public List<Lote> buscarIdLoteSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Lote> buscarTodos(){
        return super.buscarObjetos(Lote.BUSCAR_TODOS, null);
    }
    
    public void apagar(Lote user){
        super.apagar(user);
    }
    
    public Lote alterar(Lote user){
        return super.alterar(user);
    }
    
    public Lote pegaLote(List<Lote> lLote){
        Lote user = null;
        if(lLote!=null)
            if(!lLote.isEmpty())
                for(Lote oLote : lLote)
                    user = oLote;
        
        return user;
    }
    
}

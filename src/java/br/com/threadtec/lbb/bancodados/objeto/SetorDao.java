/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Setor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class SetorDao  extends DAO<Setor> {
    
    public SetorDao(){
        super(Setor.class);
    }
    
    public Setor salvar(Setor objeto){
        return super.salvar(objeto);
    }
    
    public List<Setor> buscarSetor(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Setor.BUSCAR_ID, parametros);
    }
    
    public List<Setor> buscarIdSetorSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Setor> buscarTodos(){
        return super.buscarObjetos(Setor.BUSCAR_TODOS, null);
    }
    
    public void apagar(Setor objeto){
        super.apagar(objeto);
    }
    
    public Setor alterar(Setor objeto){
        return super.alterar(objeto);
    }
    
    public Setor pegaSetor(List<Setor> lSetor){
        Setor objeto = null;
        if(lSetor!=null)
            if(!lSetor.isEmpty())
                for(Setor oSetor : lSetor)
                    objeto = oSetor;
        
        return objeto;
    }
    
}

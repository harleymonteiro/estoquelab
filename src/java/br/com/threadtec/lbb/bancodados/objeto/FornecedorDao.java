/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Fornecedor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class FornecedorDao  extends DAO<Fornecedor> {
    
    public FornecedorDao(){
        super(Fornecedor.class);
    }
    
    public Fornecedor salvar(Fornecedor user){
        return super.salvar(user);
    }
    
    public List<Fornecedor> buscarFornecedor(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Fornecedor.BUSCAR_ID, parametros);
    }
    
    public List<Fornecedor> buscarFornecedorNome(String nome){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_nome", nome);
        return super.buscarObjetos(Fornecedor.BUSCAR_NOME, parametros);
    }
    
    public List<Fornecedor> buscarFornecedorFantasia(String fantasia){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_nomeFantasia", fantasia);
        return super.buscarObjetos(Fornecedor.BUSCAR_FANTASIA, parametros);
    }
    
    public List<Fornecedor> buscarIdFornecedorSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Fornecedor> buscarTodos(){
        return super.buscarObjetos(Fornecedor.BUSCAR_TODOS, null);
    }
    
    public void apagar(Fornecedor user){
        super.apagar(user);
    }
    
    public Fornecedor alterar(Fornecedor user){
        return super.alterar(user);
    }
    
    public Fornecedor pegaFornecedor(List<Fornecedor> lFornecedor){
        Fornecedor user = null;
        if(lFornecedor!=null)
            if(!lFornecedor.isEmpty())
                for(Fornecedor oFornecedor : lFornecedor)
                    user = oFornecedor;
        
        return user;
    }
    
}

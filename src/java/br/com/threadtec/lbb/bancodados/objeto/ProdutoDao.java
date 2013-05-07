/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Produto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author master
 */
public class ProdutoDao  extends DAO<Produto> {
    
    public ProdutoDao(){
        super(Produto.class);
    }
    
    public Produto salvar(Produto objeto){
        return super.salvar(objeto);
    }
    
    public List<Produto> buscarProduto(int id){
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("_id", id);
        return super.buscarObjetos(Produto.BUSCAR_ID, parametros);
    }
    
    public List<Produto> buscarIdProdutoSql(String tabela, String sql){
        return super.buscarObjetosSql(tabela, sql);
    }
    
    public List<Produto> buscarTodos(){
        return super.buscarObjetos(Produto.BUSCAR_TODOS, null);
    }
    
    public void apagar(Produto objeto){
        super.apagar(objeto);
    }
    
    public Produto alterar(Produto objeto){
        return super.alterar(objeto);
    }
    
    public Produto pegaProduto(List<Produto> lProduto){
        Produto objeto = null;
        if(lProduto!=null)
            if(!lProduto.isEmpty())
                for(Produto oProduto : lProduto)
                    objeto = oProduto;
        
        return objeto;
    }
    
}

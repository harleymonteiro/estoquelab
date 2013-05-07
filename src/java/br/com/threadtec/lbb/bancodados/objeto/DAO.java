/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.HibernateUtil;
import br.com.threadtec.lbb.bancodados.Usuario;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author master
 */
public abstract class DAO<T> {
    
    private Class<T> entidadeClasse;
    
    Session session = null;
    public DAO(Class<T> entidadeClasse) {
            this.entidadeClasse = entidadeClasse;
    }
    
    public T salvar(T entidade) {
        if(session==null)
           session = HibernateUtil.getSessionFactory().openSession(); 
           
        Transaction t=null; 
        try{
            t = session.beginTransaction();
            session.save(entidade);
            t.commit();
            return entidade;
        }catch(Exception ex){
            ex.printStackTrace();
           // t.rollback();  
            return null;
        }/*finally{  
            session.close();
        }*/
    }
    
    public void apagar(T entidade) {
        if(session==null)
           session = HibernateUtil.getSessionFactory().openSession();  
             
        
        Transaction t = null;
        try{
        t =session.beginTransaction();
        session.delete(entidade);
        t.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            //t.rollback();  
        }/*finally{  
            session.close();
        }	*/
    }
    
    public T alterar(T entidade) {
        if(session==null)
         session = HibernateUtil.getSessionFactory().openSession(); 
            
        Transaction t=null; 
        try{
            t = session.beginTransaction();
            session.update(entidade);
            t.commit();
            return entidade;
        }catch(Exception ex){
            ex.printStackTrace();
            //t.rollback();  
            return null;
        }/*finally{  
            session.close();
        }*/
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> buscarObjetos(String sqlQuery, Map<String, Object> parametros) {
        List<T> resultado = null;
        if(session==null)
         session = HibernateUtil.getSessionFactory().openSession();   
        
        Transaction t=null; 
        try{
            t = session.beginTransaction();
            Query query = session.getNamedQuery(sqlQuery);
            if(parametros!=null && !parametros.isEmpty()){
                for (Entry<String, Object> entry : parametros.entrySet()) {
                        query.setParameter(entry.getKey(), entry.getValue());
                }
            }
            List<T> oClass =  query.list();
            t.commit();
            if(oClass!=null && !oClass.isEmpty()){
                resultado = oClass;
            }else{
                resultado = null;
            }
            return resultado;
        }catch(Exception ex){
            ex.printStackTrace();
            //t.rollback();
            return null;
        }/*finally{  
            session.close();
        }*/
    }
    @SuppressWarnings("unchecked")
    protected List<T> buscarObjetosSql(String sqlTabela, String sqlCondicao) {
    try{            
            Session session = HibernateUtil.getSessionFactory().openSession();            
            List objetoLista = session.createQuery("FROM "+sqlTabela+" WHERE "+sqlCondicao).list();
            session.flush();
            if(objetoLista.isEmpty()){objetoLista=null;}
            return objetoLista;
        }catch(Exception ex){
            System.out.println("--->"+ex.getMessage());
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    protected T buscarObjeto(List<T> lObj) {
        T tObj = null;
        if(lObj!=null){
            if(!lObj.isEmpty()){
                for(T objT : lObj){
                    tObj = objT;
                }    
            }   
        }    
        
        return tObj;
    }
    
    
    
    
}

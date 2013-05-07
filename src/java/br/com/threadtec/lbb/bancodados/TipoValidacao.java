package br.com.threadtec.lbb.bancodados;
// Generated May 2, 2013 6:37:11 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * TipoValidacao generated by hbm2java
 */
@Entity
@Table(name="tipo_validacao",schema="public")
@NamedQueries({@NamedQuery(name="TipoValidacao.buscar_tipovalidacao_id",          query="FROM TipoValidacao WHERE id = :_id"),
               @NamedQuery(name="TipoValidacao.buscar_tipovalidacao_todos",       query="FROM TipoValidacao")})
public class TipoValidacao  implements java.io.Serializable {


     public static final String BUSCAR_ID             = "TipoValidacao.buscar_tipovalidacao_id";
     public static final String BUSCAR_TODOS          = "TipoValidacao.buscar_tipovalidacao_todos";
     
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "tipo_validacao_sequence")
     @SequenceGenerator(name="tipo_validacao_sequence", sequenceName = "tipo_validacao_sequence", allocationSize=1)
     private int id;
     @Column(name="descricao", nullable=false, length=30)
     private String descricao;

    public TipoValidacao() {
    }

    public TipoValidacao(int id, String descricao) {
       this.id = id;
       this.descricao = descricao;
    }
   
         public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
        public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}



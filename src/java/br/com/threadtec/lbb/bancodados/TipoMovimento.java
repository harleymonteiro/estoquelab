package br.com.threadtec.lbb.bancodados;
// Generated May 2, 2013 6:37:11 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * TipoMovimento generated by hbm2java
 */
@Entity
@Table(name="tipo_movimento",schema="public")
@NamedQueries({@NamedQuery(name="TipoMovimento.buscar_tipomovimento_id",          query="FROM TipoMovimento WHERE id = :_id"),
               @NamedQuery(name="TipoMovimento.buscar_tipomovimento_todos",       query="FROM TipoMovimento")})
public class TipoMovimento  implements java.io.Serializable {


     public static final String BUSCAR_ID     = "TipoMovimento.buscar_tipomovimento_id";
     public static final String BUSCAR_TODOS  = "TipoMovimento.buscar_tipomovimento_todos";
     
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE,  generator    = "tipo_movimento_sequence")
     @SequenceGenerator(name="tipo_movimento_sequence", sequenceName = "tipo_movimento_sequence", allocationSize=1)
     private int id;
     @Column(name="descricao", nullable=false, length=10)
     private String descricao;
     @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoMovimento", targetEntity=Movimento.class)
     private Set movimentos = new HashSet(0);

    public TipoMovimento() {
    }

	
    public TipoMovimento(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public TipoMovimento(int id, String descricao, Set movimentos) {
       this.id = id;
       this.descricao = descricao;
       this.movimentos = movimentos;
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
    public Set getMovimentos() {
        return this.movimentos;
    }
    
    public void setMovimentos(Set movimentos) {
        this.movimentos = movimentos;
    }

}



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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Setor generated by hbm2java
 */
@Entity
@Table(name="setor",schema="public")
@NamedQueries({@NamedQuery(name="Setor.buscar_setor_id",          query="FROM Setor WHERE id = :_id"),
               @NamedQuery(name="Setor.buscar_setor_todos",       query="FROM Setor")})
public class Setor  implements java.io.Serializable {


     public static final String BUSCAR_ID             = "Setor.buscar_setor_id";
     public static final String BUSCAR_TODOS          = "Setor.buscar_setor_todos";
     
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "setor_sequence")
     @SequenceGenerator(name="setor_sequence", sequenceName = "setor_sequence", allocationSize=1)
     private int id;
     @Column(name="descricao", nullable=false, length=10)
     private String descricao;
     @OneToMany(mappedBy="setor", cascade=CascadeType.ALL, fetch=FetchType.LAZY, targetEntity=SetorUsuarioPerfil.class)
     private Set setorUsuarioPerfils = new HashSet(0);
     @OneToMany(mappedBy="setor", cascade=CascadeType.ALL, fetch=FetchType.LAZY, targetEntity=Movimento.class)
     private Set movimentos = new HashSet(0);

    public Setor() {
    }

	
    public Setor(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public Setor(int id, String descricao, Set setorUsuarioPerfils, Set movimentos) {
       this.id = id;
       this.descricao = descricao;
       this.setorUsuarioPerfils = setorUsuarioPerfils;
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
        public Set getSetorUsuarioPerfils() {
        return this.setorUsuarioPerfils;
    }
    
    public void setSetorUsuarioPerfils(Set setorUsuarioPerfils) {
        this.setorUsuarioPerfils = setorUsuarioPerfils;
    }
        public Set getMovimentos() {
        return this.movimentos;
    }
    
    public void setMovimentos(Set movimentos) {
        this.movimentos = movimentos;
    }




}


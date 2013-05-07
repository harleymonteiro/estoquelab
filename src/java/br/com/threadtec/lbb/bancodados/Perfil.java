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
 * Perfil generated by hbm2java
 */
@Entity
@Table(name="perfil",schema="public")
@NamedQueries({@NamedQuery(name="Perfil.buscar_perfil_id",          query="FROM Perfil WHERE id = :_id"),
               @NamedQuery(name="Perfil.buscar_perfil_todos",       query="FROM Perfil")})
public class Perfil  implements java.io.Serializable {


     public static final String BUSCAR_ID             = "Perfil.buscar_perfil_id";
     public static final String BUSCAR_TODOS          = "Perfil.buscar_perfil_todos";
     
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "perfil_sequence")
     @SequenceGenerator(name="perfil_sequence", sequenceName = "perfil_sequence", allocationSize=1)
     private int id;
     @Column(name="descricao", nullable=false, length=10)
     private String descricao;
     @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="perfil",targetEntity=SetorUsuarioPerfil.class)
     private Set setorUsuarioPerfils = new HashSet(0);

    public Perfil() {
    }

	
    public Perfil(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public Perfil(int id, String descricao, Set setorUsuarioPerfils) {
       this.id = id;
       this.descricao = descricao;
       this.setorUsuarioPerfils = setorUsuarioPerfils;
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




}



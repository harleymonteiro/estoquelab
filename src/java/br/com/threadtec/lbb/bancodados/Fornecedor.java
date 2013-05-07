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
 * Fornecedor generated by hbm2java
 */
@Entity
@Table(name="fornecedor",schema="public")
@NamedQueries({@NamedQuery(name="Fornecedor.buscar_fornecedor_id",          query="FROM Fornecedor WHERE id = :_id"),
               @NamedQuery(name="Fornecedor.buscar_fornecedor_nome",        query="FROM Fornecedor WHERE nome = :_nome"),
               @NamedQuery(name="Fornecedor.buscar_fornecedor_fantasia",    query="FROM Fornecedor WHERE nomeFantasia = :_nomeFantasia"),
               @NamedQuery(name="Fornecedor.buscar_fornecedor_todos",       query="FROM Fornecedor")})
public class Fornecedor  implements java.io.Serializable {


     public static final String BUSCAR_ID            = "Fornecedor.buscar_fornecedor_id";
     public static final String BUSCAR_NOME            = "Fornecedor.buscar_fornecedor_nome";
     public static final String BUSCAR_FANTASIA            = "Fornecedor.buscar_fornecedor_fantasia";
     public static final String BUSCAR_TODOS         = "Fornecedor.buscar_fornecedor_todos";
     
     
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "fornecedor_sequence")
     @SequenceGenerator(name="fornecedor_sequence", sequenceName = "fornecedor_sequence", allocationSize=1)
     private int id;
     @Column(name="nome", nullable=false, length=30)
     private String nome;
     @Column(name="nome_fantasia", nullable=false, length=30)
     private String nomeFantasia;
     @Column(name="razao_social", nullable=false, length=30)
     private String razaoSocial;
     @Column(name="inscr_estadual", nullable=false, length=15)
     private String inscrEstadual;
     @OneToMany(mappedBy="fornecedor", cascade=CascadeType.ALL, fetch=FetchType.LAZY, targetEntity=NotaFiscal.class)
     private Set notaFiscals = new HashSet(0);

    public Fornecedor() {}

	
    public Fornecedor(int id, String nome, String nomeFantasia, String razaoSocial, String inscrEstadual) {
        this.id = id;
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.inscrEstadual = inscrEstadual;
    }
    public Fornecedor(int id, String nome, String nomeFantasia, String razaoSocial, String inscrEstadual, Set notaFiscals) {
       this.id = id;
       this.nome = nome;
       this.nomeFantasia = nomeFantasia;
       this.razaoSocial = razaoSocial;
       this.inscrEstadual = inscrEstadual;
       this.notaFiscals = notaFiscals;
    }
   
        public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
        public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
        public String getNomeFantasia() {
        return this.nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
        public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
        public String getInscrEstadual() {
        return this.inscrEstadual;
    }
    
    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

        public Set getNotaFiscals() {
        return this.notaFiscals;
    }
    
    public void setNotaFiscals(Set notaFiscals) {
        this.notaFiscals = notaFiscals;
    }




}


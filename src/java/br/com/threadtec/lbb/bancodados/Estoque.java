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
 * @ Harley Monteiro e Pamela Gatinho
 */
@Entity
@Table(name="estoque",schema="public")
@NamedQueries({@NamedQuery(name="Estoque.buscar_estoque_id",          query="FROM Estoque WHERE id = :_id"),
               @NamedQuery(name="Estoque.buscar_estoque_todos",       query="FROM Estoque")})
public class Estoque  implements java.io.Serializable {


     public static final String BUSCAR_ID            = "Estoque.buscar_estoque_id";
     public static final String BUSCAR_TODOS         = "Estoque.buscar_estoque_todos";
     
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "estoque_sequence")
     @SequenceGenerator(name="estoque_sequence", sequenceName = "estoque_sequence", allocationSize=1)
     private int id;
     @ManyToOne
     @JoinColumn(name = "id", referencedColumnName = "id", insertable=false, updatable=false) 
     private NotaFiscal notaFiscal;
     @ManyToOne
     @JoinColumn(name = "id", referencedColumnName = "id", insertable=false, updatable=false) 
     private Produto produto;
     @Column(name="qtd_minima", nullable=false)
     private int qtdMinima;
     @Column(name="qtd_total", nullable=false)
     private int qtdTotal;
     @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estoque", targetEntity=Movimento.class)
     private Set movimentos = new HashSet(0);

    public Estoque() {
    }

	
    public Estoque(int id, NotaFiscal notaFiscal, Produto produto, int qtdMinima, int qtdTotal) {
        this.id = id;
        this.notaFiscal = notaFiscal;
        this.produto = produto;
        this.qtdMinima = qtdMinima;
        this.qtdTotal = qtdTotal;
    }
    public Estoque(int id, NotaFiscal notaFiscal, Produto produto, int qtdMinima, int qtdTotal, Set movimentos) {
       this.id = id;
       this.notaFiscal = notaFiscal;
       this.produto = produto;
       this.qtdMinima = qtdMinima;
       this.qtdTotal = qtdTotal;
       this.movimentos = movimentos;
    }
   
         public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
        public NotaFiscal getNotaFiscal() {
        return this.notaFiscal;
    }
    
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
        public int getQtdMinima() {
        return this.qtdMinima;
    }
    
    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    
        public int getQtdTotal() {
        return this.qtdTotal;
    }
    
    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }
    public Set getMovimentos() {
        return this.movimentos;
    }
    
    public void setMovimentos(Set movimentos) {
        this.movimentos = movimentos;
    }




}



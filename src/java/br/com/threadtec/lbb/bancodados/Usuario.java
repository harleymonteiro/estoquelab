package br.com.threadtec.lbb.bancodados;
// Generated May 2, 2013 6:37:11 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario",schema="public")
@NamedQueries({@NamedQuery(name="Usuario.buscar_usuario_id",          query="FROM Usuario WHERE id = :_idusuario"),
               @NamedQuery(name="Usuario.buscar_usuario_nome",        query="FROM Usuario WHERE nome LIKE :_nome"),
               @NamedQuery(name="Usuario.buscar_usuario_login",       query="from Usuario WHERE login LIKE :_login"),
               @NamedQuery(name="Usuario.buscar_usuario_login_senha", query="from Usuario WHERE login = :_login AND senha = :_senha"),
               @NamedQuery(name="Usuario.buscar_usuario_todos",       query="FROM Usuario")})
public class Usuario  implements java.io.Serializable {

     public static final String BUSCAR_ID            = "Usuario.buscar_usuario_id";
     public static final String BUSCAR_NOME          = "Usuario.buscar_usuario_nome";
     public static final String BUSCAR_LOGIN         = "Usuario.buscar_usuario_login";
     public static final String BUSCAR_LOGIN_SENHA   = "Usuario.buscar_usuario_login_senha";
     public static final String BUSCAR_TODOS         = "Usuario.buscar_usuario_todos"; 
     
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "usuario_sequence")
     @SequenceGenerator(name="usuario_sequence", sequenceName = "usuario_sequence", allocationSize=1)
     private int id;
    @Column(name="login", nullable=false, length=15)
     private String login;
    @Column(name="nome", nullable=false, length=40)
     private String nome;
    @Column(name="senha", nullable=false, length=30)
     private String senha;
    @Column(name="email", nullable=false, length=40)
     private String email;
    @Column(name="is_ativo", nullable=false)
     private int isAtivo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ultimo_acesso", nullable=false, length=29)
     private Date dtUltimoAcesso;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_cadastro", nullable=false, length=29)
     private Date dtCadastro;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuario",targetEntity=SetorUsuarioPerfil.class)
     private Set setorUsuarioPerfils = new HashSet(0);
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuario",targetEntity=Movimento.class)
     private Set movimentos = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int id, String login, String nome, String senha, String email, int isAtivo, Date dtUltimoAcesso, Date dtCadastro) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.isAtivo = isAtivo;
        this.dtUltimoAcesso = dtUltimoAcesso;
        this.dtCadastro = dtCadastro;
    }
    public Usuario(int id, String login, String nome, String senha, String email, int isAtivo, Date dtUltimoAcesso, Date dtCadastro, Set setorUsuarioPerfils, Set movimentos) {
       this.id = id;
       this.login = login;
       this.nome = nome;
       this.senha = senha;
       this.email = email;
       this.isAtivo = isAtivo;
       this.dtUltimoAcesso = dtUltimoAcesso;
       this.dtCadastro = dtCadastro;
       this.setorUsuarioPerfils = setorUsuarioPerfils;
       this.movimentos = movimentos;
    }
   
         public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
        public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
        public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
        public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
        public int getIsAtivo() {
        return this.isAtivo;
    }
    
    public void setIsAtivo(int isAtivo) {
        this.isAtivo = isAtivo;
    }
        public Date getDtUltimoAcesso() {
        return this.dtUltimoAcesso;
    }
    
    public void setDtUltimoAcesso(Date dtUltimoAcesso) {
        this.dtUltimoAcesso = dtUltimoAcesso;
    }
        public Date getDtCadastro() {
        return this.dtCadastro;
    }
    
    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
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



package br.com.threadtec.lbb.bancodados;
// Generated May 2, 2013 6:37:11 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
 * SetorUsuarioPerfil generated by hbm2java
 */
@Entity
@Table(name="setor_usuario_perfil",schema="public")
public class SetorUsuarioPerfil implements Serializable{

     @Id
     @GeneratedValue
     private SetorUsuarioPerfilId setorusuarioperfilid;
     private Usuario usuario;
     private Setor setor;
     private Perfil perfil;
    

    public SetorUsuarioPerfil() {
    }

    public SetorUsuarioPerfil(SetorUsuarioPerfilId setorusuarioperfilid, Usuario usuario, Setor setor, Perfil perfil) {
       this.setorusuarioperfilid = setorusuarioperfilid;
       this.usuario = usuario;
       this.setor = setor;
       this.perfil = perfil;
    }
   
    
    @AttributeOverrides( {
        @AttributeOverride(name="setorId", column=@Column(name="setor_id", nullable=false) ), 
        @AttributeOverride(name="usuarioId", column=@Column(name="usuario_id", nullable=false) ), 
        @AttributeOverride(name="perfilId", column=@Column(name="perfil_id", nullable=false) ) } )
    public SetorUsuarioPerfilId getSetorUsuarioPerfil() {
        return this.setorusuarioperfilid;
    }
    
    public void setSetorUsuarioPerfil(SetorUsuarioPerfilId setorusuarioperfilid) {
        this.setorusuarioperfilid = setorusuarioperfilid;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        public Setor getSetor() {
        return this.setor;
    }
    
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}



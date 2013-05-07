package br.com.threadtec.lbb.bancodados;
// Generated May 2, 2013 6:37:11 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SetorUsuarioPerfilId generated by hbm2java
 */
@Embeddable
public class SetorUsuarioPerfilId  implements java.io.Serializable {


     private int setorId;
     private int usuarioId;
     private int perfilId;

    public SetorUsuarioPerfilId() {
    }

    public SetorUsuarioPerfilId(int setorId, int usuarioId, int perfilId) {
       this.setorId = setorId;
       this.usuarioId = usuarioId;
       this.perfilId = perfilId;
    }
   

    @Column(name="setor_id", nullable=false)
    public int getSetorId() {
        return this.setorId;
    }
    
    public void setSetorId(int setorId) {
        this.setorId = setorId;
    }

    @Column(name="usuario_id", nullable=false)
    public int getUsuarioId() {
        return this.usuarioId;
    }
    
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Column(name="perfil_id", nullable=false)
    public int getPerfilId() {
        return this.perfilId;
    }
    
    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SetorUsuarioPerfilId) ) return false;
		 SetorUsuarioPerfilId castOther = ( SetorUsuarioPerfilId ) other; 
         
		 return (this.getSetorId()==castOther.getSetorId())
 && (this.getUsuarioId()==castOther.getUsuarioId())
 && (this.getPerfilId()==castOther.getPerfilId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSetorId();
         result = 37 * result + this.getUsuarioId();
         result = 37 * result + this.getPerfilId();
         return result;
   }   


}



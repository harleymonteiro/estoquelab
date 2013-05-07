/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.threadtec.lbb.controle.beans;

import br.com.threadtec.lbb.bancodados.Usuario;
import br.com.threadtec.lbb.bancodados.objeto.UsuarioDao;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
    Ducomento : UsuarioBean
    Criado em : May 6, 2013, 8:34:59 PM
    Author     : Harley Monteiro

 */

 /*
    Atualizaçõe:
       Atualizado em:
       Autor:
       Descrição:
 */

@ManagedBean
@SessionScoped
public class UserBean implements Serializable{
    
/***************************************************************************
 ******************** Informações dos Usuários ****************************
 ******************* Cria uma sessão do usuário ***************************
 ***************************************************************************/
    private Usuario user;

    public UserBean(){
        this.user = new Usuario();
    }
    
    //Retorna as variaveis da classe usuario
    public Usuario getUser() {
        return user;
    }

    //Pega um novo objeto de usuario
    public void setUser(Usuario user) {
        this.user = user;
    }
    
    //Recebe as informacoes de login e senha da pag. e cria a sessao do usuario
    public String entrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        UsuarioDao udao = new UsuarioDao();
        //chama o metodo de controle e regra de nogocio do sistema
        Usuario user = udao.pegaUsuario(udao.buscarUsuarioLoginSenha(this.user.getLogin(), this.user.getSenha()));
        if(user!=null){
            if(user.getIsAtivo()==1){
               this.user = user;
               return "app";
            }else{
               FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                "O usuário não tem acesso ao sistema.", "");
                context.addMessage(null, message);
                return null;
            }   
        }else{
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                "Login incorreto e/ou senha incorreta!", "");
            context.addMessage(null, message);
            return null;            
        }    
        
    }
    
    //Saida do usuario do sistema. Apaga todos as sessoes abertas pelo usuario
    public String sair(){
        HttpSession session = (HttpSession)
             FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "login";
    }

    
}

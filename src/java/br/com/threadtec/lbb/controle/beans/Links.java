/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.threadtec.lbb.controle.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
    Ducomento  : Links
    Criado em  : Apr 3, 2013, 12:44:56 AM
    Author     : Harley Monteiro
    Descrição  : Classe é responsável pela configuração dos links do sistema

 */

 /*
    Atualizaçõe:
       Atualizado em:
       Autor:
       Descrição:
 */
@ManagedBean
@RequestScoped
public class Links  implements Serializable{

    public String linkComputador(){
        return "/computador/home.xhtml?faces-redirect=true";
    }
    public String linkUsuario(){
        return "/computador/usuario.xhtml?faces-redirect=true";
    }
    public String linkUsuarioInserir(){
        return "/computador/usuarioinserir.xhtml?faces-redirect=true";
    }
    public String linkAppHome(){
        return "/computador/app-home.xhtml?faces-redirect=true";
    }
    public void linkTeste(){
        System.out.println("teste");
    }
    
}

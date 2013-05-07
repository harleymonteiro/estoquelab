/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.threadtec.lbb.controle.beans;

import br.com.threadtec.lbb.bancodados.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
    Ducomento : UsuarioBean
    Criado em : May 6, 2013, 9:03:14 PM
    Author     : Harley Monteiro

 */

 /*
    Atualizaçõe:
       Atualizado em:
       Autor:
       Descrição:
 */

@ManagedBean
@RequestScoped
public class UsuarioBean {

/***************************************************************************
 * ******************* Informações dos Usuários ****************************
 * ****************** Inserir, Buscar, Alterar e Apagar Usuarios do Banco de dados ***************************
 ***************************************************************************/
    private Usuario usuario;

    //Retorna as variaveis da classe usuario
    public Usuario getUsuario() {
        return usuario;
    }

    //Pega um novo objeto de usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void inserir(){}
    
    public void buscarNome(){}
    
    public void buscarId(){}
    
    public void buscarTodos(){}
    
    public void alterar(){}
    
    public void apagar(){}
    
}

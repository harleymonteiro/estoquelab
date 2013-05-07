/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadtec.lbb.bancodados.objeto;

import br.com.threadtec.lbb.bancodados.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author master
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UsuarioDao udao = new UsuarioDao();
       List<Usuario> lu = new ArrayList<Usuario>();
       Usuario u = new Usuario();
       u.setNome("Harley Monteiro");
       u.setLogin("harley"); 
       u.setEmail("harley"); 
       u.setSenha("harley"); 
       u.setDtCadastro(new Date());
       u.setDtUltimoAcesso(new Date());
       u.setIsAtivo(0);
       udao.salvar(u);         
    }
}

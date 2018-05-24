/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice;

import com.mycompany.webservice.DAO.UsuarioDAO;
import com.mycompany.webservice.entity.Usuario;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Asus
 */
@WebService(serviceName = "Usuarios")
public class Usuarios {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "findId")
    public Usuario findId(@WebParam(name = "id") int id) {
        Usuario user = UsuarioDAO.findUserId(id);                
        return user;
    }
    
    @WebMethod(operationName = "findAll")
    public List<Usuario> findAll() {
        List<Usuario> users = UsuarioDAO.findUserAll();                
        return users;
    }
    @WebMethod(operationName = "findIdNacional")
    public Usuario findIdNacional(@WebParam(name = "idNacional") String idNacional) {
        Usuario users = UsuarioDAO.findIdNacional(idNacional);                
        return users;
    }
    
    @WebMethod(operationName = "findEmailPasswer")
    public Usuario findEmailPasswer(@WebParam(name = "email") String email , @WebParam(name = "passwer") String passwer) {
        Usuario users = UsuarioDAO.findEmaiPaswer(email, passwer);             
        return users;
    }
}

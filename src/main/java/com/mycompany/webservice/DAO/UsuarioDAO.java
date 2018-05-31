/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice.DAO;

import com.mycompany.webservice.conexion.ConexionAdmUsuario;
import com.mycompany.webservice.entity.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Asus
 */
public class UsuarioDAO {
    
    public UsuarioDAO(){
    }
    
    public static Usuario findUserId(int id) {
        Usuario user = new Usuario();
        String sql = "select id_usuario, email, passwer, last_name, name, birthdate, id_nacional, estado, departamento from usuario where id_usuario = ?";
        try {
            Connection con = ConexionAdmUsuario.obtener();
            PreparedStatement sent = (PreparedStatement) con.prepareStatement(sql);
            sent.setInt(1, id);
            ResultSet rs = sent.executeQuery();
            if(rs.next()){
               user.setIdUsuario(rs.getInt("id_usuario"));
               user.setEmail(rs.getString("email"));
               user.setPasswer(rs.getString("passwer"));
               user.setLast_name(rs.getString("last_name"));
               user.setName(rs.getString("name"));
               user.setBirthdate(rs.getDate("birthdate"));
               user.setId_nacional(rs.getString("id_nacional"));
               user.setEstado(rs.getString("estado")); 
               user.setDepartament(rs.getString("departamento"));
            }
            
        } catch (SQLException e) {
            System.out.print("SQLError Usuario.findUserId(id)");
        } catch (Exception e) {
            System.out.print("Error Usuario.findUserId(id)");
        }        
        
        return user;
    }
    
    public static Usuario findIdNacional(String idNacional) {
        Usuario user = new Usuario();
        String sql = "select id_usuario, email, passwer, last_name, name, birthdate, id_nacional, estado,departamento from usuario where id_nacional = ?";
        try {
            Connection con = ConexionAdmUsuario.obtener();
            PreparedStatement sent = (PreparedStatement) con.prepareStatement(sql);
            sent.setString(1, idNacional);
            ResultSet rs = sent.executeQuery();
            if(rs.next()){
               user.setIdUsuario(rs.getInt("id_usuario"));
               user.setEmail(rs.getString("email"));
               user.setPasswer(rs.getString("passwer"));
               user.setLast_name(rs.getString("last_name"));
               user.setName(rs.getString("name"));
               user.setBirthdate(rs.getDate("birthdate"));
               user.setId_nacional(rs.getString("id_nacional"));
               user.setEstado(rs.getString("estado")); 
               user.setDepartament(rs.getString("departamento"));
            }
            
        } catch (SQLException e) {
            System.out.print("SQLError Usuario.findIdNacional(id)");
        } catch (Exception e) {
            System.out.print("Error Usuario.findIdNacional(id)");
        }        
        
        return user;
    }
    
    public static Usuario findEmaiPaswer(String email,String passwer) {
        Usuario user = new Usuario();
        String sql = "select id_usuario, email, passwer, last_name, name, birthdate, id_nacional, estado,departamento from usuario where email = ? and passwer = ? ";
        try {
            Connection con = ConexionAdmUsuario.obtener();
            PreparedStatement sent = (PreparedStatement) con.prepareStatement(sql);
            sent.setString(1, email);
            sent.setString(2, passwer);
            ResultSet rs = sent.executeQuery();
            if(rs.next()){
               user.setIdUsuario(rs.getInt("id_usuario"));
               user.setEmail(rs.getString("email"));
               user.setPasswer(rs.getString("passwer"));
               user.setLast_name(rs.getString("last_name"));
               user.setName(rs.getString("name"));
               user.setBirthdate(rs.getDate("birthdate"));
               user.setId_nacional(rs.getString("id_nacional"));
               user.setEstado(rs.getString("estado")); 
               user.setDepartament(rs.getString("departamento"));
            }
            
        } catch (SQLException e) {
            System.out.print("SQLError Usuario.findIdNacional(id)");
        } catch (Exception e) {
            System.out.print("Error Usuario.findIdNacional(id)");
        }        
        
        return user;
    }
    
    public static List<Usuario> findUserAll() {
        Usuario user = new Usuario();
        List<Usuario> list = new ArrayList<Usuario>();
        String sql = "select id_usuario, email, passwer, last_name, name, birthdate, id_nacional, estado,departamento from usuario ";
        try {
            Connection con = ConexionAdmUsuario.obtener();
            PreparedStatement sent = (PreparedStatement) con.prepareStatement(sql);
            
            ResultSet rs = sent.executeQuery();
            
            while(rs.next()){
               user = new Usuario();
               user.setIdUsuario(rs.getInt("id_usuario"));
               user.setEmail(rs.getString("email"));
               user.setPasswer(rs.getString("passwer"));
               user.setLast_name(rs.getString("last_name"));
               user.setName(rs.getString("name"));
               user.setBirthdate(rs.getDate("birthdate"));
               user.setId_nacional(rs.getString("id_nacional"));
               user.setEstado(rs.getString("estado")); 
               user.setDepartament(rs.getString("departamento"));
               list.add(user);
            }
            
        } catch (SQLException e) {
            System.out.print("SQLError Usuario.findUserId(id)");
        } catch (Exception e) {
            System.out.print("Error Usuario.findUserId(id)");
        }        
        
        return list;
    }
}

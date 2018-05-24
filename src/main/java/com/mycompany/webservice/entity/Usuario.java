/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice.entity;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Usuario {
    private int idUsuario;
    private String email;
    private String passwer;
    private String last_name;
    private String name;
    private Date birthdate;
    private String id_nacional;
    private String estado;

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswer() {
        return passwer;
    }

    public void setPasswer(String passwer) {
        this.passwer = passwer;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getId_nacional() {
        return id_nacional;
    }

    public void setId_nacional(String id_nacional) {
        this.id_nacional = id_nacional;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

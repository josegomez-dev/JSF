package com.cenfotec.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alego
 */
@RequestScoped
@ManagedBean
public class Bean {
    
    private String name;
    private int edad;
    private String mail;
    private String hobbie;

    /**
     * Creates a new instance of Bean
     */
    public Bean() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the hobbie
     */
    public String getHobbie() {
        return hobbie;
    }

    /**
     * @param hobbie the hobbie to set
     */
    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }
    
}

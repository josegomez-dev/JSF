/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.astrofreakazoid.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author alego
 */
@RequestScoped
@ManagedBean
public class Bean {

    private String name;
    private String ced;
    private String mail;
    private Integer edad;
    
    private String tech;
    
    private String codPais;
    private String codCiudad;
    private List<String> lst = new ArrayList<String>();
    
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
     * @return the ced
     */
    public String getCed() {
        return ced;
    }

    /**
     * @param ced the ced to set
     */
    public void setCed(String ced) {
        this.ced = ced;
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
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    /**
     * @return the codPais
     */
    public String getCodPais() {
        return codPais;
    }

    /**
     * @param codPais the codPais to set
     */
    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    /**
     * @return the codCiudad
     */
    public String getCodCiudad() {
        return codCiudad;
    }

    /**
     * @param codCiudad the codCiudad to set
     */
    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    /**
     * @return the lst
     */
    public List<String> getLst() {
        return lst;
    }

    /**
     * @param lst the lst to set
     */
    public void setLst(List<String> lst) {
        this.lst = lst;
    }
    
    public void cargarCiudades(AjaxBehaviorEvent event){
        switch(codPais){
            case "1":
                //PERU
                lst.add("LIMA");
                lst.add("CUZCO");
                break;
            case "2":
                //COLOMBIA
                lst.add("BOGOTA");
                lst.add("CALI");
                break;
        }
    }
    
    public void cargarCiudadesPrime(){ // No hace falta que reciba un AjaxBehaviorEvent
        switch(codPais){
            case "1":
                //PERU
                lst.add("LIMA");
                lst.add("CUZCO");
                break;
            case "2":
                //COLOMBIA
                lst.add("BOGOTA");
                lst.add("CALI");
                break;
        }
    }    

    /**
     * @return the tech
     */
    public String getTech() {
        return tech;
    }

    /**
     * @param tech the tech to set
     */
    public void setTech(String tech) {
        this.tech = tech;
    }
}

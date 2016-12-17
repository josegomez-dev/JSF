/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author alego
 */
@RequestScoped
@ManagedBean
public class Ciudad {

    private String codPais;
    private String codCiudad;
    private List<String> lst = new ArrayList<String>();
    /**
     * Creates a new instance of Ciudad
     */
    public Ciudad() {
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
    
    public void cargarCiudadesPrime(){
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
    
}

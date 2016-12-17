/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.validators;

/**
 *
 * @author alego
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("mailValidator")
public class MailValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(
            (CharSequence) value);
        
        HtmlInputText htmlInputText = (HtmlInputText) component;
        String label;
        
        if(htmlInputText.getLabel() == null || htmlInputText.getLabel().trim().equals("")){
            label = htmlInputText.getLabel();
        }else{
            label = htmlInputText.getLabel();
        }
        
        if(!matcher.matches()){
            FacesMessage facesMessage = new FacesMessage(label + ": no es una direccion email valida");
            
            throw new ValidatorException(facesMessage);
        }
        
    }
    
}

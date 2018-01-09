/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbean;

import entities.Customer;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.NewSessionBean;

/**
 *
 * @author xDrake
 */
@ManagedBean
@ViewScoped
public class NewJSFManagedBean {
    @EJB
    private NewSessionBean newSessionBean;

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }
    
    public List<Customer> getCustomers() {
        return this.newSessionBean.getCustomers();
    }
}

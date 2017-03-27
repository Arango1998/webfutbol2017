/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webfutbol2017.frontend.beans;

import com.webfutbol2017.backend.persistence.entities.Torneo;
import com.webfutbol2017.backend.persistence.facades.TorneoFacade;
import javax.inject.Named;
import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author camila
 */
@Named(value = "torneoManagedBean")
@ConversationScoped
public class TorneoManagedBean implements Serializable {
    
    private Torneo torneo;
    @EJB
    private TorneoFacade TorneoEJB;
    
    public TorneoManagedBean() {
    }
    
    public Torneo getTorneo() {
        return torneo;
    }
    
    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
    
    @PostConstruct
    public void init() {
        torneo = new Torneo();
        
    }
    
    public List<Torneo> listarTorneo() {
        return TorneoEJB.findAll();
    }
    
    public void registrarTorneo() {
        TorneoEJB.create(torneo);
        
    }
    
    public void eliminarTorneo() {
        
        TorneoEJB.remove(torneo);
        
    }
}

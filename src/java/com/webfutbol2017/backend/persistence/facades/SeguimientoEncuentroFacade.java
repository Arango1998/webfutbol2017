/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webfutbol2017.backend.persistence.facades;

import com.webfutbol2017.backend.persistence.entities.SeguimientoEncuentro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cristian Suesca
 */
@Stateless
public class SeguimientoEncuentroFacade extends AbstractFacade<SeguimientoEncuentro> {

    @PersistenceContext(unitName = "webfutbol2017PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SeguimientoEncuentroFacade() {
        super(SeguimientoEncuentro.class);
    }
    
}

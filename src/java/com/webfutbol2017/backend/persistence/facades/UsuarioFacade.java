/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webfutbol2017.backend.persistence.facades;

import com.webfutbol2017.backend.persistence.entities.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Cristian Suesca
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "webfutbol2017PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario login(String clave, Integer documento) {
        Usuario user = null;
        TypedQuery<Usuario> query = getEntityManager().createNamedQuery("Usuario.login", Usuario.class);
        query.setParameter("doc", documento.toString());
        query.setParameter("clv", clave);
        List<Usuario> resultado = query.getResultList();
        if(resultado.size() == 1){
            user = resultado.get(0);
        }
        return user;
    }
}

package com.webfutbol2017.frontend.beans.usuarios.seguridad;

import com.webfutbol2017.backend.persistence.entities.Usuario;
import com.webfutbol2017.backend.persistence.facades.UsuarioFacade;
import com.webfutbol2017.frontend.utilities.converters.InterfaceController;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Cristian Suesca
 */
@Named(value = "registroJugadorManagedBean")
@RequestScoped
public class RegistroJugadorManagedBean implements Serializable, InterfaceController<Usuario>{
private Usuario usuario;
@EJB 
private UsuarioFacade usuarioFacade;
    public RegistroJugadorManagedBean() {
    }

    @Override
    public Usuario getObjectByKey(Integer key) {
       
    }
    
}

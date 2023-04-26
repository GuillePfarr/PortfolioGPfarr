
package com.portfoliogui.gui.Interface;

import com.portfoliogui.gui.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer unalista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscandolo por ID
    public void deletePersona(Long id);
    
    
    //Buscar una persona por ID
    
    public Persona findPersona(Long id);
}

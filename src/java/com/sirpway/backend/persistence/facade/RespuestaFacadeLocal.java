/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sirpway.backend.persistence.facade;

import com.sirpway.backend.persistence.entity.Respuesta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jency
 */
@Local
public interface RespuestaFacadeLocal {

    void create(Respuesta respuesta);

    void edit(Respuesta respuesta);

    void remove(Respuesta respuesta);

    Respuesta find(Object id);

    List<Respuesta> findAll();

    List<Respuesta> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mercaya.logica;

import co.edu.udea.mercaya.model.Detalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author raulio
 */
@Local
public interface DetalleFacadeLocal {

    void create(Detalle detalle);

    void edit(Detalle detalle);

    void remove(Detalle detalle);

    Detalle find(Object id);

    List<Detalle> findAll(Integer id);

    List<Detalle> findRange(int[] range);

    int count();
    
}

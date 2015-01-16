/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Armando.Perea
 */
@Stateless
public class HourlyEmployeeFacade extends AbstractFacade<HourlyEmployee> {
    @PersistenceContext(unitName = "TimeSheetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HourlyEmployeeFacade() {
        super(HourlyEmployee.class);
    }
    
}
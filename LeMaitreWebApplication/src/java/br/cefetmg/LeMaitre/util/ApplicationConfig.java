/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.LeMaitre.util;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author aluno
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.cefetmg.LeMaitre.servlet.BillResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.BillTableResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.CategoryResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.EmployeeResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.ImageResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.ItemImageResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.ItemResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.OrderResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.ReservationResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.SubcategoryResource.class);
        resources.add(br.cefetmg.LeMaitre.servlet.TableResource.class);
    }
    
}

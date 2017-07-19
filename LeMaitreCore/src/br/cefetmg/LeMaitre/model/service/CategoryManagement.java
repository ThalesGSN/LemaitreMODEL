/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.LeMaitre.model.service;

import br.cefetmg.LeMaitre.model.domain.Category;
import br.cefetmg.LeMaitre.model.exception.BusinessException;
import br.cefetmg.LeMaitre.model.exception.PersistenceException;

/**
 *
 * @author Thalesgsn
 */
public interface CategoryManagement {
    public Long categoryInsert(Category category) throws BusinessException, PersistenceException;
    public boolean categoryUpdate(Category category) throws BusinessException, PersistenceException;
    public boolean categoryRemove(Integer categoryID) throws PersistenceException;
    public Category getCategoryByID(Integer categoryID) throws PersistenceException;
}

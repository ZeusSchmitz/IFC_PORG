/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratic.pratica.controller;

import com.pratic.pratica.entity.Curso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class CursoFacade extends AbstractFacade<Curso>
{

  @PersistenceContext(unitName = "com.pratic_Pratica_war_1.0PU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager()
  {
    return em;
  }

  public CursoFacade()
  {
    super(Curso.class);
  }
  
}

package com.a1softwares.foodapi.jpa;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import com.a1softwares.foodapi.domain.model.Kitchen;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CRUDKitchen {

  @PersistenceContext
  private EntityManager manager;

  public List<Kitchen> list() {
    return manager.createQuery("from Kitchen", Kitchen.class).getResultList();
  }

  public Kitchen searchKitchen(Long id) {
    return manager.find(Kitchen.class, id);
  }

  @Transactional
  public Kitchen save(Kitchen kitchen) {
    return manager.merge(kitchen);
  }

  @Transactional
  public void remove(Kitchen kitchen) {
    kitchen = searchKitchen(kitchen.getId());
    manager.remove(kitchen);
  }
}

package com.a1softwares.foodapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class kitchen {

  @Id
  private Long id;

  @Column(name = "tab_name_kitchen")
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    kitchen kitchen = (kitchen) o;
    return id.equals(kitchen.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}

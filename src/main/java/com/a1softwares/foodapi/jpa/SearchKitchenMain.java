package com.a1softwares.foodapi.jpa;

import com.a1softwares.foodapi.FoodApiApplication;
import com.a1softwares.foodapi.domain.model.Kitchen;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class SearchKitchenMain {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
            new SpringApplicationBuilder(FoodApiApplication.class).web(WebApplicationType.NONE)
                    .run(args);

    CRUDKitchen crudKitchen = applicationContext.getBean(CRUDKitchen.class);

    Kitchen kitchen = crudKitchen.searchKitchen(1L);

    System.out.println(kitchen.getName());
  }
}

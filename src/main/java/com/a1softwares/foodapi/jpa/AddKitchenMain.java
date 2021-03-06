package com.a1softwares.foodapi.jpa;

import com.a1softwares.foodapi.FoodApiApplication;
import com.a1softwares.foodapi.domain.model.Kitchen;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AddKitchenMain {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
            new SpringApplicationBuilder(FoodApiApplication.class).web(WebApplicationType.NONE)
                    .run(args);

    CRUDKitchen crudKitchen = applicationContext.getBean(CRUDKitchen.class);

    Kitchen kitchen1 = new Kitchen();
    kitchen1.setName("Brasileira");

    Kitchen kitchen2 = new Kitchen();
    kitchen2.setName("Japonesa");

    kitchen1 = crudKitchen.save(kitchen1);
    kitchen2 = crudKitchen.save(kitchen2);

    System.out.printf("%d - %s\n", kitchen1.getId(), kitchen1.getName());
    System.out.printf("%d - %s\n", kitchen2.getId(), kitchen2.getName());
  }
}

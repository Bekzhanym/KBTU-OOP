package problem2;

import problem2.model.CanHavePizza;
import problem2.model.Person;

public class Restaurant {

    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
            System.out.println("Processing payment");
        }
        
        return true;
    }
}

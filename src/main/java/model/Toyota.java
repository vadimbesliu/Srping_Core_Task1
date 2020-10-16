package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Toyota {
    @Autowired
    private ToyotaSupra toyotaSupra;
    private String name = "Toyota";

    public String getName() {
        return this.name;
    }

}

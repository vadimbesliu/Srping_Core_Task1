package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="toyotasupra")
public class ToyotaSupra extends Toyota {
    private String name = "Toyota Supra";

    public String getName() {
        return this.name;
    }

}
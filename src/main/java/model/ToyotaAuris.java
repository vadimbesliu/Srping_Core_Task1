package model;

import org.springframework.stereotype.Component;

@Component(value="toyotaauris")
public class ToyotaAuris extends Toyota {
    private String name = "Toyota Auris";

    public String getName() {
        return this.name;
    }
}

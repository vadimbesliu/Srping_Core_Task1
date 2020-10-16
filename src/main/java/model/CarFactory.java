package model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {

    private Toyota toyota;
//    private ToyotaSupra toyotaSupra;

    CarFactory(@Qualifier("toyotaauris") Toyota toyota){
        this.toyota=toyota;
    }

    public void setToyota(ToyotaSupra toyotaSupra) {
        this.toyota = toyotaSupra;
    }
    @Qualifier
    public Toyota getToyota() {
        return toyota;
    }


}
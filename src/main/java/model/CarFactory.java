package model;

import org.springframework.stereotype.Component;

@Component
public class CarFactory {
    private Toyota toyota;
    private ToyotaSupra toyotaSupra;

    public void setToyota(ToyotaSupra toyotaSupra){
        this.toyota=toyotaSupra;
    }
    public Toyota getToyota(){
        return toyota;
    }



}

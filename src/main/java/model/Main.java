package model;

import config.ConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);

        CarFactory carBean = context.getBean(CarFactory.class);
        System.out.println(carBean.getToyota().getName());
    }
}

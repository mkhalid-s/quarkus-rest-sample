package com.example;

/**
 * Created by IntelliJ IDEA.
 * User: mshaikh4
 * Date: 21-07-2021
 * Time: 20:04
 * Year: 2021
 * Project: quarkus-helloworld-rest
 * Package: com.example
 */
public class Fruit {

    private String name;
    private String description;

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

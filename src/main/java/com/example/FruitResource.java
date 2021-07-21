package com.example;

import javax.ws.rs.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: mshaikh4
 * Date: 21-07-2021
 * Time: 20:07
 * Year: 2021
 * Project: quarkus-helloworld-rest
 * Package: com.example
 */
@Path("/fruits")
public class FruitResource {

    private Set<Fruit> fruitSet = new LinkedHashSet<>();

    public FruitResource(){
        fruitSet.add(new Fruit("Banana", "A banana is a tropical fruit that's quite popular all over the world. It grows in bunches on a banana tree."));
        fruitSet.add(new Fruit("Apple", "The apple isn't just a fruit. It's a symbol — from the apples eaten by Adam and Eve in the Biblical creation story, which symbolize the loss of innocent to the expression \"American as apple pie\" to mean something that is wholesome."));
    }

    @GET
    public Set<Fruit> list(){
        return fruitSet;
    }

    @PUT
    public Set<Fruit> addFruit(Fruit fruit){
        fruitSet.add(fruit);
        return fruitSet;
    }

    @POST
    public Set<Fruit> updateFruitDesc(Fruit fruit){
        fruitSet.forEach( f -> {
            if (f.getName().equalsIgnoreCase(fruit.getName()))
                f.setDescription(fruit.getDescription());
        });
        return fruitSet;
    }

    @DELETE
    public Set<Fruit> removeFruit(String fruitName){
        fruitSet.removeIf(remFruit -> remFruit.getName().equalsIgnoreCase(fruitName));
        return fruitSet;

    }

}

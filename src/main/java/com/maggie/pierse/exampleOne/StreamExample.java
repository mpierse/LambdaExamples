package com.maggie.pierse.exampleOne;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExample {


    private List<String> exampleList = Arrays.asList("a", "b", "c", "d", "e", "f", "g");


    public void runALoop(){

        for (String listElement : exampleList){
            System.out.println(listElement);
        }

    }

    public void runAStream(){

        exampleList.forEach(listElement -> System.out.println(listElement));
    
    }

    public void runAStream(Consumer<String> action){

        exampleList.forEach(listElement -> action.accept(listElement));

    }

    
}
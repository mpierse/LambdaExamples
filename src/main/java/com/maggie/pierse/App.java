package com.maggie.pierse;

import com.maggie.pierse.helpers.HelperUtils;

public class App 
{
    public static void main( String[] args )
    {
        ExampleClass streamExample = new ExampleClass();

        streamExample.runALoop();



        streamExample.runAStream();



        streamExample.runAStream(listElement -> System.out.println(listElement));



        streamExample.runAStream(listElement -> System.out.println("This is the element: " + listElement));



        streamExample.runAStream(listElement -> HelperUtils.isB(listElement));



        streamExample.runAStream(listElement -> HelperUtils.isAVowel(listElement));


        streamExample.runAStream(HelperUtils::isAVowel);



        
    }
}

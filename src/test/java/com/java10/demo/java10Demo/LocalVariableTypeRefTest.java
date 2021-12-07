package com.java10.demo.java10Demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocalVariableTypeRefTest {

    @Test
    public void when_var_isUsed_then_Type_Is_Inferred(){
        var message = "Hello, Java 10";
        assertTrue(message instanceof String);

        var idToNameMap = new HashMap<Integer, String>();
        assertTrue(idToNameMap instanceof Map);

//        var p = (String s) -> s.length() > 10;
//        Above line would complain - Cannot infer type: lambda expression requires an explicit target type

//        var array = {1,2,3};    // This wont work and complains. As good as dumb type caster.
        var array = new int[]{1, 2, 3}; // This works when I say its Int array. Fair enough !!
    }

    @Test
    public void when_bored_Of_int_I_In_For_Loop_Then_Use_var(){
        var list = Lists.newArrayList(1,2,3,4,5);
        for(var v : list){
            System.out.print(v);
        }
        System.out.println(" This works  !!");

        for(var v=0;v<5;v++){
            System.out.print(v);
        }
        System.out.println(" This works too !!");

    }

}

package com.java10.demo.java10Demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.stream.Collectors.toUnmodifiableList;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnModifiableCollectionTest {

    @Test
    public void when_Modify_Stream_UnModifiable_List_then_ThrowsException(){
        try{
            var list = Lists.newArrayList(0, 1, 2, 3, 4, 5);
            List<Integer> evenNosList = list.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(toUnmodifiableList());

            System.out.println(evenNosList.getClass()); //Prints class ImmutableCollection

            evenNosList.add(4);
        }catch(Exception ex){
            assertTrue(ex instanceof UnsupportedOperationException);
        }
    }
}

package com.java10.demo.java10Demo;


import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CopyListTest {

    @Test
    public void when_Modify_CopyOf_List_then_ThrowsException() {
        try {
            List<Integer> copyList = List.copyOf(Arrays.asList(1, 2, 3, 4));
            copyList.add(4);
        }catch (Exception ex){
            assertTrue(ex instanceof UnsupportedOperationException);

            if(ex instanceof UnsupportedOperationException){
                System.out.println("True !!! Its Unmodifiable copyOf returns Immutable Type");
            }
        }
    }

    @Test
    public void unmodifiable_View_List(){

        try {
            var list = Lists.newArrayList(1, 2, 3, 4);
            var newList = Collections.unmodifiableList(list);   //Collections.unmodifiableList returns an unmodifiable view.
            var newCopyList = List.copyOf(list);
            // copyOf performs a shallow copy preserving the iteration order.
            // Changes to list won’t be echoed into newCopyList now.

            list.set(0,0);  // Trying to add 0 at index 0

//            newList.add(5); // This would also result in UnsupportedOperationException

            System.out.println("I modified the original list to Insert a new element. What would newList contain ? would it reflect 0 @ index 0 ?");
            System.out.println("newList - index 0 - value - " + newList.get(0));
            // This proves Collections.unmodifiableList returns a view over the underlying collection and any change with iterator/stream
            // would reflect in view too !!

            newCopyList.add(5); // Simply said Fails !! Since its immutable object and not the same object.!

        }catch (Exception ex){
            assertTrue(ex instanceof UnsupportedOperationException);

            if(ex instanceof UnsupportedOperationException){
                System.out.println("True !!! Its truly Unmodifiable as copyOf returns Immutable Type");
            }
        }


    }


}

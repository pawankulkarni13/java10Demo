package com.java10.demo.java10Demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalElseThrowTest {

    @Test
    public void when_list_does_not_contain_element_then_throw_NoSuchElementExceptionif(){

        try {
            var list = Lists.newArrayList(1, 3, 5);
            Integer firstEven = list.stream()
                    .filter(i -> i % 2 == 0)
                    .findFirst()
                    .orElseThrow();
        }catch(Exception ex){
            assertTrue(ex instanceof NoSuchElementException);
            System.out.println("NoSuchElementException !!");

        }

    }
}

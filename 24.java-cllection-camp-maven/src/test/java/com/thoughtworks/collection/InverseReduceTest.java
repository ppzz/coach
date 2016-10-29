package com.thoughtworks.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InverseReduceTest {

    @Test
    public void should_be_divided_to_smaller_number(){

        Random random = mock(Random.class);
        when(random.nextInt(3)).thenReturn(2);

        InverseReduce inverseReduce = new InverseReduce(random);

        List<Integer> resultList = Arrays.asList(7,5,3,1);

        assertThat(inverseReduce.divideToSmaller(9), is(resultList));
    }
}


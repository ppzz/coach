package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FlatenTest {

    @Test
    public void can_transform_two_dimensional_array_to_one(){
        Integer[][] array = new Integer[][]{{1}, {2}, {3,4}};

        List<Integer> resultList = Arrays.asList(1,2,3,4);

        Flaten flaten = new Flaten(array);

        assertThat(flaten.transformToOneDimesional(), is(resultList));
    }

    @Test
    public void can_transform_two_dimensional_array_to_one_and_delete_repeated(){
        Integer[][] array = {{1,2,3}, {5,2,1,4}, {2,1}};

        List<Integer> resultList = Arrays.asList(1,2,3,5,4);

        Flaten flaten = new Flaten(array);
        assertThat(flaten.transformToUnrepeatedOneDimesional(), is(resultList));
    }
}
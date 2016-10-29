package com.thoughtworks.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyMapTest {

    @Test
    public void should_map_to_double() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        MyMap myMap = new MyMap(list);

        List<Integer> resultList = Arrays.asList(2, 4, 6, 8, 10);

        assertThat(myMap.getDouble(), is(resultList));
    }

    @Test
    public void should_map_to_triple() {

        List<Integer> list = Arrays.asList(1, 3, 5, 4, 9);

        MyMap myMap = new MyMap(list);

        List<Integer> resultList = Arrays.asList(3, 9, 15, 12, 27);

        assertThat(myMap.getTriple(), is(resultList));
    }

    @Test
    public void should_map_to_fourfold_then_add_1() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        MyMap myMap = new MyMap(list);

        List<Integer> resultList = Arrays.asList(5, 9, 13, 17, 21);

        assertThat(myMap.getFourFoldThenAddOne(), is(resultList));
    }

    @Test
    public void should_map_to_letter() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        MyMap myMap = new MyMap(list);

        List<String> resultList = Arrays.asList("a", "b", "c", "d", "e");

        assertThat(myMap.mapLetter(), is(resultList));
    }

    @Test
    public void should_map_to_letters() {

        List<Integer> list = Arrays.asList(1, 13, 27, 30, 52, 53);

        MyMap myMap = new MyMap(list);

        List<String> resultList = Arrays.asList("a", "m", "aa", "ad", "az", "ba");

        assertThat(myMap.mapLetters(), is(resultList));
    }

    @Test
    public void should_sort_from_big_to_small() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        MyMap myMap = new MyMap(list);

        List<Integer> resultList = Arrays.asList(5, 4, 3, 2, 1);

        assertThat(myMap.sortFromBig(), is(resultList));
    }

    @Test
    public void should_sort_from_small_to_big() {

        List<Integer> list = Arrays.asList(3, 2, 4, 5, 1);

        MyMap myMap = new MyMap(list);


        List<Integer> resultList = Arrays.asList(1, 2, 3, 4, 5);

        assertThat(myMap.sortFromSmall(), is(resultList));
    }
}
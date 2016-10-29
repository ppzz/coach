package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CollectionOperatorTest {

    @Test
    public void should_return_list_by_Interval() {
        int right = 5;
        int left = 1;

        CollectionOperator collectionOperator = new CollectionOperator();

        List<Integer> resultList = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(collectionOperator.getListByInterval(left, right), is(resultList));

        List<Integer> inverseResultList = Arrays.asList(5, 4, 3, 2, 1);
        assertThat(collectionOperator.getListByInterval(right, left), is(inverseResultList));
    }

    @Test
    public void should_return_list_by__two_Intervals() {
        int right = 10;
        int left = 1;

        CollectionOperator collectionOperator = new CollectionOperator();

        List<Integer> resultList = Arrays.asList(2, 4, 6, 8, 10);
        assertThat(collectionOperator.getEvenListByIntervals(left, right), is(resultList));

        List<Integer> inverseResultList = Arrays.asList(10, 8, 6, 4, 2);
        assertThat(collectionOperator.getEvenListByIntervals(right, left), is(inverseResultList));
    }

    @Test
    public void should_return_letter_list_by__Interval() {
        int right = 5;
        int left = 1;

        CollectionOperator collectionOperator = new CollectionOperator();

        List<String> resultList = Arrays.asList("a", "b", "c", "d", "e");
        assertThat(collectionOperator.getLetterListByInterval(left, right), is(resultList));
    }

    @Test
    public void should_return_loop_letter_list_by__Interval() {
        int right = 53;
        int left = 20;

        CollectionOperator collectionOperator = new CollectionOperator();

        assertThat(collectionOperator.getLoopLetterListByInterval(left, right).size(), is(34));
        assertThat(collectionOperator.getLoopLetterListByInterval(left, right).get(6), is("z"));
        assertThat(collectionOperator.getLoopLetterListByInterval(left, right).get(8), is("ab"));
        assertThat(collectionOperator.getLoopLetterListByInterval(left, right).get(33), is("ba"));
    }

    @Test
    public void should_pop_even_elements() {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> resultList = Arrays.asList(2, 4);

        CollectionOperator collectionOperator = new CollectionOperator();

        assertThat(collectionOperator.popEvenElments(arrayList), is(resultList));
    }

    @Test
    public void should_pop_last_element() {
        int[] array = new int[]{1, 2, 3, 4, 5};

        CollectionOperator collectionOperator = new CollectionOperator();

        assertThat(collectionOperator.popLastElment(array), is(5));
    }

    @Test
    public void should_pop_common_elements() {
        int[] firstArray = new int[]{1, 2, 4, 6, 10};
        int[] secondArray = new int[]{3, 2, 6, 10, 8};

        Integer[] result = new Integer[]{2, 6, 10};
        List<Integer> resultList = Arrays.asList(result);

        CollectionOperator collectionOperator = new CollectionOperator();
        assertThat(collectionOperator.popCommonElement(firstArray, secondArray), is(resultList));
    }

    @Test
    public void should_add_uncommon_elements_to_first_array() {
        Integer[] firstArray = new Integer[]{1, 2, 4, 6, 10};
        Integer[] secondArray = new Integer[]{3, 2, 6, 10, 8};

        List<Integer> resultList = Arrays.asList(1, 2, 4, 6, 10, 3, 8);

        CollectionOperator collectionOperator = new CollectionOperator();
        assertThat(collectionOperator.addUncommonElement(firstArray, secondArray).size(), is(7));
        assertThat(collectionOperator.addUncommonElement(firstArray, secondArray), is(resultList));
    }
}

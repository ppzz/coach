package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


public class ReduceTest {

    @Test
    public void should_get_the_sum_of_elements (){
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getSum(), is(15));
    }

    @Test
    public void should_get_maximum_of_list(){
        List<Integer> arrayList = Arrays.asList(1,5,7,2,8,9,3,2);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getMaximum(), is(9));
    }

    @Test
    public void should_get_minimum_of_list(){
        List<Integer> arrayList = Arrays.asList(9,4,5,10,34,2,1,10,16);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getMinimum(), is(1d));
    }

    @Test
    public void should_get_average_of_list(){
        List<Integer> arrayList = Arrays.asList(12,34,56,78,90,21);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getAverage(), is(48.5));
    }

    @Test
    public void should_get_element_in_middle_position_with_order_elements(){
        List<Integer> arrayList = Arrays.asList(1,1,1,2,3);
        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getOrderedMedian(), is(1d));


        List<Integer> EvenArrayList = Arrays.asList(1,1,2,3);
        Reduce evenReduce = new Reduce(EvenArrayList);

        assertThat(evenReduce.getOrderedMedian(), is(1.5));
    }

    @Test
    public void should_get_element_in_middle_position_with__elements(){
        List<Integer> arrayList = Arrays.asList(1,4,6,2,3,10,9,8,11,20,19,30);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getUnorderedMedian(), is(8.5));
    }

    @Test
    public void should_get_element_in_middle_position_in_linkList(){
        Integer[] array = new Integer[] {1,4,6,2,3,10,9,8,11,2,19,30};
        List<Integer> arrayList = Arrays.asList(array);

        SingleLink<Integer> singleLink = mock(SingleLink.class);
        when(singleLink.getNode(6)).thenReturn(10);
        when(singleLink.getNode(7)).thenReturn(9);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getMedianInLinkList(singleLink), is(9.5));
        verify(singleLink, times(12)).addTailPointer(anyInt());

    }

    @Test
    public void should_return_first_even_element(){
        List<Integer> arrayList = Arrays.asList(1,11,27,20,4,9,15);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getFirstEven(), is(20));
    }

    @Test
    public void should_return_index_of_first_even_element(){
        List<Integer> arrayList = Arrays.asList(1,11,27,20,4,9,15,4,1,11);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getIndexOfFirstEven(), is(3));
    }

    @Test
    public void should_return_last_even_element(){
        List<Integer> arrayList = Arrays.asList(1,11,27,20,4,9,15);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getLastEven(), is(15));
    }

    @Test
    public void should_return_index_of_last_even_element(){
        List<Integer> arrayList = Arrays.asList(1,4,27,20,4,9,15,4,1,11);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getIndexOfLastEven(), is(9));
    }

    @Test
    public void can_judge_whether_is_equal(){
        List<Integer> arrayList = Arrays.asList(1,4,27,20,4,9,15,4,1,11);

        List<Integer> differentArrayList = Arrays.asList(1,4,27,20,4,9,15,4,1);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.isEqual(arrayList), is(true));
        assertThat(reduce.isEqual(differentArrayList), is(false));
    }
}

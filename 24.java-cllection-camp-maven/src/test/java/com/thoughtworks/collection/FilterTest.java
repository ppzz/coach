package com.thoughtworks.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class FilterTest {

    @Test
    public void should_return_even(){
        List<Integer> arrayList =  Arrays.asList(1,2,3,4,5);

        Filter filter = new Filter(arrayList);

        List<Integer> resultList = Arrays.asList(2,4);

        assertThat(filter.filterEven(), is(resultList));
    }



    @Test
    public void should_return_multiple_of_three(){
        List<Integer> arrayList =  Arrays.asList(6,2,3,4,9);

        Filter filter = new Filter(arrayList);

        List<Integer> resultList = Arrays.asList(6,3,9);

        assertThat(filter.filterMultipleOfThree(), is(resultList));
    }

    @Test
    public void should_return_different_elements_in_arrayList(){
        List<Integer> arrayList = Arrays.asList(1,1,1,2,3);

        List<Integer> resultList = Arrays.asList(1,2,3);

        Filter filter = new Filter(arrayList);
        assertThat(filter.getDifferentElements(), is(resultList));
    }

    @Test
    public void should_divide_array_and_return_number(){
        List<Integer> arrayList = Arrays.asList(1,1,1,1,2,3,1,3,4,2,3,1,3,4,2);

        Filter filter = new Filter(arrayList);

        Map result = new HashMap<Integer, Integer>();
        result.put(1,6);
        result.put(2,3);
        result.put(3,4);
        result.put(4,2);

        assertThat(filter.getMapOfArrayList(), is(result));
    }

    @Test
    public void should_return_divided_array(){
        List<Integer> arrayList = Arrays.asList(1,1,1,1,2,3,1,3,4,2,3,1,3,4,2);

        Filter filter = new Filter(arrayList);

        assertThat(filter.getDividedArray().size(), is(4));
        assertThat(filter.getDividedArray().get(0).size(), is(6));
        assertThat(filter.getDividedArray().get(1).size(), is(3));
        assertThat(filter.getDividedArray().get(2).size(), is(4));
        assertThat(filter.getDividedArray().get(3).size(), is(2));
    }

    @Test
    public void should_return_common_elements(){

        List<Integer> arrayList =  Arrays.asList(6,2,3,4,9);
        List<Integer> arrayList1 =  Arrays.asList(2,3,5,9,6);

        Filter filter = new Filter(arrayList);

        List<Integer> resultList = Arrays.asList(6,2,3,9);

        assertThat(filter.getCommonElements(arrayList, arrayList1), is(resultList));
    }

    @Test
    public void should_return_uncommon_elements(){

        List<Integer> arrayList =  Arrays.asList(6,2,3,4,9);
        List<Integer> arrayList1 =  Arrays.asList(2,3,5,9,6);

        Filter filter = new Filter(arrayList);

        List<Integer> resultList = Arrays.asList(4);

        assertThat(filter.getUncommonElements(arrayList, arrayList1), is(resultList));
    }

    @Test
    public void should_filter_elements_by_specify_relationship(){

        List<Integer> arrayList =  Arrays.asList(2,3);

        Filter filter = new Filter(arrayList);

        List<Integer> objectList = Arrays.asList(1,2,3,4,5,6);

        List<Integer> resultList = Arrays.asList(2,3,4,6);

        FilterHandler filterHandler = mock(FilterHandler.class);
        when(filterHandler.apply(any())).thenReturn(true, true, false, false, true);

        assertThat(filter.getElementsByRelationship(filterHandler, objectList), is(resultList));
    }
}

//class NewFilter<T> {
//    private List<T> items;
//
//    public NewFilter(List<T> items) {
//        this.items = items;
//    }
//
//    public List<T> filter(FilterHandler<T> handler){
//        List<T> result = new ArrayList<T>();
//        for(T item : items) {
//            if (handler.apply(item)) {
//                result.add(item);
//            }
//        }
//
//        return result;
//    }
//}
//
//interface FilterHandler<T>{
//    public boolean apply(T t);
//}
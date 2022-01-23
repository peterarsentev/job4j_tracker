package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenMultipleOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("3sfe", "Jacket"));
        orders.add(new Order("3mfe", "Blouse"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        HashMap<String, Order> expect = new HashMap<>();
        expect.put("3sfe", new Order("3sfe", "Jacket"));
        expect.put("3mfe", new Order("3mfe", "Blouse"));
        assertThat(map, is(expect));
    }

}
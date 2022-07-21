package com.jv.lab.stockmarketsimulator.order.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An OrderBook that contains all the orders for a given stock
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderBook {

    @Getter
    private final OrderBookId id;

    private final Map<String, List<Order>> ordersPerStock = new HashMap<>();

    public static OrderBook withId(OrderBookId orderBookId) {
        return new OrderBook(orderBookId);
    }

    public Map<String, List<Order>> getOrdersPerStock(){
        return Map.copyOf(ordersPerStock);
    }

    @Value
    public static class OrderBookId {
        private Long value;
    }
}

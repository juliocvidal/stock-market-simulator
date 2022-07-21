package com.jv.lab.stockmarketsimulator.order.adapter.out.persistence;

import org.springframework.stereotype.Component;

@Component
public class MockSpringDataOrderBookRepository implements SpringDataOrderBookRepository{
    @Override
    public OrderBookJpaEntity findById() {
        return null;
    }
}

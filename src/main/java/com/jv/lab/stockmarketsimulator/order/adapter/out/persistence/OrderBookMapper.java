package com.jv.lab.stockmarketsimulator.order.adapter.out.persistence;

import com.jv.lab.stockmarketsimulator.order.domain.OrderBook;
import org.springframework.stereotype.Component;

@Component
public class OrderBookMapper {

    OrderBook mapToDomainEntity(
            OrderBookJpaEntity orderBook) {

        return OrderBook.withId(new OrderBook.OrderBookId(orderBook.getId()));

    }
}

package com.jv.lab.stockmarketsimulator.order.adapter.out.persistence;

import com.jv.lab.stockmarketsimulator.common.PersistenceAdapter;
import com.jv.lab.stockmarketsimulator.order.application.port.out.LoadOrderBookPort;
import com.jv.lab.stockmarketsimulator.order.application.port.out.UpdateOrderBookStatePort;
import com.jv.lab.stockmarketsimulator.order.domain.OrderBook;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceAdapter
public class OrderBookPersistenceAdapter implements UpdateOrderBookStatePort, LoadOrderBookPort {

    private SpringDataOrderBookRepository orderBookRepository ;
    private final OrderBookMapper orderBookMapper;

    @Override
    public OrderBook loadOrderBook(String stockId) {
        OrderBookJpaEntity orderBookRepository = new OrderBookJpaEntity();// orderBookRepository.findById();
        return orderBookMapper.mapToDomainEntity(orderBookRepository);
    }

    @Override
    public void updateOrder(OrderBook orderBook) {

    }
}

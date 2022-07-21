package com.jv.lab.stockmarketsimulator.order.application.port.out;

import com.jv.lab.stockmarketsimulator.order.domain.OrderBook;

public interface UpdateOrderBookStatePort {

    void updateOrder(OrderBook orderBook);
}

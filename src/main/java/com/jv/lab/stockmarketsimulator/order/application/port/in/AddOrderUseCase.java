package com.jv.lab.stockmarketsimulator.order.application.port.in;

import com.jv.lab.stockmarketsimulator.order.domain.OrderBook;

public interface AddOrderUseCase {

    OrderBook addOrder(AddOrderCommand command);
}

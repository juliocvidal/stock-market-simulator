package com.jv.lab.stockmarketsimulator.order.application.service;

import com.jv.lab.stockmarketsimulator.common.UseCase;
import com.jv.lab.stockmarketsimulator.order.application.port.in.AddOrderCommand;
import com.jv.lab.stockmarketsimulator.order.application.port.in.AddOrderUseCase;
import com.jv.lab.stockmarketsimulator.order.application.port.out.LoadOrderBookPort;
import com.jv.lab.stockmarketsimulator.order.application.port.out.UpdateOrderBookStatePort;
import com.jv.lab.stockmarketsimulator.order.domain.OrderBook;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
@Slf4j
public class AddOrderService implements AddOrderUseCase {

    private final LoadOrderBookPort loadOrderBookPort;
    private final UpdateOrderBookStatePort updateOrderBook;

    @Override
    public OrderBook addOrder(AddOrderCommand command) {
        log.info("Adding order command: {} {} {} {}", command.getStockId(), command.getOrder(), command.getPrice(), command.getAmount());

        OrderBook orderBook = loadOrderBookPort.loadOrderBook(command.getStockId());
        updateOrderBook.updateOrder(orderBook);
        return orderBook;
    }
}

package com.jv.lab.stockmarketsimulator.order.adapter.in.web;

import com.jv.lab.stockmarketsimulator.common.WebAdapter;
import com.jv.lab.stockmarketsimulator.order.application.port.in.AddOrderCommand;
import com.jv.lab.stockmarketsimulator.order.application.port.in.AddOrderUseCase;
import com.jv.lab.stockmarketsimulator.order.domain.Money;
import com.jv.lab.stockmarketsimulator.order.domain.OrderEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class AddOrderController {

    private final AddOrderUseCase addOrderUseCase;

    @PostMapping(path = "/orders/add/{stockId}/{order}/{price}/{amount}")
    void sendMoney(
            @PathVariable("stockId") String stockId,
            @PathVariable("order") OrderEnum order,
            @PathVariable("price") Long price,
            @PathVariable("amount") Long amount) {

        AddOrderCommand command = new AddOrderCommand(stockId, order, Money.of(price), amount);
        addOrderUseCase.addOrder(command);
    }

}

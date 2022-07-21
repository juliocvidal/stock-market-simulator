package com.jv.lab.stockmarketsimulator.order.application.port.in;

import com.jv.lab.stockmarketsimulator.common.SelfValidating;
import com.jv.lab.stockmarketsimulator.order.domain.Money;
import com.jv.lab.stockmarketsimulator.order.domain.OrderEnum;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Value
@EqualsAndHashCode(callSuper = false)
public class AddOrderCommand extends SelfValidating<AddOrderCommand> {

    @NotNull
    private final String stockId;

    @NotNull
    private final OrderEnum order;

    @NotNull
    private final Money price;

    @NotNull
    @Positive
    private final Long amount;

    public AddOrderCommand(String stockId, OrderEnum order, Money price, Long amount) {
        this.stockId = stockId;
        this.order = order;
        this.price = price;
        this.amount = amount;
    }
}

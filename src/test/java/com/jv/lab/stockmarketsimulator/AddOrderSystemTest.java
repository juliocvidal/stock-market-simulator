package com.jv.lab.stockmarketsimulator;

import com.jv.lab.stockmarketsimulator.order.domain.OrderEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AddOrderSystemTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void addOrder() {

        ResponseEntity response = whenAddOrder(stockId(), order(), price(), amount());

        then(response.getStatusCode())
                .isEqualTo(HttpStatus.OK);

    }

    private ResponseEntity whenAddOrder(String stockId, OrderEnum order, Long price, Long amount) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        HttpEntity<Void> request = new HttpEntity<>(null, headers);

        return restTemplate.exchange(
                "/orders/add/{stockId}/{order}/{price}/{amount}",
                HttpMethod.POST,
                request,
                Object.class,
                stockId,
                order,
                price,
                amount
        );
    }


    private Long amount() {
        return 10L;
    }

    private Long price() {
        return 50L;
    }

    private OrderEnum order() {
        return OrderEnum.B;
    }

    private String stockId() {
        return "APPL";
    }

}
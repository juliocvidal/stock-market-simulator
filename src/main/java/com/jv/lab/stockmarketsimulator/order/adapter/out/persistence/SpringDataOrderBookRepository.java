package com.jv.lab.stockmarketsimulator.order.adapter.out.persistence;

//interface SpringDataOrderRepository extends JpaRepository<OrderJpaEntity, Long> {
interface SpringDataOrderBookRepository {
    OrderBookJpaEntity findById();
}

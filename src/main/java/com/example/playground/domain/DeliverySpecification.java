package com.example.playground.domain;

public interface DeliverySpecification {

    default void register(DeliverySpecification deliverySpecification) {}
}

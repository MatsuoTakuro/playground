package com.example.playground.domain;

public enum DeliverySpecificationType {

    EXPRESS( new Express());

    private DeliverySpecification deliverySpecification;
    private DeliverySpecificationType(DeliverySpecification deliverySpecification) {
        this.deliverySpecification = deliverySpecification;
    }

}

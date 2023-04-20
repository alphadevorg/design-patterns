package com.alphadev.facade;

public class ZomatoFacade {
    private Restaurant restaurant;
    private DeliveryBoy deliveryBoy;
    private DeliveryTeam deliveryTeam;

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickupOrder();
        deliveryBoy.deliverOrder();
    }
}

package com.example.server.PostRateMicroservice;

public class Shipping {

    public int Weight;

    public int Zone;

    public Double ShippingTotal;

    public Double WholeTotal;

    public Shipping(int weight, int zone) {
        Weight = weight;
        Zone = zone;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getZone() {
        return Zone;
    }

    public void setZone(int zone) {
        Zone = zone;
    }

    public Double getShippingTotal() {
        return ShippingTotal;
    }

    public void setShippingTotal(Double shippingTotal) {
        ShippingTotal = shippingTotal;
    }

    public Double getWholeTotal() {
        return WholeTotal;
    }

    public void setWholeTotal(Double wholeTotal) {
        WholeTotal = wholeTotal;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "Weight=" + Weight +
                ", Zone=" + Zone +
                ", ShippingTotal=" + ShippingTotal +
                ", WholeTotal=" + WholeTotal +
                '}';
    }
}
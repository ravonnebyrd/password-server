package com.example.server.PostRateMicroservice;

public class Shipping {

    public int weight;

    public int zone;

    public Double shippingTotal;

    public Double wholeTotal;

    public Shipping(int w, int z, double s) {
        weight = w;
        zone = z;
        shippingTotal = s;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int z) {
        zone = z;
    }

    public Double getShippingTotal() {
        return shippingTotal;
    }

    public void setShippingTotal(Double s) {
        shippingTotal = s;
    }

    public Double getWholeTotal() {
        return wholeTotal;
    }

    public void setWholeTotal(Double w) {
        wholeTotal = w;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "Weight=" + weight +
                ", Zone=" + zone +
                ", ShippingTotal=" + shippingTotal +
                ", WholeTotal=" + wholeTotal +
                '}';
    }
}
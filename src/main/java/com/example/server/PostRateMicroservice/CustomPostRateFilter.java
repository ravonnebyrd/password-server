package com.example.server.PostRateMicroservice;

public class CustomPostRateFilter {

    public String weight;

    public String zone;

    public CustomPostRateFilter(String weight, String zone) {
        this.weight = weight;
        this.zone = zone;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "CustomPostRateFilter{" +
                "weight='" + weight + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }
}

package com.example.server.PostRateMicroservice;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

@Service
public class PostRateService {

    private HashMap<Integer, Double[]> lookup;

    public PostRateService() {
        lookup = new HashMap<>();

        Double[] one = new Double[] {3.66, 3.66, 3.70, 3.74, 3.78, 3.82, 3.94, 4.06, 4.06};
        Double[] five = new Double[] {4.39, 4.39, 4.44, 4.49, 4.53, 4.57, 4.69, 4.81, 4.81};
        Double[] nine = new Double[] {5.19, 5.19, 5.24, 5.30, 5.35, 5.40, 5.53, 5.66, 5.66};
        Double[] thirteen = new Double[] {5.71, 5.71, 5.78, 5.85, 5.93, 5.99, 6.13, 6.27, 6.27};

        lookup.put(1, one);
        lookup.put(5, five);
        lookup.put(9, nine);
        lookup.put(13, thirteen);
    }

    public Shipping getShipping(CustomPostRateFilter cPWF){

        int weight = parseInt(cPWF.getWeight());
        int zone = parseInt(cPWF.getZone());
        int weightLookup;

        Double shipping;
        if (weight < 5){

            weightLookup = 1;

        } else if (weight < 9){

            weightLookup = 5;

        } else if (weight < 13){

            weightLookup = 9;

        } else {

            weightLookup = 13;

        }

        shipping = lookup.get(weightLookup)[zone - 1];


        return new Shipping(weight, zone, shipping);
    }
}
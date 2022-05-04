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

        Shipping result = new Shipping(parseInt(cPWF.getWeight()), parseInt(cPWF.getZone()));

        Double shipping;
        if (result.getWeight() < 5){

            shipping = lookup.get(1)[result.getZone()];

        } else if (result.getWeight() < 9 && result.getWeight() > 4){

            shipping = lookup.get(5)[result.getZone()];

        } else if (result.getWeight() < 13 && result.getWeight() > 8){

            shipping = lookup.get(9)[result.getZone()];

        } else {

            shipping = lookup.get(13)[result.getZone()];

        }

        result.setShippingTotal(shipping);

        return result;
    }
}
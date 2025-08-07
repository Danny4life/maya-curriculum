package week_6_curriculum.classActivity10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Products> productsList = new ArrayList<>();

        productsList.add(new Products(1, "Car", 90000f));
        productsList.add(new Products(2, "phone", 20000));
        productsList.add(new Products(3, "bike", 30000));
        productsList.add(new Products(4, "tv", 25000));

        List<Float> priceList;

        priceList = productsList.stream()
                .filter(p -> p.price > 30000)
                .map(pm -> pm.price)
                .collect(Collectors.toList());

        System.out.println(priceList);
    }
}

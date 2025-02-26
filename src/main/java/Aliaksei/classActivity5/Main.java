package Aliaksei.classActivity5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        List<Float> priceList = new ArrayList<>();

        productList.add(new Product(1, "Iphone", 25000));
        productList.add(new Product(2, "Tesla", 40000));
        productList.add(new Product(3, "Chess board", 5000));

        // we are going to filter price that are less than 30000 without using STREAM API

//        for(Product product : productList){
//            if(product.price < 30000){
//                priceList.add(product.price);
//            }
//        }
//
//        System.out.println(priceList);


        // we are going to use STREAM API to filter price that are less than 30000
        priceList = productList.stream().filter(p -> p.price < 30000).map(p -> p.price).collect(Collectors.toList());

        System.out.println(priceList);
    }
}

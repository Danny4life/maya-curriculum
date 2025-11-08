package christian.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        List<Float> priceList = new ArrayList<>();

        productList.add(new Product(1, "Iphone", 25000f));
        productList.add(new Product(2, "Car", 325000f));
        productList.add(new Product(3, "Bike", 250000f));
        productList.add(new Product(4, "Chess", 5000f));

        //productList.add(new Product());


//        for(Product product : productList){
//            if(product.price < 30000){
//                priceList.add(product.price);
//            }
//        }
//
//        System.out.println(priceList);


        priceList = productList.stream().filter(p -> p.price < 30000).map(p -> p.price)
                .collect(Collectors.toList());

        System.out.println(priceList);
    }
}

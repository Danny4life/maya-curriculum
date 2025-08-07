package week_6_curriculum.classActivity9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        List<Float> priceList = new ArrayList<>();

        productList.add(new Product(1,"phone", 25000f));
        productList.add(new Product(2,"car", 30000f));
        productList.add(new Product(3,"bike", 95000f));
        productList.add(new Product(3,"chess board", 5000f));

        // not using a stream, do this first

        for(Product product : productList){

            if(product.price < 30000){
                priceList.add(product.price);

            }

        }

        System.out.println(priceList);



        //9A1 using streams do this second
//
//        priceList = productList.stream()
//                        .filter(p -> p.price < 30000) // filtering the data
//                                .map(p -> p.price) //fetching the price using map
//                .collect(Collectors.toList()); // collecting price as a list
//
//        System.out.println(priceList);

        priceList = productList.stream().filter(p -> p.price < 30000).map(p -> p.price).collect(Collectors.toList());
        System.out.println(priceList);




        //do this for exercise 1A
        // max price
//        Product maxPrice = productList.stream()
//                        .max((prod1, prod2) -> prod1.price > prod2.price ? 1 : -1).get();
//        System.out.println(maxPrice.price);

        // min price
//        Product minPrice = productList.stream()
//                .min((prod1, prod2) -> prod1.price > prod2.price  ? 1 : -1).get();
//        System.out.println(minPrice.price);





    }
}

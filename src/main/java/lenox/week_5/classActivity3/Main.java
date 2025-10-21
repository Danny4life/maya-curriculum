package lenox.week_5.classActivity3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> pList = new ArrayList<>();
        List<Float> priceList = new ArrayList<>();

        pList.add(new Product(1, "Iphone", 25000f));
        pList.add(new Product(2, "Car", 300000f));
        pList.add(new Product(3,"Bike", 95000f));
        pList.add(new Product(4, "Chess Board", 5000f));

//        for(Product product : pList){
//            if(product.price < 30000){
//                priceList.add(product.price);
//            }
//        }
//
//        System.out.println(priceList);



        priceList = pList.stream().filter(p -> p.price < 30000).map(p -> p.price).collect(Collectors.toList());

        System.out.println(priceList);



    }
}

package henry.week_5.classActivity6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> pList = new ArrayList<>();
        List<Float> priceList = new ArrayList<>();

        pList.add(new Product(1, "Iphone", 25000f));
        pList.add(new Product(2, "Toyota", 300000f));
        pList.add(new Product(3, "Super Bike", 100000f));
        pList.add(new Product(4, "Chess board", 5000f));


        for(Product product : pList){

            if (5000 < 30000){
               priceList.add(product.price);   // [25000, 5000]
            }

        }

        System.out.println(priceList);



        priceList = pList.stream().filter(p -> p.price < 30000)
                .map(p -> p.price).collect(Collectors.toList());

        System.out.println(priceList);


        //{20, 30, 40, 50, null, null}



    }
}

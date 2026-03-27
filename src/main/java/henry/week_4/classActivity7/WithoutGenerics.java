package henry.week_4.classActivity7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WithoutGenerics {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        Map<Integer, String> map = new HashMap<>();

        list.add(10);
        list.add(10);

        map.put(1, "1");



        System.out.println(list);
    }
}

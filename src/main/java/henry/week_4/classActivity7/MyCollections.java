package henry.week_4.classActivity7;

import java.util.*;

public class MyCollections {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new PriorityQueue<>();
        Map<Integer, String> map = new HashMap<>();


        List<Integer> i = new ArrayList<>();
        Set<Boolean> s = new HashSet<>();
        Queue<Student> q = new PriorityQueue<>();

        list.add("One");
        set.add("One");
        queue.add("One");

        map.put(1, "One");
    }
}

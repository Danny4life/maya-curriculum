package olga.set.classActivity1A;

import java.util.*;

public class SetEx {

    public static void main(String[] args) {

        Set<String> hashSetNames = new HashSet<>();


        hashSetNames.add("John");
        hashSetNames.add("Grace");
        hashSetNames.add("Patrick");
        // add duplicate name to show set does not take duplicate items after first running it without
        // the duplicate
         hashSetNames.add("Patrick");


        System.out.println("Hash set : " + hashSetNames);




        // notice the order in which the names are printed out, its un-ordered
        // add duplicate names to show set does not contain duplicates
        // use the size method to show the number of elements in a set
        // use the remove method to remove an item from the set
        // use the clear method to show how to remove all content of a set
        // show an example to loop through the set
        // also use a lambda expression to show you can do the loop in a single line



        // for showing total items in a set
        //System.out.println(hashSetNames.size());

        // for clearing sets
         //hashSetNames.clear();
        // System.out.println(hashSetNames);

        // for showing remove method
        // System.out.println(hashSetNames.remove("Patrick"));

        // to search for an element, we can use the contains method

       // System.out.println(hashSetNames.contains("Patricks"));

        // to convert set into an array, and search for the first element
        String[] arr = hashSetNames.toArray(new String[0]);
        System.out.println("Arrays : " + Arrays.toString(arr));
//        System.out.println("Arrays : " + Arrays.toString(new String[]{arr[0]}));





        // do this to show that you can not remove an item from a set using the index
        // as possible in a list, and the reason is that set does not return the items
        // in a particular order, which make sense.
        //System.out.println(hashSetNames.remove(1));





//        for(String name : hashSetNames){
//            System.out.println(name);
//        }

        //hashSetNames.forEach(System.out::println);





        // talk about when to use a set, then show an example with using a set to remove list duplicate

        // in class activity 1B
        // it is called a hash set because behind the scene it uses what is called a hash table
        // which make its manipulation fast with a constant time of O(1) - which means that it will
        // take the same amount of time to run a set not matter how you add the items, or running a large
        // or smaller set

        // talk about other types of set -- TreeSet, LinkedHashSet

        // TreeSet work the same way as HashSet, only difference is that they maintain
        // their natural ordering in which they were inputted alphabetically-- show example above

        // so when should use a hashset or a tree set, hash set are way way faster than a tree set
        // in terms of performance, you should only consider using a treeset when you really care
        // about the natural ordering of your items, if not use a hashset.

        // LinkedHash set maintains the insertion ordering of the element -- in terms of performance
        // it is faster than a tree set but not as fast as a hash set


        // do this after talking about hash set
        Set<String> treeSetNames = new TreeSet<>();

        // do this after
        Set<String> linkedSetNames = new LinkedHashSet<>();



        treeSetNames.add("John");
        //treeSetNames.add("Jake");
        treeSetNames.add("Grace");
        treeSetNames.add("Patrick");
        treeSetNames.add("Patrick");

        linkedSetNames.add("John");
        linkedSetNames.add("Jake");
        linkedSetNames.add("Grace");
        linkedSetNames.add("Patrick");
        linkedSetNames.add("Patrick");





        System.out.println("Hash set : " + hashSetNames);

        System.out.println("****************************");

        System.out.println("Tree set : " + treeSetNames);

        System.out.println("****************************");

        System.out.println("Linked hash set : " + linkedSetNames);

    }
}

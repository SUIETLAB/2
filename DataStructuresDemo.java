import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeMap;

public class DataStructuresDemo {

    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("Charlie");
        System.out.println("ArrayList: " + arrayList);

        arrayList.remove("Bob");
        System.out.println("ArrayList after removal: " + arrayList);

        System.out.println("ArrayList retrieval: " + arrayList.get(1));

        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Tom");
        linkedList.add("Jerry");
        linkedList.add("Spike");
        System.out.println("LinkedList: " + linkedList);

        linkedList.remove("Jerry");
        System.out.println("LinkedList after removal: " + linkedList);

        System.out.println("LinkedList retrieval: " + linkedList.get(1));

        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        System.out.println("HashSet: " + hashSet);

        hashSet.remove("Green");
        System.out.println("HashSet after removal: " + hashSet);

        System.out.println("HashSet contains 'Blue': " + hashSet.contains("Blue"));

        // TreeMap example
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        System.out.println("TreeMap: " + treeMap);

        treeMap.remove(2);
        System.out.println("TreeMap after removal: " + treeMap);

        System.out.println("TreeMap retrieval for key 3: " + treeMap.get(3));
    }
}

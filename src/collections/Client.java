package collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        //List
        // ordered Collection
        // Allows duplicates

        // List can be implemented by 4 containers -> ArrayList, LinkedList, Vector, Stack

        System.out.println("ArrayList : ");
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(11);
        list1.add(13);

        System.out.println(list1);

        System.out.println("LinkedList : ");
        List<Integer> list2 = new LinkedList<>();

        list2.add(100);
        System.out.println(list2);

        System.out.println("Vector :");
        List<Integer> list3 = new Vector<>();
        list3.add(200);
        list3.add(300);

        System.out.println(list3);

        System.out.println("Stack : ");
        Stack<Integer> stk = new Stack<>();
        stk.push(600);
        stk.push(700);
        stk.push(800);

        System.out.println("stk: " + stk);

        System.out.println("peek() : " + stk.peek());

        System.out.println("pop() : " + stk.pop());
        System.out.println("peek() " + stk.peek());
        System.out.println("empty() : " + stk.empty());
        System.out.println("contains(800) : " + stk.contains(800));
        System.out.println("contains(600) : " + stk.contains(600));
        System.out.println("search(600) : " + stk.search(600));
        System.out.println("stk : " + stk);
        System.out.println("size() : " + stk.size());

        Deque<Integer> deque = new ArrayDeque<>();

        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new Hashtable<>();

    }
}

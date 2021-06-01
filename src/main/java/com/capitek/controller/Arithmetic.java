package com.capitek.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Arithmetic {
    private static int count = 0;


    public static void main(String[] args) {
//        test1();
        test2();

    }




    public static void test2(){
        int a = lengthOfLongestSubstring("abcabcbb");
        System.out.println(a);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }




    public static void test1(){
        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9
                ,new ListNode(9,new ListNode(9,new ListNode(9)))))));
        ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
//        ListNode l3 = addTwoNumbers(l1,l2);
        ListNode l3 = addTwoNumbers2(l1,l2);
        sout(l3);
    }
    public static void sout(ListNode l1){
        if(l1.val == 0 && l1.next == null){
            System.out.print(l1.val);
            return;
        }
        System.out.print(l1.val+",");
        if(l1.next!=null){
            sout(l1.next);
        }
    }
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val == 0 && l1.next == null){
            return l2;
        }

        if(l1.next != null && l2.next != null){
            l1.val = l1.val + l2.val + count;
            if(l1.val>9){
                count = 1;
                l1.val -=10;
            }else
                count = 0;
            addTwoNumbers(l1.next,l2.next);
        }
        if(l1.next != null && l2.next == null){
            l1.val+=count+l2.val;
            count = 0;
            if(l1.val>9){
                l1.val -=10;
                l2.next = new ListNode();
                l2.next.val = 1;
                l2.next.next = null;
                addTwoNumbers(l1.next,l2.next);
            }
            else
                return l1;
        }
        if(l1.next == null && l2.next != null){
            l1.val +=count+l2.val;
            count = 0;
            if(l1.val>9){
                l1.val -=10;
                l1.next = new ListNode();
                l1.next.val=1;
                l1.next.next = null;
                addTwoNumbers(l1.next,l2.next);
            }
            else{
                l1.next = l2.next;
                return l1;
            }
        }
        if(l1.next == null && l2.next ==null){
            l1.val = l1.val +l2.val+count;
            if(l1.val>9){
                l1.val -=10;
                l1.next = new ListNode(1);
            }
            return l1;
        }
        return l1;
    }
}

package com.DataStructure;

public class Stack {
	 ListNode top;
	    int length = 0;

	    public static class ListNode {
	        int data;
	        ListNode next;

	        ListNode(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public void push(int data) {
	        ListNode temp = new ListNode(data);
	        temp.next = top;
	        top = temp;
	        length++;
	    }

	    public int pop() {
	        int result = top.data;
	        top = top.next;
	        length--;
	        return result;
	    }

	    public int peek() {
	        return top.data;
	    }

	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        for (int i=0;i<= stack.length;i++){
	            System.out.println(stack.pop());
	        }
	    }
}

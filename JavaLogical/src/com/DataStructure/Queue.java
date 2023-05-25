package com.DataStructure;

import java.util.NoSuchElementException;

public class Queue {
	 ListNode front;
	    ListNode rear;
	    int length;

	    Queue() {
	        this.front = null;
	        this.rear = null;
	        this.length = 0;
	    }


	    public static class ListNode {
	        int data;
	        ListNode next;

	        ListNode(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public int length() {
	        return length;
	    }

	    public boolean isEmpty() {
	        return length == 0;
	    }

	    public void enQueue(int data) {
	        ListNode temp = new ListNode(data);
	        if (isEmpty()) {
	            front = temp;
	        } else {
	            rear.next = temp;
	        }
	        rear = temp;
	        length++;
	    }

	    public int deQueue() {

	        ListNode currentNode=front;
	        if (isEmpty()){
	            throw new NoSuchElementException();
	        }
	        int result=front.data;
	        front=front.next;
	        if (front==null){
	            rear=null;
	        }
	        length--;
	        return  result;
	    }

	    public int queueFirst(){
	        if (isEmpty()){
	            throw new NoSuchElementException();
	        }
	        return front.data;
	    }
	    public int queueLast(){
	        if (isEmpty()){
	            throw new NoSuchElementException();
	        }
	        return rear.data;
	    }

	    public void print(){
	        ListNode current=front;
	        while(current!=null){
	            System.out.print(current.data+" ");
	            current=current.next;
	        }
	        System.out.print("null");
	    }


	    public static void main(String[] args) {
	        Queue queue=new Queue();
	        queue.enQueue(10);
	        queue.enQueue(20);
	        queue.print();
	    }

}

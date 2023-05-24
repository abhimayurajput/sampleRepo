package com.numbers;

public class SingleLinkedList {
	
	static ListNode root=null;
	
	static class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
			this.next=null;
		}
	}
	
	static void add(int data) {
		ListNode newNode = new ListNode(data);
		if(root == null) {
			root = newNode;
		}else {
			ListNode current = root;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		
		//root=node;
		
	}
	
	static void print() {
		ListNode temp=root;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SingleLinkedList l1  = new SingleLinkedList();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		l1.print();
		
		SingleLinkedList l2 = new SingleLinkedList();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		l2.print();
		
		
		
	}

}

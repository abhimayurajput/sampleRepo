package com.numbers;

import java.util.Stack;

public class PreOrderIterative {
	TreeNode root;
	
	private class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data){
			this.data=data;
			}
		
	}
	
	
	public static void main(String[] args) {
		PreOrderIterative poi = new PreOrderIterative();
		poi.createBinaryTree();
		poi.PreOrder();
	}


	private void PreOrder() {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.println(temp.data);
			
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left !=null) {
				stack.push(temp.left);
			}
		}
	}


	private void createBinaryTree() {
		// TODO Auto-generated method stub
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
	}
}
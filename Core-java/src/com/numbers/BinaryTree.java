package com.numbers;
//pre-order binary tree
public class BinaryTree {
	static TreeNode root;
	
	private class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data=data;
		}
	}
	
	/*
	 * public void add(int data) { TreeNode newNode = new TreeNode(data);
	 * if(root==null) { root=newNode; }
	 * 
	 * 
	 * }
	 */
	
	public void createBinary() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		//TreeNode fifth = new TreeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		//second.right = fifth;
	}
	
	public void preOrder(TreeNode root) {
		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
		
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createBinary();
		binaryTree.preOrder(root);
	}
}

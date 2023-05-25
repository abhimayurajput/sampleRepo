package com.DataStructure;

public class BinaryTree {
	private TreeNode root;
    static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinary(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);

        root=first;
        first.left=second;
        first.right=third;
    }
    public void preorder(TreeNode root){
    if(root==null){
        return;
    }
        System.out.println("data: "+root.data+" ");
    preorder(root.left);
    preorder(root.right);
    }

    public void iterativePreorder(TreeNode root){
        if (root==null){
            return;
        }
        java.util.Stack<TreeNode> stack=new java.util.Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp =stack.pop();
            System.out.println(temp.data);
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left !=null){
                stack.push(temp.left);
            }
        }
    }

    public void rescursiveInOrder(TreeNode root){
        if (root==null){
            return;
        }
        rescursiveInOrder(root.left);
        System.out.println(root.data);
        rescursiveInOrder(root.right);
    }
    public void iterativeInOrder(TreeNode root){
        if(root==null){
            return;
        }
        java.util.Stack<TreeNode> stack=new java.util.Stack<>();
        TreeNode temp=root;
        while(!stack.isEmpty() || temp!=null){
            if (temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                System.out.println(temp.data);
                temp=temp.right;
            }
        }
    }
    public void recursivePostOrder(TreeNode root){
        if (root==null){
            return;
        }
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
    	BinaryTree bt=new BinaryTree();
        bt.createBinary();
        bt.preorder(bt.root);
        bt.iterativePreorder(bt.root);
    }
}

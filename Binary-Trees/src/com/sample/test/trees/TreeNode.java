package com.sample.test.trees;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	
	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	
	
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	

}

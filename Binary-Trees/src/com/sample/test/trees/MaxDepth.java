package com.sample.test.trees;

/*
 * Given the root of a binary tree, return its maximum depth.

 A binary tree's maximum depth is the number of nodes along the longest path from the root node
 down to the farthest leaf node.
 */
public class MaxDepth {

	public int getMaxDepth(TreeNode root) {

		if (root == null)
			return 0;

		int leftHeight = getMaxDepth(root.left);
		int rightHeight = getMaxDepth(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxDepth maxDepth = new MaxDepth();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		int height = maxDepth.getMaxDepth(root);
		System.out.println("The maximum depth of the tree is :" + height);

	}

}

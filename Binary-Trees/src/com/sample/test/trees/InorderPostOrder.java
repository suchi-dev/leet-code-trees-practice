package com.sample.test.trees;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary
 *  tree and postorder is the postorder traversal of the same tree, 
 *  construct and return the binary tree.
 */
public class InorderPostOrder {

	static Map<Integer, Integer> mp = new HashMap<>();
	static int postIndex;

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int len = inorder.length;
		for (int i = 0; i < inorder.length; i++) {
			mp.put(inorder[i], i);
		}
		postIndex = len - 1;
		return buildUtil(inorder, postorder, 0, len - 1);

	}

	private TreeNode buildUtil(int[] inorder, int[] postorder, int inStart, int inEnd) {
		if (inStart > inEnd)
			return null;

		int curr = postorder[postIndex];
		TreeNode treeNode = new TreeNode(curr);
		postIndex--;
		int index = mp.get(curr);

		if (inStart == inEnd)
			return treeNode;
		treeNode.right = buildUtil(inorder, postorder, index + 1, inEnd);

		treeNode.left = buildUtil(inorder, postorder, inStart, index - 1);
		return treeNode;

	}

	public void preorderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + "|");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inorder = new int[] { 9, 3, 15, 20, 7 };
		int[] postorder = new int[] { 9, 15, 7, 20, 3 };
		InorderPostOrder inorderPostOrder = new InorderPostOrder();
		TreeNode root = inorderPostOrder.buildTree(inorder, postorder);

		System.out.println("Preorder traversal is");
		inorderPostOrder.preorderTraversal(root);

	}

};

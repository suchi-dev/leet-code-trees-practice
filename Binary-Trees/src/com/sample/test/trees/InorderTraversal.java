package com.sample.test.trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * In inorder traversal:-
 * a) We visit the root's left child
 * b) We then visit root node
 * c) We then visit the root's right child
 * 
 */
public class InorderTraversal {

	List<Integer> result = new ArrayList<>();

	public List<Integer> inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			result.add(root.val);
			inorder(root.right);

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InorderTraversal inorderTraversal = new InorderTraversal();
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		List<Integer> nodes = inorderTraversal.inorder(root);
		
		for(Integer n : nodes) {
			System.out.print(n+"|");
		}

	}

}

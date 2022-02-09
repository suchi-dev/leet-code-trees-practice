package com.sample.test.trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * In Preorder Traversal :-
 * a) We visit the root node
 * b) We then visit it's left child
 * c) We then visit it's right child
 */

public class PreOrderTraversal {

	List<Integer> result = new ArrayList<>();

	public List<Integer> preOrder(TreeNode root) {

		if (root != null) {
			result.add(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
		List<Integer> nodes = preOrderTraversal.preOrder(root);

		for (Integer n : nodes) {
			System.out.print(n + "|");
		}

	}

}

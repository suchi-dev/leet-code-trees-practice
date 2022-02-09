package com.sample.test.trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * In postorder traversal,
 * a) We traverse root's left node
 * b) We traverse root's right node
 * c) We then visit the root node
 *
 *
 */
public class PostOrderTraversal {

	List<Integer> result = new ArrayList<>();
	public List<Integer> postOrder(TreeNode root){
		if(root !=null) {
			postOrder(root.left);
			postOrder(root.right);
			result.add(root.val);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
		List<Integer> nodes = postOrderTraversal.postOrder(root);
		
		
		for (Integer n : nodes) {
			System.out.print(n + "|");
		}
		

	}

}

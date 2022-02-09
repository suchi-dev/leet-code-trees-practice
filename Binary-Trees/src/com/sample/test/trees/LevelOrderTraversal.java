package com.sample.test.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Given the root of a binary tree, return the level order traversal of its nodes' values. 
 * (i.e., from left to right, level by level).
 * 
 * We use Queue Data structure to do level by level traversal.
 *     3
 *    / \
 *   9   20
 *       / \
 *      15  7
 *      
 * Output : [[3], [9,20], [15,7]]
 *      
 * 
 */

public class LevelOrderTraversal {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> levelOrder(TreeNode root) {

		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		List<Integer> level = new ArrayList<>();
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty() && queue.size() > 1) {
			root = queue.poll();
			if (root != null) {
				level.add(root.val);
				if (root.left != null) {
					queue.add(root.left);
				}
				if (root.right != null) {
					queue.add(root.right);
				}

			} else {
				queue.add(null);
				result.add(level);
				level = new ArrayList<>();
			}
		}

		if (level.size() > 0) {
			result.add(level);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		LevelOrderTraversal levelOrder = new LevelOrderTraversal();
		List<List<Integer>> result = levelOrder.levelOrder(root);
		for (List<Integer> r : result) {
			for (Integer n : r) {
				System.out.print(n + "|");
			}
			System.out.println();
		}

	}

}

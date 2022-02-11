package com.sample.test.trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
 */
public class PathToLeafSum {

	public boolean hasPathSum(TreeNode root, List<Integer> result, int sum) {
		if (root == null)
			return false;
		// leaf node check
		if (root.left == null && root.right == null) {
			if (root.val == sum) {
				result.add(root.val);
				return true;
			} else {
				return false;
			}
		}

		if (hasPathSum(root.left, result, sum - root.val)) {
			result.add(root.val);
			return true;
		}

		if (hasPathSum(root.right, result, sum - root.val)) {
			result.add(root.val);
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PathToLeafSum pathToLeafSum = new PathToLeafSum();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);

		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		List<Integer> path = new ArrayList<>();
		boolean pathExists = pathToLeafSum.hasPathSum(root, path, 22);

		if (path.size() > 0) {
			for (Integer i : path) {
				System.out.print(i + "|");
			}
		}

		System.out.println();
		System.out.println("Such a path exists  where sum is 22 ? :" + pathExists);

	}

}

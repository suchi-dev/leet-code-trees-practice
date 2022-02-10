package com.sample.test.trees;

/*
 * Given the root of a binary tree, check whether it is 
 * a mirror of itself (i.e., symmetric around its center).

 
 */
public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}

	private boolean isMirror(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if (root1 == null && root2 == null)
			return true;

		if (root1 != null && root2 != null && root1.val == root2.val) {
			return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SymmetricTree symmTree = new SymmetricTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		
		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		boolean isSymmetric = symmTree.isSymmetric(root);
		System.out.println("This is a symmetric tree : " +isSymmetric);

	}

}

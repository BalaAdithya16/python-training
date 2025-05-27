import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
public class binarytree {
    TreeNode root;
    public void insertLevelOrder(int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.offer(current.left);
            }
            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.offer(current.right);
            }
        }
    }
    public void bfsTraversal() {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();
    }
    public boolean search(TreeNode node, int target) {
        if (node == null) return false;
        if (node.val == target) return true;
        else if (target < node.val) return search(node.left, target);
        else return search(node.right, target);
    }
    public static void main(String[] args) {
        binarytree tree = new binarytree();
        int[] values = {10, 5, 15, 3, 12, 18};
        for (int val : values) {
            tree.insertLevelOrder(val);
        }
        tree.bfsTraversal();
        int searchValue = 10;
        boolean found = tree.search(tree.root, searchValue);
        System.out.println("Search for " + searchValue + ": " + (found ? "Found" : "Not Found"));
    }
}                                                        
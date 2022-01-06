/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06q05;

/**
 *
 * @author Emertat
 */
public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void addNormal(int value) throws Exception {
        Node temp, ptr;
        temp = new Node(value);
        if (root == null) {
            root = temp;
            return;
        } else {
            ptr = root;
            while (ptr != null) {
                if (ptr.key > value) // left
                {
                    if (ptr.left != null) {
                        ptr = ptr.left;
                    } else {
                        ptr.left = temp;
                        break;
                    }
                } else if (ptr.key < value) // right
                {
                    if (ptr.right == null) {
                        ptr.right = temp;
                        break;
                    } else {
                        ptr = ptr.right;
                    }
                } else {
                    throw new Exception("Repeated value");
                }
            }
        }
    }

    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node n) {
        if (n == null) {
            return;
        }
        inOrderRecursive(n.left);
        System.out.print(n.key + "\t");
        inOrderRecursive(n.right);
    }

  
    public void rem(int a) {
        removen(root, a);
    }

    public Node removen(Node n, int a) {
        if (n != null) {

            n.right = removen(n.right, a);

            n.left = removen(n.left, a);

            Node temp = null, back = null;
            if (n.key >= a) {
                if (n.left == null) {
                    temp = n;
                    n = n.right;
                } else if (n.right == null) {
                    temp = n;
                    n = n.left;
                } else {
                    temp = n.left;
                    back = n;
                    while (temp.right != null) {
                        back = temp;
                        temp = temp.right;
                    }
                    if (n.left == temp) {
                        swap_data(n, temp);
                        n.left = temp.left;
                    } else {
                        swap_data(n, temp);
                        back.right = temp.left;
                    }
                }

                temp = null;

            }

        }
        return n;
    }

    public void swap_data(Node root1, Node root2) {
        int temp = root2.key;
        root2.key = root1.key;
        root1.key = temp;
    }

    public void DMTA(int key) {
        if (root != null) {

            root = removen(root, key);

        } else {
            System.out.print("\n Empty BST\n");
        }
        System.out.print("\n");

    }
}

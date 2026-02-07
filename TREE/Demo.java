package Tree;

import java.util.Scanner;

class Tree {
    int data;
    Tree right, left;

    // Tree(){
    // right=left=null;
    // }
    Tree(int val) {
        data = val;
        left = right = null;

    }
}

public class Demo {
    static Scanner sc = new Scanner(System.in);

    static Tree create() {
        System.out.println("Enter the value:(-1 for Exit):");
        int a = sc.nextInt();
        if (a == -1) {
            return null;
        }
        Tree newnode = new Tree(a);
        System.out.println("Enter the left of " + a + ":(-1 for Exit:):");
        newnode.left = create();
        System.out.println("Enter the Right of " + a + ":(-1 for Exit:):");
        newnode.right = create();
        return newnode;
    }

    static void postorder(Tree root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "->");
        }
    }

    static void preorder(Tree root) {
        if (root != null) {
            System.out.print(root.data + "->");
            preorder(root.left);
            preorder(root.right);

        }
    }

    static void inorder(Tree root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + "->");
            inorder(root.right);
        }

    }

    public static void main(String[] args) {
        Tree root = create();
        System.out.print("\nInorder Travesal:");
        inorder(root);
        System.out.print("\nPreorder Travesal:");
        preorder(root);
        System.out.print("\nPostorder Travesal:");
        postorder(root);

        // 102
        // 103
        // 112
        // 100
        // 110
        // 101
        // 102
        // 113
        // 226
        // Total no.of Node in BST of Height H: (2^h+1)-1
    }
}
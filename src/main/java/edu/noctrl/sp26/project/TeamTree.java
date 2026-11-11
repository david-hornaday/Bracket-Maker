package edu.noctrl.sp26.project;

public class TeamTree {
    private TeamTreeNode root;
    private int depth;

    TeamTree(TeamTreeNode root) {
        this.root = root;
        this.depth = 0;
    }

    public double evaluate() {
        return evaluateRecursive(root);
    }

    @Override
    public String toString() {
        return toStringRecursive(root);
    }

    private double evaluateRecursive(TeamTreeNode node) {
        return 0.00;
    }

    private String toStringRecursive(TeamTreeNode node) {
        return "";
    }

    public TeamTreeNode getRoot() {
        return this.root;
    }

    public int getDepth() {
        TeamTreeNode curr = this.getRoot();
        int i = 0;
        while (curr.getLeft() != null) {
            i++;
            curr = curr.getLeft();
        }
        this.depth = i;
        return i;
    }



    // // Recursively clears tree
    // private void clear(TeamTreeNode root) { 
    //     // if (root == null || root.getData() == null) {
    //     //     return null;
    //     // }
    //     // root.setLeft(clear(root.getLeft()));
    //     // root.setRight(clear(root.getRight()));
    //     // return null;

    //     for (int i = 0; i > this.array.length; i++) {
    //         this.array[i] = null;
    //     }

    // }
}
package edu.noctrl.sp26.project;

public class TeamTreeNode {
    private Team data;
    private TeamTreeNode left;
    private TeamTreeNode right;

    public TeamTreeNode(Team data) {
        this.data = data;
        this.left = null;
    }

    public Team getData() {
        return this.data;
    }

    public TeamTreeNode getLeft() {
        return this.left;
    }

    public void setLeft(TeamTreeNode left) {
        this.left = left;
    }

    public TeamTreeNode getRight() {
        return this.right;
    }

    public void setRight(TeamTreeNode right) {
        this.right = right;
    }

}

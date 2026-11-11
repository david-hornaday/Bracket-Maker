package edu.noctrl.sp26.project;

public class TeamList implements List {
    private static final int DEFAULT_CAPACITY = 10;
    private Team[] data;
    private int size;

    public TeamList() {
        this.data = new Team[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public TeamList(int capacity) {
        this.data = new Team[capacity];
        this.size = 0;
    }

    @Override
    public void add(Team e) {
        this.data[this.size] = e;
        this.size++;
    }

    @Override
    public Team get(int index) {
        Team e = this.data[index];
        return e;
    }

    @Override
    public Team remove(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        Team e = this.data[index];
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
        return e;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Team[] getList() {
        return this.data;
    }

    // public static void sort(Team[] empArr) {
    //     for (int i = 1; i < empArr.length; i++) // Insert i'th record
    //         for (int j = i; (j > 0) && (compare(empArr[j], empArr[j - 1])); j--)
    //             swap(empArr, j, j - 1);

    // }

    // static boolean compare(Team teamA, Team teamB) {
    //     return teamA.getRating() < teamB.getRating();
    // }

    // public static void swap(Team[] arr, int j, int k) {
    //     Team temp = arr[j];
    //     arr[j] = arr[k];
    //     arr[k] = temp;
    // }

     /**
     * Sorts from Highest to Lowest
    /**/
    public void sort() {
        for (int i = 1; i < this.size; i++) {
            for (int j = i; (j > 0) && (isHigher(data[j], data[j - 1])); j--) {
                swap(data, j, j - 1);
            }
        }
    }

    private static boolean isHigher(Team teamA, Team teamB) {
        // Higher rating returns true to swap the better team toward the front
        return teamA.getRating() > teamB.getRating();
    }

    private static void swap(Team[] arr, int i, int j) {
        Team temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public String printList() {
        String result = "";
        for (int i = 0; i < this.size(); i++) {
            result += (this.get(i) + "\n");
        }
        return result;
    }
}
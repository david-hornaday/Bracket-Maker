package edu.noctrl.sp26.project;

/**
 * An ordered list of elements.
 */
public interface List {

    /**
     * Appends an element at the end of the list.
     * 
     * @param e the element to be appended
     */
    public void add(Team e);

    public Object get(int index);

    public Object remove(int index);

    public Team[] getList();
    

    /**
     * Determines whether the list contains any elements.
     * 
     * @return if the list is empty; false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements currently stored in the list.
     * 
     * @return the number of elements in the list
     */
    public int size();

}
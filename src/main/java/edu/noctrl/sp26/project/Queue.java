package edu.noctrl.sp26.project;

/**
 * Queue ADT as presented in OpenDSA.
 */
public interface Queue {
  /**
   * Clears the queue of all elements.
   */
  public void clear();

  /**
   * Adds an element to the rear of the queue.
   * @param it The element to be added.
   * @return true if the element was added, false otherwise.
   */
  public boolean enqueue(Game it);

  /**
   * Removes and returns the element at the front of the queue.
   * @return The element removed from the front of the queue.
   */
  public Game dequeue();

  /**
   * Returns the element at the front of the queue without removing it.
   * @return The element at the front of the queue.
   */
  public Game frontValue();

  /**
   * Returns the number of elements in the queue.
   * @return The number of elements in the queue.
   */
  public int length();

  /**
   * Returns true if the queue is empty, false otherwise.
   * 
   * @return true if the queue is empty, false otherwise.
   */
  public boolean isEmpty();
}


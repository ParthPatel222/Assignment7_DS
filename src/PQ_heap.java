// Generic code for class priority_queue_heap for Assignment 5
// Name: <Parth Patel>
// Class: CS 3305/Section#W01
// Term: Summer 2023
// Instructor: Prof. Majeed
// Assignment: 3

import java.util.Arrays;

public class PQ_heap <E extends Comparable<E>> {
	   private Heap<E> heap; //Added Heap to store the priority queue

	// Constructor method
    PQ_heap() {
	   	  this.heap = new Heap<>();
   }


	// Return true if priority queue is empty; otherwise return false
   public boolean is_empty() {
	   	  return heap.getSize() == 0;
   }
	
	// Return true if priority queue is full; otherwise return false
   public boolean is_full() {
	   	  return heap.getSize() ==  heap.CAPACITY;
   }

	// Return (don't remove) the front element from the priority queue
	// Precondition: priority queue is not empty.
   public E front() {
	   if (is_empty()){
		   return null;
	   }
	   return heap.top();
   }

	// return number of elements in the queue
   public int size() {
	   	  return heap.getSize();
   }
   
	// Remove the largest value from this priority queue and return it.
	// Precondition: priority queue is not empty.
   public E dequeue() {
	   if (is_empty()){
		   return null;
	   }
	   return heap.remove();
   }

	// Inserts the 'value' into the priority queue.
	// Precondition: priority queue is not full
   public void enqueue(E value) {
	   if (is_full()){
		   return;
	   }
	   heap.add(value);
   }

   	// Print the contents of the priority queue
	   public void print() {
		   System.out.println(heap.toString());
	   }


}

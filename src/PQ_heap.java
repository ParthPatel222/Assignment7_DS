// Generic code for class PQ_heap for Assignment 7 
// Name: <Parth Patel>
// Class: CS 3305/01
// Term: Spring 2023
// Instructor: Dr. Haddad
// Assignment: 7
// IDE Name: <IntelliJ>

public class PQ_heap <E extends Comparable<E>> {

	//Create the heap object as private data member


	// Constructor method
   PQ_heap(Heap heap) {
	   	  this.heap = heap;
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
	   return (E) heap.top();
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
	   return (E) heap.remove();
   }

	// Inserts the 'value' into the priority queue.
	// Precondition: priority queue is not full
   public void enqueue(E value) {
	   if (is_full()){
		   return;
	   }
	   heap.add(value);
   };
}

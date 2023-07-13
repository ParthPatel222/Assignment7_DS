// Name: <Parth Patel>
// Class: CS 3305/Section#W01
// Term: Summer 2023
// Instructor: Prof. Majeed
// Assignment: 3
import java.util.Scanner;

public class TestPQH {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		PQ_heap pq = new PQ_heap<>();
		int choice;
		String type = "";

		do {
			System.out.println("""
					------------MAIN MENU------------
					0. Enter Queue Type (integer or string)
					1. Enqueue Element
					2. Dequeue Element
					3. Check if_Full
					4. Check if_Empty
					5. Print PQueue Size
					6. Display Front Element
					7. Print PQueue Elements
					8. Exit Program

					Enter option number:\s""");
			choice = scan.nextInt();

			switch (choice){
				case 0:
					System.out.println("Enter Queue Type (integer or string): ");
					 type = scan.next();
					 type = type.toLowerCase();
					if (type.equals("integer")){
						pq = new PQ_heap<>();
					}
					else if (type.equals("string")){
						pq = new PQ_heap<String>();
					}
					else {
						System.out.println("Invalid Queue Type");
					}
					break;
				case 1:
					System.out.println("Enter Element to Enqueue: ");
					String element = scan.next();
					if (type.equals("integer")){
						pq.enqueue(element);
					}
					else if (type.equals("string")){
						pq.enqueue(element);
					}
					else {
						System.out.println("Invalid Queue Type");
					}
					break;
				case 2: if (pq.is_empty()){
						System.out.println("Queue is Empty");
						break;
				}
					System.out.println("Dequeued Element: " + pq.dequeue());
					break;
				case 3:
					if (pq.is_full()){
						System.out.println("PQueue is Full");
					}
					else {
						System.out.println("PQueue is not Full");
					}
					break;
				case 4: if (pq.is_empty()){
					System.out.println("PQueue is Empty");
					break;
				} else {
					System.out.println("PQueue is not Empty");
				}
					break;
				case 5:
					System.out.println("PQueue Size: " + pq.size());
					break;
				case 6: if (pq.is_empty()){
					System.out.println("Queue is Empty");
					break;
				}
					System.out.println("Front Element: " + pq.front());
					break;
				case 7: if (pq.is_empty()){
					System.out.println("Queue is Empty");
					break;
				}
					System.out.println("PQueue Elements: " + pq);
					break;
				case 8:
					System.out.println("Exiting Program...");
					break;
				default:
					System.out.println("Invalid Option");
			}


		} while (choice != 8);
	}
}

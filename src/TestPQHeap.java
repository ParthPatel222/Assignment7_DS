import java.util.Scanner;

public class TestPQHeap {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		Heap heap = new Heap();
		PQ_heap<?> pq = null;
		int choice;

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
					String type = scan.next();
					if (type.equals("integer")){
						pq = new PQ_heap<Integer>(heap);
					}
					else if (type.equals("string")){
						pq = new PQ_heap<String>(heap);
					}
					else {
						System.out.println("Invalid Queue Type");
					}
					break;
				case 1:
					System.out.println("Enter Element to Enqueue: ");
					String element = scan.next();
					pq.enqueue(element);
					break;
			}


		} while (choice != 8);
	}
}

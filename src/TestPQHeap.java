import java.util.Scanner;

public class TestPQHeap {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		PQ_heap<?> pq = null;

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
				case 0: {
					System.out.println("Enter queue type (integer or string): ");
					type = scan.next();
					type = type.toLowerCase();
					if (type.equals("integer")){
						pq = new PQ_heap<Integer>();
					}
					else if (type.equals("string")){
						pq = new PQ_heap<String >();
					}
					else {
						System.out.println("Invalid queue type.");
					}
					break;
				}
				case 1: //check if queue has been created
					if (type.equals("integer")){
						System.out.println("Enter integer to enqueue: ");
						int num = scan.nextInt();
						pq.enqueue(num);
					}
					else if (type.equals("string")){
						System.out.println("Enter string to enqueue: ");
						String str = scan.next();
						pq.enqueue(str);
					}
					else {
						System.out.println("Queue not created.");
					}
					break;

			}


		} while (choice != 8);
	}
}

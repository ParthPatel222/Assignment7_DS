import java.util.Scanner;

public class TestPQHeap {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);


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


			}


		} while (choice != 8);
	}
}

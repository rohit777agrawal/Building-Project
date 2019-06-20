import java.util.Scanner;
public class BuildingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Building [] annandaleCampus = new Building[10];
		int numberOfBuildings = 0;
		int option;
		
		do {
			System.out.println("Press 1 to add a Building");
			System.out.println("Press 2 to look at all Buildings");
			System.out.println("Press 3 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("Enter the name of the building");
				String name = keyboard.nextLine();
				
				System.out.println("Enter the number of rooms");
				int numberOfRooms = keyboard.nextInt();
				
				Building currentBuilding = new Building();
				currentBuilding.setName(name);
				currentBuilding.setNumberOfRooms(numberOfRooms);
				
				if(numberOfBuildings < annandaleCampus.length) {
					annandaleCampus[numberOfBuildings] = currentBuilding;
					numberOfBuildings++;
				}
				else {
					System.out.println("There is no more room");
				}
			}
			else if (option == 2){
				for (int index =0; index < numberOfBuildings; index++)
				{
					System.out.println("The room number is: " + index);
					System.out.println(annandaleCampus[index].getName());
					System.out.println(annandaleCampus[index].getNumberOfRooms());
				}
			}
			else if (option ==3){
				System.out.println("Goodbye!");
			}
			else
			{
				System.out.println("Error!");
			}
			
		}while(option != 3);
		keyboard.close();
		
	}

}

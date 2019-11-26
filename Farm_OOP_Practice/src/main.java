/**
 * @author M. Strand
 * 11/24/2019
 * Purpose: Practice Java OOP concepts with a farm 
 *
 */

import java.util.Random; 

public class main 
{ 
	
	public static void main(String [] args)
	{
		Farm strandFarm = new Farm("Strand Farm", "Grandma Strand", 1945);
		generateAnimalAndBuilding(strandFarm, 10);
		printFarmInfo(strandFarm);
	}

	//generate the animal, name, and building they're housed in
	public static void generateAnimalAndBuilding(Farm myFarm, int numAnimalsToAdd)
	{
		if(numAnimalsToAdd <= 10) {
			String creatures[] = new String[10];
			String names[] = new String[10];

			generateAnimalAttributes(creatures, 0);
			generateAnimalAttributes(names, 1);

			//
			for(int i=0; i < numAnimalsToAdd; ++i) {
				Random randCreature = new Random(); 
				Random randName = new Random(); 
				int randomCreature = randCreature.nextInt(creatures.length); 
				int randomName = randName.nextInt(names.length); 

				if(randomCreature < 5) {
					Animal animal = new Animal(creatures[randomCreature], names[randomName], "Barn");
					myFarm.addAnimal(animal);
				} else {
					Animal animal = new Animal(creatures[randomCreature], names[randomName], "Dovecote");
					myFarm.addAnimal(animal);
				}
			}
		} else {
			System.out.println("");
		}			
	}
	
	//add the elements to the arrays for the animals and names to be generated, names could be assigned dynamically later
	public static void generateAnimalAttributes(String array[],int type) 
	{
		if(array.length == 10 && type == 0) {
			//0-4 are barn animals
			array[0] = "cow";
			array[1] = "horse";
			array[2] = "goat";
			array[3] = "pig";
			array[4] = "sheep";
			
			//5-9 are dovecote animals
			array[5] = "chicken";
			array[6] = "turkey";
			array[7] = "feasant";
			array[8] = "pigeon";
			array[9] = "dove";
		} else if(array.length == 10 && type == 1 ){
			//TODO: ADD MORE NAMES HERE LATER AND INCREASE THE SIZE OF THE ARRAY ABOVE, OR TURN IT INTO A VECTOR
			array[0] = "Sam";
			array[1] = "Fred";
			array[2] = "Betty";
			array[3] = "Sarah";
			array[4] = "Lou";
			array[5] = "Jerry";
			array[6] = "Bob";
			array[7] = "Larry";
			array[8] = "Izzy";
			array[9] = "Susan";			
		}else {
			System.out.println("Invalid Size of array to add creatures or buildings to.");
		}
		
	}
	
	//print the info about the farm in a readable way
	public static void printFarmInfo(Farm myFarm)
	{
		System.out.print(myFarm.getFarmName() + " has ");
		for(int i=0; i < myFarm.getAnimals().size(); ++i) {
			String type = myFarm.getAnimals().elementAt(i).getAnimalType();
			String name = myFarm.getAnimals().elementAt(i).getAnimalName();
			if(i == myFarm.getAnimals().size()-1) {
				System.out.print("and " + name + " the " + type);
			} else {
				System.out.print(name + " the " + type + ", ");
			}
			
		}
		
	}
	
	//print the array, this is for debugging purposes
	public static void printArray(String array[], String arrayName) 
	{
		System.out.print(arrayName + ": ");
		for(String item: array) {
			System.out.print(item + " ");
		}
	}
	
}
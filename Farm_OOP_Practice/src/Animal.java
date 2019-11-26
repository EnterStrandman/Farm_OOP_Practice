/**
 * Animal Class 
 * @author M. Strand
 * 11/24/2019
 */
public class Animal
{
	private final String animalType;
	private final String animalName;
	private String buildingHoused;
	
	//constructor
	public Animal(String animalType, String animalName, String buildingHoused)
	{
		this.animalType = animalType;
		this.animalName = animalName;
		this.buildingHoused = buildingHoused;
	}
	
	//GETTERS
	public String getBuildingHoused() {return buildingHoused;}
	public String getAnimalType() {return animalType;}
	public String getAnimalName() {return animalName;}
	
	//SETTERS
	public void setBuildingHoused(String buildingHoused) {this.buildingHoused = buildingHoused;}

}

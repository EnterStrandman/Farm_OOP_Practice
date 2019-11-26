/*
 * Farm Class 
 * @author M. Strand
 * 11/24/2019
 */
import java.util.Vector;

public class Farm 
{
	private String farmName;
	private String ownerName;
	private final int yearConstructed;
	private Vector<Animal> farmAnimals = new Vector<Animal>(); 
	
	//parameterized constructor
	public Farm(String farmName, String ownerName, int yearConstructed)
	{
		this.farmName = farmName;
		this.ownerName = ownerName;
		this.yearConstructed = yearConstructed;
	}
	
	//METHODS
	protected void addAnimal(Animal newAnimal)
	{
		farmAnimals.add(newAnimal);
	}
	
	protected boolean removeAnimal(Animal removeAnimal)
	{
		if(farmAnimals.contains(removeAnimal)) {
			farmAnimals.remove(removeAnimal);
			return true;
		} else {
			return false;
		}
	}
	
	//GETTERS
	public String getFarmName() {return farmName;}
	public String getOwnerName() {return ownerName;}
	public int getYearConstructed() {return yearConstructed;}
	public Vector<Animal> getAnimals() {return farmAnimals;}
	
	//SETTERS
	public void setName(String farmName) {this.farmName = farmName;}
	public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
	
}

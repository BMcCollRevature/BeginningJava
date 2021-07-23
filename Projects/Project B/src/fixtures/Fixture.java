package fixtures;

public abstract class Fixture {
	
	String name;
	String shortDescription;
	String longDescription;
	
	String item;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		}
	
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public String getshortDescription() {
		return shortDescription;
		}
	public void setshortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
		}
	public String getlongDescription() {
		return longDescription;
		}
	public void setlongDescription(String longDescription) {
		this.longDescription = longDescription;
		}
	@Override
	public String toString() {
		return shortDescription + " " + longDescription + "\n";
	}
	
	
}



public class Sculpture extends Art {

	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	// the method abstract from class Art 
	
	public void viewArt() {
		String r = "";
		r += "Title: " + getTitle() + "\n";
		r += "Author: " + getAuthor() + "\n";
		r += "Description: " + getDescription() + "\n";
		r += "material:   " + material + "\n";
		System.out.println(r);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
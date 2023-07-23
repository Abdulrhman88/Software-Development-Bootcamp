

public class Painting extends Art {

	private String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
    	// the method abstract from class Art 

	public void viewArt() {
		String r = "";
		r += "Title : " + getTitle() + "\n";
		r += "Author : " + getAuthor() + "\n";
		r += "Description: " + getDescription() + "\n";
		r += "paintType:   " + paintType + "\n";

		System.out.println(r);
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
}
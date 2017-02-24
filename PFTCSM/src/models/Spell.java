package models;

public class Spell {
	private String name;
	private int level;
	private String school;
	private String subschool;
	private int prepared;
	private int cast;
	private String notes;
	private String description;
	
	public Spell(){
		
	}
	
	public Spell(String name, int level, String school, String subschool, int prepared, int cast, String notes, String description){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSubschool() {
		return subschool;
	}

	public void setSubschool(String subschool) {
		this.subschool = subschool;
	}

	public int getPrepared() {
		return prepared;
	}

	public void setPrepared(int prepared) {
		this.prepared = prepared;
	}

	public int getCast() {
		return cast;
	}

	public void setCast(int cast) {
		this.cast = cast;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

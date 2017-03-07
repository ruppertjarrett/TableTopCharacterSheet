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
		setName(name);
		setLevel(level);
		setSchool(school);
		setSubschool(subschool);
		setPrepared(prepared);
		setCast(cast);
		setNotes(notes);
		setDescription(description);
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name # ");
		sb.append(getName());
		sb.append(" | ");
		
		sb.append("Level # ");
		sb.append(getLevel());
		sb.append(" | ");
		
		sb.append("School # ");
		sb.append(getSchool());
		sb.append(" | ");
		
		sb.append("Subschool # ");
		sb.append(getSubschool());
		sb.append(" | ");
		
		sb.append("Prepared # ");
		sb.append(getPrepared());
		sb.append(" | ");
		
		sb.append("Cast # ");
		sb.append(getCast());
		sb.append(" | ");
		
		sb.append("Notes # ");
		sb.append(getNotes());
		sb.append(" | ");
		
		sb.append("Description # ");
		sb.append(getDescription());
		sb.append(" | ");
		
		sb.append("\r	");
		
		return sb.toString();
	}
}

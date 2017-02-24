package models;

public class Ability {
	private String name;
	private String type;
	private String notes;
	private AbilityType abilityType;
	
	public Ability(){
		
	}
	
	public Ability(String name, String type, String notes, AbilityType abilityType){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public AbilityType getAbilityType() {
		return abilityType;
	}

	public void setAbilityType(AbilityType abilityType) {
		this.abilityType = abilityType;
	}

}

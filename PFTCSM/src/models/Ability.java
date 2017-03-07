package models;

import enums.AbilityType;

public class Ability {
	private String name;
	private String type;
	private String notes;
	private AbilityType abilityType;
	
	public Ability(){
		
	}
	
	public Ability(String name, String type, String notes, AbilityType abilityType){
		setName(name);
		setType(type);
		setNotes(notes);
		setAbilityType(abilityType);
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name # ");
		sb.append(getName());
		sb.append(" | ");
		
		sb.append("Type # ");
		sb.append(getType());
		sb.append(" | ");
		
		sb.append("Notes # ");
		sb.append(getNotes());
		sb.append(" | ");
		
		sb.append("AbilityType # ");
		sb.append(getAbilityType());
		sb.append(" | ");
		
		sb.append("\r	+");
		
		return sb.toString();
	}
}

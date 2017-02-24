package models;

public class Armor {
	private String name;
	private int value;
	private String type;
	private int bonus;
	private int penalty;
	private int spellFailure;
	private int weight;
	private String properties;
	
	public Armor(){
		
	}
	public Armor(String name, int value, String type, int bonus, int penalty, int spellFailure, int weight, String Properties){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public int getSpellFailure() {
		return spellFailure;
	}
	public void setSpellFailure(int spellFailure) {
		this.spellFailure = spellFailure;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
}

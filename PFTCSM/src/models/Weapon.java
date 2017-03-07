package models;

public class Weapon {
	private String name;
	private int value;
	private String range;
	private String damage;
	private int attackBonus;
	private String critical;
	private String type;
	private String notes;
	
	public Weapon(){
		
	}
	
	public Weapon(String name, int value, String range, String damage, int attackBonus, String critical, String type, String notes){
		setName(name);
		setValue(value);
		setRange(range);
		setDamage(damage);
		setAttackBonus(attackBonus);
		setCritical(critical);
		setType(type);
		setNotes(notes);
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

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	public int getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}

	public String getCritical() {
		return critical;
	}

	public void setCritical(String critical) {
		this.critical = critical;
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name # ");
		sb.append(getName());
		sb.append(" | ");
		
		sb.append("Value # ");
		sb.append(getValue());
		sb.append(" | ");
		
		sb.append("Range # ");
		sb.append(getRange());
		sb.append(" | ");
		
		sb.append("Damage # ");
		sb.append(getDamage());
		sb.append(" | ");
		
		sb.append("AttackBonus # ");
		sb.append(getAttackBonus());
		sb.append(" | ");
		
		sb.append("Critical # ");
		sb.append(getCritical());
		sb.append(" | ");
		
		sb.append("Type # ");
		sb.append(getType());
		sb.append(" | ");
		
		sb.append("Notes # ");
		sb.append(getNotes());
		sb.append(" | ");
		
		sb.append("\r	+");
		
		return sb.toString();
	}
}

package models;

public class Item {
	private String name;
	private int value;
	private String location;
	private String type;
	private String description;
	
	public Item(){
		
	}
	
	public Item(String name, int value, String location, String type, String description){
		setName(name);
		setValue(value);
		setLocation(location);
		setType(type);
		setDescription(description);
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name # ");
		sb.append(getName());
		sb.append(" | ");
		
		sb.append("Value # ");
		sb.append(getValue());
		sb.append(" | ");
		
		sb.append("Location # ");
		sb.append(getLocation());
		sb.append(" | ");
		
		sb.append("Type # ");
		sb.append(getType());
		sb.append(" | ");
		
		sb.append("Description # ");
		sb.append(getDescription());
		sb.append(" | ");
		
		sb.append("\r	+");
		
		return sb.toString();
	}
}

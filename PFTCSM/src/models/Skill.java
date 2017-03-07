package models;

import enums.NameOfSkill;
import enums.SkillTiedAbility;

public class Skill {
	private final NameOfSkill name;
	private final SkillTiedAbility ability;
	private int rank;
	private int miscMod;
	
	public Skill(NameOfSkill name, SkillTiedAbility ability, int rank, int miscMod){
		this.name = name;
		this.ability = ability;
		setRank(rank);
		setMiscMod(miscMod);
	}
	
	public int getTotal(){
		return rank + miscMod;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getMiscMod() {
		return miscMod;
	}

	public void setMiscMod(int miscMod) {
		this.miscMod = miscMod;
	}

	public NameOfSkill getName() {

		return name;
	}	

	public SkillTiedAbility getAbility() {
		return ability;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Ability # ");
		sb.append(getAbility());
		sb.append(" | ");
		
		sb.append("Rank # ");
		sb.append(getRank());
		sb.append(" | ");
		
		sb.append("MiscMod # ");
		sb.append(getMiscMod());
		sb.append(" | ");
		
		sb.append("\r	");
		
		return sb.toString();
	}
}

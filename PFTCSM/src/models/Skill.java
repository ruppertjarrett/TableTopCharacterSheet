package models;

import enums.NameOfSkill;
import enums.SkillTiedAbility;

public class Skill {
	private final NameOfSkill name;
	private final SkillTiedAbility ability;
	private int rank;
	private int miscMod;
	
	public Skill(NameOfSkill name, SkillTiedAbility ability){
		this.name = name;
		this.ability = ability;
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

}

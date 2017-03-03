package models;

import java.util.ArrayList;
import java.util.HashMap;

import enums.Alignment;
import enums.Class;
import enums.Deity;
import enums.Gender;
import enums.NameOfSkill;
import enums.Race;

public class CharacterSheet
{
	private int level, age, weight, strBase, strMod, strTemp, strTempMod, dexBase, dexMod, dexTemp, dexTempMod, conBase,
			conMod, conTemp, conTempMod, intBase, intMod, intTemp, intTempMod, wisBase, wisMod, wisTemp, wisTempMod,
			baseHP, curHP, baseSpeed, speedWithArmor, flySpeed, swimSpeed, climbSpeed, burrowSpeed, speedMod,
			nonlethalDamage, armorBonus, shieldBonus, sizeArmorMod, naturalArmor, deflectArmorMod, miscArmorMod,
			initiativeMod, miscInitiativeMod, baseSaveF, baseSaveR, baseSaveW, magicModF, miscModF, tempModF, magicModR,
			miscModR, tempModR, magicModW, miscModW, tempModW, baseAttackBonus, experience, expToNextLvl, CP, SP, GP,
			PP, spellsKnown0, dc0, spd0, spellsKnown1, dc1, spd1, bonusSpells1, spellsKnown2, dc2, spd2, bonusSpells2,
			spellsKnown3, dc3, spd3, bonusSpells3, spellsKnown4, dc4, spd4, bonusSpells4, spellsKnown5, dc5, spd5, bonusSpells5,
			spellsKnown6, dc6, spd6, bonusSpells6, spellsKnown7, dc7, spd7, bonusSpells7, spellsKnown8, dc8, spd8, bonusSpells8,
			spellsKnown9, dc9, spd9, bonusSpells9;
	private String name, homeland, size, height, hair, eyes, spellResistance;
	private Class charClass;
	private Alignment alignment;
	private Deity deity;
	private Race race;
	private Gender gender;
	ArrayList<Weapon> weapons = new ArrayList<>();
	ArrayList<Armor> armor = new ArrayList<>();
	ArrayList<Item> items = new ArrayList<>();
	ArrayList<Spell> spells = new ArrayList<>();
	ArrayList<Ability> abilities = new ArrayList<>();
	HashMap<NameOfSkill, Skill> skills = new HashMap<>();
	
	public CharacterSheet(){
	}

	public CharacterSheet(int level, int age, int weight, int strBase, int strMod, int strTemp, int strTempMod,
			int dexBase, int dexMod, int dexTemp, int dexTempMod, int conBase, int conMod, int conTemp, int conTempMod,
			int intBase, int intMod, int intTemp, int intTempMod, int wisBase, int wisMod, int wisTemp, int wisTempMod,
			int baseHP, int curHP, int baseSpeed, int speedWithArmor, int flySpeed, int swimSpeed, int climbSpeed,
			int burrowSpeed, int speedMod, int nonlethalDamage, int armorBonus, int shieldBonus, int sizeArmorMod,
			int naturalArmor, int deflectArmorMod, int miscArmorMod, int initiativeMod, int miscInitiativeMod,
			int baseSaveF, int baseSaveR, int baseSaveW, int magicModF, int miscModF, int tempModF, int magicModR,
			int miscModR, int tempModR, int magicModW, int miscModW, int tempModW, int baseAttackBonus, int experience,
			int expToNextLvl, int cP, int sP, int gP, int pP, String name, String homeland, String size, String height,
			String hair, String eyes, String spellResistance, Class charClass, Alignment alignment, Deity deity,
			Race race, Gender gender, ArrayList<Weapon> weapons, ArrayList<Armor> armor, ArrayList<Item> items,
			ArrayList<Spell> spells, ArrayList<Ability> abilities, HashMap<NameOfSkill, Skill> skills)
	{
		super();
		this.level = level;
		this.age = age;
		this.weight = weight;
		this.strBase = strBase;
		this.strMod = strMod;
		this.strTemp = strTemp;
		this.strTempMod = strTempMod;
		this.dexBase = dexBase;
		this.dexMod = dexMod;
		this.dexTemp = dexTemp;
		this.dexTempMod = dexTempMod;
		this.conBase = conBase;
		this.conMod = conMod;
		this.conTemp = conTemp;
		this.conTempMod = conTempMod;
		this.intBase = intBase;
		this.intMod = intMod;
		this.intTemp = intTemp;
		this.intTempMod = intTempMod;
		this.wisBase = wisBase;
		this.wisMod = wisMod;
		this.wisTemp = wisTemp;
		this.wisTempMod = wisTempMod;
		this.baseHP = baseHP;
		this.curHP = curHP;
		this.baseSpeed = baseSpeed;
		this.speedWithArmor = speedWithArmor;
		this.flySpeed = flySpeed;
		this.swimSpeed = swimSpeed;
		this.climbSpeed = climbSpeed;
		this.burrowSpeed = burrowSpeed;
		this.speedMod = speedMod;
		this.nonlethalDamage = nonlethalDamage;
		this.armorBonus = armorBonus;
		this.shieldBonus = shieldBonus;
		this.sizeArmorMod = sizeArmorMod;
		this.naturalArmor = naturalArmor;
		this.deflectArmorMod = deflectArmorMod;
		this.miscArmorMod = miscArmorMod;
		this.initiativeMod = initiativeMod;
		this.miscInitiativeMod = miscInitiativeMod;
		this.baseSaveF = baseSaveF;
		this.baseSaveR = baseSaveR;
		this.baseSaveW = baseSaveW;
		this.magicModF = magicModF;
		this.miscModF = miscModF;
		this.tempModF = tempModF;
		this.magicModR = magicModR;
		this.miscModR = miscModR;
		this.tempModR = tempModR;
		this.magicModW = magicModW;
		this.miscModW = miscModW;
		this.tempModW = tempModW;
		this.baseAttackBonus = baseAttackBonus;
		this.experience = experience;
		this.expToNextLvl = expToNextLvl;
		CP = cP;
		SP = sP;
		GP = gP;
		PP = pP;
		this.name = name;
		this.homeland = homeland;
		this.size = size;
		this.height = height;
		this.hair = hair;
		this.eyes = eyes;
		this.spellResistance = spellResistance;
		this.charClass = charClass;
		this.alignment = alignment;
		this.deity = deity;
		this.race = race;
		this.gender = gender;
		this.weapons = weapons;
		this.armor = armor;
		this.items = items;
		this.spells = spells;
		this.abilities = abilities;
		this.skills = skills;
	}

	public int getLevel()
	{
		return level;
	}

	public int getAge()
	{
		return age;
	}

	public int getWeight()
	{
		return weight;
	}

	public int getStrBase()
	{
		return strBase;
	}

	public int getStrMod()
	{
		return strMod;
	}

	public int getStrTemp()
	{
		return strTemp;
	}

	public int getStrTempMod()
	{
		return strTempMod;
	}

	public int getDexBase()
	{
		return dexBase;
	}

	public int getDexMod()
	{
		return dexMod;
	}

	public int getDexTemp()
	{
		return dexTemp;
	}

	public int getDexTempMod()
	{
		return dexTempMod;
	}

	public int getConBase()
	{
		return conBase;
	}

	public int getConMod()
	{
		return conMod;
	}

	public int getConTemp()
	{
		return conTemp;
	}

	public int getConTempMod()
	{
		return conTempMod;
	}

	public int getIntBase()
	{
		return intBase;
	}

	public int getIntMod()
	{
		return intMod;
	}

	public int getIntTemp()
	{
		return intTemp;
	}

	public int getIntTempMod()
	{
		return intTempMod;
	}

	public int getWisBase()
	{
		return wisBase;
	}

	public int getWisMod()
	{
		return wisMod;
	}

	public int getWisTemp()
	{
		return wisTemp;
	}

	public int getWisTempMod()
	{
		return wisTempMod;
	}

	public int getBaseHP()
	{
		return baseHP;
	}

	public int getCurHP()
	{
		return curHP;
	}

	public int getBaseSpeed()
	{
		return baseSpeed;
	}

	public int getSpeedWithArmor()
	{
		return speedWithArmor;
	}

	public int getFlySpeed()
	{
		return flySpeed;
	}

	public int getSwimSpeed()
	{
		return swimSpeed;
	}

	public int getClimbSpeed()
	{
		return climbSpeed;
	}

	public int getBurrowSpeed()
	{
		return burrowSpeed;
	}

	public int getSpeedMod()
	{
		return speedMod;
	}

	public int getNonlethalDamage()
	{
		return nonlethalDamage;
	}

	public int getArmorBonus()
	{
		return armorBonus;
	}

	public int getShieldBonus()
	{
		return shieldBonus;
	}

	public int getSizeArmorMod()
	{
		return sizeArmorMod;
	}

	public int getNaturalArmor()
	{
		return naturalArmor;
	}

	public int getDeflectArmorMod()
	{
		return deflectArmorMod;
	}

	public int getMiscArmorMod()
	{
		return miscArmorMod;
	}

	public int getInitiativeMod()
	{
		return initiativeMod;
	}

	public int getMiscInitiativeMod()
	{
		return miscInitiativeMod;
	}

	public int getBaseSaveF()
	{
		return baseSaveF;
	}

	public int getBaseSaveR()
	{
		return baseSaveR;
	}

	public int getBaseSaveW()
	{
		return baseSaveW;
	}

	public int getMagicModF()
	{
		return magicModF;
	}

	public int getMiscModF()
	{
		return miscModF;
	}

	public int getTempModF()
	{
		return tempModF;
	}

	public int getMagicModR()
	{
		return magicModR;
	}

	public int getMiscModR()
	{
		return miscModR;
	}

	public int getTempModR()
	{
		return tempModR;
	}

	public int getMagicModW()
	{
		return magicModW;
	}

	public int getMiscModW()
	{
		return miscModW;
	}

	public int getTempModW()
	{
		return tempModW;
	}

	public int getBaseAttackBonus()
	{
		return baseAttackBonus;
	}

	public int getExperience()
	{
		return experience;
	}

	public int getExpToNextLvl()
	{
		return expToNextLvl;
	}

	public int getCP()
	{
		return CP;
	}

	public int getSP()
	{
		return SP;
	}

	public int getGP()
	{
		return GP;
	}

	public int getPP()
	{
		return PP;
	}

	public String getName()
	{
		return name;
	}

	public String getHomeland()
	{
		return homeland;
	}

	public String getSize()
	{
		return size;
	}

	public String getHeight()
	{
		return height;
	}

	public String getHair()
	{
		return hair;
	}

	public String getEyes()
	{
		return eyes;
	}

	public String getSpellResistance()
	{
		return spellResistance;
	}

	public Class getCharClass()
	{
		return charClass;
	}

	public Alignment getAlignment()
	{
		return alignment;
	}

	public Deity getDeity()
	{
		return deity;
	}

	public Race getRace()
	{
		return race;
	}

	public Gender getGender()
	{
		return gender;
	}

	public ArrayList<Weapon> getWeapons()
	{
		return weapons;
	}

	public ArrayList<Armor> getArmor()
	{
		return armor;
	}

	public ArrayList<Item> getItems()
	{
		return items;
	}

	public ArrayList<Spell> getSpells()
	{
		return spells;
	}

	public ArrayList<Ability> getAbilities()
	{
		return abilities;
	}

	public HashMap<NameOfSkill, Skill> getSkills()
	{
		return skills;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public void setStrBase(int strBase)
	{
		this.strBase = strBase;
	}

	public void setStrMod(int strMod)
	{
		this.strMod = strMod;
	}

	public void setStrTemp(int strTemp)
	{
		this.strTemp = strTemp;
	}

	public void setStrTempMod(int strTempMod)
	{
		this.strTempMod = strTempMod;
	}

	public void setDexBase(int dexBase)
	{
		this.dexBase = dexBase;
	}

	public void setDexMod(int dexMod)
	{
		this.dexMod = dexMod;
	}

	public void setDexTemp(int dexTemp)
	{
		this.dexTemp = dexTemp;
	}

	public void setDexTempMod(int dexTempMod)
	{
		this.dexTempMod = dexTempMod;
	}

	public void setConBase(int conBase)
	{
		this.conBase = conBase;
	}

	public void setConMod(int conMod)
	{
		this.conMod = conMod;
	}

	public void setConTemp(int conTemp)
	{
		this.conTemp = conTemp;
	}

	public void setConTempMod(int conTempMod)
	{
		this.conTempMod = conTempMod;
	}

	public void setIntBase(int intBase)
	{
		this.intBase = intBase;
	}

	public void setIntMod(int intMod)
	{
		this.intMod = intMod;
	}

	public void setIntTemp(int intTemp)
	{
		this.intTemp = intTemp;
	}

	public void setIntTempMod(int intTempMod)
	{
		this.intTempMod = intTempMod;
	}

	public void setWisBase(int wisBase)
	{
		this.wisBase = wisBase;
	}

	public void setWisMod(int wisMod)
	{
		this.wisMod = wisMod;
	}

	public void setWisTemp(int wisTemp)
	{
		this.wisTemp = wisTemp;
	}

	public void setWisTempMod(int wisTempMod)
	{
		this.wisTempMod = wisTempMod;
	}

	public void setBaseHP(int baseHP)
	{
		this.baseHP = baseHP;
	}

	public void setCurHP(int curHP)
	{
		this.curHP = curHP;
	}

	public void setBaseSpeed(int baseSpeed)
	{
		this.baseSpeed = baseSpeed;
	}

	public void setSpeedWithArmor(int speedWithArmor)
	{
		this.speedWithArmor = speedWithArmor;
	}

	public void setFlySpeed(int flySpeed)
	{
		this.flySpeed = flySpeed;
	}

	public void setSwimSpeed(int swimSpeed)
	{
		this.swimSpeed = swimSpeed;
	}

	public void setClimbSpeed(int climbSpeed)
	{
		this.climbSpeed = climbSpeed;
	}

	public void setBurrowSpeed(int burrowSpeed)
	{
		this.burrowSpeed = burrowSpeed;
	}

	public void setSpeedMod(int speedMod)
	{
		this.speedMod = speedMod;
	}

	public void setNonlethalDamage(int nonlethalDamage)
	{
		this.nonlethalDamage = nonlethalDamage;
	}

	public void setArmorBonus(int armorBonus)
	{
		this.armorBonus = armorBonus;
	}

	public void setShieldBonus(int shieldBonus)
	{
		this.shieldBonus = shieldBonus;
	}

	public void setSizeArmorMod(int sizeArmorMod)
	{
		this.sizeArmorMod = sizeArmorMod;
	}

	public void setNaturalArmor(int naturalArmor)
	{
		this.naturalArmor = naturalArmor;
	}

	public void setDeflectArmorMod(int deflectArmorMod)
	{
		this.deflectArmorMod = deflectArmorMod;
	}

	public void setMiscArmorMod(int miscArmorMod)
	{
		this.miscArmorMod = miscArmorMod;
	}

	public void setInitiativeMod(int initiativeMod)
	{
		this.initiativeMod = initiativeMod;
	}

	public void setMiscInitiativeMod(int miscInitiativeMod)
	{
		this.miscInitiativeMod = miscInitiativeMod;
	}

	public void setBaseSaveF(int baseSaveF)
	{
		this.baseSaveF = baseSaveF;
	}

	public void setBaseSaveR(int baseSaveR)
	{
		this.baseSaveR = baseSaveR;
	}

	public void setBaseSaveW(int baseSaveW)
	{
		this.baseSaveW = baseSaveW;
	}

	public void setMagicModF(int magicModF)
	{
		this.magicModF = magicModF;
	}

	public void setMiscModF(int miscModF)
	{
		this.miscModF = miscModF;
	}

	public void setTempModF(int tempModF)
	{
		this.tempModF = tempModF;
	}

	public void setMagicModR(int magicModR)
	{
		this.magicModR = magicModR;
	}

	public void setMiscModR(int miscModR)
	{
		this.miscModR = miscModR;
	}

	public void setTempModR(int tempModR)
	{
		this.tempModR = tempModR;
	}

	public void setMagicModW(int magicModW)
	{
		this.magicModW = magicModW;
	}

	public void setMiscModW(int miscModW)
	{
		this.miscModW = miscModW;
	}

	public void setTempModW(int tempModW)
	{
		this.tempModW = tempModW;
	}

	public void setBaseAttackBonus(int baseAttackBonus)
	{
		this.baseAttackBonus = baseAttackBonus;
	}

	public void setExperience(int experience)
	{
		this.experience = experience;
	}

	public void setExpToNextLvl(int expToNextLvl)
	{
		this.expToNextLvl = expToNextLvl;
	}

	public void setCP(int cP)
	{
		CP = cP;
	}

	public void setSP(int sP)
	{
		SP = sP;
	}

	public void setGP(int gP)
	{
		GP = gP;
	}

	public void setPP(int pP)
	{
		PP = pP;
	}
	
	public int getSpellsKnown0() {
		return spellsKnown0;
	}

	public void setSpellsKnown0(int spellsKnown0) {
		this.spellsKnown0 = spellsKnown0;
	}

	public int getDc0() {
		return dc0;
	}

	public void setDc0(int dc0) {
		this.dc0 = dc0;
	}

	public int getSpd0() {
		return spd0;
	}

	public void setSpd0(int spd0) {
		this.spd0 = spd0;
	}

	public int getSpellsKnown1() {
		return spellsKnown1;
	}

	public void setSpellsKnown1(int spellsKnown1) {
		this.spellsKnown1 = spellsKnown1;
	}

	public int getDc1() {
		return dc1;
	}

	public void setDc1(int dc1) {
		this.dc1 = dc1;
	}

	public int getSpd1() {
		return spd1;
	}

	public void setSpd1(int spd1) {
		this.spd1 = spd1;
	}

	public int getBonusSpells1() {
		return bonusSpells1;
	}

	public void setBonusSpells1(int bonusSpells1) {
		this.bonusSpells1 = bonusSpells1;
	}

	public int getSpellsKnown2() {
		return spellsKnown2;
	}

	public void setSpellsKnown2(int spellsKnown2) {
		this.spellsKnown2 = spellsKnown2;
	}

	public int getDc2() {
		return dc2;
	}

	public void setDc2(int dc2) {
		this.dc2 = dc2;
	}

	public int getSpd2() {
		return spd2;
	}

	public void setSpd2(int spd2) {
		this.spd2 = spd2;
	}

	public int getBonusSpells2() {
		return bonusSpells2;
	}

	public void setBonusSpells2(int bonusSpells2) {
		this.bonusSpells2 = bonusSpells2;
	}

	public int getSpellsKnown3() {
		return spellsKnown3;
	}

	public void setSpellsKnown3(int spellsKnown3) {
		this.spellsKnown3 = spellsKnown3;
	}

	public int getDc3() {
		return dc3;
	}

	public void setDc3(int dc3) {
		this.dc3 = dc3;
	}

	public int getSpd3() {
		return spd3;
	}

	public void setSpd3(int spd3) {
		this.spd3 = spd3;
	}

	public int getBonusSpells3() {
		return bonusSpells3;
	}

	public void setBonusSpells3(int bonusSpells3) {
		this.bonusSpells3 = bonusSpells3;
	}

	public int getSpellsKnown4() {
		return spellsKnown4;
	}

	public void setSpellsKnown4(int spellsKnown4) {
		this.spellsKnown4 = spellsKnown4;
	}

	public int getDc4() {
		return dc4;
	}

	public void setDc4(int dc4) {
		this.dc4 = dc4;
	}

	public int getSpd4() {
		return spd4;
	}

	public void setSpd4(int spd4) {
		this.spd4 = spd4;
	}

	public int getBonusSpells4() {
		return bonusSpells4;
	}

	public void setBonusSpells4(int bonusSpells4) {
		this.bonusSpells4 = bonusSpells4;
	}

	public int getSpellsKnown5() {
		return spellsKnown5;
	}

	public void setSpellsKnown5(int spellsKnown5) {
		this.spellsKnown5 = spellsKnown5;
	}

	public int getDc5() {
		return dc5;
	}

	public void setDc5(int dc5) {
		this.dc5 = dc5;
	}

	public int getSpd5() {
		return spd5;
	}

	public void setSpd5(int spd5) {
		this.spd5 = spd5;
	}

	public int getBonusSpells5() {
		return bonusSpells5;
	}

	public void setBonusSpells5(int bonusSpells5) {
		this.bonusSpells5 = bonusSpells5;
	}

	public int getSpellsKnown6() {
		return spellsKnown6;
	}

	public void setSpellsKnown6(int spellsKnown6) {
		this.spellsKnown6 = spellsKnown6;
	}

	public int getDc6() {
		return dc6;
	}

	public void setDc6(int dc6) {
		this.dc6 = dc6;
	}

	public int getSpd6() {
		return spd6;
	}

	public void setSpd6(int spd6) {
		this.spd6 = spd6;
	}

	public int getBonusSpells6() {
		return bonusSpells6;
	}

	public void setBonusSpells6(int bonusSpells6) {
		this.bonusSpells6 = bonusSpells6;
	}

	public int getSpellsKnown7() {
		return spellsKnown7;
	}

	public void setSpellsKnown7(int spellsKnown7) {
		this.spellsKnown7 = spellsKnown7;
	}

	public int getDc7() {
		return dc7;
	}

	public void setDc7(int dc7) {
		this.dc7 = dc7;
	}

	public int getSpd7() {
		return spd7;
	}

	public void setSpd7(int spd7) {
		this.spd7 = spd7;
	}

	public int getBonusSpells7() {
		return bonusSpells7;
	}

	public void setBonusSpells7(int bonusSpells7) {
		this.bonusSpells7 = bonusSpells7;
	}

	public int getSpellsKnown8() {
		return spellsKnown8;
	}

	public void setSpellsKnown8(int spellsKnown8) {
		this.spellsKnown8 = spellsKnown8;
	}

	public int getDc8() {
		return dc8;
	}

	public void setDc8(int dc8) {
		this.dc8 = dc8;
	}

	public int getSpd8() {
		return spd8;
	}

	public void setSpd8(int spd8) {
		this.spd8 = spd8;
	}

	public int getBonusSpells8() {
		return bonusSpells8;
	}

	public void setBonusSpells8(int bonusSpells8) {
		this.bonusSpells8 = bonusSpells8;
	}

	public int getSpellsKnown9() {
		return spellsKnown9;
	}

	public void setSpellsKnown9(int spellsKnown9) {
		this.spellsKnown9 = spellsKnown9;
	}

	public int getDc9() {
		return dc9;
	}

	public void setDc9(int dc9) {
		this.dc9 = dc9;
	}

	public int getSpd9() {
		return spd9;
	}

	public void setSpd9(int spd9) {
		this.spd9 = spd9;
	}

	public int getBonusSpells9() {
		return bonusSpells9;
	}

	public void setBonusSpells9(int bonusSpells9) {
		this.bonusSpells9 = bonusSpells9;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setHomeland(String homeland)
	{
		this.homeland = homeland;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public void setHeight(String height)
	{
		this.height = height;
	}

	public void setHair(String hair)
	{
		this.hair = hair;
	}

	public void setEyes(String eyes)
	{
		this.eyes = eyes;
	}

	public void setSpellResistance(String spellResistance)
	{
		this.spellResistance = spellResistance;
	}

	public void setCharClass(Class charClass)
	{
		this.charClass = charClass;
	}

	public void setAlignment(Alignment alignment)
	{
		this.alignment = alignment;
	}

	public void setDeity(Deity deity)
	{
		this.deity = deity;
	}

	public void setRace(Race race)
	{
		this.race = race;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public void setWeapons(ArrayList<Weapon> weapons)
	{
		this.weapons = weapons;
	}

	public void setArmor(ArrayList<Armor> armor)
	{
		this.armor = armor;
	}

	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}

	public void setSpells(ArrayList<Spell> spells)
	{
		this.spells = spells;
	}

	public void setAbilities(ArrayList<Ability> abilities)
	{
		this.abilities = abilities;
	}

	public void setSkills(HashMap<NameOfSkill, Skill> skills)
	{
		this.skills = skills;
	}
}
/*
 * +getTouchAC() : int +getFlatFootedAC() : int +getCMB() : int +getCMD() : int
 * Getters(For everything)
 * 
 * Setters(For everything)
 */
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
			PP;
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
 */
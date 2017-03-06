package app;

import models.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import enums.Alignment;
import enums.Class;
import enums.Deity;
import enums.Gender;
import enums.Race;

public class FileManager {

	public static String formatInfoToString(CharacterSheet sheet) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Level : ");
		sb.append(sheet.getLevel());
		sb.append(";\r");
		
		sb.append("Age : ");
		sb.append(sheet.getAge());
		sb.append(";\r");
		
		sb.append("Weight : ");
		sb.append(sheet.getWeight());
		sb.append(";\r");
		
		sb.append("StrBase : ");
		sb.append(sheet.getStrBase());
		sb.append(";\r");
		
		sb.append("StrMod : ");
		sb.append(sheet.getStrMod());
		sb.append(";\r");
		
		sb.append("StrTemp : ");
		sb.append(sheet.getStrTemp());
		sb.append(";\r");
		
		sb.append("StrTempMod : ");
		sb.append(sheet.getStrTempMod());
		sb.append(";\r");
		
		sb.append("DexBase : ");
		sb.append(sheet.getDexBase());
		sb.append(";\r");
		
		sb.append("DexMod : ");
		sb.append(sheet.getDexMod());
		sb.append(";\r");
		
		sb.append("DexTemp : ");
		sb.append(sheet.getDexTemp());
		sb.append(";\r");
		
		sb.append("DexTempMod : ");
		sb.append(sheet.getDexTempMod());
		sb.append(";\r");
		
		sb.append("ConBase : ");
		sb.append(sheet.getConBase());
		sb.append(";\r");
		
		sb.append("ConMod : ");
		sb.append(sheet.getConMod());
		sb.append(";\r");
		
		sb.append("ConTemp : ");
		sb.append(sheet.getConTemp());
		sb.append(";\r");
		
		sb.append("ConTempMod : ");
		sb.append(sheet.getConTempMod());
		sb.append(";\r");
		
		sb.append("IntBase : ");
		sb.append(sheet.getIntBase());
		sb.append(";\r");
		
		sb.append("IntMod : ");
		sb.append(sheet.getIntMod());
		sb.append(";\r");
		
		sb.append("IntTemp : ");
		sb.append(sheet.getIntTemp());
		sb.append(";\r");
		
		sb.append("IntTempMod : ");
		sb.append(sheet.getIntTempMod());
		sb.append(";\r");
		
		sb.append("WisBase : ");
		sb.append(sheet.getWisBase());
		sb.append(";\r");
		
		sb.append("WisMod : ");
		sb.append(sheet.getWisMod());
		sb.append(";\r");
		
		sb.append("WisTemp : ");
		sb.append(sheet.getWisTemp());
		sb.append(";\r");
		
		sb.append("WisTempMod : ");
		sb.append(sheet.getWisTempMod());
		sb.append(";\r");
		
		sb.append("BaseHP : ");
		sb.append(sheet.getBaseHP());
		sb.append(";\r");
		
		sb.append("CurHP : ");
		sb.append(sheet.getCurHP());
		sb.append(";\r");
		
		sb.append("BaseSpeed : ");
		sb.append(sheet.getBaseSpeed());
		sb.append(";\r");
		
		sb.append("SpeedWithArmor : ");
		sb.append(sheet.getSpeedWithArmor());
		sb.append(";\r");
		
		sb.append("FlySpeed : ");
		sb.append(sheet.getFlySpeed());
		sb.append(";\r");
		
		sb.append("SwimSpeed : ");
		sb.append(sheet.getSwimSpeed());
		sb.append(";\r");
		
		sb.append("ClimbSpeed : ");
		sb.append(sheet.getClimbSpeed());
		sb.append(";\r");
		
		sb.append("BurrowSpeed : ");
		sb.append(sheet.getBurrowSpeed());
		sb.append(";\r");
		
		sb.append("SpeedMod : ");
		sb.append(sheet.getSpeedMod());
		sb.append(";\r");
		
		sb.append("NonlethalDamage : ");
		sb.append(sheet.getNonlethalDamage());
		sb.append(";\r");
		
		sb.append("ArmorBonus : ");
		sb.append(sheet.getArmorBonus());
		sb.append(";\r");
		
		sb.append("ShieldBonus : ");
		sb.append(sheet.getShieldBonus());
		sb.append(";\r");
		
		sb.append("SizeArmorMod : ");
		sb.append(sheet.getSizeArmorMod());
		sb.append(";\r");
		
		sb.append("NaturalArmor : ");
		sb.append(sheet.getNaturalArmor());
		sb.append(";\r");
		
		sb.append("DeflectArmorMod : ");
		sb.append(sheet.getDeflectArmorMod());
		sb.append(";\r");
		
		sb.append("MiscArmorMod : ");
		sb.append(sheet.getMiscArmorMod());
		sb.append(";\r");
		
		sb.append("InitiativeMod : ");
		sb.append(sheet.getInitiativeMod());
		sb.append(";\r");
		
		sb.append("MiscInitiativeMod : ");
		sb.append(sheet.getMiscInitiativeMod());
		sb.append(";\r");
		
		sb.append("BaseSaveF : ");
		sb.append(sheet.getBaseSaveF());
		sb.append(";\r");
		
		sb.append("BaseSaveR : ");
		sb.append(sheet.getBaseSaveR());
		sb.append(";\r");
		
		sb.append("BaseSaveW : ");
		sb.append(sheet.getBaseSaveW());
		sb.append(";\r");
		
		sb.append("MagicModF : ");
		sb.append(sheet.getMagicModF());
		sb.append(";\r");
		
		sb.append("MagicModR : ");
		sb.append(sheet.getMagicModR());
		sb.append(";\r");
		
		sb.append("MagicModW : ");
		sb.append(sheet.getMagicModW());
		sb.append(";\r");
		
		sb.append("MiscModF : ");
		sb.append(sheet.getMiscModF());
		sb.append(";\r");
		
		sb.append("MiscModR : ");
		sb.append(sheet.getMiscModR());
		sb.append(";\r");
		
		sb.append("MiscModW : ");
		sb.append(sheet.getMiscModW());
		sb.append(";\r");
		
		sb.append("TempModF : ");
		sb.append(sheet.getTempModF());
		sb.append(";\r");
		
		sb.append("TempModR : ");
		sb.append(sheet.getTempModR());
		sb.append(";\r");
		
		sb.append("TempModW : ");
		sb.append(sheet.getTempModW());
		sb.append(";\r");
		
		sb.append("BaseAttackBonus : ");
		sb.append(sheet.getBaseAttackBonus());
		sb.append(";\r");
		
		sb.append("Experience : ");
		sb.append(sheet.getExperience());
		sb.append(";\r");
		
		sb.append("ExpToNextLvl : ");
		sb.append(sheet.getExpToNextLvl());
		sb.append(";\r");
		
		sb.append("CP : ");
		sb.append(sheet.getCP());
		sb.append(";\r");
		
		sb.append("SP : ");
		sb.append(sheet.getSP());
		sb.append(";\r");
		
		sb.append("GP : ");
		sb.append(sheet.getGP());
		sb.append(";\r");
		
		sb.append("PP : ");
		sb.append(sheet.getPP());
		sb.append(";\r");
		
		sb.append("Name : ");
		sb.append(sheet.getName());
		sb.append(";\r");
		
		sb.append("Homeland : ");
		sb.append(sheet.getHomeland());
		sb.append(";\r");
		
		sb.append("Size : ");
		sb.append(sheet.getSize());
		sb.append(";\r");
		
		sb.append("Height : ");
		sb.append(sheet.getHeight());
		sb.append(";\r");
		
		sb.append("Hair : ");
		sb.append(sheet.getHair());
		sb.append(";\r");
		
		sb.append("Eyes : ");
		sb.append(sheet.getEyes());
		sb.append(";\r");
		
		sb.append("SpellResistance : ");
		sb.append(sheet.getSpellResistance());
		sb.append(";\r");
		
		sb.append("CharClass : ");
		sb.append(sheet.getCharClass());
		sb.append(";\r");
		
		sb.append("Alignment : ");
		sb.append(sheet.getAlignment());
		sb.append(";\r");
		
		sb.append("Deity : ");
		sb.append(sheet.getDeity());
		sb.append(";\r");
		
		sb.append("Race : ");
		sb.append(sheet.getRace());
		sb.append(";\r");
		
		sb.append("Gender : ");
		sb.append(sheet.getGender());
		sb.append(";\r");
		
		sb.append("Weapons : ");
		sb.append(sheet.getWeapons());
		sb.append(";\r");
		
		sb.append("Armor : ");
		sb.append(sheet.getArmor());
		sb.append(";\r");
		
		sb.append("Items : ");
		sb.append(sheet.getItems());
		sb.append(";\r");
		
		sb.append("Spells : ");
		sb.append(sheet.getSpells());
		sb.append(";\r");
		
		sb.append("Abilities : ");
		sb.append(sheet.getAbilities());
		sb.append(";\r");
		
		sb.append("Skills : ");
		sb.append(sheet.getSkills());
		sb.append(";\r");
		
		return sb.toString();
	}
	
	public static CharacterSheet formatInfoToCharacterSheet(String s) {
		CharacterSheet sheet = new CharacterSheet();
		
		String[] splitSheet = s.split(";");
		
		String data = "";
		
		for(int i = 0; i < splitSheet.length; i++) {
			data = splitSheet[i];
			
			String[] splitData = data.split(":");
			
			switch (splitData[0].trim()) {
			
				case "Level":
					sheet.setLevel(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "Age":
					sheet.setAge(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "Weight":
					sheet.setWeight(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "StrBase":
					sheet.setStrBase(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "StrTemp":
					sheet.setStrTemp(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "StrTempMod":
					sheet.setStrTempMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "DexBase":
					sheet.setDexBase(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "DexMod":
					sheet.setDexMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "DexTemp":
					sheet.setDexTemp(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "DexTempMod":
					sheet.setDexTempMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ConBase":
					sheet.setConBase(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ConMod":
					sheet.setConMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ConTemp":
					sheet.setConTemp(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ConTempMod":
					sheet.setConTempMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "IntBase":
					sheet.setIntBase(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "IntMod":
					sheet.setIntMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "IntTemp":
					sheet.setIntTemp(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "IntTempMod":
					sheet.setIntTempMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "WisBase":
					sheet.setWisBase(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "WisMod":
					sheet.setWisMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "WisTemp":
					sheet.setWisTemp(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "WisTempMod":
					sheet.setWisTempMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "BaseHP":
					sheet.setBaseHP(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "CurHP":
					sheet.setCurHP(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "BaseSpeed":
					sheet.setBaseSpeed(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "SpeedWithArmor":
					sheet.setSpeedWithArmor(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "FlySpeed":
					sheet.setFlySpeed(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "SwimSpeed":
					sheet.setSwimSpeed(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ClimbSpeed":
					sheet.setClimbSpeed(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "BurrowSpeed":
					sheet.setBurrowSpeed(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "SpeedMod":
					sheet.setSpeedMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "NonlethalDamage":
					sheet.setNonlethalDamage(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ArmorBonus":
					sheet.setArmorBonus(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ShieldBonus":
					sheet.setShieldBonus(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "SizeArmorMod":
					sheet.setSizeArmorMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "NaturalArmor":
					sheet.setNaturalArmor(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "DeflectArmorMod":
					sheet.setDeflectArmorMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MiscArmorMod":
					sheet.setMiscArmorMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "InitiativeMod":
					sheet.setInitiativeMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MiscInitiativeMod":
					sheet.setMiscInitiativeMod(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "BaseSaveF":
					sheet.setBaseSaveF(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "BaseSaveR":
					sheet.setBaseSaveR(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "BaseSaveW":
					sheet.setBaseSaveW(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MagicModF":
					sheet.setMagicModF(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MagicModR":
					sheet.setMagicModR(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MagicModW":
					sheet.setMagicModW(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MiscModF":
					sheet.setMiscModF(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MiscModR":
					sheet.setMiscModR(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "MiscModW":
					sheet.setMiscModW(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "TempModF":
					sheet.setTempModF(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "TempModR":
					sheet.setTempModR(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "TempModW":
					sheet.setTempModW(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "BaseAttackBonus":
					sheet.setBaseAttackBonus(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "Experience":
					sheet.setExperience(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "ExpToNextLvl":
					sheet.setExpToNextLvl(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "CP":
					sheet.setCP(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "SP":
					sheet.setSP(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "GP":
					sheet.setGP(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "PP":
					sheet.setPP(Integer.parseInt(splitData[1].trim()));
					
					break;
				case "Name":
					sheet.setName(splitData[1].trim());
					
					break;
				case "Homeland":
					sheet.setHomeland(splitData[1].trim());
					
					break;
				case "Size":
					sheet.setSize(splitData[1].trim());
					
					break;
				case "Height":
					sheet.setHeight(splitData[1].trim());
					
					break;
				case "Hair":
					sheet.setHair(splitData[1].trim());
					
					break;
				case "Eyes":
					sheet.setEyes(splitData[1].trim());
					
					break;
				case "SpellResistance":
					sheet.setSpellResistance(splitData[1].trim());
					
					break;
				case "CharClass":
//					BARBARIAN,
//					BARD,
//					CLERIC,
//					DRUID,
//					FIGHTER,
//					MONK,
//					PALADIN,
//					RANGER,
//					ROGUE,
//					SORCERER,
//					WIZARD
					
					data = splitData[1].trim();
					
					switch (data) {
					case "BARBARIAN":
						sheet.setCharClass(Class.BARBARIAN);
						break;
					case "BARD":
						sheet.setCharClass(Class.BARD);
						break;
					case "CLERIC":
						sheet.setCharClass(Class.CLERIC);
						break;
					case "DRUID":
						sheet.setCharClass(Class.DRUID);
						break;
					case "FIGHTER":
						sheet.setCharClass(Class.FIGHTER);
						break;
					case "MONK":
						sheet.setCharClass(Class.MONK);
						break;
					case "PALADIN":
						sheet.setCharClass(Class.PALADIN);
						break;
					case "RANGER":
						sheet.setCharClass(Class.RANGER);
						break;
					case "ROGUE":
						sheet.setCharClass(Class.ROGUE);
						break;
					case "SORCERER":
						sheet.setCharClass(Class.SORCERER);
						break;
					case "WIZARD":
						sheet.setCharClass(Class.WIZARD);
						break;
					}
					
					break;
				case "Alignment":
//					LAWFUL_GOOD,
//					NEUTRAL_GOOD,
//					CHOATIC_GOOD,
//					LAWFUL_NEUTRAL,
//					TRUE_NEUTRAL,
//					CHOATIC_NEUTRAL,
//					LAWFUL_EVIL,
//					NEUTRAL_EVIL,
//					CHOATIC_EVIL
					
					data = splitData[1].trim();
					
					switch (data) {
					
					case "LAWFUL_GOOD":
						sheet.setAlignment(Alignment.LAWFUL_GOOD);
						break;
					case "NEUTRAL_GOOD":
						sheet.setAlignment(Alignment.NEUTRAL_GOOD);
						break;
					case "CHAOTIC_GOOD":
						sheet.setAlignment(Alignment.CHAOTIC_GOOD);
						break;
					case "LAWFUL_NEUTRAL":
						sheet.setAlignment(Alignment.LAWFUL_NEUTRAL);
						break;
					case "TRUE_NEUTRAL":
						sheet.setAlignment(Alignment.TRUE_NEUTRAL);
						break;
					case "CHAOTIC_NEUTRAL":
						sheet.setAlignment(Alignment.CHAOTIC_NEUTRAL);
						break;
					case "LAWFUL_EVIL":
						sheet.setAlignment(Alignment.LAWFUL_EVIL);
						break;
					case "NEUTRAL_EVIL":
						sheet.setAlignment(Alignment.NEUTRAL_EVIL);
						break;
					case "CHAOTIC_EVIL":
						sheet.setAlignment(Alignment.CHAOTIC_EVIL);
						break;
					}
					break;
				case "Deity":
//					ABADAR,
//					ASMODEUS,
//					CALISTRIA,
//					CAYDEN_CAILEAN,
//					DESNA,
//					ERASTIL,
//					GORUM,
//					GOZREH,
//					IOMEDAE,
//					IRORI,
//					LAMASHTU,
//					NETHYS,
//					NORGORBER,
//					PHARASMA,
//					ROVAGUG,
//					SARENRAE,
//					SHELYN,
//					TORAG,
//					URGATHOA,
//					ZON_KUTHON
					data = splitData[1].trim();
					
					switch (data) {
					
					case "ABADAR":
						sheet.setDeity(Deity.ABADAR);
						break;
					case "ASMODEUS":
						sheet.setDeity(Deity.ASMODEUS);
						break;
					case "CALISTRIA":
						sheet.setDeity(Deity.CALISTRIA);
						break;
					case "CAYDEN_CAILEAN":
						sheet.setDeity(Deity.CAYDEN_CAILEAN);
						break;
					case "DESNA":
						sheet.setDeity(Deity.DESNA);
						break;
					case "ERASTIL":
						sheet.setDeity(Deity.ERASTIL);
						break;
					case "GORUM":
						sheet.setDeity(Deity.GORUM);
						break;
					case "GOZREH":
						sheet.setDeity(Deity.GOZREH);
						break;
					case "IOMEDAE":
						sheet.setDeity(Deity.IOMEDAE);
						break;
					case "IRORI":
						sheet.setDeity(Deity.IRORI);
						break;
					case "LAMASHTU":
						sheet.setDeity(Deity.LAMASHTU);
						break;
					case "NETHYS":
						sheet.setDeity(Deity.NETHYS);
						break;
					case "NORGORBER":
						sheet.setDeity(Deity.NORGORBER);
						break;
					case "PHARASMA":
						sheet.setDeity(Deity.PHARASMA);
						break;
					case "ROVAGUG":
						sheet.setDeity(Deity.ROVAGUG);
						break;
					case "SARENRAE":
						sheet.setDeity(Deity.SARENRAE);
						break;
					case "SHELYN":
						sheet.setDeity(Deity.SHELYN);
						break;
					case "TORAG":
						sheet.setDeity(Deity.TORAG);
						break;
					case "URGATHOA":
						sheet.setDeity(Deity.URGATHOA);
						break;
					case "ZON_KUTHON":
						sheet.setDeity(Deity.ZON_KUTHON);
						break;
					}
				case "Race":
//					DWARF,
//					ELF,
//					GNOME,
//					HALF_ELF,
//					HALF_ORC,
//					HALFLING,
//					HUMAN
					
					data = splitData[1];
					
					switch (data) {
					
					case "DWARF":
						sheet.setRace(Race.DWARF);
						break;
					case "ELF":
						sheet.setRace(Race.ELF);
						break;
					case "GNOME":
						sheet.setRace(Race.GNOME);
						break;
					case "HALF_ELF":
						sheet.setRace(Race.HALF_ELF);
						break;
					case "HALF_ORC":
						sheet.setRace(Race.HALF_ORC);
						break;
					case "HALFLING":
						sheet.setRace(Race.HALFLING);
						break;
					case "HUMAN":
						sheet.setRace(Race.HUMAN);
						break;
					}
					break;
				case "Gender":
					data = splitData[1];
					
					switch (data) {
					case "MALE":
						sheet.setGender(Gender.MALE);
						break;
					case"FEMALE":
						sheet.setGender(Gender.FEMALE);
						break;
					case"NOT_APPLICABLE":
						sheet.setGender(Gender.NOT_APPLICABLE);
						break;
					}
					break;
				case "Weapons":
			}
		}
		
		return sheet;
	}
	
	public static boolean writeToFile(String filePath, String characterName, String output) {
		
		if (filePath == null || output == null) {
			return false;
		}
		
		try {
			Files.write(Paths.get(filePath, "\\", characterName + ".txt"), output.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public static CharacterSheet readFile(String filePath) {
		byte[] byteFile = null;
		
		try {
			byteFile = Files.readAllBytes(Paths.get(filePath));
		} catch (FileNotFoundException f) {
			
		} catch (IOException e) {
			
		}
		
		String s = new String(byteFile);
		
		CharacterSheet sheet = formatInfoToCharacterSheet(s);
		
		return sheet;
	}
}

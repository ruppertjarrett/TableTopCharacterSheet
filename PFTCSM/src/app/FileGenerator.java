package app;

import java.util.HashMap;
import java.util.Random;

import enums.Class;
import enums.NameOfSkill;
import enums.Race;
import enums.SkillTiedAbility;
import models.CharacterSheet;
import models.Skill;

public class FileGenerator {

	public static Random rnd = new Random();
	
	public static int randomAbilityScore() {
		return 0;
	}
	
	public static HashMap<NameOfSkill, Skill> randomizeSkills(Class chaClass, Race race, int level, CharacterSheet sheet) { 
//	    BARBARIAN, 
//	    The barbarians class skills are Acrobatics (Dex), Climb
//	    (Str), Craft (Int), Handle Animal (Cha), Intimidate (Cha), 
//	    Knowledge (nature) (Int), Perception (Wis), Ride (Dex), 
//	    Survival (Wis), and Swim (Str). 
//	    Skill Ranks per Level: 4 + Int modifier. 
	     
//	    BARD, 
//		The bard’s class skills are Acrobatics (Dex), Appraise
//		(Int), Bluff (Cha), Climb (Str), Craft (Int), Diplomacy (Cha),
//		Disguise (Cha), Escape Artist (Dex), Intimidate (Cha),
//		Knowledge (all) (Int), Linguistics (Int), Perception (Wis),
//		Perform (Cha), Profession (Wis), Sense Motive (Wis),
//		Sleight of Hand (Dex), Spellcraft (Int), Stealth (Dex), and
//		Use Magic Device (Cha).
//		Skill Ranks per Level: 6 + Int modifier.
		
//	    CLERIC,
//		The cleric’s class skills are Appraise (Int), Craft (Int),
//		Diplomacy (Cha), Heal (Wis), Knowledge (arcana) (Int),
//		Knowledge (history) (Int), Knowledge (nobility) (Int),
//		Knowledge (planes) (Int), Knowledge (religion) (Int),
//		Linguistics (Int), Profession (Wis), Sense Motive (Wis), and
//		Spellcraft (Int).
//		Skill Ranks per Level: 2 + Int modifier.
		
//	    DRUID,
		
		
//	    FIGHTER, 
		
		
//	    MONK,
		
		
//	    PALADIN,
		
		
//	    RANGER,
		
		
//	    ROGUE,
		
		
//	    SORCERER,
		
		
//	    WIZARD
		
	     
	    HashMap<NameOfSkill, Skill> skills = new HashMap<>(); 
	     
	    if (chaClass == Class.BARBARIAN) {
	    	int rank = (4+sheet.getIntMod())*level;
	    	int rank1 = 0;
	    	int rank2 = 0;
	    	int rank3 = 0;
	    	int rank4 = 0;
	    	int rank5 = 0;
	    	int rank6 = 0;
	    	int rank7 = 0;
	    	int rank8 = 0;
	    	int rank9 = 0;
	    	int rank10 = 0;
	    	
	    	for(int i = 1; i <= rank; i++){
	    		int rand = (rnd.nextInt(10)+1);
	    		
	    		if (rand == 1) {
	    			rank1++;
	    		} else if (rand == 2) {
	    			rank2++;
	    		} else if (rand == 3) {
	    			rank3++;
	    		} else if (rand == 4) {
	    			rank4++;
	    		} else if (rand == 5) {
	    			rank5++;
	    		} else if (rand == 6) {
	    			rank6++;
	    		} else if (rand == 7) {
	    			rank7++;
	    		} else if (rand == 8) {
	    			rank8++;
	    		} else if (rand == 9) {
	    			rank9++;
	    		} else if (rand == 10) {
	    			rank10++;
	    		}
	    	}
	    	
	    	int miscMod1 = 0;
	    	int miscMod2 = 0;
	    	int miscMod3 = 0;
	    	int miscMod4 = 0;
	    	int miscMod5 = 0;
	    	int miscMod6 = 0;
	    	int miscMod7 = 0;
	    	int miscMod8 = 0;
	    	int miscMod9 = 0;
	    	int miscMod10 = 0;
	    	
	    	if (rank1 > 0) {
	    		miscMod1 = 3;
	    	}
	    	if (rank2 > 0) {
	    		miscMod2 = 3;
	    	}
	    	if (rank3 > 0) {
	    		miscMod3 = 3;
	    	}
	    	if (rank4 > 0) {
	    		miscMod4 = 3;
	    	}
	    	if (rank5 > 0) {
	    		miscMod5 = 3;
	    	}
	    	if (rank6 > 0) {
	    		miscMod6 = 3;
	    	}
	    	if (rank7 > 0) {
	    		miscMod7 = 3;
	    	}
	    	if (rank8 > 0) {
	    		miscMod8 = 3;
	    	}
	    	if (rank9 > 0) {
	    		miscMod9 = 3;
	    	}
	    	if (rank10 > 0) {
	    		miscMod10 = 3;
	    	}
	    	
	    	Skill acrobatics = new Skill(NameOfSkill.ACROBATICS, SkillTiedAbility.DEX, rank1, miscMod1);
	    	skills.put(acrobatics.getName(), acrobatics);
	    	
	    	Skill climb = new Skill(NameOfSkill.CLIMB, SkillTiedAbility.STR, rank2, miscMod2);
	    	skills.put(climb.getName(), climb);
	    	
	    	Skill craft = new Skill(NameOfSkill.CRAFT1, SkillTiedAbility.INT, rank3, miscMod3);
	    	skills.put(craft.getName(), craft);
	    	
	    	Skill handleAnimal = new Skill(NameOfSkill.HANDLE_ANIMAL, SkillTiedAbility.CHA, rank4, miscMod4);
	    	skills.put(handleAnimal.getName(), handleAnimal);
	    	
	    	Skill intimidate = new Skill(NameOfSkill.INTIMIDATE, SkillTiedAbility.CHA, rank5, miscMod5);
	    	skills.put(intimidate.getName(), intimidate);
	    	
	    	Skill knowledge = new Skill(NameOfSkill.KNOWLEDGE_NA, SkillTiedAbility.INT, rank6, miscMod6);
	    	skills.put(knowledge.getName(), knowledge);
	    	
	    	Skill perception = new Skill(NameOfSkill.PERCEPTION, SkillTiedAbility.WIS, rank7, miscMod7);
	    	skills.put(perception.getName(), perception);
	    	
	    	Skill ride = new Skill(NameOfSkill.RIDE, SkillTiedAbility.DEX, rank8, miscMod8);
	    	skills.put(ride.getName(), ride);
	    	
	    	Skill survival = new Skill(NameOfSkill.SURVIVAL, SkillTiedAbility.WIS, rank8, miscMod9);
	    	skills.put(survival.getName(), survival);
	    	
	    	Skill swim = new Skill(NameOfSkill.SWIM, SkillTiedAbility.STR, rank10, miscMod10);
	    	skills.put(swim.getName(), swim);
	    } else if (chaClass == Class.BARD) {
	    	int rank = (6+sheet.getIntMod())*level;
	    	int rank1 = 0;
	    	int rank2 = 0;
	    	int rank3 = 0;
	    	int rank4 = 0;
	    	int rank5 = 0;
	    	int rank6 = 0;
	    	int rank7 = 0;
	    	int rank8 = 0;
	    	int rank9 = 0;
	    	int rank10 = 0;
	    	int rank11 = 0;
	    	int rank12 = 0;
	    	int rank13 = 0;
	    	int rank14 = 0;
	    	int rank15 = 0;
	    	int rank16 = 0;
	    	int rank17 = 0;
	    	int rank18 = 0;
	    	int rank19 = 0;
	    	int rank20 = 0;
	    	int rank21 = 0;
	    	int rank22 = 0;
	    	int rank23 = 0;
	    	int rank24 = 0;
	    	int rank25 = 0;
	    	int rank26 = 0;
	    	int rank27 = 0;
	    	int rank28 = 0;
	    	
	    	for(int i = 1; i <= rank; i++){
	    		int rand = (rnd.nextInt(28)+1);
	    		
	    		if (rand == 1) {
	    			rank1++;
	    		} else if (rand == 2) {
	    			rank2++;
	    		} else if (rand == 3) {
	    			rank3++;
	    		} else if (rand == 4) {
	    			rank4++;
	    		} else if (rand == 5) {
	    			rank5++;
	    		} else if (rand == 6) {
	    			rank6++;
	    		} else if (rand == 7) {
	    			rank7++;
	    		} else if (rand == 8) {
	    			rank8++;
	    		} else if (rand == 9) {
	    			rank9++;
	    		} else if (rand == 10) {
	    			rank10++;
	    		} else if (rand == 11) {
	    			rank11++;
	    		} else if (rand == 12) {
	    			rank12++;
	    		} else if (rand == 13) {
	    			rank13++;
	    		} else if (rand == 14) {
	    			rank14++;
	    		} else if (rand == 15) {
	    			rank15++;
	    		} else if (rand == 16) {
	    			rank16++;
	    		} else if (rand == 17) {
	    			rank17++;
	    		} else if (rand == 18) {
	    			rank18++;
	    		} else if (rand == 19) {
	    			rank19++;
	    		} else if (rand == 20) {
	    			rank20++;
	    		} else if (rand == 21) {
	    			rank21++;
	    		} else if (rand == 22) {
	    			rank22++;
	    		} else if (rand == 23) {
	    			rank23++;
	    		} else if (rand == 24) {
	    			rank24++;
	    		} else if (rand == 25) {
	    			rank25++;
	    		} else if (rand == 26) {
	    			rank26++;
	    		} else if (rand == 27) {
	    			rank27++;
	    		} else if (rand == 28) {
	    			rank28++;
	    		}
	    	}
	    	
	    	int miscMod1 = 0;
	    	int miscMod2 = 0;
	    	int miscMod3 = 0;
	    	int miscMod4 = 0;
	    	int miscMod5 = 0;
	    	int miscMod6 = 0;
	    	int miscMod7 = 0;
	    	int miscMod8 = 0;
	    	int miscMod9 = 0;
	    	int miscMod10 = 0;
	    	int miscMod11 = 0;
	    	int miscMod12 = 0;
	    	int miscMod13 = 0;
	    	int miscMod14 = 0;
	    	int miscMod15 = 0;
	    	int miscMod16 = 0;
	    	int miscMod17 = 0;
	    	int miscMod18 = 0;
	    	int miscMod19 = 0;
	    	int miscMod20 = 0;
	    	int miscMod21 = 0;
	    	int miscMod22 = 0;
	    	int miscMod23 = 0;
	    	int miscMod24 = 0;
	    	int miscMod25 = 0;
	    	int miscMod26 = 0;
	    	int miscMod27 = 0;
	    	int miscMod28 = 0;
	    	
	    	if (rank1 > 0) {
	    		miscMod1 = 3;
	    	}
	    	if (rank2 > 0) {
	    		miscMod2 = 3;
	    	}
	    	if (rank3 > 0) {
	    		miscMod3 = 3;
	    	}
	    	if (rank4 > 0) {
	    		miscMod4 = 3;
	    	}
	    	if (rank5 > 0) {
	    		miscMod5 = 3;
	    	}
	    	if (rank6 > 0) {
	    		miscMod6 = 3;
	    	}
	    	if (rank7 > 0) {
	    		miscMod7 = 3;
	    	}
	    	if (rank8 > 0) {
	    		miscMod8 = 3;
	    	}
	    	if (rank9 > 0) {
	    		miscMod9 = 3;
	    	}
	    	if (rank10 > 0) {
	    		miscMod10 = 3;
	    	}
	    	if (rank11 > 0) {
	    		miscMod11 = 3;
	    	}
	    	if (rank12 > 0) {
	    		miscMod12 = 3;
	    	}
	    	if (rank13 > 0) {
	    		miscMod13 = 3;
	    	}
	    	if (rank14 > 0) {
	    		miscMod14 = 3;
	    	}
	    	if (rank15 > 0) {
	    		miscMod15 = 3;
	    	}
	    	if (rank16 > 0) {
	    		miscMod16 = 3;
	    	}
	    	if (rank17 > 0) {
	    		miscMod17 = 3;
	    	}
	    	if (rank18 > 0) {
	    		miscMod18 = 3;
	    	}
	    	if (rank19 > 0) {
	    		miscMod19 = 3;
	    	}
	    	if (rank20 > 0) {
	    		miscMod20 = 3;
	    	}
	    	if (rank21 > 0) {
	    		miscMod21 = 3;
	    	}
	    	if (rank22 > 0) {
	    		miscMod22 = 3;
	    	}
	    	if (rank23 > 0) {
	    		miscMod23 = 3;
	    	}
	    	if (rank24 > 0) {
	    		miscMod24 = 3;
	    	}
	    	if (rank25 > 0) {
	    		miscMod25 = 3;
	    	}
	    	if (rank26 > 0) {
	    		miscMod26 = 3;
	    	}
	    	if (rank27 > 0) {
	    		miscMod27 = 3;
	    	}
	    	if (rank28 > 0) {
	    		miscMod28 = 3;
	    	}
	    	
	    	Skill acrobatics = new Skill(NameOfSkill.ACROBATICS, SkillTiedAbility.DEX, rank1, miscMod1);
	    	skills.put(acrobatics.getName(), acrobatics);
	    	
	    	Skill appraise = new Skill(NameOfSkill.APPRAISE, SkillTiedAbility.INT, rank2, miscMod2);
	    	skills.put(appraise.getName(), appraise);
	    	
	    	Skill bluff = new Skill(NameOfSkill.BLUFF, SkillTiedAbility.CHA, rank3, miscMod3);
	    	skills.put(bluff.getName(), bluff);
	    	
	    	Skill climb = new Skill(NameOfSkill.CLIMB, SkillTiedAbility.STR, rank4, miscMod4);
	    	skills.put(climb.getName(), climb);
	    	
	    	Skill craft = new Skill(NameOfSkill.CRAFT1, SkillTiedAbility.INT, rank5, miscMod5);
	    	skills.put(craft.getName(), craft);
	    	
	    	Skill diplomacy = new Skill(NameOfSkill.DIPLOMACY, SkillTiedAbility.CHA, rank6, miscMod6);
	    	skills.put(diplomacy.getName(), diplomacy);
	    	
	    	Skill disguise = new Skill(NameOfSkill.DISGUISE, SkillTiedAbility.CHA, rank7, miscMod7);
	    	skills.put(disguise.getName(), disguise);
	    	
	    	Skill escapeArtist = new Skill(NameOfSkill.ESCAPE_ARTIST, SkillTiedAbility.DEX, rank8, miscMod8);
	    	skills.put(escapeArtist.getName(), escapeArtist);
	    	
	    	Skill intimidate = new Skill(NameOfSkill.INTIMIDATE, SkillTiedAbility.CHA, rank9, miscMod9);
	    	skills.put(intimidate.getName(), intimidate);
	    	
	    	Skill knowledgeA = new Skill(NameOfSkill.KNOWLEDGE_A, SkillTiedAbility.INT, rank10, miscMod10);
	    	skills.put(knowledgeA.getName(), knowledgeA);
	    	
	    	Skill knowledgeD = new Skill(NameOfSkill.KNOWLEDGE_D, SkillTiedAbility.INT, rank11, miscMod11);
	    	skills.put(knowledgeD.getName(), knowledgeD);
	    	
	    	Skill knowledgeE = new Skill(NameOfSkill.KNOWLEDGE_E, SkillTiedAbility.INT, rank12, miscMod12);
	    	skills.put(knowledgeE.getName(), knowledgeE);
	    	
	    	Skill knowledgeG = new Skill(NameOfSkill.KNOWLEDGE_G, SkillTiedAbility.INT, rank13, miscMod13);
	    	skills.put(knowledgeG.getName(), knowledgeG);
	    	
	    	Skill knowledgeH = new Skill(NameOfSkill.KNOWLEDGE_H, SkillTiedAbility.INT, rank14, miscMod14);
	    	skills.put(knowledgeH.getName(), knowledgeH);
	    	
	    	Skill knowledgeL = new Skill(NameOfSkill.KNOWLEDGE_L, SkillTiedAbility.INT, rank15, miscMod15);
	    	skills.put(knowledgeL.getName(), knowledgeL);
	    	
	    	Skill knowledgeNA = new Skill(NameOfSkill.KNOWLEDGE_NA, SkillTiedAbility.INT, rank16, miscMod16);
	    	skills.put(knowledgeNA.getName(), knowledgeNA);
	    	
	    	Skill knowledgeNO = new Skill(NameOfSkill.KNOWLEDGE_NO, SkillTiedAbility.INT, rank17, miscMod17);
	    	skills.put(knowledgeNO.getName(), knowledgeNO);
	    	
	    	Skill knowledgeP = new Skill(NameOfSkill.KNOWLEDGE_P, SkillTiedAbility.INT, rank18, miscMod18);
	    	skills.put(knowledgeP.getName(), knowledgeP);
	    	
	    	Skill knowledgeR = new Skill(NameOfSkill.KNOWLEDGE_R, SkillTiedAbility.INT, rank19, miscMod19);
	    	skills.put(knowledgeR.getName(), knowledgeR);
	    	
	    	Skill linguistics = new Skill(NameOfSkill.LINGUISTICS, SkillTiedAbility.INT, rank20, miscMod20);
	    	skills.put(linguistics.getName(), linguistics);
	    	
	    	Skill perception = new Skill(NameOfSkill.PERCEPTION, SkillTiedAbility.WIS, rank21, miscMod21);
	    	skills.put(perception.getName(), perception);
	    	
	    	Skill perform = new Skill(NameOfSkill.PERFORM1, SkillTiedAbility.CHA, rank22, miscMod22);
	    	skills.put(perform.getName(), perform);
	    	
	    	Skill profession = new Skill(NameOfSkill.PROFESSION1, SkillTiedAbility.WIS, rank23, miscMod23);
	    	skills.put(profession.getName(), profession);
	    	
	    	Skill senseMotive = new Skill(NameOfSkill.SENSE_MOTIVE, SkillTiedAbility.WIS, rank24, miscMod24);
	    	skills.put(senseMotive.getName(), senseMotive);
	    	
	    	Skill sleightOfHand = new Skill(NameOfSkill.SLEIGHT_OF_HAND, SkillTiedAbility.DEX, rank25, miscMod25);
	    	skills.put(sleightOfHand.getName(), sleightOfHand);
	    	
	    	Skill spellcraft = new Skill(NameOfSkill.SPELLCRAFT, SkillTiedAbility.INT, rank26, miscMod26);
	    	skills.put(spellcraft.getName(), spellcraft);
	    	
	    	Skill stealth = new Skill(NameOfSkill.STEALTH, SkillTiedAbility.DEX, rank27, miscMod27);
	    	skills.put(stealth.getName(), stealth);
	    	
	    	Skill useMagicDevice = new Skill(NameOfSkill.USE_MAGIC_DEVICE, SkillTiedAbility.CHA, rank28, miscMod28);
	    	skills.put(useMagicDevice.getName(), useMagicDevice);
	    } else if (chaClass == Class.CLERIC) {
	    	int rank = (2+sheet.getIntMod())*level;
	    	int rank1 = 0;
	    	int rank2 = 0;
	    	int rank3 = 0;
	    	int rank4 = 0;
	    	int rank5 = 0;
	    	int rank6 = 0;
	    	int rank7 = 0;
	    	int rank8 = 0;
	    	int rank9 = 0;
	    	int rank10 = 0;
	    	int rank11 = 0;
	    	int rank12 = 0;
	    	int rank13 = 0;
	    	
	    	for(int i = 1; i <= rank; i++){
	    		int rand = (rnd.nextInt(28)+1);
	    		
	    		if (rand == 1) {
	    			rank1++;
	    		} else if (rand == 2) {
	    			rank2++;
	    		} else if (rand == 3) {
	    			rank3++;
	    		} else if (rand == 4) {
	    			rank4++;
	    		} else if (rand == 5) {
	    			rank5++;
	    		} else if (rand == 6) {
	    			rank6++;
	    		} else if (rand == 7) {
	    			rank7++;
	    		} else if (rand == 8) {
	    			rank8++;
	    		} else if (rand == 9) {
	    			rank9++;
	    		} else if (rand == 10) {
	    			rank10++;
	    		} else if (rand == 11) {
	    			rank11++;
	    		} else if (rand == 12) {
	    			rank12++;
	    		} else if (rand == 13) {
	    			rank13++;
	    		}
	    	}
	    	
	    	int miscMod1 = 0;
	    	int miscMod2 = 0;
	    	int miscMod3 = 0;
	    	int miscMod4 = 0;
	    	int miscMod5 = 0;
	    	int miscMod6 = 0;
	    	int miscMod7 = 0;
	    	int miscMod8 = 0;
	    	int miscMod9 = 0;
	    	int miscMod10 = 0;
	    	int miscMod11 = 0;
	    	int miscMod12 = 0;
	    	int miscMod13 = 0;
	    	
	    	if (rank1 > 0) {
	    		miscMod1 = 3;
	    	}
	    	if (rank2 > 0) {
	    		miscMod2 = 3;
	    	}
	    	if (rank3 > 0) {
	    		miscMod3 = 3;
	    	}
	    	if (rank4 > 0) {
	    		miscMod4 = 3;
	    	}
	    	if (rank5 > 0) {
	    		miscMod5 = 3;
	    	}
	    	if (rank6 > 0) {
	    		miscMod6 = 3;
	    	}
	    	if (rank7 > 0) {
	    		miscMod7 = 3;
	    	}
	    	if (rank8 > 0) {
	    		miscMod8 = 3;
	    	}
	    	if (rank9 > 0) {
	    		miscMod9 = 3;
	    	}
	    	if (rank10 > 0) {
	    		miscMod10 = 3;
	    	}
	    	if (rank11 > 0) {
	    		miscMod11 = 3;
	    	}
	    	if (rank12 > 0) {
	    		miscMod12 = 3;
	    	}
	    	if (rank13 > 0) {
	    		miscMod13 = 3;
	    	}
	    	
//	    	The cleric’s class skills are Appraise (Int), Craft (Int),
//	    	Diplomacy (Cha), Heal (Wis), Knowledge (arcana) (Int),
//	    	Knowledge (history) (Int), Knowledge (nobility) (Int),
//	    	Knowledge (planes) (Int), Knowledge (religion) (Int),
//	    	Linguistics (Int), Profession (Wis), Sense Motive (Wis), and
//	    	Spellcraft (Int).
//	    	Skill Ranks per Level: 2 + Int modifier.
	    	
	    	Skill appraise = new Skill(NameOfSkill.APPRAISE, SkillTiedAbility.INT, rank1, miscMod1);
	    	skills.put(appraise.getName(), appraise);
	    	
	    	Skill craft = new Skill(NameOfSkill.CRAFT1, SkillTiedAbility.INT, rank2, miscMod2);
	    	skills.put(craft.getName(), craft);
	    	
	    	Skill diplomacy = new Skill(NameOfSkill.DIPLOMACY, SkillTiedAbility.CHA, rank3, miscMod3);
	    	skills.put(diplomacy.getName(), diplomacy);
	    	
	    	Skill heal = new Skill(NameOfSkill.HEAL, SkillTiedAbility.WIS, rank4, miscMod4);
	    	skills.put(heal.getName(), heal);
	    	
	    	Skill knowledgeA = new Skill(NameOfSkill.KNOWLEDGE_A, SkillTiedAbility.INT, rank5, miscMod5);
	    	skills.put(knowledgeA.getName(), knowledgeA);
	    	
	    	
	    }
	     
	    return skills; 
	  }
	
	public static CharacterSheet startRandomCharacter(String name, Class chaClass, Race race, int level) {
		return null;
	}
}

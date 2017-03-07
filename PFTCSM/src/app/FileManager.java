package app;

import models.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

import enums.AbilityType;
import enums.Alignment;
import enums.Class;
import enums.Deity;
import enums.Gender;
import enums.NameOfSkill;
import enums.Race;
import enums.SkillTiedAbility;

public class FileManager {

	public static CharacterSheet formatInfoToCharacterSheet(String s) {
		CharacterSheet sheet = new CharacterSheet();

		String[] splitSheet = s.split(";");

		String data = "";

		for (int i = 0; i < splitSheet.length; i++) {
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
				// BARBARIAN,
				// BARD,
				// CLERIC,
				// DRUID,
				// FIGHTER,
				// MONK,
				// PALADIN,
				// RANGER,
				// ROGUE,
				// SORCERER,
				// WIZARD

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
				// LAWFUL_GOOD,
				// NEUTRAL_GOOD,
				// CHOATIC_GOOD,
				// LAWFUL_NEUTRAL,
				// TRUE_NEUTRAL,
				// CHOATIC_NEUTRAL,
				// LAWFUL_EVIL,
				// NEUTRAL_EVIL,
				// CHOATIC_EVIL

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
				// ABADAR,
				// ASMODEUS,
				// CALISTRIA,
				// CAYDEN_CAILEAN,
				// DESNA,
				// ERASTIL,
				// GORUM,
				// GOZREH,
				// IOMEDAE,
				// IRORI,
				// LAMASHTU,
				// NETHYS,
				// NORGORBER,
				// PHARASMA,
				// ROVAGUG,
				// SARENRAE,
				// SHELYN,
				// TORAG,
				// URGATHOA,
				// ZON_KUTHON
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
				// DWARF,
				// ELF,
				// GNOME,
				// HALF_ELF,
				// HALF_ORC,
				// HALFLING,
				// HUMAN

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
				case "FEMALE":
					sheet.setGender(Gender.FEMALE);
					break;
				case "NOT_APPLICABLE":
					sheet.setGender(Gender.NOT_APPLICABLE);
					break;
				}
				break;
			case "Weapons":
				ArrayList<Weapon> weapons = new ArrayList<>();

				String st = splitData[1].replaceAll("\\[", "").replaceAll("\\]", "");

				String[] w = st.split("\\+,");

				for (int x = 0; x < w.length; x++) {
					String[] we = w[x].split("\\|");

					String[] n = we[0].split("\\#");

					String name = n[1].trim();

					String[] v = we[1].split("\\#");

					int value = Integer.parseInt(v[1].trim());

					String[] r = we[2].split("\\#");

					String range = r[1].trim();

					String[] d = we[3].split("\\#");

					String damage = d[1].trim();

					String[] a = we[4].split("\\#");

					int attackBonus = Integer.parseInt(a[1].trim());

					String[] c = we[5].split("\\#");

					String critical = c[1].trim();

					String[] t = we[6].split("\\#");

					String type = t[1].trim();

					String[] no = we[7].split("\\#");

					String notes = no[1].trim();

					Weapon newWeapon = new Weapon(name, value, range, damage, attackBonus, critical, type, notes);

					weapons.add(newWeapon);
				}

				sheet.setWeapons(weapons);
				break;
			case "Armor":
				ArrayList<Armor> armor = new ArrayList<>();

				String str = splitData[1].replaceAll("\\[", "").replaceAll("\\]", "");

				String[] a = str.split("\\+,");

				for (int x = 0; x < a.length; x++) {
					String[] ar = a[x].split("\\|");

					String[] n = ar[0].split("\\#");

					String name = n[1].trim();

					String[] v = ar[1].split("\\#");

					int value = Integer.parseInt(v[1].trim());

					String[] t = ar[2].split("\\#");

					String type = t[1].trim();

					String[] b = ar[3].split("\\#");

					int bonus = Integer.parseInt(b[1].trim());

					String[] p = ar[4].split("\\#");

					int penalty = Integer.parseInt(p[1].trim());

					String[] sf = ar[5].split("\\#");

					int spellFailure = Integer.parseInt(sf[1].trim());

					String[] wh = ar[6].split("\\#");

					int weight = Integer.parseInt(wh[1].trim());

					String[] pr = ar[7].split("\\#");

					String properties = pr[1].trim();

					Armor armr = new Armor(name, value, type, bonus, penalty, spellFailure, weight, properties);

					armor.add(armr);
				}

				sheet.setArmor(armor);
				break;
			case "Items":
				ArrayList<Item> items = new ArrayList<>();

				String stri = splitData[1].replaceAll("\\[", "").replaceAll("\\]", "");

				String[] it = stri.split("\\+,");

				for (int x = 0; x < it.length; x++) {
					String[] ite = it[x].split("\\|");

					String[] n = ite[0].split("\\#");

					String name = n[1].trim();

					String[] v = ite[1].split("\\#");

					int value = Integer.parseInt(v[1].trim());

					String[] l = ite[2].split("\\#");

					String location = l[1].trim();

					String[] t = ite[3].split("\\#");

					String type = t[1].trim();

					String[] d = ite[4].split("\\#");

					String description = d[1].trim();

					Item item = new Item(name, value, location, type, description);

					items.add(item);
				}

				sheet.setItems(items);
				break;
			case "Spells":
				ArrayList<Spell> spells = new ArrayList<>();

				String strin = splitData[1].replaceAll("\\[", "").replaceAll("\\]", "");

				String[] sp = strin.split("\\+,");

				for (int x = 0; x < sp.length; x++) {
					String[] spe = sp[x].split("\\|");

					String[] n = spe[0].split("\\#");

					String name = n[1].trim();

					String[] l = spe[1].split("\\#");

					int level = Integer.parseInt(l[1].trim());

					String[] sc = spe[2].split("\\#");

					String school = sc[1].trim();

					String[] ss = spe[3].split("\\#");

					String subschool = ss[1].trim();

					String[] p = spe[4].split("\\#");

					int prepared = Integer.parseInt(p[1].trim());

					String[] c = spe[5].split("\\#");

					int cast = Integer.parseInt(c[1].trim());

					String[] no = spe[6].split("\\#");

					String notes = no[1].trim();

					String[] d = spe[7].split("\\#");

					String description = d[1].trim();

					Spell spell = new Spell(name, level, school, subschool, prepared, cast, notes, description);

					spells.add(spell);
				}

				sheet.setSpells(spells);
				break;
			case "SpellsKnown0":
				sheet.setSpellsKnown0(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc0":
				sheet.setDc0(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd0":
				sheet.setSpd0(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown1":
				sheet.setSpellsKnown1(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc1":
				sheet.setDc1(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd1":
				sheet.setSpd1(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells1":
				sheet.setBonusSpells1(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown2":
				sheet.setSpellsKnown2(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc2":
				sheet.setDc2(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd2":
				sheet.setSpd2(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells2":
				sheet.setBonusSpells2(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown3":
				sheet.setSpellsKnown3(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc3":
				sheet.setDc3(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd3":
				sheet.setSpd3(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells3":
				sheet.setBonusSpells3(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown4":
				sheet.setSpellsKnown4(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc4":
				sheet.setDc4(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd4":
				sheet.setSpd4(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells4":
				sheet.setBonusSpells4(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown6":
				sheet.setSpellsKnown6(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc6":
				sheet.setDc6(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd6":
				sheet.setSpd6(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells6":
				sheet.setBonusSpells6(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown7":
				sheet.setSpellsKnown7(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc7":
				sheet.setDc7(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd7":
				sheet.setSpd7(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells7":
				sheet.setBonusSpells7(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown8":
				sheet.setSpellsKnown8(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc8":
				sheet.setDc8(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd8":
				sheet.setSpd8(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells8":
				sheet.setBonusSpells8(Integer.parseInt(splitData[1].trim()));
				break;
			case "SpellsKnown9":
				sheet.setSpellsKnown9(Integer.parseInt(splitData[1].trim()));
				break;
			case "Dc9":
				sheet.setDc9(Integer.parseInt(splitData[1].trim()));
				break;
			case "Spd9":
				sheet.setSpd9(Integer.parseInt(splitData[1].trim()));
				break;
			case "BonusSpells9":
				sheet.setBonusSpells9(Integer.parseInt(splitData[1].trim()));
				break;
			case "Abilities":
				ArrayList<Ability> abilities = new ArrayList<>();

				String string = splitData[1].replaceAll("\\[", "").replaceAll("\\]", "");

				String[] ab = string.split("\\+,");

				for (int x = 0; x < ab.length; x++) {
					String[] spe = ab[x].split("\\|");

					String[] n = spe[0].split("\\#");

					String name = n[1].trim();

					String[] t = spe[1].split("\\#");

					String type = t[1].trim();

					String[] no = spe[2].split("\\#");

					String notes = no[1].trim();

					String[] at = spe[3].split("\\#");

					AbilityType abilityType = null;
					if (at[1].trim().equals("FEAT")) {
						abilityType = AbilityType.FEAT;
					} else if (at[1].trim().equals("SPECIAL_ABILITY")) {
						abilityType = AbilityType.SPECIAL_ABILITY;
					} else if (at[1].trim().equals("TRAIT")) {
						abilityType = AbilityType.TRAIT;
					}

					Ability ability = new Ability(name, type, notes, abilityType);

					abilities.add(ability);
				}

				sheet.setAbilities(abilities);
				break;
			case "Skills":
				HashMap<NameOfSkill, Skill> skills = new HashMap<>();

				String stringS = splitData[1].replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("=", "\\|");

				String[] sk = stringS.split("\\+,");

				for (int x = 0; x < sk.length; x++) {
					String[] skilz = sk[x].split("\\|");

					NameOfSkill name = null;
					if (skilz[0].trim().equals("ACROBATICS")) {
						name = NameOfSkill.ACROBATICS;
					} else if (skilz[0].trim().equals("APPRAISE")) {
						name = NameOfSkill.APPRAISE;
					} else if (skilz[0].trim().equals("BLUFF")) {
						name = NameOfSkill.BLUFF;
					} else if (skilz[0].trim().equals("CLIMB")) {
						name = NameOfSkill.CLIMB;
					} else if (skilz[0].trim().equals("CRAFT1")) {
						name = NameOfSkill.CRAFT1;
					} else if (skilz[0].trim().equals("CRAFT2")) {
						name = NameOfSkill.CRAFT2;
					} else if (skilz[0].trim().equals("CRAFT3")) {
						name = NameOfSkill.CRAFT3;
					} else if (skilz[0].trim().equals("DIPLOMACY")) {
						name = NameOfSkill.DIPLOMACY;
					} else if (skilz[0].trim().equals("DISABLE_DEVICE")) {
						name = NameOfSkill.DISABLE_DEVICE;
					} else if (skilz[0].trim().equals("DISGUISE")) {
						name = NameOfSkill.DISGUISE;
					} else if (skilz[0].trim().equals("ESCAPE_ARTIST")) {
						name = NameOfSkill.ESCAPE_ARTIST;
					} else if (skilz[0].trim().equals("FLY")) {
						name = NameOfSkill.FLY;
					} else if (skilz[0].trim().equals("HANDLE_ANIMAL")) {
						name = NameOfSkill.HANDLE_ANIMAL;
					} else if (skilz[0].trim().equals("HEAL")) {
						name = NameOfSkill.HEAL;
					} else if (skilz[0].trim().equals("INTIMIDATE")) {
						name = NameOfSkill.INTIMIDATE;
					} else if (skilz[0].trim().equals("KNOWLEDGE_A")) {
						name = NameOfSkill.KNOWLEDGE_A;
					} else if (skilz[0].trim().equals("KNOWLEDGE_D")) {
						name = NameOfSkill.KNOWLEDGE_D;
					} else if (skilz[0].trim().equals("KNOWLEDGE_E")) {
						name = NameOfSkill.KNOWLEDGE_E;
					} else if (skilz[0].trim().equals("kNOWLEDGE_G")) {
						name = NameOfSkill.KNOWLEDGE_G;
					} else if (skilz[0].trim().equals("KNOWLEDGE_H")) {
						name = NameOfSkill.KNOWLEDGE_H;
					} else if (skilz[0].trim().equals("KNOWLEDGE_L")) {
						name = NameOfSkill.KNOWLEDGE_L;
					} else if (skilz[0].trim().equals("KNOWLEDGE_NA")) {
						name = NameOfSkill.KNOWLEDGE_NA;
					} else if (skilz[0].trim().equals("KNOWLEDGE_NO")) {
						name = NameOfSkill.KNOWLEDGE_NO;
					} else if (skilz[0].trim().equals("KNOWLEDGE_P")) {
						name = NameOfSkill.KNOWLEDGE_P;
					} else if (skilz[0].trim().equals("KNOWLEDGE_R")) {
						name = NameOfSkill.KNOWLEDGE_R;
					} else if (skilz[0].trim().equals("LINGUISTICS")) {
						name = NameOfSkill.LINGUISTICS;
					} else if (skilz[0].trim().equals("PERCEPTION")) {
						name = NameOfSkill.PERCEPTION;
					} else if (skilz[0].trim().equals("PERFORM1")) {
						name = NameOfSkill.PERFORM1;
					} else if (skilz[0].trim().equals("PERFORM2")) {
						name = NameOfSkill.PERFORM2;
					} else if (skilz[0].trim().equals("PROFESSION1")) {
						name = NameOfSkill.PROFESSION1;
					} else if (skilz[0].trim().equals("PROFESSION2")) {
						name = NameOfSkill.PROFESSION2;
					} else if (skilz[0].trim().equals("RIDE")) {
						name = NameOfSkill.RIDE;
					} else if (skilz[0].trim().equals("SENSE_MOTIVE")) {
						name = NameOfSkill.SENSE_MOTIVE;
					} else if (skilz[0].trim().equals("SLEIGHT_OF_HAND")) {
						name = NameOfSkill.SLEIGHT_OF_HAND;
					} else if (skilz[0].trim().equals("SPELLCRAFT")) {
						name = NameOfSkill.SPELLCRAFT;
					} else if (skilz[0].trim().equals("STEALTH")) {
						name = NameOfSkill.STEALTH;
					} else if (skilz[0].trim().equals("SURVIVAL")) {
						name = NameOfSkill.SURVIVAL;
					} else if (skilz[0].trim().equals("SWIM")) {
						name = NameOfSkill.SWIM;
					} else if (skilz[0].trim().equals("USE_MAGIC_DEVICE")) {
						name = NameOfSkill.USE_MAGIC_DEVICE;
					}

					String[] abil = skilz[1].split("\\#");

					SkillTiedAbility ability = null;
					if (abil[1].trim().equals("CHA")) {
						ability = SkillTiedAbility.CHA;
					} else if (abil[1].trim().equals("DEX")) {
						ability = SkillTiedAbility.DEX;
					} else if (abil[1].trim().equals("INT")) {
						ability = SkillTiedAbility.INT;
					} else if (abil[1].trim().equals("STR")) {
						ability = SkillTiedAbility.STR;
					} else if (abil[1].trim().equals("WIS")) {
						ability = SkillTiedAbility.WIS;
					}

					String[] r = skilz[2].split("\\#");

					int rank = Integer.parseInt(r[1].trim());

					String[] m = skilz[3].split("\\#");

					int miscMod = Integer.parseInt(m[1].trim());

					Skill skill = new Skill(name, ability, rank, miscMod);

					skills.put(name, skill);
				}

				sheet.setSkills(skills);
				break;
			}
		}

		return sheet;
	}

	public static boolean writeToFile(String filePath, String characterName, CharacterSheet sheet) {
		String output = sheet.toString();

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

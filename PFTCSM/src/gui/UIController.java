package gui;

import app.FileManager;
import enums.AbilityType;
import enums.Alignment;
import enums.Deity;
import enums.Gender;
import enums.Race;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lib.ProgramUtil;
import lib.TryParseIntResult;
import models.Ability;
import models.Armor;
import models.CharacterSheet;
import models.Item;
import models.Spell;
import models.Weapon;

public class UIController implements Initializable {

    public static CharacterSheet theSheet = new CharacterSheet();

    // Root node, BorderPane aka rootPane
    @FXML
    private BorderPane rootPane;

    // Creation buttons
    @FXML
    private Button newFeat, newSpecialAbility, newWeapon, newTrait, newACItem, newGear, newLevel0, newLevel1, saveCurrent,
            newLevel2, newLevel3, newLevel4, newLevel5, newLevel6, newLevel7, newLevel8, newLevel9, newSpellLike;

    // First tab, Stats, TextFields
    @FXML
    private TextField playerName, characterName, level, homeland, size, age, height, weight, hair, eyes,
            currentEXP, nextLVL, strBase, dexBase, conBase, wisBase, intBase, chaBase, strMod, dexMod,
            conMod, wisMod, intMod, chaMod, strTemp, dexTemp, conTemp, wisTemp, intTemp, chaTemp, strTempMod,
            dexTempMod, conTempMod, wisTempMod, intTempMod, chaTempMod;

    // Skills Tab Mods
    @FXML
    private Label acrobaticsMod, appraiseMod, bluffMod, climbMod, craft1Mod, craft2Mod, craft3Mod,
            diplomacyMod, disableDeviceMod, disguiseMod, escapeArtistMod, flyMod, handleAnimalMod, healMod,
            intimidateMod, knowledgeAMod, knowledgeDMod, knowledgeEMod, knowledgeGMod, knowledgeHMod,
            knowledgeLMod, knowledgeNaMod, knowledgeNoMod, knowledgePMod, knowledgeRMod, linguisticsMod,
            perceptionMod, perform1Mod, perform2Mod, profession1Mod, profession2Mod, rideMod, senseMotiveMod,
            sleightOfHandMod, spellcraftMod, stealthMod, survivalMod, swimMod, useMagicDeviceMod;

    // Skills Tab TextFields
    @FXML
    private TextField acrobaticsBonus, appraiseBonus, bluffBonus, climbBonus, craft1Bonus, craft2Bonus, craft3Bonus,
            diplomacyBonus, disableDeviceBonus, disguiseBonus, escapeArtistBonus, flyBonus, handleAnimalBonus,
            healBonus, intimidateBonus, knowledgeABonus, knowledgeDBonus, knowledgeEBonus, knowledgeGBonus,
            knowledgeHBonus, knowledgeLBonus, knowledgeNaBonus, knowledgeNoBonus, knowledgePBonus,
            knowledgeRBonus, linguisticsBonus, perceptionBonus, perform1Bonus, perform2Bonus, profession1Bonus,
            profession2Bonus, rideBonus, senseMotiveBonus, sleightOfHandBonus, spellcraftBonus, stealthBonus,
            survivalBonus, swimBonus, useMagicDeviceBonus, acrobaticsRanks, appraiseRanks, bluffRanks,
            climbRanks, craft1Ranks, craft2Ranks, craft3Ranks, diplomacyRanks, disableDeviceRanks,
            disguiseRanks, escapeArtistRanks, flyRanks, handleAnimalRanks, healRanks, intimidateRanks,
            knowledgeARanks, knowledgeDRanks, knowledgeERanks, knowledgeGRanks, knowledgeHRanks,
            knowledgeLRanks, knowledgeNaRanks, knowledgeNoRanks, knowledgePRanks, knowledgeRRanks,
            linguisticsRanks, perceptionRanks, perform1Ranks, perform2Ranks, profession1Ranks,
            profession2Ranks, rideRanks, senseMotiveRanks, sleightOfHandRanks, spellcraftRanks,
            stealthRanks, survivalRanks, swimRanks, useMagicDeviceRanks, acrobaticsMisc, appraiseMisc,
            bluffMisc, climbMisc, craft1Misc, craft2Misc, craft3Misc, diplomacyMisc, disableDeviceMisc,
            disguiseMisc, escapeArtistMisc, flyMisc, handleAnimalMisc, healMisc, intimidateMisc,
            knowledgeAMisc, knowledgeDMisc, knowledgeEMisc, knowledgeGMisc, knowledgeHMisc, knowledgeLMisc,
            knowledgeNaMisc, knowledgeNoMisc, knowledgePMisc, knowledgeRMisc, linguisticsMisc, perceptionMisc,
            perform1Misc, perform2Misc, profession1Misc, profession2Misc, rideMisc, senseMotiveMisc,
            sleightOfHandMisc, spellcraftMisc, stealthMisc, survivalMisc, swimMisc, useMagicDeviceMisc;

    @FXML
    private ComboBox charClass, race, alignment, deity, gender;

    private Spell newSpell;

    public UIController() {
        System.out.println("UIController instantiated, creating and injecting JavaFX objects.");
        // Doing anything here will result in NullPointers, objects aren't fully injected yet
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("UIController initialized.");
        saveCurrent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                saveFile();
            }
        });
        ObservableList<String> choices = FXCollections.observableArrayList();
        for (enums.Class c : enums.Class.values()) {
            choices.add(c.toString());
        }
        charClass.getItems().setAll(choices);
        choices.clear();
        for (Race c : Race.values()) {
            choices.add(c.toString());
        }
        race.getItems().setAll(choices);
        choices.clear();
        for (Alignment c : Alignment.values()) {
            choices.add(c.toString());
        }
        alignment.getItems().setAll(choices);
        choices.clear();
        for (Deity c : Deity.values()) {
            choices.add(c.toString());
        }
        deity.getItems().setAll(choices);
        choices.clear();
        for (Gender c : Gender.values()) {
            choices.add(c.toString());
        }
        gender.getItems().setAll(choices);

        rootPane.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent k) {
                update();
            }
        });

        // NEW FEAT
        newFeat.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                Stage newF = new Stage();

                VBox base = new VBox();

                TextField usrName = new TextField(), usrDesc = new TextField(), usrType = new TextField();

                base.getChildren().add(new Label("Feat Name:"));
                base.getChildren().add(usrName);

                base.getChildren().add(new Label("Type:"));
                base.getChildren().add(usrType);

                base.getChildren().add(new Label("Notes:"));
                base.getChildren().add(usrDesc);

                Button conf = new Button("Ok"), cancel = new Button("Cancel");
                HBox buttonz = new HBox(conf, cancel);
                buttonz.setSpacing(50);
                buttonz.setAlignment(Pos.CENTER);

                base.getChildren().add(buttonz);
                base.setAlignment(Pos.CENTER);
                base.setPadding(new Insets(10, 20, 20, 20));
                base.setSpacing(10);

                Scene scheme = new Scene(base);

                newF.setScene(scheme);
                newF.show();

                conf.setOnAction(new EventHandler<ActionEvent>() {
                    Ability newThing;

                    @Override
                    public void handle(ActionEvent e) {
                        newThing = new Ability(usrName.getText(), usrType.getText(), usrDesc.getText(), AbilityType.FEAT);
                        theSheet.getAbilities().add(newThing);
                        FlowPane thing = (FlowPane) newFeat.getParent();
                        Button newOne = new Button(usrName.getText());

                        thing.getChildren().add(newOne);
                        newF.close();
                    }
                });

                cancel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        newF.close();
                    }
                });
            }
        }
        );

        // NEW SPECIAL ABILITY
        newSpecialAbility.setOnAction(new EventHandler<ActionEvent>() {
            Ability newSpecial;

            @Override
            public void handle(ActionEvent e) {
                Stage newSpecAbDialogue = new Stage();
                VBox base = new VBox();
                TextField usrName = new TextField(), usrType = new TextField(), usrDesc = new TextField();

                base.getChildren().add(new Label("Name:"));
                base.getChildren().add(usrName);

                base.getChildren().add(new Label("Type (Ex, Sp, Su, ...):"));
                base.getChildren().add(usrType);

                base.getChildren().add(new Label("Notes:"));
                base.getChildren().add(usrDesc);

                Button confirm = new Button("Ok");
                Button cancel = new Button("Cancel");

                HBox choices = new HBox(confirm, cancel);

                choices.setSpacing(50);
                choices.setAlignment(Pos.CENTER);

                base.getChildren().add(choices);
                base.setAlignment(Pos.CENTER);
                base.setPadding(new Insets(10, 20, 20, 20));
                base.setSpacing(12);

                Scene scheme = new Scene(base);
                newSpecAbDialogue.setScene(scheme);
                newSpecAbDialogue.show();

                confirm.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        newSpecial = new Ability(usrName.getText(), usrType.getText(), usrDesc.getText(), AbilityType.SPECIAL_ABILITY);
                        theSheet.getAbilities().add(newSpecial);
                        FlowPane parent = (FlowPane) newSpecialAbility.getParent();
                        parent.getChildren().add(new Button(usrName.getText()));
                        newSpecAbDialogue.close();
                    }
                });
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        newSpecAbDialogue.close();
                    }
                });
            }
        }
        );

        // NEW WEAPON
        newWeapon.setOnAction(new EventHandler<ActionEvent>() {
            int attackBonus = -9000;

            @Override
            public void handle(ActionEvent e) {
                Stage newWeapDia = new Stage();
                VBox base = new VBox();
                TextField usrName = new TextField(), usrABonus = new TextField(), usrDmg = new TextField(),
                        usrType = new TextField(), usrCrit = new TextField(), usrDesc = new TextField(),
                        usrRange = new TextField();
                base.getChildren().add(new Label("Name:"));
                base.getChildren().add(usrName);

                base.getChildren().add(new Label("Range:"));
                base.getChildren().add(usrRange);

                base.getChildren().add(new Label("Attack Bonus:"));
                base.getChildren().add(usrABonus);

                base.getChildren().add(new Label("Damage:"));
                base.getChildren().add(usrDmg);

                base.getChildren().add(new Label("Type:"));
                base.getChildren().add(usrType);

                base.getChildren().add(new Label("Crit:"));
                base.getChildren().add(usrCrit);

                base.getChildren().add(new Label("Notes:"));
                base.getChildren().add(usrDesc);

                Button confirm = new Button("Ok");
                Button cancel = new Button("Cancel");

                HBox choices = new HBox(confirm, cancel);

                choices.setSpacing(50);
                choices.setAlignment(Pos.CENTER);

                base.getChildren().add(choices);
                base.setAlignment(Pos.CENTER);
                base.setPadding(new Insets(10, 20, 20, 20));
                base.setSpacing(12);

                Scene scheme = new Scene(base);

                newWeapDia.setScene(scheme);
                newWeapDia.show();

                confirm.setOnAction(new EventHandler<ActionEvent>() {
                    Weapon newWeap;

                    @Override
                    public void handle(ActionEvent e) {
                        attackBonus = parse(usrABonus.getText());
                        newWeap = new Weapon(usrName.getText(), 0, usrRange.getText(), usrDmg.getText(), attackBonus, usrCrit.getText(), usrType.getText(), usrDesc.getText());
                        theSheet.getWeapons().add(newWeap);
                        FlowPane parent = (FlowPane) newWeapon.getParent();
                        parent.getChildren().add(new Button(usrName.getText()));
                        newWeapDia.close();
                    }
                });
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        newWeapDia.close();
                    }
                });
            }
        }
        );

        // NEW TRAIT
        newTrait.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Stage newTraitDia = new Stage();
                TextField usrName = new TextField(), usrType = new TextField(), usrNotes = new TextField();

                VBox base = new VBox();
                base.getChildren().add(new Label("Name:"));
                base.getChildren().add(usrName);

                base.getChildren().add(new Label("Type:"));
                base.getChildren().add(usrType);

                base.getChildren().add(new Label("Notes:"));
                base.getChildren().add(usrNotes);

                Button confirm = new Button("OK"), cancel = new Button("Cancel");
                HBox choices = new HBox(confirm, cancel);

                choices.setSpacing(50);
                choices.setAlignment(Pos.CENTER);

                base.setPadding(new Insets(10, 20, 20, 20));
                base.setSpacing(12);
                base.setAlignment(Pos.CENTER);

                base.getChildren().add(choices);

                newTraitDia.setScene(new Scene(base));
                newTraitDia.show();

                confirm.setOnAction(new EventHandler<ActionEvent>() {
                    Ability newTraitThing;

                    @Override
                    public void handle(ActionEvent e) {
                        newTraitThing = new Ability(usrName.getText(), usrType.getText(), usrNotes.getText(), AbilityType.TRAIT);
                        theSheet.getAbilities().add(newTraitThing);
                        FlowPane parent = (FlowPane) newTrait.getParent();
                        parent.getChildren().add(new Button(usrName.getText()));
                        newTraitDia.close();
                    }
                });

                cancel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        newTraitDia.close();
                    }
                });
            }
        }
        );

        // NEW AC ITEM
        newACItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Stage newGearDia = new Stage();
                TextField usrName = new TextField(), usrType = new TextField(), usrLocation = new TextField(),
                        usrNotes = new TextField(), usrBonus = new TextField(), usrPenalty = new TextField(),
                        usrSpellFailure = new TextField(), usrWeight = new TextField();
                VBox base = new VBox();

                base.getChildren().add(new Label("Name:"));
                base.getChildren().add(usrName);

                base.getChildren().add(new Label("Type:"));
                base.getChildren().add(usrType);

                GridPane bonusPenalty = new GridPane();
                bonusPenalty.add(new Label("Bonus:"), 0, 0);
                bonusPenalty.add(usrBonus, 0, 1);
                bonusPenalty.add(new Label("Penalty:"), 1, 0);
                bonusPenalty.add(usrPenalty, 1, 1);
                bonusPenalty.setVgap(5);
                bonusPenalty.setHgap(10);
                bonusPenalty.setMaxSize(800, 400);

                base.getChildren().add(bonusPenalty);

                base.getChildren().add(new Label("Location (on body):"));
                base.getChildren().add(usrLocation);

                base.getChildren().add(new Label("Spell Failure:"));
                base.getChildren().add(usrSpellFailure);

                base.getChildren().add(new Label("Weight:"));
                base.getChildren().add(usrWeight);

                base.getChildren().add(new Label("Properties:"));
                base.getChildren().add(usrNotes);

                Button confirm = new Button("Ok"), cancel = new Button("Cancel");

                HBox choices = new HBox(confirm, cancel);

                choices.setSpacing(50);
                choices.setAlignment(Pos.CENTER);

                base.setPadding(new Insets(10, 20, 20, 20));
                base.setSpacing(12);
                base.setAlignment(Pos.CENTER);

                base.getChildren().add(choices);
                newGearDia.setScene(new Scene(base));
                newGearDia.show();

                confirm.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        theSheet.getArmor().add(new Armor(usrName.getText(), 0, usrType.getText(), parse(usrBonus.getText()), parse(usrPenalty.getText()), parse(usrSpellFailure.getText()), parse(usrWeight.getText()), usrNotes.getText()));
                        FlowPane parent = (FlowPane) newGear.getParent();
                        parent.getChildren().add(new Button(usrName.getText()));
                        newGearDia.close();
                    }
                });

                cancel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        newGearDia.close();
                    }
                });
            }
        }
        );

        // NEW ITEMS
        newGear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Stage newGearDia = new Stage();
                TextField usrName = new TextField(), usrValue = new TextField(), usrLocation = new TextField(),
                        usrType = new TextField(), usrDesc = new TextField();
                VBox base = new VBox();

                base.getChildren().add(new Label("Name:"));
                base.getChildren().add(usrName);

                base.getChildren().add(new Label("Value:"));
                base.getChildren().add(usrValue);

                base.getChildren().add(new Label("Location:"));
                base.getChildren().add(usrLocation);

                base.getChildren().add(new Label("Type:"));
                base.getChildren().add(usrType);

                base.getChildren().add(new Label("Description:"));
                base.getChildren().add(usrDesc);

                Button confirm = new Button("Ok"), cancel = new Button("Cancel");

                HBox choices = new HBox(confirm, cancel);

                choices.setSpacing(50);
                choices.setAlignment(Pos.CENTER);

                base.setPadding(new Insets(10, 20, 20, 20));
                base.setSpacing(12);
                base.setAlignment(Pos.CENTER);

                base.getChildren().add(choices);
                newGearDia.setScene(new Scene(base));
                newGearDia.show();

                confirm.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        theSheet.getItems().add(new Item(usrName.getText(), parse(usrValue.getText()), usrLocation.getText(), usrType.getText(), usrDesc.getText()));
                        FlowPane parent = (FlowPane) newGear.getParent();
                        parent.getChildren().add(new Button(usrName.getText()));
                        newGearDia.close();
                    }
                });

                cancel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        newGearDia.close();
                    }
                });
            }
        }
        );

        // NEW SPELLS: 0
        newLevel0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(0);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 1
        newLevel1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(1);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 2
        newLevel2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(2);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 3
        newLevel3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(3);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 4
        newLevel0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(4);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 5
        newLevel5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(5);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 6
        newLevel6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(6);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 7
        newLevel7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(7);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 8
        newLevel8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(8);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: 9
        newLevel9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(9);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });

        // NEW SPELLS: SPELL-LIKE
        newSpellLike.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Spell newThing = genNewSpell(-1);
                theSheet.getSpells().add(newThing);
                FlowPane parent = (FlowPane) newLevel0.getParent();
                parent.getChildren().add(new Button(newThing.getName()));
            }
        });
        /*
            Logic for buttons:
        when they are created, add eventHandlers that will get from theSheet the thing and set the text to 
        their respective things; new method for displaying stuff and re-saving AS SAME OBJECT
         */
    }

    /**
     * Method to deal with viewing of objects based on what flowpane they are
     * in; can handle weapon, armor, item, and ability inputs
     *
     * @param btn button that gets clicked to view the item
     */
    private void addHandlerToButton(Button btn) {
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                // Re-create the necessary stage for the appropriate thing, with option to delete it
                // Or just put the toString of the object in a big label? why not
                if (btn.getParent().getChildrenUnmodifiable().contains(newWeapon)) {
                    // It's a weapon button
                } else if (btn.getParent().getChildrenUnmodifiable().contains(newGear)) {
                    // It's in the random item area
                } else if (btn.getParent().getChildrenUnmodifiable().contains(newSpecialAbility)) {
                    // It's in ONE OF THE ABILITIES
                } else if (btn.getParent().getChildrenUnmodifiable().contains(newACItem)) {
                    // It's in the armor section
                } else {
                    System.out.println("There was an issue figuring out the parent of the " + btn.getText() + " button.");
                }
            }
        });
    }

    /**
     * @param level Level of spell to be created
     * @return returns a new Spell with all fields but level dictated by user
     */
    private Spell genNewSpell(int level) {
        Stage newSpellDia = new Stage();
        TextField usrName = new TextField(), usrSchool = new TextField(), usrSubSchool = new TextField(),
                usrPrepared = new TextField(), usrCast = new TextField(), usrNotes = new TextField(),
                usrDesc = new TextField();
        VBox base = new VBox();

        base.getChildren().add(new Label("Name:"));
        base.getChildren().add(usrName);

        base.getChildren().add(new Label("School:"));
        base.getChildren().add(usrSchool);

        base.getChildren().add(new Label("SubSchool:"));
        base.getChildren().add(usrSubSchool);

        base.getChildren().add(new Label("Prepared:"));
        base.getChildren().add(usrPrepared);

        base.getChildren().add(new Label("Cast:"));
        base.getChildren().add(usrCast);

        base.getChildren().add(new Label("Notes:"));
        base.getChildren().add(usrNotes);

        base.getChildren().add(new Label("Description:"));
        base.getChildren().add(usrDesc);

        Button confirm = new Button("Ok"), cancel = new Button("Cancel");

        HBox choices = new HBox(confirm, cancel);

        choices.setSpacing(50);
        choices.setAlignment(Pos.CENTER);

        base.setPadding(new Insets(10, 20, 20, 20));
        base.setSpacing(12);
        base.setAlignment(Pos.CENTER);

        base.getChildren().add(choices);
        newSpellDia.setScene(new Scene(base));
        newSpellDia.setTitle("New Spell");

        confirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                newSpell = new Spell(usrName.getText(), level, usrSchool.getText(),
                        usrSubSchool.getText(), parse(usrPrepared.getText()),
                        parse(usrCast.getText()), usrNotes.getText(), usrDesc.getText());
                newSpellDia.close();
            }
        });

        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                newSpell = null;
                newSpellDia.close();
            }
        });

        newSpellDia.showAndWait();

        return newSpell;
    }

    private void update() {
        updateMods();
        updateSkillsMods();
        updateSkillTotals();
    }

    private void updateMods() {
        String backup = "0";
        intMod.setText("" + (int) (Math.floor(parse((intBase.getText() == null || "".equals(intBase.getText())) ? backup : intBase.getText()) - 10) / 2.0));
        dexMod.setText("" + (int) (Math.floor(parse((dexBase.getText() == null || "".equals(dexBase.getText())) ? backup : dexBase.getText()) - 10) / 2.0));
        wisMod.setText("" + (int) (Math.floor(parse((wisBase.getText() == null || "".equals(wisBase.getText())) ? backup : wisBase.getText()) - 10) / 2.0));
        conMod.setText("" + (int) (Math.floor(parse((conBase.getText() == null || "".equals(conBase.getText())) ? backup : conBase.getText()) - 10) / 2.0));
        strMod.setText("" + (int) (Math.floor(parse((strBase.getText() == null || "".equals(strBase.getText())) ? backup : strBase.getText()) - 10) / 2.0));
        chaMod.setText("" + (int) (Math.floor(parse((chaBase.getText() == null || "".equals(chaBase.getText())) ? backup : chaBase.getText()) - 10) / 2.0));
    }

    private void updateSkillsMods() {
        acrobaticsMod.setText(dexMod.getText());
        appraiseMod.setText(intMod.getText());
        bluffMod.setText(chaMod.getText());
        climbMod.setText(strMod.getText());
        craft1Mod.setText(intMod.getText());
        craft2Mod.setText(intMod.getText());
        craft3Mod.setText(intMod.getText());
        diplomacyMod.setText(chaMod.getText());
        disableDeviceMod.setText(dexMod.getText());
        disguiseMod.setText(chaMod.getText());
        escapeArtistMod.setText(dexMod.getText());
        flyMod.setText(dexMod.getText());
        handleAnimalMod.setText(chaMod.getText());
        healMod.setText(wisMod.getText());
        intimidateMod.setText(chaMod.getText());
        knowledgeAMod.setText(intMod.getText());
        knowledgeDMod.setText(intMod.getText());
        knowledgeEMod.setText(intMod.getText());
        knowledgeGMod.setText(intMod.getText());
        knowledgeHMod.setText(intMod.getText());
        knowledgeLMod.setText(intMod.getText());
        knowledgeNaMod.setText(intMod.getText());
        knowledgeNoMod.setText(intMod.getText());
        knowledgePMod.setText(intMod.getText());
        knowledgeRMod.setText(intMod.getText());
        linguisticsMod.setText(intMod.getText());
        perceptionMod.setText(wisMod.getText());
        perform1Mod.setText(chaMod.getText());
        perform2Mod.setText(chaMod.getText());
        profession1Mod.setText(wisMod.getText());
        profession2Mod.setText(wisMod.getText());
        rideMod.setText(dexMod.getText());
        senseMotiveMod.setText(wisMod.getText());
        sleightOfHandMod.setText(dexMod.getText());
        spellcraftMod.setText(intMod.getText());
        stealthMod.setText(dexMod.getText());
        survivalMod.setText(wisMod.getText());
        swimMod.setText(strMod.getText());
        useMagicDeviceMod.setText(chaMod.getText());
    }

    private void updateSkillTotals() {
        String mod = acrobaticsMod.getText(), rank = acrobaticsRanks.getText(), misc = acrobaticsMisc.getText();
        int bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        acrobaticsBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = appraiseMod.getText();
        rank = appraiseRanks.getText();
        misc = appraiseMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        appraiseBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = bluffMod.getText();
        rank = bluffRanks.getText();
        misc = bluffMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        bluffBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = climbMod.getText();
        rank = climbRanks.getText();
        misc = climbMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        climbBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = craft1Mod.getText();
        rank = craft1Ranks.getText();
        misc = craft1Misc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        craft1Bonus.setText((bonus == 0) ? "" : bonus + "");

        mod = craft2Mod.getText();
        rank = craft2Ranks.getText();
        misc = craft2Misc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        craft2Bonus.setText((bonus == 0) ? "" : bonus + "");

        mod = craft3Mod.getText();
        rank = craft3Ranks.getText();
        misc = craft3Misc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        craft3Bonus.setText((bonus == 0) ? "" : bonus + "");

        mod = diplomacyMod.getText();
        rank = diplomacyRanks.getText();
        misc = diplomacyMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        diplomacyBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = disableDeviceMod.getText();
        rank = disableDeviceRanks.getText();
        misc = disableDeviceMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        disableDeviceBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = disguiseMod.getText();
        rank = disguiseRanks.getText();
        misc = disguiseMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        disguiseBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = escapeArtistMod.getText();
        rank = escapeArtistRanks.getText();
        misc = escapeArtistMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        escapeArtistBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = flyMod.getText();
        rank = flyRanks.getText();
        misc = flyMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        flyBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = handleAnimalMod.getText();
        rank = handleAnimalRanks.getText();
        misc = handleAnimalMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        handleAnimalBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = healMod.getText();
        rank = healRanks.getText();
        misc = healMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        healBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = intimidateMod.getText();
        rank = intimidateRanks.getText();
        misc = intimidateMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        intimidateBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeAMod.getText();
        rank = knowledgeARanks.getText();
        misc = knowledgeAMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeABonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeDMod.getText();
        rank = knowledgeDRanks.getText();
        misc = knowledgeDMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeDBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeEMod.getText();
        rank = knowledgeERanks.getText();
        misc = knowledgeEMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeEBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeGMod.getText();
        rank = knowledgeGRanks.getText();
        misc = knowledgeGMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeGBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeHMod.getText();
        rank = knowledgeHRanks.getText();
        misc = knowledgeHMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeHBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeLMod.getText();
        rank = knowledgeLRanks.getText();
        misc = knowledgeLMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeLBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeNaMod.getText();
        rank = knowledgeNaRanks.getText();
        misc = knowledgeNaMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeNaBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeNoMod.getText();
        rank = knowledgeNoRanks.getText();
        misc = knowledgeNoMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeNoBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgePMod.getText();
        rank = knowledgePRanks.getText();
        misc = knowledgePMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgePBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = knowledgeRMod.getText();
        rank = knowledgeRRanks.getText();
        misc = knowledgeRMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        knowledgeRBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = linguisticsMod.getText();
        rank = linguisticsRanks.getText();
        misc = linguisticsMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        linguisticsBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = perceptionMod.getText();
        rank = perceptionRanks.getText();
        misc = perceptionMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        perceptionBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = perform1Mod.getText();
        rank = perform1Ranks.getText();
        misc = perform1Misc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        perform1Bonus.setText((bonus == 0) ? "" : bonus + "");

        mod = perform2Mod.getText();
        rank = perform2Ranks.getText();
        misc = perform2Misc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        perform2Bonus.setText((bonus == 0) ? "" : bonus + "");

        mod = profession1Mod.getText();
        rank = profession1Ranks.getText();
        misc = profession1Misc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        profession1Bonus.setText((bonus == 0) ? "" : bonus + "");

        mod = profession2Mod.getText();
        rank = profession2Ranks.getText();
        misc = profession2Misc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        profession2Bonus.setText((bonus == 0) ? "" : bonus + "");

        mod = rideMod.getText();
        rank = rideRanks.getText();
        misc = rideMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        rideBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = senseMotiveMod.getText();
        rank = senseMotiveRanks.getText();
        misc = senseMotiveMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        senseMotiveBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = sleightOfHandMod.getText();
        rank = sleightOfHandRanks.getText();
        misc = sleightOfHandMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        sleightOfHandBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = spellcraftMod.getText();
        rank = spellcraftRanks.getText();
        misc = spellcraftMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        spellcraftBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = stealthMod.getText();
        rank = stealthRanks.getText();
        misc = stealthMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        stealthBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = survivalMod.getText();
        rank = survivalRanks.getText();
        misc = survivalMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        survivalBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = swimMod.getText();
        rank = swimRanks.getText();
        misc = swimMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        swimBonus.setText((bonus == 0) ? "" : bonus + "");

        mod = useMagicDeviceMod.getText();
        rank = useMagicDeviceRanks.getText();
        misc = useMagicDeviceMisc.getText();
        bonus = ((mod != null && !mod.isEmpty()) ? parse(mod) : 0) + ((rank != null && !rank.isEmpty()) ? parse(rank) : 0) + ((misc != null && !misc.isEmpty()) ? parse(misc) : 0);
        useMagicDeviceBonus.setText((bonus == 0) ? "" : bonus + "");

    }

    private void saveFile(){
        FileManager.writeToFile(InitController.workingDir, characterName.getText(), theSheet);
    }
    
    /**
     * @param s String to be parsed to int
     * @return Returns 0 if parse was unsuccessful, int of string if successful
     */
    private Integer parse(String s) {
        TryParseIntResult thing = new TryParseIntResult(false, 0);
        try {
            thing = ProgramUtil.tryParseInt(s);
        } catch (NumberFormatException e) {
            Stage noEmpty = new Stage();
            VBox bad = new VBox(new Label("Input cannot be empty."));
            Button fine = new Button("Ok");
            bad.getChildren().add(fine);
            noEmpty.setScene(new Scene(bad));
            noEmpty.show();
            fine.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    noEmpty.close();
                }
            });
        }
        return (thing.didParse) ? thing.result : 0;
    }

    /**
     * @return the newSpell
     */
    public Spell getNewSpell() {
        return newSpell;
    }

    /**
     * @param newSpell the newSpell to set
     */
    public void setNewSpell(Spell newSpell) {
        this.newSpell = newSpell;
    }
}

package app;

import models.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.fxml.*;

public class FileManager {

	public String formatInfoToString(CharacterSheet sheet) {
		
	}
	
	public CharacterSheet formatInfoToCharacterSheet(String s) {
		
	}
	
	public boolean writeToFile(String filePath, String characterName, String output) {
		
		try {
			Files.write(Paths.get(filePath, "\\", characterName, ".txt"), output.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public CharacterSheet readFile(String filePath) {
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

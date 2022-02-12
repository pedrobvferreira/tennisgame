package com.tg.helper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.*;

/*
 * Author: pedro.ferreira
 * */
public abstract class FileConvertHelper {
	static Logger logger = Logger.getLogger(FileConvertHelper.class.getName());
	
	/** Reads a File as a String **/
	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(System.getProperty("user.home") + fileName)));
		return data;
	}
	
	/** Reads a File as a List of String **/
	public static List<String> readFileInList(String fileName) {
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(Paths.get(System.getProperty("user.home") + fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		return lines;
	}
	
	/** Writes a String into a File **/
	public static void writeFileString(String fileName, String text) {
		try {
			// Create an object of BufferedWriter
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(System.getProperty("user.home") + fileName));
			// Write text(content) to file
			writeFile.write(text);
			// Message showcasing successful execution of the program
			System.out.print("File is created successfully with the content.");
			// Close the BufferedWriter object
			writeFile.close();
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
	
	/** Writes a List String into a File **/
	public static void writeFileList(String fileName, List<String> lstText) {
		try {
			// Create an object of BufferedWriter
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(System.getProperty("user.home") + fileName));
			for (String text : lstText) {
				writeFile.write(text + System.lineSeparator());
			}
			// Close the BufferedWriter object
			writeFile.close();
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
}

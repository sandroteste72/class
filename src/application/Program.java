package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		/*
		 * File file = new File("C:\\ws_eclipse\\in.txt"); Scanner scan = null; try {
		 * scan = new Scanner(file); while (scan.hasNextLine()) {
		 * System.out.println(scan.nextLine()); } } catch (IOException e) {
		 * System.out.println("Error: " + e.getMessage()); } finally { if (scan != null)
		 * { scan.close(); } }
		 */

		/*
		 * String path = "C:\\ws_eclipse\\in.txt"; BufferedReader br = null; FileReader
		 * fr = null; try { fr = new FileReader(path); br = new BufferedReader(fr);
		 * String line = br.readLine(); while (line != null) { System.out.println(line);
		 * line = br.readLine(); } } catch (IOException e) {
		 * System.out.println("Error: " + e.getMessage()); } finally { try { if (br !=
		 * null) br.close(); if (fr != null) fr.close(); } catch (IOException e) {
		 * e.printStackTrace(); } }
		 */

		String path = "C:\\ws_eclipse\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		path = "C:\\ws_eclipse\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

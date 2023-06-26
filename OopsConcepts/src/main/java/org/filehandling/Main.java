package org.filehandling;

import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = null;
        try {
            // Read the data from file and initialize it to buffer reader
                br = new BufferedReader(new FileReader(new File("C:\\Users\\anunay.anand\\IdeaProjects\\Java\\OopsConcepts\\src\\main\\java\\org\\filehandling\\readFile.txt")));
            String line = null;

            // Read each line and validate
            while((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                // Now print all words
                for(String token: tokens) {
                    System.out.print(token.toLowerCase() + " ");
                }
            }
        } catch(FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            if(br != null) {
                br.close();
            }
        }
    }
}

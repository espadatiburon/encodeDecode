import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class FileEncryption
{
	public static void main(String [] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			PrintWriter fileOut;
			String line;
			char ch;
			String inputFile;
			String outputFile;
			int choice;
		
			System.out.print("Input file name(encode): ");
			inputFile = sc.nextLine();
		
			System.out.print("Output file name(encode): ");
			outputFile = sc.nextLine();
			
			File inputF = new File(inputFile);
			sc = new Scanner(inputF);
			fileOut = new PrintWriter(outputFile);
			
			while(sc.hasNextLine())
			{
				line  = sc.nextLine();
				for(int i = 0; i<line.length(); i++)
				{
					ch = line.charAt(i);
					fileOut.print(encryptLetter(ch));
				}
			}
			
			fileOut.close();
			
			sc = new Scanner(System.in);
			System.out.print("Input file name(decode): ");
			inputFile = sc.nextLine();
			
			System.out.print("Output file name(decode): ");
			outputFile = sc.nextLine();
			
			inputF = new File(inputFile);
			sc = new Scanner(inputF);
			fileOut = new PrintWriter(outputFile);
			
			while(sc.hasNextLine())
			{
				line  = sc.nextLine();
				for(int i = 0; i<line.length(); i++)
				{
					ch = line.charAt(i);
					fileOut.print(decodeLetter(ch));
				}
			}
			
			fileOut.close();
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("That file does not exist!");
		}
	}
	
	public static char encryptLetter(char ch)
	{
		char character = ch;
		switch(ch){
			case 'a':
			case 'A': character = (char)(ch + 10); break;
				
			case 'b':
			case 'B': character = (char)(ch + 12); break;
			
			case 'c':
			case 'C': character = (char)(ch + 4); break;
			
			case 'd':
			case 'D': character = (char)(ch - 1); break;
			
			case 'e':
			case 'E': character = (char)(ch - 4); break;
			
			case 'f':
			case 'F': character = (char)(ch - 2); break;
			
			case 'g':
			case 'G': character = (char)(ch + 12); break;
			
			case 'h':
			case 'H': character = (char)(ch + 16); break;
			
			case 'i':
			case 'I': character = (char)(ch - 7); break;
			
			case 'j':
			case 'J': character = (char)(ch + 12); break;
			
			case 'k':
			case 'K': character = (char)(ch - 5); break;
			
			case 'l':
			case 'L': character = (char)(ch - 4); break;
			
			case 'm':
			case 'M': character = (char)(ch - 3); break;
			
			case 'n':
			case 'N': character = (char)(ch + 6); break;
			
			case 'o':
			case 'O': character = (char)(ch - 6); break;
			
			case 'p':
			case 'P': character = (char)(ch + 5); break;
			
			case 'q':
			case 'Q': character = (char)(ch - 4); break;
			
			case 'r':
			case 'R': character = (char)(ch + 7); break;
			
			case 's':
			case 'S': character = (char)(ch - 7); break;
			
			case 't':
			case 'T': character = (char)(ch + 6); break;
			
			case 'u':
			case 'U': character = (char)(ch - 4); break;
			
			case 'v':
			case 'V': character = (char)(ch - 4); break;
			
			case 'w':
			case 'W': character = (char)(ch - 8); break;
			
			case 'x':
			case 'X': character = (char)(ch - 8); break;
			
			case 'y':
			case 'Y': character = (char)(ch - 2); break;
			
			case 'z':
			case 'Z': character = (char)(ch - 21); break;
		}
		
		return character;
	}
	
	public static char decodeLetter(char ch)
	{
		char character = ch;
		switch(ch){
			case 'a':
			case 'A': character = (char)(ch + 4); break;
				
			case 'b':
			case 'B': character = (char)(ch + 7); break;
			
			case 'c':
			case 'C': character = (char)(ch + 1); break;
			
			case 'd':
			case 'D': character = (char)(ch + 2); break;
			
			case 'e':
			case 'E': character = (char)(ch + 21); break;
			
			case 'f':
			case 'F': character = (char)(ch + 5); break;
			
			case 'g':
			case 'G': character = (char)(ch - 4); break;
			
			case 'h':
			case 'H': character = (char)(ch + 4); break;
			
			case 'i':
			case 'I': character = (char)(ch + 6); break;
			
			case 'j':
			case 'J': character = (char)(ch + 3); break;
			
			case 'k':
			case 'K': character = (char)(ch - 10); break;
			
			case 'l':
			case 'L': character = (char)(ch + 7); break;
			
			case 'm':
			case 'M': character = (char)(ch + 4); break;
			
			case 'n':
			case 'N': character = (char)(ch - 12); break;
			
			case 'o':
			case 'O': character = (char)(ch + 8); break;
			
			case 'p':
			case 'P': character = (char)(ch + 8); break;
			
			case 'q':
			case 'Q': character = (char)(ch + 4); break;
			
			case 'r':
			case 'R': character = (char)(ch + 4); break;
			
			case 's':
			case 'S': character = (char)(ch - 12); break;
			
			case 't':
			case 'T': character = (char)(ch - 6); break;
			
			case 'u':
			case 'U': character = (char)(ch - 5); break;
			
			case 'v':
			case 'V': character = (char)(ch - 12); break;
			
			case 'w':
			case 'W': character = (char)(ch + 2); break;
			
			case 'x':
			case 'X': character = (char)(ch - 16); break;
			
			case 'y':
			case 'Y': character = (char)(ch - 7); break;
			
			case 'z':
			case 'Z': character = (char)(ch - 6); break;
		}
		
		return character;
	}
}
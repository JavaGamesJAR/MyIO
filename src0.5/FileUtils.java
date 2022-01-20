package JGJAR.libraries.MyIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**<h1>FileUtils class</h1>
 * 
 * @author JavaGamesJAR
 * @version 0.1
 * @since 0.5
 * 
 */
public class FileUtils 
{
	//private FileUtils(){};
	/**
	 * Reads String from file
	 * @param file your file
	 * @return String from file
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static String read(File file) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String res = "";
		String st;
		while ((st = br.readLine()) != null)
		{
		  res+=st+"\n";
		}
		return res;
		
	}
	/**
	 * Reads String from file
	 * @param path path to your file
	 * @return String from file
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static String read(String path) throws IOException
	{
		return read(new File(path));
		
	}
	/**Clears file
	 * 
	 * @param file your file
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static void clear(File file) throws IOException
	{
		PrintWriter writer = new PrintWriter(file);
		writer.print("");
		writer.close();
		
	}
	/**Clears file
	 * 
	 * @param path path to your file
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static void clear(String path) throws IOException
	{
		clear(new File(path));
		
	}
	/**
	 * Writes String to File
	 * @param file your file
	 * @param text text you will see in file
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static void write(File file, String text) throws IOException
	{
		clear(file);
		BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath(), true));
	    writer.write(text);
	    
	    writer.close();
		
	}
	/**
	 * Writes String to File
	 * @param path path to your file
	 * @param text text you will see in file
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static void write(String path, String text) throws IOException
	{
		clear(path);
		BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
	    writer.write(text);
	    
	    writer.close();
	}
	/**Appends (adds to the bottom) String to the file
	 * 
	 * @param file your file
	 * @param text text which will appended
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static void append(File file, String text) throws IOException
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath(), true));
	    writer.append(' ');
	    writer.append("\n"+text);
	    writer.close();
		
	}
	/**Appends (adds to the bottom) String to the file
	 * 
	 * @param path path to your file
	 * @param text text which will appended
	 * @throws IOException
	 * @since 0.1 (MyIO 0.5)
	 */
	public static void append(String path, String text) throws IOException
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
	    writer.append(' ');
	    writer.append("\n"+text);
	    writer.close();
		
	}

}

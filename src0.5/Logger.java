package JGJAR.libraries.MyIO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class Logger 
{
	private static DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
	public Logger(boolean date, boolean systemdotout, DateTimeFormatter dtf, File f)
	{
		this.log = f;
		this.date = date;
		this.dtf = dtf;
		this.out = systemdotout;
		
	}
	public Logger(File f)
	{
		this(true, true, DEFAULT_FORMATTER, f);
		
	}
	boolean date;
	boolean out;
	DateTimeFormatter dtf;
	File log;
	
	public void log(String s)
	{
		if(date)
			s = "["+dtf.format(LocalDateTime.now())+"] "+s;
		if(out)
			System.out.println(s);
		try
		{
			FileUtils.append(log, s);
			
		}
		catch(IOException e){log(e);}
		
	}
	public void log(Exception exp)
	{
		String s = exp.toString();
		if(date)
			s = "["+dtf.format(LocalDateTime.now())+"] "+s;
		if(out)
			System.err.println(s);
		try
		{
			FileUtils.append(log, s);
			
		}
		catch(IOException e){log(e);}
			
		
	}

}

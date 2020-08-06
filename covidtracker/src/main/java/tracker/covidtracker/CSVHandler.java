package tracker.covidtracker;

import java.io.*;

public class CSVHandler 
{
	File file;
	FileInputStream fr;
	BufferedReader br;
	int year, month, day;
	String date;
	
	public CSVHandler(String path)
	{
		try
		{
			file = new File(path);
			fr = new FileInputStream(file);
			br = new BufferedReader(new InputStreamReader(fr));
			
			year = 2020;
			month = 8;
			day = 4;
			date = year + "-" + ((month > 9) ? "" : "0") + month + "-" + ((day > 9) ? "" : "0") + day;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public String getLine(int row)
	{
		String line = "";
		
		try
		{
			for(int i = 0; i <= row; i++)
			{
				line = br.readLine();
			}
			
			fr.getChannel().position(0);
			br = new BufferedReader(new InputStreamReader(fr));
			return line;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
	}
	
	public String getLine(CountryCode cc)
	{
		String[] header = getLine(0).split(", ");
		String attribute = "";
		String code = cc.toString();
		int i;
		
		if(cc == CountryCode.ZZZ)
		{
			code = " ";
		}
		
		for(i = 1; !header[0].equals(date) || !attribute.equals(code); i++)
		{
			header = getLine(i).split(",");
			attribute = header[1];
		}
		
		return getLine(--i);
	}
	
	public String getAttribute(int row, String category)
	{
		String[] header = getLine(0).split(", ");
		String attribute = "";
		int i;
		
		for(i = 0; !attribute.equals(category); i++)
		{
			attribute = header[i];
		}
		
		String line = getLine(row);
		header = line.split(",");
		attribute = header[--i];
		
		return attribute;
	}
	
	public String getAttribute(String line, String category)
	{
		String[] header = getLine(0).split(", ");
		String attribute = "";
		int i;
		
		for(i = 0; !attribute.equals(category); i++)
		{
			attribute = header[i];
		}
		
		header = line.split(",");
		attribute = header[--i];
		
		return attribute;
	}
	
	public String getAttribute(CountryCode cc, String category)
	{
		String[] header = getLine(0).split(", ");
		String code = cc.toString();
		String attribute = "";
		int i, j;
		
		if(cc == CountryCode.ZZZ)
		{
			code = " ";
		}
		
		for(i = 0; !attribute.equals(category); i++)
		{
			attribute = header[i];
		}
		
		attribute = "";
		
		for(j = 1; !attribute.equals(code) || !header[0].equals(date); j++)
		{
			header = getLine(j).split(",");
			attribute = header[1];
		}
		
		String line = getLine(--j);
		header = line.split(",");
		attribute = header[--i];
		
		return attribute;
	}
}

package tracker.covidtracker;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.EmbedType;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.MessageEmbed.Field;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.MessageAction;

public class MessageHandler 
{
	static String prefix = "!";
	
	public static void onMessage(MessageReceivedEvent event)
	{
		//Get message info
    	MessageChannel ch = event.getChannel();
        Message msg = event.getMessage();
        User author = event.getAuthor();
        String content = msg.getContentRaw();
        
        //Check if either the author is a bot or the message is not a command
        if(author.isBot() || !content.substring(0, 1).equals(prefix))
        {
        	return;
        }
        		
        //Dissect message info
        content = content.substring(1);
        String[] args = content.split(" ");
        String command = args[0];
        
        //Message info
        String regular = "";
        MessageAction send;
       
        //Embed info
        boolean embed = false;
        
        String url = null;
        String title = null;
        String description = null;
        EmbedType type = EmbedType.RICH;
        int color = 0xFF0000;
        MessageEmbed.Thumbnail thumbnail = null;
        MessageEmbed.Provider provider = null;
        MessageEmbed.AuthorInfo authorInfo = null;
        MessageEmbed.VideoInfo videoInfo = null;
        MessageEmbed.Footer footer = null;
        MessageEmbed.ImageInfo image = null;
        List<MessageEmbed.Field> fields = new ArrayList<>();
        
        //Interpret command
        if(command.equals("help"))
        {
        	embed = true;
        	title = "Help Menu";
        	description = "A list of all commands and their functions.";
        	
        	thumbnail = new MessageEmbed.Thumbnail("https://fathertheo.files.wordpress.com/2011/09/question-mark.png", null, 5, 5);
        	
        	if(args.length > 1)
        	{
        		if(args[1].equals("info"))
        		{
        			if(args.length == 3)
        			{
        				if(args[2].equals("-cc"))
        				{
        					title += " (info -cc)";
        					description = "A list of ALL country codes.";
        					Country[] c = Country.values();
        					CountryCode[] cc = CountryCode.values();
        					
        					for(int i = 0; i < cc.length; i++)
        					{
        						switch(cc[i])
        						{
        							case BQ:
        								fields.add(new MessageEmbed.Field("BQ", "Bonaire, Sint Eustatius and Saba", true));
        								break;
        							case CI:
        								fields.add(new MessageEmbed.Field("CI", "Cote d'Ivoire", true));
        								break;
        							case GW:
        								fields.add(new MessageEmbed.Field("GW", "Guinea-Bissau", true));
        								break;
        							case LA:
        								fields.add(new MessageEmbed.Field("LA", "Lao People's Democratic Republic", true));
        								break;
        							case TL:
        								fields.add(new MessageEmbed.Field("TL", "Timor-Leste", true));
        								break;
        							default:
        								fields.add(new MessageEmbed.Field(cc[i].toString(), c[i].toString().replaceAll("_", " "), true));	
        						}
        						
        						if(i % 25 == 0 && i != 0)
        						{
        							MessageEmbed m = new MessageEmbed(	url,
    										title,
    										description,
    										type, //?
    										OffsetDateTime.now(),
    										color,
    										thumbnail, provider, authorInfo, videoInfo, footer, image,
    										fields
    									);
        							send = ch.sendMessage(m);
        							send.queue();
        							fields.clear();
        						}
        					}
        				}
        				else
        				{
        					embed = false;
        					regular = author.getAsMention() + ": \"" + args[2] + "\" is invalid. Type \"!help info\".";
        				}
        			}
        			else
        			{
        				title += " (info)";
        				description = "Arguments for: !info ([args])";
        				fields.add(new MessageEmbed.Field("NONE", "If no arguments are provided, world statistics are shown.", false));
        				fields.add(new MessageEmbed.Field("-cc [CODE]", "A specified country is displayed using their Country Code (e.g. !info -cc US). Type \"!help info -cc\" for a list of ALL country codes.", false));
        			}
        		}
        		else 
        		{
        			embed = false;
					regular = author.getAsMention() + ": \"" + args[1] + "\" is invalid. Type \"!help info\"";
        		}
        	}
        	else
        	{
        		fields.add(new MessageEmbed.Field("!help ([args])", "Displays this help page. Append a command to learn more about it (e.g. !help info).", false));
            	fields.add(new MessageEmbed.Field("!info ([args])", "Displays information for COVID-19 with optional arguments for more detailed info (planned). Type \"!help info\" for more.", false));
        	}
        	
        }
        else if(command.equals("info"))
        {
        	ch.sendMessage("Processing your request...").queue();
        	
        	embed = true;
        	String date = "2020-08-04";
        	
        	if(args.length > 1)
        	{
        		if(args[1].equals("-cc"))
        		{
        			if(args.length != 3)
        			{
        				embed = false;
        				regular = author.getAsMention() + ": \"!" + content + "\" has too many arguments. Type \"!help info -cc\"";
        			}
        			else
        			{
        				try
        				{
        					CountryCode cc = CountryCode.valueOf(args[2]);
        					CSVHandler f = new CSVHandler("./WHO-COVID-19-global-data.csv");
        					String info = f.getLine(cc);
        	        		String country = f.getAttribute(info, "Country");
        					
        					title = "COVID-19 " + country + " Information";
        	        		description = "General stats for COVID-19 in " + country + ".";
        	        		
        	        		fields.add(new MessageEmbed.Field(country + " New Cases: ", f.getAttribute(info, "New_cases"), true));
        	        		fields.add(new MessageEmbed.Field(country + " Total Cases: ", f.getAttribute(info, "Cumulative_cases"), true));
        	        		fields.add(new MessageEmbed.Field(country + " New Deaths: ", f.getAttribute(info, "New_deaths"), true));
        	        		fields.add(new MessageEmbed.Field(country + " Total Deaths: ", f.getAttribute(info, "Cumulative_deaths"), true));
        				}
        				catch(Exception e)
            			{
            				embed = false;
            				regular = author.getAsMention() + ": " + args[2] + " is an invalid country code. Type \"!help info -cc\"";
            			}
        			}
        		}
        		else
        		{
        			embed = false;
    				regular = author.getAsMention() + ": " + args[1] + " is an invalid flag. Type \"!help info\".";
        		}
        	}
        	else
        	{
        		title = "COVID-19 Information";
        		description = "General stats for COVID-19 worldwide.";
        	
        		/*CSVHandler f = new CSVHandler("./WHO-COVID-19-global-data.csv");
        		int total = 0;
        		
        		for(CountryCode cc : CountryCode.values())
        		{
        			String line = f.getLine(cc);
        			line = f.getAttribute(line, "Cumulative_cases");
        			total += Integer.parseInt(line);
        			System.out.println("Total: " + total);
        		}*/
        		
        		fields.add(new MessageEmbed.Field("TO BE IMPLEMENTED", "", true));
        	}
        	
    		thumbnail = new MessageEmbed.Thumbnail("http://www.muralswallpaper.co.uk/app/uploads/political-map-plain.jpg", null, 323, 214);
    		footer = new MessageEmbed.Footer("Data taken from the WHO. Last Updated: " + date + ".", null, null);
        }
        else
        {
        	regular = author.getAsMention() + ": \"!" + command + "\" is an invalid command.";
        }
        
        if(embed)
        {
        	MessageEmbed m = new MessageEmbed(	url,
        										title,
        										description,
        										type, //?
        										OffsetDateTime.now(),
        										color,
        										thumbnail, provider, authorInfo, videoInfo, footer, image,
        										fields
        									);
        	send = ch.sendMessage(m);
        }
        else
        {
        	send = ch.sendMessage(regular);
        }
        
        send.queue();
	}
}

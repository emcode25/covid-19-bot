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
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.MessageAction;

public class Bot extends ListenerAdapter
{
	public static void main(String[] args) throws LoginException
    {
    	String token = "NzM3NzY1MDUwMTkzODA1MzM0.XyCHPg.tmlcsFXdSZROy_2xA48Afz6nCec";
        
    	JDABuilder.createLight(token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
        	.addEventListeners(new Bot())
        	.setActivity(Activity.playing("Type !ping"))
        	.build();
    }
    
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
    	MessageHandler.onMessage(event);
    }
}







/*if(msg.getContentRaw().equals("!ping"))
{
	MessageChannel channel = event.getChannel();
	long time = System.currentTimeMillis();
	channel.sendMessage("Pong!")
		.queue(response -> 
		{
			response.editMessageFormat("Pong: %d ms", System.currentTimeMillis()- time).queue();
		});
}*/

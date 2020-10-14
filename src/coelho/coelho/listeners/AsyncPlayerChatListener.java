package coelho.coelho.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import coelho.coelho.AutomaticHelp;

public class AsyncPlayerChatListener implements Listener {
	
	@EventHandler
	public void listener(AsyncPlayerChatEvent event) {
		for (String string : AutomaticHelp.getAutomaticHelp().getConfig().getConfigurationSection("Questions").getKeys(false)) {
			String question = AutomaticHelp.getAutomaticHelp().getConfig().getString("Questions." + string + ".Question").replace("&", "§");
			String answer = AutomaticHelp.getAutomaticHelp().getConfig().getString("Questions." + string + ".Answer").replace("&", "§");
			String message = AutomaticHelp.getAutomaticHelp().getConfig().getString("Messages.Answer").replace("&", "§").replace("@answer", answer);
			
			if (event.getMessage().equals(question)) {
				event.setCancelled(true);
				event.setCancelled(true);
				
				event.getPlayer().sendMessage(message);
			}
		}
	}
}
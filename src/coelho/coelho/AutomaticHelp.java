package coelho.coelho;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import coelho.coelho.listeners.AsyncPlayerChatListener;

public class AutomaticHelp extends JavaPlugin {
	
	public void onEnable() {
		saveDefaultConfig();
		
		Commands();
		Listeners();
		Messages();
	}
	
	private void Messages() {
		getServer().getConsoleSender().sendMessage("");
		getServer().getConsoleSender().sendMessage("§a[AutomaticHelp] §fPlugin habilited");
		getServer().getConsoleSender().sendMessage("§a[AutomaticHelp] §fAuthor §a" + getDescription().getAuthors().get(0));
		getServer().getConsoleSender().sendMessage("§a[AutomaticHelp] §fVersion §a" + getDescription().getVersion());
		getServer().getConsoleSender().sendMessage("");
	}

	private void Listeners() {
		Bukkit.getPluginManager().registerEvents(new AsyncPlayerChatListener(), this);
	}

	private void Commands() {
	}

	public void onDisable() {
		
	}
	
	public static AutomaticHelp getAutomaticHelp() {
		return getPlugin(AutomaticHelp.class);
	}
}
package com.github.professorSam.main;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.professorSam.commands.DiscordCommand;
import com.github.professorSam.commands.LiveCommand;
import com.github.professorSam.listener.ScoreboardCreator;

public class Main extends JavaPlugin{
	
	public static String prefix = "§7[§einfo§7] ";
	
	@Override
	public void onEnable() {
		this.getCommand("discord").setExecutor(new DiscordCommand());
		this.getCommand("live").setExecutor(new LiveCommand());
		
		getServer().getPluginManager().registerEvents(new ScoreboardCreator(), this);

		
	}
}

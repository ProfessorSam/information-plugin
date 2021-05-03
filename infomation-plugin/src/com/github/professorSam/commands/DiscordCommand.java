package com.github.professorSam.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.professorSam.main.Main;

public class DiscordCommand implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage(" ");
			player.sendMessage(Main.prefix + "§7Du möchtest unseren §9Discord §7beitreten? Gerne! Gehe einfach auf folgenden Link: §9https://discord.gg/pd74XNxH7n");
			player.sendMessage(" ");
		}
		return true;
	}

}

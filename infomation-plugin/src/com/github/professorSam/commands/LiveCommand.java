package com.github.professorSam.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.professorSam.main.Main;

public class LiveCommand implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage(" ");
			player.sendMessage(Main.prefix + "§7Du möchtest §cGamedipro §7und §cProxxiten §7live sehen? Gerne!");
			player.sendMessage(Main.prefix + "§cGamedipro §f- §9Twitch§7: https://twitch.tv/Gamedipro");
			player.sendMessage(Main.prefix + "§cProxxiten §f- §4You§fTube§7: https://youtube.com/poxxiten");
			player.sendMessage(" ");
			
		}
		return false;
	}

}

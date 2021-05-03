package com.github.professorSam.listener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class ScoreboardCreator implements Listener{
	@EventHandler
	public void join(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		
		//spoawn fix
		
		Location loc = new Location(Bukkit.getWorld("world"), -30.5, 62, 55.5, -180, -5);
		player.teleport(loc);
		
	}
	
}

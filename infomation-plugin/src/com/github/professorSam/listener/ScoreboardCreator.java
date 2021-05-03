package com.github.professorSam.listener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Scoreboard;



public class ScoreboardCreator implements Listener{
	@EventHandler
	public void join(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		
		Objective objective = board.registerNewObjective("lol", "dummy");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplayName("§l§eLobby");
		
		Score leer1 = objective.getScore(" ");
		leer1.setScore(6);
				
		
		Score hilfe = objective.getScore("§d§o/hilfe");
		hilfe.setScore(5);
		
		Score discord = objective.getScore("§9§o/discord");
		discord.setScore(4);
		
		Score live = objective.getScore("§c§o/live");
		live.setScore(3);
		
		Score leer2 = objective.getScore(" ");
		leer2.setScore(2);
		
		Score footer = objective.getScore("§f§l§oGamediPoxx.net");
		footer.setScore(1);
		
		
		
		player.setScoreboard(board);
		
		//spoawn fix
		
		Location loc = new Location(Bukkit.getWorld("world"), 32.5, 61.5, 153.5, 0, 0);
		player.teleport(loc);
		
	}
	
}

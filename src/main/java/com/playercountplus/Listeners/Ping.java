package com.connorlinfoot.customplayercount.Listeners;

import com.connorlinfoot.customplayercount.CustomPlayerCount;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Ping implements Listener {

    @EventHandler
    public void onPing(ServerListPingEvent event) {
        event.setMaxPlayers(new PlayerCountPlus().config.getInt("max-players"));
        

}}

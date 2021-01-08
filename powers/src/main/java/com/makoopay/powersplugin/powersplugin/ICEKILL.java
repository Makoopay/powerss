package com.makoopay.powersplugin.powersplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ICEKILL implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerUse(PlayerDeathEvent event) {
        Player p = event.getEntity();
        if (p.isDead()) {
            Player pk = p.getKiller();
            pk.sendMessage(ChatColor.DARK_RED + "You have killed " + ChatColor.RED + p.getName());
        }
    }
}

package com.makoopay.powersplugin.powersplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class HANDEVENT implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase("Choose Your Team")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null){
                return;
            }else if (e.getCurrentItem().getType().equals(Material.ICE)){
                p.sendMessage(ChatColor.AQUA + "YOU ARE NOW IN THE ICE TEAM");
                p.setDisplayName(ChatColor.AQUA + "[ICE]" + ChatColor.AQUA +p.getName());
                p.setPlayerListName(ChatColor.AQUA + "[ICE]" + ChatColor.AQUA +p.getName());
                p.closeInventory();
            }else if (e.getCurrentItem().getType().equals(Material.LAVA_BUCKET)){
                p.sendMessage(ChatColor.RED + "YOU ARE NOW IN THE FIRE TEAM");
                p.setDisplayName(ChatColor.RED + "[FIRE]" + ChatColor.RED + p.getName());
                p.setPlayerListName(ChatColor.RED + "[FIRE]" + ChatColor.RED +p.getName());
                p.closeInventory();
            }
            else if (e.getCurrentItem().getType().equals(Material.GRAY_STAINED_GLASS_PANE)){
                return;
            }
        }
    }
}

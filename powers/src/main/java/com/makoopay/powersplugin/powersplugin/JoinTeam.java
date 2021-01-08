package com.makoopay.powersplugin.powersplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinTeam implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory gui = Bukkit.createInventory(p,9,"Choose Your Team" );
            ItemStack item1 = new ItemStack(Material.ICE, 1);
            ItemMeta item1_meta = item1.getItemMeta();
            item1_meta.setDisplayName(ChatColor.AQUA + "ICETEAM");
            item1.setItemMeta(item1_meta);
            ItemStack item2 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            ItemMeta item2_meta = item2.getItemMeta();
            item2_meta.setDisplayName("BLANK1");
            item2.setItemMeta(item2_meta);
            ItemStack item3 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            ItemMeta item3_meta = item3.getItemMeta();
            item3_meta.setDisplayName("BLANK2");
            item3.setItemMeta(item3_meta);
            ItemStack item4 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            ItemMeta item4_meta = item4.getItemMeta();
            item4_meta.setDisplayName("BLANK3");
            item4.setItemMeta(item4_meta);
            ItemStack item5 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            ItemMeta item5_meta = item5.getItemMeta();
            item5_meta.setDisplayName("BLANK4");
            item5.setItemMeta(item5_meta);
            ItemStack item6 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            ItemMeta item6_meta = item6.getItemMeta();
            item6_meta.setDisplayName("BLANK");
            item6.setItemMeta(item6_meta);
            ItemStack item7 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            ItemMeta item7_meta = item7.getItemMeta();
            item7_meta.setDisplayName("BLANK5");
            item7.setItemMeta(item7_meta);
            ItemStack item8 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            ItemMeta item8_meta = item8.getItemMeta();
            item8_meta.setDisplayName("BLANK6");
            item8.setItemMeta(item8_meta);
            ItemStack item9 = new ItemStack(Material.LAVA_BUCKET, 1);
            ItemMeta item9_meta = item9.getItemMeta();
            item9_meta.setDisplayName(ChatColor.RED + "FIRE");
            item9.setItemMeta(item9_meta);


            gui.addItem(item1);
            gui.addItem(item2);
            gui.addItem(item3);
            gui.addItem(item4);
            gui.addItem(item5);
            gui.addItem(item6);
            gui.addItem(item7);
            gui.addItem(item8);
            gui.addItem(item9);
            p.openInventory(gui);
        }
        return true;
    }

}
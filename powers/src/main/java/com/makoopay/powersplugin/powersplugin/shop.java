package com.makoopay.powersplugin.powersplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class shop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory gui = Bukkit.createInventory(p,13,"Shop" );
            ItemStack item1 = new ItemStack(Material.STONE, 1);
            ItemMeta item1_meta = item1.getItemMeta();
            item1_meta.setDisplayName("1$");
            item1.setItemMeta(item1_meta);
            ItemStack item2 = new ItemStack(Material.COAL_ORE, 1);
            ItemMeta item2_meta = item2.getItemMeta();
            item2_meta.setDisplayName("3$");
            item2.setItemMeta(item2_meta);
            ItemStack item3 = new ItemStack(Material.IRON_ORE, 1);
            ItemMeta item3_meta = item3.getItemMeta();
            item3_meta.setDisplayName("10$");
            item3.setItemMeta(item3_meta);
            ItemStack item4 = new ItemStack(Material.GOLD_ORE, 1);
            ItemMeta item4_meta = item4.getItemMeta();
            item4_meta.setDisplayName("15&");
            item4.setItemMeta(item4_meta);
            ItemStack item5 = new ItemStack(Material.DIAMOND_ORE, 1);
            ItemMeta item5_meta = item5.getItemMeta();
            item5_meta.setDisplayName("30&");
            item5.setItemMeta(item5_meta);
            ItemStack item6 = new ItemStack(Material.REDSTONE_ORE, 1);
            ItemMeta item6_meta = item6.getItemMeta();
            item6_meta.setDisplayName("18&");
            item6.setItemMeta(item6_meta);
            ItemStack item7 = new ItemStack(Material.LAPIS_ORE, 1);
            ItemMeta item7_meta = item7.getItemMeta();
            item7_meta.setDisplayName("23&");
            item7.setItemMeta(item7_meta);
            ItemStack item8 = new ItemStack(Material.COAL, 1);
            ItemMeta item8_meta = item8.getItemMeta();
            item8_meta.setDisplayName("5$");
            item8.setItemMeta(item8_meta);
            ItemStack item9 = new ItemStack(Material.IRON_INGOT, 1);
            ItemMeta item9_meta = item9.getItemMeta();
            item9_meta.setDisplayName( "20&");
            item9.setItemMeta(item9_meta);
            ItemStack item10 = new ItemStack(Material.GOLD_INGOT, 1);
            ItemMeta item10_meta = item10.getItemMeta();
            item10_meta.setDisplayName("30&");
            item10.setItemMeta(item10_meta);
            ItemStack item11 = new ItemStack(Material.DIAMOND, 1);
            ItemMeta item11_meta = item11.getItemMeta();
            item11_meta.setDisplayName("50&");
            item11.setItemMeta(item11_meta);
            ItemStack item12 = new ItemStack(Material.REDSTONE, 1);
            ItemMeta item12_meta = item12.getItemMeta();
            item12_meta.setDisplayName("20&");
            item12.setItemMeta(item10_meta);
            ItemStack item13 = new ItemStack(Material.LAPIS_LAZULI, 1);
            ItemMeta item13_meta = item13.getItemMeta();
            item13_meta.setDisplayName("25&");
            item13.setItemMeta(item13_meta);




            gui.addItem(item1);
            gui.addItem(item2);
            gui.addItem(item3);
            gui.addItem(item4);
            gui.addItem(item5);
            gui.addItem(item6);
            gui.addItem(item7);
            gui.addItem(item8);
            gui.addItem(item9);
            gui.addItem(item10);
            gui.addItem(item11);
            gui.addItem(item12);
            gui.addItem(item13);
            p.openInventory(gui);
        }
        return true;
    }

}
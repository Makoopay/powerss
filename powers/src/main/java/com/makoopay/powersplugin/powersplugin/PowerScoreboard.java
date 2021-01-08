package com.makoopay.powersplugin.powersplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.HashMap;
import java.util.UUID;

public class PowerScoreboard implements Listener {

    private final HashMap<UUID, Integer> points = new HashMap<>();

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();


        // add the player to the hashmap if missing
        points.putIfAbsent(event.getPlayer().getUniqueId(), 0);

        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();

        Objective objective = scoreboard.registerNewObjective("FiceMC", "Money Counter");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "§f§l   FiceDollars   §f");

        Team team = scoreboard.registerNewTeam("point_counter");

        team.addEntry(ChatColor.WHITE.toString());

        team.setPrefix(ChatColor.RED + "Dollars: " + ChatColor.WHITE);

        team.setSuffix(String.valueOf(points.get(event.getPlayer().getUniqueId())));

        objective.getScore(ChatColor.WHITE.toString()).setScore(1);

        player.setScoreboard(scoreboard);
    }


    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerUse(PlayerDeathEvent event) {
        Player p = event.getEntity();
        if (p.isDead()) {
            Player pk = p.getKiller();
            if (pk instanceof Player) {

                pk.sendMessage(ChatColor.GREEN + " +1 Dollar ");

                pk.spawnParticle(Particle.LAVA, pk.getLocation(), 10);

                Scoreboard scoreboard = pk.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        pk.getUniqueId(),
                        points.get(pk.getUniqueId()) + 1

                );


                team.setSuffix(String.valueOf(points.get(pk.getUniqueId())));


            }
        }

    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase("Choose Your Team")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType().equals(Material.STONE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 1

                );
                team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.COAL_ORE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 3

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.IRON_ORE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 10

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.GOLD_ORE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 15

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.DIAMOND_ORE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 30

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.REDSTONE_ORE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 18

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.LAPIS_ORE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 23

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.COAL)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 5

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));

                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.IRON_INGOT)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 20

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.GOLD_INGOT)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 30

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.DIAMOND)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 50

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.REDSTONE)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 20

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
            if (e.getCurrentItem().getType().equals(Material.LAPIS_LAZULI)) {

                Scoreboard scoreboard = p.getScoreboard();

                Team team = scoreboard.getTeam("point_counter");

                points.put(
                        p.getUniqueId(),
                        points.get(p.getUniqueId()) - 25

                );team.setSuffix(String.valueOf(points.get(p.getUniqueId())));
                if(
                        points.get(p.getUniqueId()).equals(0)){
                    p.sendMessage(ChatColor.RED + "YOU DONT HAVE ENOUGH MONEY");
                    return;
                }
            }
        }
    }
}
package com.makoopay.powersplugin.powersplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PowersPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PowerScoreboard(), this);
        this.getCommand("ChooseTeam").setExecutor(new JoinTeam());
        this.getCommand("Shop").setExecutor(new shop());
        Bukkit.getPluginManager().registerEvents(new ICEKILL(), this);
        Bukkit.getPluginManager().registerEvents(new HANDEVENT(), this);

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package me.branbran;

import org.bukkit.plugin.java.JavaPlugin;

import me.branbran.branbits.GUIListener;

public class BranBits extends JavaPlugin {    
    @Override
    public void onEnable() {
        getLogger().info("Starting BranBits!");

        // Set listeners
        new GUIListener(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling BranBits!");
    }
}

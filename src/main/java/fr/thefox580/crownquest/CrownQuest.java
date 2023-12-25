package fr.thefox580.crownquest;

import fr.thefox580.crownquest.listeners.onNoxesiumJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrownQuest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Loading Custom Crown Quest Plugin - Version 1.0");
        getServer().getPluginManager().registerEvents(new onNoxesiumJoinEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package io.github.LGCMcLovin.MSDropParty;


import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Allen on 8/30/2014.
 */
public class MSDropParty extends JavaPlugin {
    public static Plugin plugin;
    public static Plugin getPlugin() {return plugin; }
    @Override
    public void onLoad(){
        plugin = this;
        this.getCommand("MSDP").setExecutor(new Commander());
    }
}

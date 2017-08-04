package me.masonic.mc;

import me.masonic.mc.Customize.AirStrike;
import me.masonic.mc.Customize.BlackPrison;
import me.masonic.mc.Customize.Changable;
import me.masonic.mc.Customize.Knock;
import me.masonic.mc.Function.Menu;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Mason Project
 * 2017-6-21-0021
 */
public class Core extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("sss").setExecutor(new AirStrike(this));
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    private void registerEvents() {


        getServer().getPluginManager().registerEvents(new Changable(), this);
        getServer().getPluginManager().registerEvents(new BlackPrison(), this);
        getServer().getPluginManager().registerEvents(new Knock(), this);
    }


    public static void main(String[] args) {

    }
}

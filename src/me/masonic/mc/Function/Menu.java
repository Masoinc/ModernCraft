package me.masonic.mc.Function;

import me.masonic.mc.Utility.Utility;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

/**
 * Mason Project
 * 2017-6-17-0017
 */
public class Menu implements Listener {
    @EventHandler
    void onSneak(PlayerToggleSneakEvent e) {
        if (!e.isSneaking()) {
            if (e.getPlayer().getLocation().getPitch() == -90) {
                Utility.runOp(e.getPlayer(), "bs mxwcore");
            }
        }

    }

    @EventHandler
    void onCommand(PlayerCommandPreprocessEvent e) {
        if (e.getMessage().equals("/help")) {
            e.setCancelled(true);
            Utility.runOp(e.getPlayer(),"bs mxwcore");
        }
    }

}

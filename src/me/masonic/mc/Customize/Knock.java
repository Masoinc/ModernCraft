package me.masonic.mc.Customize;

import me.DeeCaaD.CrackShotPlus.PlayerInteract;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Mason Project
 * 2017-7-12-0012
 */
public class Knock implements Listener {

    @EventHandler
    private void onClick(PlayerInteractEntityEvent e) {
        if (e.getPlayer().getName().equalsIgnoreCase("Sasuke_") &&
                e.getRightClicked() instanceof Player &&
                e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("萨格拉斯之眼")
                ) {
            Player p = e.getPlayer();
            Player v = (Player)e.getRightClicked();
            v.setVelocity(p.getLocation().getDirection().setY(100));
        }
    }


    @EventHandler
    private void onLeftClick(PlayerInteractEvent e) {
        if (e.getPlayer().getName().equalsIgnoreCase("Sasuke_") &&
                e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("萨格拉斯之眼") &&
                e.getAction().equals(Action.LEFT_CLICK_AIR)
                ) {
            Location loc = e.getPlayer().getLocation();
            for (Player v:Bukkit.getOnlinePlayers()) {
                if (v.getLocation().getWorld().equals(loc.getWorld()) && v.getLocation().distanceSquared(loc) < 900) {
                    v.teleport(loc);
                }
            }
        }
    }
}

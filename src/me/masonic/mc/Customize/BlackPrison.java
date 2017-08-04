package me.masonic.mc.Customize;

import net.aufdemrand.denizen.utilities.blocks.FakeBlock;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.Arrays;
import java.util.List;

/**
 * Mason Project
 * 2017-7-8-0008
 */
public class BlackPrison implements Listener {
    @EventHandler
    private void onClick(PlayerInteractEntityEvent e) {
        if (e.getPlayer().getName().equals("Masonic") || e.getPlayer().getName().equalsIgnoreCase("Angelonely") && e.getRightClicked() instanceof Player) {
            Player p = e.getPlayer();
            Player t = (Player) e.getRightClicked();
            if (p.getInventory().getItemInMainHand().getType() == Material.SKULL_ITEM &&
                    p.getInventory().getItemInMainHand().getDurability() == 3 &&
                    p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("")) {
                Location sLoc = t.getLocation();
                List<Location> bLoc = Arrays.asList(
                        //上
                        sLoc.add(0, -1, 0),
                        sLoc.add(0, -2, 0),

                        //下
                        sLoc.add(0, 1, 0),
                        sLoc.add(0, 2, 0),

                        //前后左右
                        sLoc.add(1, 0, 0),
                        sLoc.add(2, 0, 0),

                        sLoc.add(0, 0, 1),
                        sLoc.add(0, 0, 2),

                        sLoc.add(-1, 0, 0),
                        sLoc.add(-2, 0, 0),

                        sLoc.add(0, 0, -1),
                        sLoc.add(0, 0, -2),

                        //对角线
                        sLoc.add(1, -1, 1),
                        sLoc.add(-1, -1, 1),
                        sLoc.add(1, -1, -1),
                        sLoc.add(-1, -1, -1),

                        sLoc.add(1, 1, 1),
                        sLoc.add(-1, 1, 1),
                        sLoc.add(1, 1, -1),
                        sLoc.add(-1, 1, -1));

            }
        }
    }

}

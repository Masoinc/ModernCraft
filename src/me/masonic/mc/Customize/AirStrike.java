package me.masonic.mc.Customize;

import me.DeeCaaD.CrackShotPlus.API;
import me.masonic.mc.Core;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

/**
 * Mason Project
 * 2017-6-22-0022
 */
public class AirStrike implements CommandExecutor {

    private final Core plugin;

    public AirStrike(Core plugin) {
        this.plugin = plugin;
    }

    private void callAirStrike(Player target, Player executer) {
        API.getCSMinion().callAirstrike(target, "Asa_AirStrike", executer);

        BukkitTask task = new BukkitRunnable() {
            @Override
            public void run() {
                for (Player p2 : Bukkit.getOnlinePlayers()) {
                    p2.sendMessage("§8[ §6ModernXraft §8] §c" + executer.getName() + " §7使用了 §6战术导弹轰炸 §c☠ §6" + target.getName());
                    if (!target.getName().equalsIgnoreCase("Sasuke_") && !target.getName().equalsIgnoreCase("Masonic") ) {
                        target.setHealth(0);
                    }
                }
            }
        }.runTaskLater(this.plugin, 100);

    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            if (p.getName().equalsIgnoreCase("asawswse11") || p.getName().equalsIgnoreCase("Masonic")) {
                if (args.length != 1) {
                    p.sendMessage("§8[ §6ModernXraft §8] §6/sss &8[受害者id]");
                    return true;
                }
                callAirStrike(Bukkit.getPlayer(args[0]), p);
            }
        }
        return true;
    }
}


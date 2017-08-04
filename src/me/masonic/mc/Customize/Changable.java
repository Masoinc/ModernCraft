package me.masonic.mc.Customize;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Mason Project
 * 2017-6-21-0021
 */
public class Changable implements Listener {

    private static final HashMap<String, String> SKILLMAP = new HashMap<>();

    static {
        SKILLMAP.put("A", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§9§r§6Blink§0§9§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("B", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§9§r§6烈焰锋斩§0§9§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("C", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§9§r§6Ice Spikes§0§9§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("D", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§9§r§6Amaterasu§0§9§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("E", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§9§r§6Nero Beam§0§9§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("F", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§8§r§6放箭§0§8§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("G", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§8§r§6Wither Skull§0§8§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("H", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§8§r§6集束炎爆§0§8§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");
        SKILLMAP.put("I", "§7§0§6§r§7◇ 右键§0§6§r§7: §6§0§7§r§6雷击§0§7§r§6 §7[§8§1§2§r§80.0§1§2§r§8秒§7]");


    }

    private ItemStack getChangeItemI(String type) {
        ItemStack CMA1 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta CMA1Meta = CMA1.getItemMeta();
        CMA1Meta.setDisplayName("§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵" + " " + type);
        List<String> CMA1L = Arrays.asList(
                "§6▽ 无限耐久",
                "§7品质 §7: §c圣物",
                "",
                "§7§0§1§r§7○ 近战攻击§0§1§r§7: §0§2§r§a3600.0 §7- §a4800.0§0§2§r§7",
                "§7§0§1§r§7○ 暴击§0§1§r§7: §0§2§r§a50.0%§0§2§r§7",
                "§7§0§1§r§7○ 暴击加成§0§1§r§7: §0§2§r§a2.0§7x§0§2§r§7",
                "",
                SKILLMAP.get(type),
                "",
                "§7▽ §0§3§r§7§3阴影潜行 X§0§3§r§7§7 [§8被动§7]",
                "§7▽ §0§3§r§7§c火焰抗性 X§0§3§r§7§7 [§8被动§7]",
                "§7▽ §5§0§4§r§5Dark Impact V§0§4§r§5 §7[§8§0§5§r§7100.0§0§5§r§7%§8触发§7]",
                "",
                "§7▽ §cInstantKill§8[100%]",
                "",
                "§7武器介绍",
                "§8“末日骑士”象征着神秘与终结",
                "",
                "§8◇ §7Shift+右键: §6切换形态",
                "",
                "§6✵ §8>>>§6 _Beginner §8[灵魂绑定]",
                "",
                "§8[ModernXraft] FullyCustomized#1"
        );
        CMA1Meta.setLore(CMA1L);
        CMA1Meta.spigot().setUnbreakable(true);
        CMA1Meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        CMA1Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        CMA1Meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 50, true);
        CMA1Meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        CMA1.setItemMeta(CMA1Meta);
        return CMA1;
    }

    private ItemStack getChangeItemII(String type) {
        ItemStack CMA1 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta CMA1Meta = CMA1.getItemMeta();
        CMA1Meta.setDisplayName("§d米奈希尔之力 §8✵" + " " + type);
        List<String> CMA1L = Arrays.asList(
                "§6▽ 无限耐久",
                "§7○ 品级: §d卓越",
                "",
                "§7§0§1§r§7○ 近战攻击§0§1§r§7: §0§2§r§a2333.0§0§2§r§7",
                "§7§0§1§r§7○ 暴击§0§1§r§7: §0§2§r§a100.0%§0§2§r§7",
                "§7§0§1§r§7○ 暴击加成§0§1§r§7: §0§2§r§a2.5§7x§0§2§r§7",
                "",
                SKILLMAP.get(type),
                "",
                "§7▽ 下蹲加右键可进行变形九种主动技能]",
                "§7",
                "§6✵ §8>>>§6 Sasuke_ §8[灵魂绑定]",
                "§8[ModernXraft] weapon"
        );
        CMA1Meta.setLore(CMA1L);
        CMA1Meta.spigot().setUnbreakable(true);
        CMA1Meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        CMA1Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        CMA1Meta.addEnchant(Enchantment.KNOCKBACK, 10, true);
        CMA1.setItemMeta(CMA1Meta);
        return CMA1;
    }

    @EventHandler
    private void onInteract(PlayerInteractEvent e) {
        if (e.getPlayer().isSneaking() &&
                e.getPlayer().getInventory().getItemInMainHand().hasItemMeta() &&
                e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasDisplayName()) {
            if ((e.getPlayer().getName().equalsIgnoreCase("_Beginner"))) {
                switch (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName()) {
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ A":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("B"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6烈焰锋斩");
                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ B":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("C"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6冰锥");
                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ C":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("D"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6炼狱黑火");

                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ D":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("E"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6末影圆环");
                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ E":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("F"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6放箭");
                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ F":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("G"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6凋零骷髅");
                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ G":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("H"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6集束炎爆");
                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ H":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("I"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6雷击");
                        return;
                    case "§7[§c末日骑士§7] §6死亡鸣奏曲 §8✵ I":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemI("A"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6闪现");
                }
            } else if ((e.getPlayer().getName().equalsIgnoreCase("Sasuke_")) || e.getPlayer().getName().equalsIgnoreCase("Masonic")){

                switch (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName()) {
                    case "§d米奈希尔之力 §8✵ A":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("B"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6烈焰锋斩");
                        return;
                    case "§d米奈希尔之力 §8✵ B":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("C"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6冰锥");
                        return;
                    case "§d米奈希尔之力 §8✵ C":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("D"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6炼狱黑火");

                        return;
                    case "§d米奈希尔之力 §8✵ D":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("E"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6末影圆环");
                        return;
                    case "§d米奈希尔之力 §8✵ E":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("F"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6放箭");
                        return;
                    case "§d米奈希尔之力 §8✵ F":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("G"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6凋零骷髅");
                        return;
                    case "§d米奈希尔之力 §8✵ G":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("H"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6集束炎爆");
                        return;
                    case "§d米奈希尔之力 §8✵ H":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("I"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6雷击");
                        return;
                    case "§d米奈希尔之力 §8✵ I":
                        e.getPlayer().getInventory().setItemInMainHand(getChangeItemII("A"));
                        e.getPlayer().sendMessage("§8[ §6ModernXraft §8] §7主动技能已切换至 §6闪现");
                }
            }
        }
    }
}

package net.nuggetmc.tplus.bot.agent.legacyagent;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class LegacyItems {
    public static final Material SHOVEL = Material.IRON_SHOVEL;
    public static final Material AXE = Material.IRON_AXE;
    public static final Material PICKAXE = Material.IRON_PICKAXE;
    public static ItemStack HEALTH_POTION;
    static {
        HEALTH_POTION = new ItemStack(Material.SPLASH_POTION);
        PotionMeta potionMeta = (PotionMeta) HEALTH_POTION.getItemMeta();
        potionMeta.setBasePotionData(new PotionData(PotionType.INSTANT_HEAL));
        HEALTH_POTION.setItemMeta(potionMeta);
    }
}

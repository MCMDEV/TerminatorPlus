package net.nuggetmc.ai.bot.agent;

import net.nuggetmc.ai.PlayerAI;
import net.nuggetmc.ai.bot.BotManager;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Agent {

    protected final PlayerAI plugin;
    protected final BotManager manager;
    protected final BukkitScheduler scheduler;
    protected final Set<BukkitRunnable> taskList;
    protected final Random random;

    protected boolean enabled;
    protected int taskID;

    public Agent(BotManager manager) {
        this.plugin = PlayerAI.getInstance();
        this.manager = manager;
        this.scheduler = Bukkit.getScheduler();
        this.taskList = new HashSet<>();
        this.random = new Random();

        setEnabled(true);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean b) {
        enabled = b;

        if (b) {
            taskID = scheduler.scheduleSyncRepeatingTask(plugin, this::tick, 0, 1);
        } else {
            scheduler.cancelTask(taskID);
            taskList.forEach(t -> {
                if (!t.isCancelled()) {
                    t.cancel();
                }
            });
            taskList.clear();
        }
    }

    protected abstract void tick();
}
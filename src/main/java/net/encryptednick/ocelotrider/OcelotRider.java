package net.encryptednick.ocelotrider;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class OcelotRider extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();

        if (player.hasPermission("ocelotrider.ride")) {
            if (event.getRightClicked().getType() == EntityType.valueOf("OCELOT")) {
                event.getRightClicked().setPassenger(player);
            }
        }
    }
}

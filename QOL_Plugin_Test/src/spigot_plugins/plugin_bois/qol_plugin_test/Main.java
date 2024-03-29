package spigot_plugins.plugin_bois.qol_plugin_test;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //Fired when the server enables the plugin
    }

    @Override
    public void onDisable() {
        //Fired when the server stops and disables all plugins
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("hello")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Hey! How are you?");
                return true;
            } else {
                sender.sendMessage("Hey, you're not a player!");
                return true;
            }
        }
        return false;
    }

}

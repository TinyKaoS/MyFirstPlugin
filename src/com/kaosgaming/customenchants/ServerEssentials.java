package com.kaosgaming.customenchants;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.kaosgaming.customenchants.GUI.Kits;
import com.kaosgaming.customenchants.GUI.SocialMedia;
import com.kaosgaming.customenchants.GUI.Warps;
import com.kaosgaming.customenchants.GUI.Baron.Baron;
import com.kaosgaming.customenchants.GUI.Duke.Duke;
import com.kaosgaming.customenchants.GUI.King.King;
import com.kaosgaming.customenchants.GUI.Knight.Knight;
import com.kaosgaming.customenchants.GUI.Peasant.Peasant;
import com.kaosgaming.customenchants.GUI.Prince.Prince;
import com.kaosgaming.customenchants.event.player.PlayerJoin;
import com.kaosgaming.customenchants.inventory.InventoryClick;

public class ServerEssentials extends JavaPlugin {

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		registerCommands();
		registerEvents();
		registerConfig();

		logger.info(pdfFile.getName() + "has been Enabled (V." + pdfFile.getVersion() + ")");
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getName() + " has been Disabled (V." + pdfFile.getVersion() + ")");
	}

	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	private void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new InventoryClick(), this);
		pm.registerEvents(new PlayerJoin(this), this);
	}

	private void registerCommands() {

		getCommand("kits").setExecutor(new Kits());
		getCommand("warps").setExecutor(new Warps());
		getCommand("sm").setExecutor(new SocialMedia());
		getCommand("kitpeasant").setExecutor(new Peasant());
		getCommand("kitknight").setExecutor(new Knight());
		getCommand("kitbaron").setExecutor(new Baron());
		getCommand("kitduke").setExecutor(new Duke());
		getCommand("kitprince").setExecutor(new Prince());
		getCommand("kitking").setExecutor(new King());
		
	}
}

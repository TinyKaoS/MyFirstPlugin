package com.kaosgaming.customenchants.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SocialMedia implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}

		Player player = (Player) sender;

		Inventory inv = Bukkit.createInventory(null, 45, ChatColor.AQUA + "            Social Media!");

		ItemStack warpPvP = nameItem(Material.DIAMOND_SWORD, ChatColor.RED + "Warp PvP!");
		inv.setItem(0, warpPvP);
		ItemStack warpCrates = nameItem(Material.GOLDEN_APPLE, ChatColor.AQUA + "Warp Crates!");
		inv.setItem(1, warpCrates);
		ItemStack warpShop = nameItem(Material.YELLOW_FLOWER, ChatColor.YELLOW + "Warp Shop!");
		inv.setItem(2, warpShop);
		ItemStack banner1 = nameItem(Material.BANNER, ChatColor.BLACK + "");
		inv.setItem(3, banner1);
		ItemStack spawnItem = nameItem(Material.COMPASS, ChatColor.AQUA + "Go To Spawn!");
		inv.setItem(4, spawnItem);
		ItemStack banner2 = nameItem(Material.BANNER, ChatColor.BLACK + "");
		inv.setItem(5, banner2);;
		ItemStack warpEnder = nameItem(Material.EYE_OF_ENDER, ChatColor.DARK_GREEN + "Go to the Ender!");
		inv.setItem(6, warpEnder);
		ItemStack warpNether = nameItem(Material.NETHER_STAR, ChatColor.WHITE + "Go To the Nether!");
		inv.setItem(7, warpNether);
		ItemStack warpRules = nameItem(Material.BOOK, ChatColor.AQUA + "Go To the Rules!");
		inv.setItem(8, warpRules);

		player.openInventory(inv);

		return false;
	}

	private ItemStack nameItem(ItemStack item, String name) {
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		item.setItemMeta(meta);
		return item;
	}

	private ItemStack nameItem(Material item, String name) {
		return nameItem(new ItemStack(item), name);
	}
}
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

public class Warps implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}

		Player player = (Player) sender;

		Inventory inv = Bukkit.createInventory(null, 27, ChatColor.AQUA + "                Warps!");

		ItemStack stainedGlass1 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(0, stainedGlass1);
		
		ItemStack stainedGlass2 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(1, stainedGlass2);
		
		ItemStack stainedGlass3 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(2, stainedGlass3);
		
		ItemStack stainedGlass4 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(3, stainedGlass4);
		
		ItemStack stainedGlass5 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(4, stainedGlass5);
		
		ItemStack stainedGlass6 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(5, stainedGlass6);
		
		ItemStack stainedGlass7 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(6, stainedGlass7);
		
		ItemStack stainedGlass8 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(7, stainedGlass8);
		
		ItemStack stainedGlass9 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(8, stainedGlass9);
		
		ItemStack stainedGlass10 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(9, stainedGlass10);
		
		ItemStack warpShop = nameItem(Material.DIAMOND, ChatColor.AQUA + "Warp Shop!");
		inv.setItem(10, warpShop);	
		
		ItemStack warpCrates = nameItem(Material.ENDER_CHEST, ChatColor.AQUA + "Warp Crates!");
		inv.setItem(11, warpCrates);
		
		ItemStack stainedGlass11 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(12, stainedGlass11);
		
		ItemStack warpPvP = nameItem(Material.DIAMOND_SWORD, ChatColor.AQUA + "Warp PvP!");
		inv.setItem(13, warpPvP);
		
		ItemStack stainedGlass12 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(14, stainedGlass12);
		
		ItemStack warpNether = nameItem(Material.NETHER_STAR, ChatColor.AQUA + "Warp Nether!");
		inv.setItem(15, warpNether);
		
		ItemStack warpEnd = nameItem(Material.EYE_OF_ENDER, ChatColor.AQUA + "Warp End!");
		inv.setItem(16, warpEnd);

		ItemStack stainedGlass13 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(17, stainedGlass13);
		
		ItemStack stainedGlass14 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(18, stainedGlass14);

		ItemStack stainedGlass15 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(19, stainedGlass15);

		ItemStack stainedGlass16 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(20, stainedGlass16);

		ItemStack stainedGlass17 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(21, stainedGlass17);

		ItemStack stainedGlass18 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(22, stainedGlass18);

		ItemStack stainedGlass19 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(23, stainedGlass19);

		ItemStack stainedGlass20 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(24, stainedGlass20);

		ItemStack stainedGlass21 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(25, stainedGlass21);

		ItemStack stainedGlass22 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(26, stainedGlass22);
		
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
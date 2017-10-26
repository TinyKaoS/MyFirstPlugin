package com.kaosgaming.customenchants.GUI.Duke;

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

public class Duke implements CommandExecutor {
	
	
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}
		
		Player player = (Player) sender;

		Inventory inv = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "               [Duke] Rank!");

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
		
		ItemStack stainedGlass11 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(10, stainedGlass11);	
		
		ItemStack stainedGlass12 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(11, stainedGlass12);
		
		ItemStack PvPp = nameItem(Material.GOLD_SWORD, ChatColor.YELLOW + "PvPd");
		inv.setItem(12, PvPp);
		
		ItemStack stainedGlass13 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(13, stainedGlass13);
		
		ItemStack peasantKit = nameItem(Material.GOLD_PICKAXE, ChatColor.YELLOW + "[Duke] Kit");
		inv.setItem(14, peasantKit);
		
		ItemStack stainedGlass66 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(15, stainedGlass66);
		
		ItemStack stainedGlass61 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(16, stainedGlass61);

		ItemStack stainedGlass64 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(17, stainedGlass64);
		
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

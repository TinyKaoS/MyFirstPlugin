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

public class Kits implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}

		Player player = (Player) sender;

		Inventory inv = Bukkit.createInventory(null, 45, ChatColor.AQUA + "                 Kits!");

		ItemStack glassStain1 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(0, glassStain1);
		
		ItemStack glassStain2 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(1, glassStain2);
		
		ItemStack glassStain3 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(2, glassStain3);
		
		ItemStack glassStain4 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(3, glassStain4);
		
		ItemStack glassStain5 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(4, glassStain5);
		
		ItemStack glassStain6 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(5, glassStain6);
		
		ItemStack glassStain7 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(6, glassStain7);
		
		ItemStack glassStain8 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(7, glassStain8);
		
		ItemStack glassStain9 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(8, glassStain9);
		
		ItemStack glassStain17 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(9, glassStain17);
		
		ItemStack glassStain18 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(17, glassStain18);
		
		ItemStack glassStain26 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(18, glassStain26);
		
		ItemStack glassStain27 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(26, glassStain27);
		
		ItemStack glassStain35 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(27, glassStain35);
		
		ItemStack glassStain36 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(35, glassStain36);
		
		ItemStack glassStain37 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(36, glassStain37);
		
		ItemStack glassStain38 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(37, glassStain38);
		
		ItemStack glassStain39 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(38, glassStain39);
		
		ItemStack glassStain40 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(39, glassStain40);
		
		ItemStack glassStain41 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(40, glassStain41);
		
		ItemStack glassStain42 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(41, glassStain42);
		
		ItemStack glassStain43 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(42, glassStain43);
		
		ItemStack glassStain44 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(43, glassStain44);
		
		ItemStack glassStain45 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(44, glassStain45);
		
		ItemStack kitPeasent = nameItem(Material.WOOD, ChatColor.AQUA + "[Peasant] Rank");
		inv.setItem(10, kitPeasent);
		
		ItemStack kitKnight = nameItem(Material.STONE, ChatColor.BLUE + "[Knight] Rank");
		inv.setItem(11, kitKnight);
		
		ItemStack kitBaron = nameItem(Material.IRON_INGOT, ChatColor.RED + "[Baron] Rank");
		inv.setItem(12, kitBaron);
		
		ItemStack kitDuke = nameItem(Material.GOLD_INGOT, ChatColor.YELLOW + "[Duke] Rank");
		inv.setItem(14, kitDuke);
		
		ItemStack kitPrince = nameItem(Material.DIAMOND, ChatColor.LIGHT_PURPLE + "[Prince] Rank");
		inv.setItem(15, kitPrince);
		
		ItemStack kitKing = nameItem(Material.EMERALD, ChatColor.GOLD + "[King] Rank");
		inv.setItem(16, kitKing);
		
		ItemStack kitCannon = nameItem(Material.TNT, ChatColor.RED + "[Cannon] Kit");
		inv.setItem(29, kitCannon);
		
		ItemStack kitFarmer = nameItem(Material.DIAMOND_HOE, ChatColor.DARK_GREEN + "[Farmer] Kit");
		inv.setItem(30, kitFarmer);
		
		ItemStack kitExplorer = nameItem(Material.MAP, ChatColor.DARK_GRAY + "[Explorer] Kit");
		inv.setItem(31, kitExplorer);
		
		ItemStack kitBrewing = nameItem(Material.GOLDEN_CARROT, ChatColor.DARK_AQUA + "[Brewing] Kit");
		inv.setItem(32, kitBrewing);
		
		ItemStack kitPotPvP = nameItem(Material.POTION, ChatColor.DARK_PURPLE + "[PotPvP] Kit");
		inv.setItem(33, kitPotPvP);
		
		ItemStack glassStain46 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(13, glassStain46);
		
		ItemStack glassStain47 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(19, glassStain47);
		
		ItemStack glassStain48 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(20, glassStain48);
		
		ItemStack glassStain49 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(21, glassStain49);
		
		ItemStack glassStain50 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(22, glassStain50);
		
		ItemStack glassStain51 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(23, glassStain51);
		
		ItemStack glassStain52 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(24, glassStain52);
		
		ItemStack glassStain53 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(25, glassStain53);
		
		ItemStack glassStain54 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(28, glassStain54);
		
		ItemStack glassStain55 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(34, glassStain55);
		
		player.openInventory(inv);

		return true;
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
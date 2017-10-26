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

public class MainMenu implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}

		Player player = (Player) sender;

		Inventory inv = Bukkit.createInventory(null, 54, ChatColor.AQUA + "           NationsNetwork Menu!");

		ItemStack stainGlass1 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(0, stainGlass1);

		ItemStack stainGlass2 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(1, stainGlass2);

		ItemStack stainGlass3 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(2, stainGlass3);

		ItemStack stainGlass4 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(3, stainGlass4);

		ItemStack stainGlass5 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(4, stainGlass5);

		ItemStack stainGlass6 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(5, stainGlass6);

		ItemStack stainGlass7 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(6, stainGlass7);

		ItemStack stainGlass8 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(7, stainGlass8);

		ItemStack stainGlass9 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(8, stainGlass9);

		ItemStack stainGlass10 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(9, stainGlass10);

		ItemStack stainGlass11 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(10, stainGlass11);

		ItemStack stainGlass12 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(11, stainGlass12);

		ItemStack stainGlass13 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(12, stainGlass13);

		ItemStack stainGlass14 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(13, stainGlass14);

		ItemStack stainGlass15 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(14, stainGlass15);

		ItemStack stainGlass16 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(15, stainGlass16);

		ItemStack stainGlass17 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(16, stainGlass17);

		ItemStack stainGlass18 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(17, stainGlass18);

		ItemStack stainGlass19 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(18, stainGlass19);

		ItemStack stainGlass20 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(19, stainGlass20);

		ItemStack stainGlass21 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(20, stainGlass21);

		ItemStack stainGlass22 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(21, stainGlass22);

		ItemStack spawnItem = nameItem(Material.BEACON, ChatColor.AQUA + "Go to Spawn!");
		inv.setItem(22, spawnItem);

		ItemStack stainGlass23 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(23, stainGlass23);

		ItemStack stainGlass24 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(24, stainGlass24);

		ItemStack stainGlass25 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(25, stainGlass25);

		ItemStack stainGlass26 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(26, stainGlass26);

		ItemStack stainGlass27 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(27, stainGlass27);

		ItemStack stainGlass28 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(28, stainGlass28);

		ItemStack kitsWarp = nameItem(Material.CHEST, ChatColor.AQUA + "Kits Menu!");
		inv.setItem(29, kitsWarp);

		ItemStack stainGlass29 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(30, stainGlass29);

		ItemStack stainGlass30 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(31, stainGlass30);

		ItemStack stainGlass31 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(32, stainGlass31);

		ItemStack compassCompass = nameItem(Material.COMPASS, ChatColor.AQUA + "Warp Menu!");
		inv.setItem(33, compassCompass);

		ItemStack stainGlass32 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(34, stainGlass32);

		ItemStack stainGlass33 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(35, stainGlass33);

		ItemStack stainGlass34 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(36, stainGlass34);

		ItemStack stainGlass35 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(37, stainGlass35);

		ItemStack stainGlass36 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(38, stainGlass36);

		ItemStack stainGlass37 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(39, stainGlass37);

		ItemStack mapMap = nameItem(Material.MAP, ChatColor.AQUA + "Links to Our Social Media Pages!");
		inv.setItem(40, mapMap);

		ItemStack stainGlass38 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(41, stainGlass38);

		ItemStack stainGlass39 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(42, stainGlass39);

		ItemStack stainGlass40 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(43, stainGlass40);

		ItemStack stainGlass41 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(44, stainGlass41);

		ItemStack stainGlass42 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(45, stainGlass42);

		ItemStack stainGlass43 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(46, stainGlass43);
				
		ItemStack stainGlass44 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(47, stainGlass44);

		ItemStack stainGlass45 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(48, stainGlass45);

		ItemStack stainGlass46 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(49, stainGlass46);

		ItemStack stainGlass47 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(50, stainGlass47);

		ItemStack stainGlass48 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(51, stainGlass48);

		ItemStack stainGlass49 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(52, stainGlass49);

		ItemStack stainGlass50 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(53, stainGlass50);

		ItemStack stainGlass51 = nameItem(Material.STAINED_GLASS_PANE, ChatColor.BLACK + "");
		inv.setItem(54, stainGlass51);

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

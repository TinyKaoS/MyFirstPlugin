package com.kaosgaming.customenchants.inventory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryClick implements Listener {

	private Player sender;
	Player player = (Player) sender;

	@EventHandler
	public void onInventoryClick2(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("                  Kits!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.WOOD) {

			event.setCancelled(true);
			player.chat("/kitpeasant");
		}
	}

	@EventHandler
	public void onInventoryClick3(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Peasant] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.WOOD_PICKAXE) {
			player.sendMessage(ChatColor.AQUA + "You Redeemed the [Peasant] Kit, you may do this again in 7 Days!");
			event.setCancelled(true);
			player.chat("/kit Peasant");
		}
	}

	@EventHandler
	public void onInventoryClick4(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Peasant] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.WOOD_SWORD) {
			player.sendMessage(ChatColor.AQUA + "You Redeemed the [Peasant] PvP Kit, you may do this again in 4 Days!");
			event.setCancelled(true);
			player.chat("/kit pvpp");
		}

	}

	@EventHandler
	public void onInventoryClick5(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("                  Kits!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.STONE) {
			event.setCancelled(true);
			player.chat("/kitknight");
		}
	}

	@EventHandler
	public void onInventoryClick6(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Knight] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.STONE_SWORD) {
			player.sendMessage(ChatColor.BLUE + "You Redeemed the [Knight] PvP Kit, you may do this again in 4 Days!");
			event.setCancelled(true);
			player.chat("/kit pvpk");
		}
	}

	@EventHandler
	public void onInventoryClick7(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Knight] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.STONE_PICKAXE) {
			player.sendMessage(ChatColor.BLUE + "You Redeemed the Knight Kit, you may do this again in 7 Days!");
			event.setCancelled(true);
			player.chat("/kit Knight");
		}
	}

	@EventHandler
	public void onInventoryClick8(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("                  Kits!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.IRON_INGOT) {
			event.setCancelled(true);
			player.chat("/kitbaron");
		}
	}

	@EventHandler
	public void onInventoryClick9(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Baron] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.IRON_SWORD) {
			player.sendMessage(ChatColor.RED + "You Redeemed the [Baron] PvP Kit, you may do this again in 4 Days!");
			event.setCancelled(true);
			player.chat("/kit pvpb");
		}
	}

	@EventHandler
	public void onInventoryClick10(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Baron] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.IRON_PICKAXE) {
			player.sendMessage(ChatColor.RED + "You Redeemed the [Baron] Kit, you may do this again in 7 Days!");
			event.setCancelled(true);
			player.chat("/kit Baron");
		}
	}
	
	
	@EventHandler
	public void onInventoryClick11(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("                  Kits!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.GOLD_INGOT) {
			event.setCancelled(true);
			player.chat("/kitduke");
		}
	}

	@EventHandler
	public void onInventoryClick12(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Duke] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.GOLD_SWORD) {
			player.sendMessage(ChatColor.YELLOW + "You Redeemed the [Duke] PvP Kit, you may do this again in 4 Days!");
			event.setCancelled(true);
			player.chat("/kit pvpd");
		}
	}

	@EventHandler
	public void onInventoryClick13(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Baron] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.GOLD_PICKAXE) {
			player.sendMessage(ChatColor.YELLOW + "You Redeemed the [Duke] Kit, you may do this again in 7 Days!");
			event.setCancelled(true);
			player.chat("/kit Duke");
		}
	}
	
	@EventHandler
	public void onInventoryClick14(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("                  Kits!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.DIAMOND) {

			event.setCancelled(true);
			player.chat("/kitprince");
		}
	}

	@EventHandler
	public void onInventoryClick15(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Prince] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.DIAMOND_SWORD) {
			player.sendMessage(ChatColor.DARK_PURPLE + "You Redeemed the [Prince] PvP Kit, you may do this again in 4 Days!");
			event.setCancelled(true);
			player.chat("/kit pvppr");
		}
	}

	@EventHandler
	public void onInventoryClick16(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [Prince] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.DIAMOND_PICKAXE) {
			player.sendMessage(ChatColor.DARK_PURPLE + "You Redeemed the [Prince] Kit, you may do this again in 7 Days!");
			event.setCancelled(true);
			player.chat("/kit Prince");
		}
	}
	
	@EventHandler
	public void onInventoryClick17(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("                  Kits!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.EMERALD) {

			event.setCancelled(true);
			player.chat("/kitking");
		}
	}

	@EventHandler
	public void onInventoryClick18(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [King] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.EMERALD_BLOCK) {
			player.sendMessage(ChatColor.GOLD + "You Redeemed the [King] PvP Kit, you may do this again in 4 Days!");
			event.setCancelled(true);
			player.chat("/kit pvpkg");
		}
	}

	@EventHandler
	public void onInventoryClick19(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (!inv.getTitle().equals("            [King] Rank!"))
			if (!(event.getWhoClicked() instanceof Player))
				return;

		if (!(event.getWhoClicked() instanceof Player))
			return;

		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();

		if (item.getType() == Material.EMERALD_ORE) {
			player.sendMessage(ChatColor.GOLD + "You Redeemed the [King] Kit, you may do this again in 7 Days!");
			event.setCancelled(true);
			player.chat("/kit King");
		}
	}
}
package com.kaosgaming.customenchants.event.player;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.kaosgaming.customenchants.ServerEssentials;

import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle.EnumTitleAction;
import net.minecraft.server.v1_8_R3.PlayerConnection;

public class PlayerJoin implements Listener {

	public PlayerJoin(ServerEssentials pl) {
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();

		PacketPlayOutTitle welcomeTitle = new PacketPlayOutTitle(EnumTitleAction.TITLE,
				ChatSerializer.a("{\"text\":\"Welcome to the server!\",\"color\":\"gold\",\"bold\":true}"), 20, 40, 30);
		PacketPlayOutTitle welcomeSubtitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE,
				ChatSerializer.a("{\"text\":\"Enjoy your stay!\",\"italic\":true\"underlined\",\":true}"), 20, 40, 30);

		PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
		connection.sendPacket(welcomeTitle);
		connection.sendPacket(welcomeSubtitle);

	}
}

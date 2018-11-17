package com.arpaesis.scmc.network.message;

import com.arpaesis.scmc.capabilities.ShieldProvider;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSetPlayerShieldClient implements IMessage, IMessageHandler<MessageSetPlayerShieldClient, IMessage>
{

	private double shield;

	public MessageSetPlayerShieldClient()
	{
	}

	public MessageSetPlayerShieldClient(double shield)
	{
		this.shield = shield;
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeDouble(shield);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		shield = buf.readDouble();
	}

	@Override
	public IMessage onMessage(MessageSetPlayerShieldClient message, MessageContext ctx)
	{
		EntityPlayer player = Minecraft.getMinecraft().player;
		if (player != null && player.world.isRemote && player.getCapability(ShieldProvider.SHIELD, null) != null)
		{
			player.getCapability(ShieldProvider.SHIELD, null).set(message.shield);
		}
		return null;
	}
}
package ga.scmc.network;

import ga.scmc.lib.Library;
import ga.scmc.network.message.MessageSpawnItem;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {

	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Library.MODID);

	public static void init() {
		INSTANCE.registerMessage(new MessageSpawnItem(), MessageSpawnItem.class, 0, Side.SERVER);
	}

	public static void sendToServer(IMessage message) {
		INSTANCE.sendToServer(message);
	}

	public static void getPacketFrom(IMessage message) {
		INSTANCE.getPacketFrom(message);
	}
}
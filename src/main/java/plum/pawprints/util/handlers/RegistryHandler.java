package plum.pawprints.util.handlers;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import plum.pawprints.init.EntityInit;

@EventBusSubscriber
public class RegistryHandler
{
	public static void preInitRegistries()
	{
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
}
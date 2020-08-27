package plum.pawprints.util.handlers;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import plum.pawprints.entity.EntityBilby;
import plum.pawprints.entity.EntityPinkfairy;
import plum.pawprints.entity.EntityQuokka;
import plum.pawprints.entity.render.RenderBilby;
import plum.pawprints.entity.render.RenderPinkfairy;
import plum.pawprints.entity.render.RenderQuokka;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBilby.class, RenderBilby::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityPinkfairy.class, RenderPinkfairy::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityQuokka.class, RenderQuokka::new);
	}
}

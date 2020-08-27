package plum.pawprints.init;

import plum.pawprints.main;
import plum.pawprints.entity.EntityBilby;
import plum.pawprints.entity.EntityPinkfairy;
import plum.pawprints.entity.EntityQuokka;
import plum.pawprints.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	public static void registerEntities()
	{
		registerEntity("bilby", EntityBilby.class, Reference.ENTITY_BILBY, 64, 14870761, 16763855);
		registerEntity("pinkfairy", EntityPinkfairy.class, Reference.ENTITY_PINKFAIRY, 64, 16761789, 16118771);
		registerEntity("quokka", EntityQuokka.class, Reference.ENTITY_QUOKKA, 64, 11045000, 8154213);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, main.instance, range, 1, true, color1, color2);
	}
}

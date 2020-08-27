package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityQuokka;
import plum.pawprints.entity.model.ModelQuokka;

public class RenderQuokka extends RenderLiving<EntityQuokka>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("pawprints", "textures/quokka.png");
	
	public RenderQuokka(RenderManager manager)
	{
		super(manager, new ModelQuokka(), 0.2F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityQuokka entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityQuokka entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
    public float prepareScale(EntityQuokka entitylivingbaseIn, float partialTicks)
    {
        GlStateManager.scale(0.55F, 0.55F, 0.55F);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
}

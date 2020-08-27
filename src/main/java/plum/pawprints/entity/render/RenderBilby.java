package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityBilby;
import plum.pawprints.entity.model.ModelBilby;

public class RenderBilby extends RenderLiving<EntityBilby>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("pawprints", "textures/bilby.png");
	
	public RenderBilby(RenderManager manager)
	{
		super(manager, new ModelBilby(), 0.2F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBilby entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityBilby entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
    public float prepareScale(EntityBilby entitylivingbaseIn, float partialTicks)
    {
        GlStateManager.scale(0.4F, 0.4F, 0.4F);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
}

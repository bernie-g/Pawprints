package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityPinkfairy;
import plum.pawprints.entity.model.ModelPinkfairy;

public class RenderPinkfairy extends RenderLiving<EntityPinkfairy>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("pawprints", "textures/fairy.png");
	
	public RenderPinkfairy(RenderManager manager)
	{
		super(manager, new ModelPinkfairy(), 0.15F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityPinkfairy entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityPinkfairy entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
    public float prepareScale(EntityPinkfairy entitylivingbaseIn, float partialTicks)
    {
        GlStateManager.scale(0.25F, 0.25F, 0.25F);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
}

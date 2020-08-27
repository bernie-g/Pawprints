package plum.pawprints.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.AnimationController;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class EntityQuokka extends EntityAnimal implements IAnimatedEntity
{	
	public EntityQuokka(World worldIn)
	{
		super(worldIn);
		setSize(0.4F, 0.4F);
		registerAnimationControllers();
	}
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAILookIdle(this));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	public EntityAnimal createChild(EntityAgeable ageable)
    {
		return null;
    }
	
	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
		return false;
    }
	
	public boolean isBreedingItem(ItemStack stack)
    {
        return false;
    }
	
	public boolean canMateWith(EntityAnimal otherAnimal)
    {
        return false;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return null;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSource) 
	{
	    return null;
	}
	
	protected SoundEvent getDeathSound() 
	{
	    return null;
	}
	
	@Override
	public EntityAnimationManager getAnimationManager()
	{
		return manager;
	}
	
	private EntityAnimationManager manager = new EntityAnimationManager();
	private AnimationController controller = new EntityAnimationController(this, "moveController", 20, this::animationPredicate);
	private <E extends EntityQuokka> boolean animationPredicate(AnimationTestEvent<E> event)
	{
		if(event.isWalking())
		{
			controller.setAnimation(new AnimationBuilder().addAnimation("animation.quokka.walk").addAnimation("animation.quokka.walk", true));
			return true;
		} else {
			controller.setAnimation(new AnimationBuilder().addAnimation("animation.quokka.idle", true));
			return true;
		}
	}
	
	private void registerAnimationControllers()
	{
		manager.addAnimationController(controller);
	}
}

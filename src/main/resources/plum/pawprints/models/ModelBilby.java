package plum.pawprints.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityBilby;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class ModelBilby extends AnimatedEntityModel<EntityBilby> 
{

	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer snout;
	private final AnimatedModelRenderer snoutlong;
	private final AnimatedModelRenderer diagonal;
	private final AnimatedModelRenderer cheek1;
	private final AnimatedModelRenderer ear1;
	private final AnimatedModelRenderer ear2;
	private final AnimatedModelRenderer cheek2;
	private final AnimatedModelRenderer headtop;
	private final AnimatedModelRenderer bodyneck;
	private final AnimatedModelRenderer bodymain;
	private final AnimatedModelRenderer hump2;
	private final AnimatedModelRenderer rear;
	private final AnimatedModelRenderer tail1;
	private final AnimatedModelRenderer tail2;
	private final AnimatedModelRenderer tail3;
	private final AnimatedModelRenderer tail4;
	private final AnimatedModelRenderer tail5;
	private final AnimatedModelRenderer hump1;
	private final AnimatedModelRenderer thigh1;
	private final AnimatedModelRenderer leg1;
	private final AnimatedModelRenderer foot1;
	private final AnimatedModelRenderer thigh2;
	private final AnimatedModelRenderer leg1_1;
	private final AnimatedModelRenderer foot2;
	private final AnimatedModelRenderer thigh3;
	private final AnimatedModelRenderer leg3;
	private final AnimatedModelRenderer foot3;
	private final AnimatedModelRenderer thighdiag1;
	private final AnimatedModelRenderer thigh4;
	private final AnimatedModelRenderer leg4;
	private final AnimatedModelRenderer foot4;
	private final AnimatedModelRenderer thighdiag2;

    public ModelBilby()
    {
        textureWidth = 100;
    textureHeight = 60;
    head = new AnimatedModelRenderer(this);
		head.setRotationPoint(-0.15F, 19.4F, -6.8F);
		setRotationAngle(head, -18.6672F, 0.0F, 0.0F);
		head.setTextureOffset(44, 0).addBox(-2.5F, -2.5F, -4.2F, 5.0F, 5.0F, 5.0F, 0.1F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		snout = new AnimatedModelRenderer(this);
		snout.setRotationPoint(0.1F, 1.5F, -4.6F);
		head.addChild(snout);
		snout.setTextureOffset(44, 11).addBox(-1.6F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		snout.setModelRendererName("snout");
		this.registerModelRenderer(snout);

		snoutlong = new AnimatedModelRenderer(this);
		snoutlong.setRotationPoint(0.0F, 0.5F, -0.6F);
		snout.addChild(snoutlong);
		snoutlong.setTextureOffset(53, 11).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		snoutlong.setModelRendererName("snoutlong");
		this.registerModelRenderer(snoutlong);

		diagonal = new AnimatedModelRenderer(this);
		diagonal.setRotationPoint(0.0F, 0.2F, -0.4F);
		snout.addChild(diagonal);
		setRotationAngle(diagonal, 0.4512F, 0.0F, 0.0F);
		diagonal.setTextureOffset(53, 14).addBox(-1.0F, -0.6F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		diagonal.setModelRendererName("diagonal");
		this.registerModelRenderer(diagonal);

		cheek1 = new AnimatedModelRenderer(this);
		cheek1.setRotationPoint(-2.3F, 1.4F, -1.7F);
		head.addChild(cheek1);
		cheek1.setTextureOffset(33, 0).addBox(-0.9F, -0.9F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		cheek1.setModelRendererName("cheek1");
		this.registerModelRenderer(cheek1);

		ear1 = new AnimatedModelRenderer(this);
		ear1.setRotationPoint(-2.3F, -2.4F, -1.0F);
		head.addChild(ear1);
		setRotationAngle(ear1, -0.5009F, -0.2731F, 0.0F);
		ear1.setTextureOffset(81, 0).addBox(-0.7F, -5.6F, -0.4F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		ear1.setModelRendererName("ear1");
		this.registerModelRenderer(ear1);

		ear2 = new AnimatedModelRenderer(this);
		ear2.setRotationPoint(2.3F, -2.4F, -1.0F);
		head.addChild(ear2);
		setRotationAngle(ear2, -0.5009F, 0.2731F, 0.0F);
		ear2.setTextureOffset(89, 0).addBox(-0.2F, -5.6F, -0.4F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		ear2.setModelRendererName("ear2");
		this.registerModelRenderer(ear2);

		cheek2 = new AnimatedModelRenderer(this);
		cheek2.setRotationPoint(2.3F, 1.4F, -1.7F);
		head.addChild(cheek2);
		cheek2.setTextureOffset(33, 7).addBox(-1.1F, -0.9F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		cheek2.setModelRendererName("cheek2");
		this.registerModelRenderer(cheek2);

		headtop = new AnimatedModelRenderer(this);
		headtop.setRotationPoint(-0.15F, 19.0F, -10.2F);
		setRotationAngle(headtop, 0.6339F, 0.0F, 0.0F);
		headtop.setTextureOffset(44, 18).addBox(-2.5F, -1.7401F, 0.4271F, 5.0F, 4.0F, 5.0F, -0.2F, false);
		headtop.setModelRendererName("headtop");
		this.registerModelRenderer(headtop);

		bodyneck = new AnimatedModelRenderer(this);
		bodyneck.setRotationPoint(-0.25F, 18.9F, -6.9F);
		setRotationAngle(bodyneck, 0.4098F, 0.0F, 0.0F);
		bodyneck.setTextureOffset(10, 0).addBox(-2.9F, -3.9F, 0.6F, 6.0F, 7.0F, 5.0F, 0.0F, false);
		bodyneck.setModelRendererName("bodyneck");
		this.registerModelRenderer(bodyneck);

		bodymain = new AnimatedModelRenderer(this);
		bodymain.setRotationPoint(0.1F, 0.0F, 4.7F);
		bodyneck.addChild(bodymain);
		setRotationAngle(bodymain, -0.3316F, 0.0F, 0.0F);
		bodymain.setTextureOffset(2, 14).addBox(-4.01F, -4.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		bodymain.setModelRendererName("bodymain");
		this.registerModelRenderer(bodymain);

		hump2 = new AnimatedModelRenderer(this);
		hump2.setRotationPoint(2.9F, -22.7F, 10.9F);
		bodymain.addChild(hump2);
		setRotationAngle(hump2, -0.3187F, 0.0F, 0.0F);
		hump2.setTextureOffset(8, 32).addBox(-6.4F, 18.2F, -0.8F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		hump2.setModelRendererName("hump2");
		this.registerModelRenderer(hump2);

		rear = new AnimatedModelRenderer(this);
		rear.setRotationPoint(2.9F, -17.9F, 14.5F);
		bodymain.addChild(rear);
		setRotationAngle(rear, 0.2731F, 0.0F, 0.0F);
		rear.setTextureOffset(14, 50).addBox(-5.9F, 12.6186F, -11.6F, 6.0F, 7.0F, 3.0F, 0.0F, false);
		rear.setModelRendererName("rear");
		this.registerModelRenderer(rear);

		tail1 = new AnimatedModelRenderer(this);
		tail1.setRotationPoint(-3.0F, 16.0F, -9.3F);
		rear.addChild(tail1);
		setRotationAngle(tail1, -0.2731F, 0.0F, 0.0F);
		tail1.setTextureOffset(70, 37).addBox(-1.0F, -1.0331F, -0.2F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		tail1.setModelRendererName("tail1");
		this.registerModelRenderer(tail1);

		tail2 = new AnimatedModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 3.8F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, -0.1367F, 0.0F, 0.0F);
		tail2.setTextureOffset(84, 37).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		tail2.setModelRendererName("tail2");
		this.registerModelRenderer(tail2);

		tail3 = new AnimatedModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.1394F, 3.834F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, -0.3187F, 0.0F, 0.0F);
		tail3.setTextureOffset(70, 45).addBox(-1.0F, -0.9894F, -0.634F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		tail3.setModelRendererName("tail3");
		this.registerModelRenderer(tail3);

		tail4 = new AnimatedModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.0606F, 3.866F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, -0.2731F, 0.0F, 0.0F);
		tail4.setTextureOffset(84, 45).addBox(-1.0F, -0.85F, -0.8F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		tail4.setModelRendererName("tail4");
		this.registerModelRenderer(tail4);

		tail5 = new AnimatedModelRenderer(this);
		tail5.setRotationPoint(0.0F, 0.2F, 3.3F);
		tail4.addChild(tail5);
		setRotationAngle(tail5, 0.3187F, 0.0F, 0.0F);
		tail5.setTextureOffset(70, 53).addBox(-1.0F, -1.15F, -0.4F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		tail5.setModelRendererName("tail5");
		this.registerModelRenderer(tail5);

		hump1 = new AnimatedModelRenderer(this);
		hump1.setRotationPoint(2.9F, -21.4F, 6.9F);
		bodymain.addChild(hump1);
		setRotationAngle(hump1, 0.2731F, 0.0F, 0.0F);
		hump1.setTextureOffset(34, 34).addBox(-6.4F, 14.5F, -11.7F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		hump1.setModelRendererName("hump1");
		this.registerModelRenderer(hump1);

		thigh1 = new AnimatedModelRenderer(this);
		thigh1.setRotationPoint(-2.7F, 18.0F, 4.7F);
		setRotationAngle(thigh1, 0.1367F, 0.0F, 0.0F);
		thigh1.setTextureOffset(26, 13).addBox(-1.4F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, -0.2F, false);
		thigh1.setModelRendererName("thigh1");
		this.registerModelRenderer(thigh1);

		leg1 = new AnimatedModelRenderer(this);
		leg1.setRotationPoint(0.2F, 3.1F, 0.6F);
		thigh1.addChild(leg1);
		setRotationAngle(leg1, -0.5463F, 0.0F, 0.0F);
		leg1.setTextureOffset(5, 17).addBox(-0.6F, 0.0F, -0.4F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg1.setModelRendererName("leg1");
		this.registerModelRenderer(leg1);

		foot1 = new AnimatedModelRenderer(this);
		foot1.setRotationPoint(2.9F, 2.6139F, 0.0157F);
		leg1.addChild(foot1);
		setRotationAngle(foot1, 0.4363F, 0.0F, 0.0F);
		foot1.setTextureOffset(34, 22).addBox(-3.5F, -0.4139F, -1.3157F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		foot1.setModelRendererName("foot1");
		this.registerModelRenderer(foot1);

		thigh2 = new AnimatedModelRenderer(this);
		thigh2.setRotationPoint(2.1F, 18.0F, 4.7F);
		setRotationAngle(thigh2, 0.1367F, 0.0F, 0.0F);
		thigh2.setTextureOffset(65, 0).addBox(-1.4F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, -0.2F, false);
		thigh2.setModelRendererName("thigh2");
		this.registerModelRenderer(thigh2);

		leg1_1 = new AnimatedModelRenderer(this);
		leg1_1.setRotationPoint(0.2F, 2.9F, 0.5F);
		thigh2.addChild(leg1_1);
		setRotationAngle(leg1_1, -0.5463F, 0.0F, 0.0F);
		leg1_1.setTextureOffset(5, 12).addBox(-0.6F, 0.1F, -0.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg1_1.setModelRendererName("leg1_1");
		this.registerModelRenderer(leg1_1);

		foot2 = new AnimatedModelRenderer(this);
		foot2.setRotationPoint(-0.15F, 2.5361F, 0.4504F);
		leg1_1.addChild(foot2);
		setRotationAngle(foot2, 0.4363F, 0.0F, 0.0F);
		foot2.setTextureOffset(34, 22).addBox(-0.45F, -0.3655F, -1.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		foot2.setModelRendererName("foot2");
		this.registerModelRenderer(foot2);

		thigh3 = new AnimatedModelRenderer(this);
		thigh3.setRotationPoint(-2.2F, 18.9F, -2.1F);
		setRotationAngle(thigh3, 0.0911F, 0.0F, 0.0F);
		thigh3.setTextureOffset(65, 13).addBox(-1.3F, 0.0F, -2.6F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		thigh3.setModelRendererName("thigh3");
		this.registerModelRenderer(thigh3);

		leg3 = new AnimatedModelRenderer(this);
		leg3.setRotationPoint(0.2F, 2.1F, -1.0F);
		thigh3.addChild(leg3);
		setRotationAngle(leg3, -0.5463F, 0.0F, 0.0F);
		leg3.setTextureOffset(5, 7).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg3.setModelRendererName("leg3");
		this.registerModelRenderer(leg3);

		foot3 = new AnimatedModelRenderer(this);
		foot3.setRotationPoint(0.1F, 2.3F, 0.0F);
		leg3.addChild(foot3);
		setRotationAngle(foot3, 0.4363F, 0.0F, 0.0F);
		foot3.setTextureOffset(34, 30).addBox(-0.6F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		foot3.setModelRendererName("foot3");
		this.registerModelRenderer(foot3);

		thighdiag1 = new AnimatedModelRenderer(this);
		thighdiag1.setRotationPoint(0.2F, 0.7F, -2.7F);
		thigh3.addChild(thighdiag1);
		setRotationAngle(thighdiag1, -0.3187F, 0.0F, 0.0F);
		thighdiag1.setTextureOffset(2, 32).addBox(-1.0F, 0.0F, -1.2F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		thighdiag1.setModelRendererName("thighdiag1");
		this.registerModelRenderer(thighdiag1);

		thigh4 = new AnimatedModelRenderer(this);
		thigh4.setRotationPoint(1.7F, 18.9F, -2.1F);
		setRotationAngle(thigh4, 0.0911F, 0.0F, 0.0F);
		thigh4.setTextureOffset(2, 42).addBox(-1.5F, 0.0F, -2.6F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		thigh4.setModelRendererName("thigh4");
		this.registerModelRenderer(thigh4);

		leg4 = new AnimatedModelRenderer(this);
		leg4.setRotationPoint(0.2F, 2.1F, -1.0F);
		thigh4.addChild(leg4);
		setRotationAngle(leg4, -0.5463F, 0.0F, 0.0F);
		leg4.setTextureOffset(5, 2).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg4.setModelRendererName("leg4");
		this.registerModelRenderer(leg4);

		foot4 = new AnimatedModelRenderer(this);
		foot4.setRotationPoint(-0.05F, 2.6946F, -0.0398F);
		leg4.addChild(foot4);
		setRotationAngle(foot4, 0.4363F, 0.0F, 0.0F);
		foot4.setTextureOffset(41, 28).addBox(-0.5F, -0.4781F, -1.8171F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		foot4.setModelRendererName("foot4");
		this.registerModelRenderer(foot4);

		thighdiag2 = new AnimatedModelRenderer(this);
		thighdiag2.setRotationPoint(0.0F, 0.7F, -2.7F);
		thigh4.addChild(thighdiag2);
		setRotationAngle(thighdiag2, -0.3187F, 0.0F, 0.0F);
		thighdiag2.setTextureOffset(21, 43).addBox(-1.0F, 0.0F, -1.2F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		thighdiag2.setModelRendererName("thighdiag2");
		this.registerModelRenderer(thighdiag2);

    this.rootBones.add(head);
		this.rootBones.add(headtop);
		this.rootBones.add(bodyneck);
		this.rootBones.add(thigh1);
		this.rootBones.add(thigh2);
		this.rootBones.add(thigh3);
		this.rootBones.add(thigh4);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.head.rotateAngleY = netHeadYaw * 0.007453292F;
    	this.head.rotateAngleX = headPitch * 0.007453292F;
    }
    
    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("pawprints", "models/animations/bilbyentity.json");
    }
}
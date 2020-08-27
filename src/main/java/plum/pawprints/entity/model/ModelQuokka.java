package plum.pawprints.entity.model;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityQuokka;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class ModelQuokka extends AnimatedEntityModel<EntityQuokka> {

    private final AnimatedModelRenderer body;
	private final AnimatedModelRenderer fronthump;
	private final AnimatedModelRenderer backhump;
	private final AnimatedModelRenderer neckhump;
	private final AnimatedModelRenderer neck;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer rightcheek;
	private final AnimatedModelRenderer leftcheek;
	private final AnimatedModelRenderer snout;
	private final AnimatedModelRenderer jaw;
	private final AnimatedModelRenderer nose;
	private final AnimatedModelRenderer noseblock;
	private final AnimatedModelRenderer snoutdiag;
	private final AnimatedModelRenderer earright;
	private final AnimatedModelRenderer earleft;
	private final AnimatedModelRenderer butt;
	private final AnimatedModelRenderer frontthighright;
	private final AnimatedModelRenderer frontlegright;
	private final AnimatedModelRenderer frontpawright;
	private final AnimatedModelRenderer frontthighleft;
	private final AnimatedModelRenderer frontlegleft;
	private final AnimatedModelRenderer frontpawleft;
	private final AnimatedModelRenderer backthighright;
	private final AnimatedModelRenderer backlegtopright;
	private final AnimatedModelRenderer backlegbottomright;
	private final AnimatedModelRenderer backpawright;
	private final AnimatedModelRenderer backthighleft;
	private final AnimatedModelRenderer backlegtopleft;
	private final AnimatedModelRenderer backlegbottomleft;
	private final AnimatedModelRenderer backpawleft;
	private final AnimatedModelRenderer tailbase;
	private final AnimatedModelRenderer tailtwo;
	private final AnimatedModelRenderer tailthree;
	private final AnimatedModelRenderer tailfour;
	private final AnimatedModelRenderer tailfive;
	private final AnimatedModelRenderer tailsix;
	private final AnimatedModelRenderer tailtip;

    public ModelQuokka()
    {
        textureWidth = 64;
    textureHeight = 64;
    body = new AnimatedModelRenderer(this);
		body.setRotationPoint(0.0F, 17.8F, -4.2F);
		body.setTextureOffset(0, 0).addBox(-4.5F, -4.0F, 0.0F, 9.0F, 7.0F, 10.0F, 0.0F, false);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		fronthump = new AnimatedModelRenderer(this);
		fronthump.setRotationPoint(0.1F, -2.3F, 3.4F);
		body.addChild(fronthump);
		setRotationAngle(fronthump, 0.2618F, 0.0F, 0.0F);
		fronthump.setTextureOffset(0, 17).addBox(-4.1F, -2.6F, -3.0F, 8.0F, 4.0F, 6.0F, -0.1F, false);
		fronthump.setModelRendererName("fronthump");
		this.registerModelRenderer(fronthump);

		backhump = new AnimatedModelRenderer(this);
		backhump.setRotationPoint(0.1F, -2.5F, 6.8F);
		body.addChild(backhump);
		setRotationAngle(backhump, -0.2182F, 0.0F, 0.0F);
		backhump.setTextureOffset(28, 0).addBox(-4.1F, -2.6F, -2.0F, 8.0F, 4.0F, 5.0F, 0.0F, false);
		backhump.setModelRendererName("backhump");
		this.registerModelRenderer(backhump);

		neckhump = new AnimatedModelRenderer(this);
		neckhump.setRotationPoint(0.5F, -1.0F, 0.7F);
		body.addChild(neckhump);
		setRotationAngle(neckhump, 0.5236F, 0.0F, 0.0F);
		neckhump.setTextureOffset(23, 23).addBox(-4.5F, -3.0F, -4.0F, 8.0F, 6.0F, 5.0F, -0.1F, false);
		neckhump.setModelRendererName("neckhump");
		this.registerModelRenderer(neckhump);

		neck = new AnimatedModelRenderer(this);
		neck.setRotationPoint(-0.4F, 0.8536F, -2.9392F);
		neckhump.addChild(neck);
		setRotationAngle(neck, -0.5236F, 0.0F, 0.0F);
		neck.setTextureOffset(15, 34).addBox(-3.0F, -2.5F, -2.6F, 6.0F, 5.0F, 3.0F, -0.2F, false);
		neck.setModelRendererName("neck");
		this.registerModelRenderer(neck);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.0F, -0.4F, -2.6F);
		neck.addChild(head);
		head.setTextureOffset(33, 34).addBox(-2.0F, -2.5F, -3.6F, 4.0F, 5.0F, 4.0F, -0.2F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		rightcheek = new AnimatedModelRenderer(this);
		rightcheek.setRotationPoint(-1.6F, 1.0464F, -2.4608F);
		head.addChild(rightcheek);
		setRotationAngle(rightcheek, 0.0F, 0.0F, -0.2094F);
		rightcheek.setTextureOffset(44, 9).addBox(-1.3F, -1.4464F, -1.9392F, 2.0F, 3.0F, 4.0F, -0.3F, false);
		rightcheek.setModelRendererName("rightcheek");
		this.registerModelRenderer(rightcheek);

		leftcheek = new AnimatedModelRenderer(this);
		leftcheek.setRotationPoint(1.4F, 1.0464F, -2.0608F);
		head.addChild(leftcheek);
		setRotationAngle(leftcheek, 0.0F, 0.0F, 0.2094F);
		leftcheek.setTextureOffset(39, 43).addBox(-0.6022F, -1.4672F, -2.3392F, 2.0F, 3.0F, 4.0F, -0.3F, false);
		leftcheek.setModelRendererName("leftcheek");
		this.registerModelRenderer(leftcheek);

		snout = new AnimatedModelRenderer(this);
		snout.setRotationPoint(-0.1F, 0.7464F, -2.9608F);
		head.addChild(snout);
		snout.setTextureOffset(25, 43).addBox(-1.9F, -1.2464F, -2.7392F, 4.0F, 3.0F, 3.0F, -0.4F, false);
		snout.setModelRendererName("snout");
		this.registerModelRenderer(snout);

		jaw = new AnimatedModelRenderer(this);
		jaw.setRotationPoint(0.1F, 0.9536F, -0.4392F);
		snout.addChild(jaw);
		setRotationAngle(jaw, 0.2269F, 0.0F, 0.0F);
		jaw.setTextureOffset(0, 45).addBox(-1.5F, -0.2F, -1.7F, 3.0F, 1.0F, 2.0F, -0.1F, false);
		jaw.setModelRendererName("jaw");
		this.registerModelRenderer(jaw);

		nose = new AnimatedModelRenderer(this);
		nose.setRotationPoint(0.0F, 0.0F, -1.8F);
		snout.addChild(nose);
		setRotationAngle(nose, 0.1396F, 0.0F, 0.0F);
		nose.setTextureOffset(38, 9).addBox(-1.4F, -0.2464F, -1.7392F, 3.0F, 2.0F, 2.0F, -0.5F, false);
		nose.setModelRendererName("nose");
		this.registerModelRenderer(nose);

		noseblock = new AnimatedModelRenderer(this);
		noseblock.setRotationPoint(0.5F, -0.3404F, 0.4518F);
		nose.addChild(noseblock);
		setRotationAngle(noseblock, -0.3927F, 0.0F, 0.0F);
		noseblock.setTextureOffset(41, 55).addBox(-1.4F, -0.2464F, -1.7392F, 2.0F, 2.0F, 2.0F, -0.3F, false);
		noseblock.setModelRendererName("noseblock");
		this.registerModelRenderer(noseblock);

		snoutdiag = new AnimatedModelRenderer(this);
		snoutdiag.setRotationPoint(-0.1F, -0.1536F, -2.0608F);
		head.addChild(snoutdiag);
		setRotationAngle(snoutdiag, -0.7592F, 0.0F, 0.0F);
		snoutdiag.setTextureOffset(11, 42).addBox(-1.9F, -1.2464F, -2.7392F, 4.0F, 4.0F, 3.0F, -0.6F, false);
		snoutdiag.setModelRendererName("snoutdiag");
		this.registerModelRenderer(snoutdiag);

		earright = new AnimatedModelRenderer(this);
		earright.setRotationPoint(-1.7F, -1.9F, -1.1F);
		head.addChild(earright);
		setRotationAngle(earright, -0.4363F, -0.4189F, -0.5411F);
		earright.setTextureOffset(49, 26).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		earright.setModelRendererName("earright");
		this.registerModelRenderer(earright);

		earleft = new AnimatedModelRenderer(this);
		earleft.setRotationPoint(1.5F, -1.9F, -1.1F);
		head.addChild(earleft);
		setRotationAngle(earleft, -0.4363F, 0.4189F, 0.5411F);
		earleft.setTextureOffset(28, 17).addBox(0.1566F, -1.6228F, -0.9803F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		earleft.setModelRendererName("earleft");
		this.registerModelRenderer(earleft);

		butt = new AnimatedModelRenderer(this);
		butt.setRotationPoint(0.0F, 0.1F, 8.8F);
		body.addChild(butt);
		setRotationAngle(butt, -0.2182F, 0.0F, 0.0F);
		butt.setTextureOffset(0, 27).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 7.0F, 3.0F, -0.1F, false);
		butt.setModelRendererName("butt");
		this.registerModelRenderer(butt);

		frontthighright = new AnimatedModelRenderer(this);
		frontthighright.setRotationPoint(-1.1F, 20.0F, -4.8F);
		setRotationAngle(frontthighright, 0.0873F, 0.0F, 0.0F);
		frontthighright.setTextureOffset(47, 41).addBox(-1.8F, -0.6F, -1.0F, 2.0F, 3.0F, 2.0F, 0.1F, false);
		frontthighright.setModelRendererName("frontthighright");
		this.registerModelRenderer(frontthighright);

		frontlegright = new AnimatedModelRenderer(this);
		frontlegright.setRotationPoint(-0.8F, 1.9F, 0.0F);
		frontthighright.addChild(frontlegright);
		setRotationAngle(frontlegright, -0.4712F, 0.0F, 0.0F);
		frontlegright.setTextureOffset(6, 0).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		frontlegright.setModelRendererName("frontlegright");
		this.registerModelRenderer(frontlegright);

		frontpawright = new AnimatedModelRenderer(this);
		frontpawright.setRotationPoint(0.0F, 0.5956F, -0.4065F);
		frontlegright.addChild(frontpawright);
		setRotationAngle(frontpawright, 0.384F, 0.0F, 0.0F);
		frontpawright.setTextureOffset(30, 34).addBox(-0.5F, 0.8F, -1.5F, 1.0F, 1.0F, 2.0F, -0.1F, false);
		frontpawright.setModelRendererName("frontpawright");
		this.registerModelRenderer(frontpawright);

		frontthighleft = new AnimatedModelRenderer(this);
		frontthighleft.setRotationPoint(1.3F, 20.0F, -4.8F);
		setRotationAngle(frontthighleft, 0.0873F, 0.0F, 0.0F);
		frontthighleft.setTextureOffset(47, 32).addBox(-0.2F, -0.6F, -1.0F, 2.0F, 3.0F, 2.0F, 0.1F, false);
		frontthighleft.setModelRendererName("frontthighleft");
		this.registerModelRenderer(frontthighleft);

		frontlegleft = new AnimatedModelRenderer(this);
		frontlegleft.setRotationPoint(0.8F, 1.9F, 0.0F);
		frontthighleft.addChild(frontlegleft);
		setRotationAngle(frontlegleft, -0.4712F, 0.0F, 0.0F);
		frontlegleft.setTextureOffset(0, 0).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		frontlegleft.setModelRendererName("frontlegleft");
		this.registerModelRenderer(frontlegleft);

		frontpawleft = new AnimatedModelRenderer(this);
		frontpawleft.setRotationPoint(0.0F, 0.5956F, -0.4065F);
		frontlegleft.addChild(frontpawleft);
		setRotationAngle(frontpawleft, 0.384F, 0.0F, 0.0F);
		frontpawleft.setTextureOffset(15, 27).addBox(-0.5F, 0.8F, -1.5F, 1.0F, 1.0F, 2.0F, -0.1F, false);
		frontpawleft.setModelRendererName("frontpawleft");
		this.registerModelRenderer(frontpawleft);

		backthighright = new AnimatedModelRenderer(this);
		backthighright.setRotationPoint(-2.9F, 20.0F, 3.2F);
		setRotationAngle(backthighright, 0.0873F, 0.0F, 0.0F);
		backthighright.setTextureOffset(0, 37).addBox(-1.8F, -2.4F, -1.9F, 3.0F, 4.0F, 4.0F, 0.1F, false);
		backthighright.setModelRendererName("backthighright");
		this.registerModelRenderer(backthighright);

		backlegtopright = new AnimatedModelRenderer(this);
		backlegtopright.setRotationPoint(0.5F, 0.6F, 0.2F);
		backthighright.addChild(backlegtopright);
		setRotationAngle(backlegtopright, 0.0524F, 0.0F, 0.0F);
		backlegtopright.setTextureOffset(44, 21).addBox(-1.8F, -0.4F, -1.9F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		backlegtopright.setModelRendererName("backlegtopright");
		this.registerModelRenderer(backlegtopright);

		backlegbottomright = new AnimatedModelRenderer(this);
		backlegbottomright.setRotationPoint(0.5F, -0.0418F, -0.2971F);
		backlegtopright.addChild(backlegbottomright);
		backlegbottomright.setTextureOffset(49, 0).addBox(-1.8F, -0.4F, -0.9F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		backlegbottomright.setModelRendererName("backlegbottomright");
		this.registerModelRenderer(backlegbottomright);

		backpawright = new AnimatedModelRenderer(this);
		backpawright.setRotationPoint(-1.3F, 2.4349F, 0.1997F);
		backlegbottomright.addChild(backpawright);
		setRotationAngle(backpawright, -0.1396F, 0.0F, 0.0F);
		backpawright.setTextureOffset(22, 17).addBox(-0.5F, -0.1F, -2.9F, 1.0F, 1.0F, 4.0F, 0.1F, false);
		backpawright.setModelRendererName("backpawright");
		this.registerModelRenderer(backpawright);

		backthighleft = new AnimatedModelRenderer(this);
		backthighleft.setRotationPoint(2.9F, 20.0F, 3.2F);
		setRotationAngle(backthighleft, 0.0873F, 0.0F, 0.0F);
		backthighleft.setTextureOffset(34, 13).addBox(-1.2F, -2.4F, -1.9F, 3.0F, 4.0F, 4.0F, 0.1F, false);
		backthighleft.setModelRendererName("backthighleft");
		this.registerModelRenderer(backthighleft);

		backlegtopleft = new AnimatedModelRenderer(this);
		backlegtopleft.setRotationPoint(-0.5F, 0.6F, 0.2F);
		backthighleft.addChild(backlegtopleft);
		setRotationAngle(backlegtopleft, 0.0524F, 0.0F, 0.0F);
		backlegtopleft.setTextureOffset(0, 5).addBox(-0.2F, -0.4F, -1.9F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		backlegtopleft.setModelRendererName("backlegtopleft");
		this.registerModelRenderer(backlegtopleft);

		backlegbottomleft = new AnimatedModelRenderer(this);
		backlegbottomleft.setRotationPoint(-0.5F, -0.0418F, -0.2971F);
		backlegtopleft.addChild(backlegbottomleft);
		backlegbottomleft.setTextureOffset(0, 17).addBox(0.8F, -0.4F, -0.9F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		backlegbottomleft.setModelRendererName("backlegbottomleft");
		this.registerModelRenderer(backlegbottomleft);

		backpawleft = new AnimatedModelRenderer(this);
		backpawleft.setRotationPoint(1.3F, 2.4349F, 0.1997F);
		backlegbottomleft.addChild(backpawleft);
		setRotationAngle(backpawleft, -0.1396F, 0.0F, 0.0F);
		backpawleft.setTextureOffset(0, 0).addBox(-0.5F, -0.1F, -2.9F, 1.0F, 1.0F, 4.0F, 0.1F, false);
		backpawleft.setModelRendererName("backpawleft");
		this.registerModelRenderer(backpawleft);

		tailbase = new AnimatedModelRenderer(this);
		tailbase.setRotationPoint(0.1F, 19.7F, 6.9F);
		tailbase.setTextureOffset(49, 49).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 2.0F, 2.0F, -0.2F, false);
		tailbase.setModelRendererName("tailbase");
		this.registerModelRenderer(tailbase);

		tailtwo = new AnimatedModelRenderer(this);
		tailtwo.setRotationPoint(0.0F, 0.0F, 1.2F);
		tailbase.addChild(tailtwo);
		tailtwo.setTextureOffset(32, 49).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 2.0F, -0.3F, false);
		tailtwo.setModelRendererName("tailtwo");
		this.registerModelRenderer(tailtwo);

		tailthree = new AnimatedModelRenderer(this);
		tailthree.setRotationPoint(0.0F, 0.0F, 1.2F);
		tailtwo.addChild(tailthree);
		tailthree.setTextureOffset(24, 49).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 2.0F, 2.0F, -0.4F, false);
		tailthree.setModelRendererName("tailthree");
		this.registerModelRenderer(tailthree);

		tailfour = new AnimatedModelRenderer(this);
		tailfour.setRotationPoint(0.0F, 0.0F, 1.1F);
		tailthree.addChild(tailfour);
		tailfour.setTextureOffset(16, 49).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 2.0F, 2.0F, -0.4F, false);
		tailfour.setModelRendererName("tailfour");
		this.registerModelRenderer(tailfour);

		tailfive = new AnimatedModelRenderer(this);
		tailfive.setRotationPoint(0.0F, 0.0F, 1.2F);
		tailfour.addChild(tailfive);
		tailfive.setTextureOffset(8, 49).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		tailfive.setModelRendererName("tailfive");
		this.registerModelRenderer(tailfive);

		tailsix = new AnimatedModelRenderer(this);
		tailsix.setRotationPoint(0.0F, 0.0F, 0.8F);
		tailfive.addChild(tailsix);
		tailsix.setTextureOffset(48, 16).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		tailsix.setModelRendererName("tailsix");
		this.registerModelRenderer(tailsix);

		tailtip = new AnimatedModelRenderer(this);
		tailtip.setRotationPoint(0.0F, 0.0F, 1.0F);
		tailsix.addChild(tailtip);
		tailtip.setTextureOffset(0, 48).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 2.0F, 2.0F, -0.6F, false);
		tailtip.setModelRendererName("tailtip");
		this.registerModelRenderer(tailtip);

    this.rootBones.add(body);
		this.rootBones.add(frontthighright);
		this.rootBones.add(frontthighleft);
		this.rootBones.add(backthighright);
		this.rootBones.add(backthighleft);
		this.rootBones.add(tailbase);
    }

    
    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("pawprints", "models/animations/quokkaentity.json");
    }
}
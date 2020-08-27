package plum.pawprints.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityPinkfairy;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class ModelPinkfairy extends AnimatedEntityModel<EntityPinkfairy> {

    private final AnimatedModelRenderer bigbodyfront;
	private final AnimatedModelRenderer bigbodyback;
	private final AnimatedModelRenderer bodyback;
	private final AnimatedModelRenderer butt;
	private final AnimatedModelRenderer bodyneck;
	private final AnimatedModelRenderer thighleftfront;
	private final AnimatedModelRenderer legleftfront;
	private final AnimatedModelRenderer leftpawfront;
	private final AnimatedModelRenderer leftpawbasefront;
	private final AnimatedModelRenderer leftfrontclawleft;
	private final AnimatedModelRenderer leftfrontclawright;
	private final AnimatedModelRenderer leftfrontclawmiddle;
	private final AnimatedModelRenderer thighrightfront;
	private final AnimatedModelRenderer legrightfront;
	private final AnimatedModelRenderer rightpawfront;
	private final AnimatedModelRenderer rightpawbasefront;
	private final AnimatedModelRenderer rightfrontclawright;
	private final AnimatedModelRenderer rightfrontclawleft;
	private final AnimatedModelRenderer rightfrontclawmiddle;
	private final AnimatedModelRenderer thighrightback;
	private final AnimatedModelRenderer legrightback;
	private final AnimatedModelRenderer rightpawback;
	private final AnimatedModelRenderer rightpawbaseback;
	private final AnimatedModelRenderer rightbackclawright;
	private final AnimatedModelRenderer rightbackclawleft;
	private final AnimatedModelRenderer rightbackclawmiddle;
	private final AnimatedModelRenderer thighleftback;
	private final AnimatedModelRenderer legleftback;
	private final AnimatedModelRenderer leftpawback;
	private final AnimatedModelRenderer leftpawbaseback;
	private final AnimatedModelRenderer leftbackclawright;
	private final AnimatedModelRenderer leftbackclawleft;
	private final AnimatedModelRenderer leftbackclawmiddle;
	private final AnimatedModelRenderer tailbase;
	private final AnimatedModelRenderer tailtwo;
	private final AnimatedModelRenderer tailthree;
	private final AnimatedModelRenderer tailfour;
	private final AnimatedModelRenderer tailfive;
	private final AnimatedModelRenderer tailtipbig;
	private final AnimatedModelRenderer tailtipsmall;
	private final AnimatedModelRenderer neckfur;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer headfront;
	private final AnimatedModelRenderer snout;
	private final AnimatedModelRenderer headdiag;

    public ModelPinkfairy()
    {
        textureWidth = 64;
    textureHeight = 64;
    bigbodyfront = new AnimatedModelRenderer(this);
		bigbodyfront.setRotationPoint(0.0F, 19.2F, -0.5F);
		setRotationAngle(bigbodyfront, 0.0436F, 0.0F, 0.0F);
		bigbodyfront.setTextureOffset(0, 11).addBox(-3.1F, -2.7395F, -3.3871F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		bigbodyfront.setModelRendererName("bigbodyfront");
		this.registerModelRenderer(bigbodyfront);

		bigbodyback = new AnimatedModelRenderer(this);
		bigbodyback.setRotationPoint(-0.1F, 0.2006F, 1.4956F);
		bigbodyfront.addChild(bigbodyback);
		setRotationAngle(bigbodyback, -0.1396F, 0.0F, 0.0F);
		bigbodyback.setTextureOffset(0, 0).addBox(-3.0F, -2.9391F, -0.2993F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		bigbodyback.setModelRendererName("bigbodyback");
		this.registerModelRenderer(bigbodyback);

		bodyback = new AnimatedModelRenderer(this);
		bodyback.setRotationPoint(2.4F, 1.9209F, 10.4202F);
		bigbodyback.addChild(bodyback);
		setRotationAngle(bodyback, 0.1047F, 0.0F, 0.0F);
		bodyback.setTextureOffset(19, 19).addBox(-5.9F, -5.2937F, -6.993F, 7.0F, 5.0F, 3.0F, 0.2F, false);
		bodyback.setModelRendererName("bodyback");
		this.registerModelRenderer(bodyback);

		butt = new AnimatedModelRenderer(this);
		butt.setRotationPoint(-2.4F, -2.8434F, -4.9192F);
		bodyback.addChild(butt);
		setRotationAngle(butt, -0.3491F, 0.0F, 0.0F);
		butt.setTextureOffset(30, 30).addBox(-2.5F, -1.6302F, 0.2366F, 5.0F, 3.0F, 1.0F, 0.5F, false);
		butt.setModelRendererName("butt");
		this.registerModelRenderer(butt);

		bodyneck = new AnimatedModelRenderer(this);
		bodyneck.setRotationPoint(-0.1F, -0.2F, -4.0F);
		bigbodyfront.addChild(bodyneck);
		setRotationAngle(bodyneck, -0.0436F, 0.0F, 0.0F);
		bodyneck.setTextureOffset(20, 7).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 4.0F, 0.1F, false);
		bodyneck.setModelRendererName("bodyneck");
		this.registerModelRenderer(bodyneck);

		thighleftfront = new AnimatedModelRenderer(this);
		thighleftfront.setRotationPoint(2.4F, 17.4F, -1.8F);
		thighleftfront.setTextureOffset(0, 29).addBox(-1.0F, 0.8F, -1.6F, 2.0F, 4.0F, 3.0F, -0.1F, false);
		thighleftfront.setModelRendererName("thighleftfront");
		this.registerModelRenderer(thighleftfront);

		legleftfront = new AnimatedModelRenderer(this);
		legleftfront.setRotationPoint(0.9F, 3.6F, 0.0F);
		thighleftfront.addChild(legleftfront);
		setRotationAngle(legleftfront, 0.3752F, 0.0F, 0.0F);
		legleftfront.setTextureOffset(31, 27).addBox(-1.4F, 1.0304F, -0.6665F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		legleftfront.setModelRendererName("legleftfront");
		this.registerModelRenderer(legleftfront);

		leftpawfront = new AnimatedModelRenderer(this);
		leftpawfront.setRotationPoint(-0.9F, 1.0F, 0.1F);
		legleftfront.addChild(leftpawfront);
		leftpawfront.setTextureOffset(33, 27).addBox(-0.5F, 0.4219F, -1.5914F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		leftpawfront.setModelRendererName("leftpawfront");
		this.registerModelRenderer(leftpawfront);

		leftpawbasefront = new AnimatedModelRenderer(this);
		leftpawbasefront.setRotationPoint(0.0F, -0.6385F, -1.3028F);
		leftpawfront.addChild(leftpawbasefront);
		setRotationAngle(leftpawbasefront, -0.2094F, 0.0F, 0.0F);
		leftpawbasefront.setTextureOffset(2, 5).addBox(-0.5F, 1.8795F, -0.9612F, 1.0F, 0.0F, 1.0F, 0.3F, false);
		leftpawbasefront.setModelRendererName("leftpawbasefront");
		this.registerModelRenderer(leftpawbasefront);

		leftfrontclawleft = new AnimatedModelRenderer(this);
		leftfrontclawleft.setRotationPoint(0.5F, -0.1475F, -1.3303F);
		leftpawfront.addChild(leftfrontclawleft);
		setRotationAngle(leftfrontclawleft, -0.1571F, -0.1309F, 0.2094F);
		leftfrontclawleft.setTextureOffset(14, 11).addBox(-0.297F, 1.0222F, -2.5288F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		leftfrontclawleft.setModelRendererName("leftfrontclawleft");
		this.registerModelRenderer(leftfrontclawleft);

		leftfrontclawright = new AnimatedModelRenderer(this);
		leftfrontclawright.setRotationPoint(-0.4F, -0.1475F, -1.3303F);
		leftpawfront.addChild(leftfrontclawright);
		setRotationAngle(leftfrontclawright, -0.1571F, 0.1309F, -0.2094F);
		leftfrontclawright.setTextureOffset(14, 11).addBox(-0.8F, 1.0037F, -2.5446F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		leftfrontclawright.setModelRendererName("leftfrontclawright");
		this.registerModelRenderer(leftfrontclawright);

		leftfrontclawmiddle = new AnimatedModelRenderer(this);
		leftfrontclawmiddle.setRotationPoint(0.0F, -0.2434F, -0.7551F);
		leftpawfront.addChild(leftfrontclawmiddle);
		setRotationAngle(leftfrontclawmiddle, -0.1571F, 0.0F, 0.0F);
		leftfrontclawmiddle.setTextureOffset(0, 0).addBox(-0.5F, 1.0275F, -3.2929F, 1.0F, 0.0F, 4.0F, -0.1F, false);
		leftfrontclawmiddle.setModelRendererName("leftfrontclawmiddle");
		this.registerModelRenderer(leftfrontclawmiddle);

		thighrightfront = new AnimatedModelRenderer(this);
		thighrightfront.setRotationPoint(-2.6F, 18.4F, -1.8F);
		thighrightfront.setTextureOffset(20, 27).addBox(-1.0F, -0.2F, -1.6F, 2.0F, 4.0F, 3.0F, -0.1F, false);
		thighrightfront.setModelRendererName("thighrightfront");
		this.registerModelRenderer(thighrightfront);

		legrightfront = new AnimatedModelRenderer(this);
		legrightfront.setRotationPoint(-0.9F, 3.6F, 0.0F);
		thighrightfront.addChild(legrightfront);
		setRotationAngle(legrightfront, 0.3752F, 0.0F, 0.0F);
		legrightfront.setTextureOffset(28, 16).addBox(0.4F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		legrightfront.setModelRendererName("legrightfront");
		this.registerModelRenderer(legrightfront);

		rightpawfront = new AnimatedModelRenderer(this);
		rightpawfront.setRotationPoint(0.9F, 1.0F, 0.1F);
		legrightfront.addChild(rightpawfront);
		rightpawfront.setTextureOffset(30, 16).addBox(-0.5F, -0.5085F, -1.2249F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		rightpawfront.setModelRendererName("rightpawfront");
		this.registerModelRenderer(rightpawfront);

		rightpawbasefront = new AnimatedModelRenderer(this);
		rightpawbasefront.setRotationPoint(0.0F, -0.6385F, -1.3028F);
		rightpawfront.addChild(rightpawbasefront);
		setRotationAngle(rightpawbasefront, -0.2094F, 0.0F, 0.0F);
		rightpawbasefront.setTextureOffset(2, 5).addBox(-0.5F, 0.8932F, -0.7961F, 1.0F, 0.0F, 1.0F, 0.3F, false);
		rightpawbasefront.setModelRendererName("rightpawbasefront");
		this.registerModelRenderer(rightpawbasefront);

		rightfrontclawright = new AnimatedModelRenderer(this);
		rightfrontclawright.setRotationPoint(-0.5F, -0.1475F, -1.3303F);
		rightpawfront.addChild(rightfrontclawright);
		setRotationAngle(rightfrontclawright, -0.1571F, 0.1309F, -0.2094F);
		rightfrontclawright.setTextureOffset(14, 11).addBox(-0.5591F, 0.0626F, -2.2873F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		rightfrontclawright.setModelRendererName("rightfrontclawright");
		this.registerModelRenderer(rightfrontclawright);

		rightfrontclawleft = new AnimatedModelRenderer(this);
		rightfrontclawleft.setRotationPoint(0.4F, -0.1475F, -1.3303F);
		rightpawfront.addChild(rightfrontclawleft);
		setRotationAngle(rightfrontclawleft, -0.1571F, -0.1309F, 0.2094F);
		rightfrontclawleft.setTextureOffset(14, 11).addBox(-0.3439F, 0.044F, -2.3032F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		rightfrontclawleft.setModelRendererName("rightfrontclawleft");
		this.registerModelRenderer(rightfrontclawleft);

		rightfrontclawmiddle = new AnimatedModelRenderer(this);
		rightfrontclawmiddle.setRotationPoint(0.0F, -0.2434F, -0.7551F);
		rightpawfront.addChild(rightfrontclawmiddle);
		setRotationAngle(rightfrontclawmiddle, -0.1571F, 0.0F, 0.0F);
		rightfrontclawmiddle.setTextureOffset(0, 0).addBox(-0.5F, 0.0512F, -3.0765F, 1.0F, 0.0F, 4.0F, -0.1F, false);
		rightfrontclawmiddle.setModelRendererName("rightfrontclawmiddle");
		this.registerModelRenderer(rightfrontclawmiddle);

		thighrightback = new AnimatedModelRenderer(this);
		thighrightback.setRotationPoint(-3.0F, 18.5F, 4.4F);
		setRotationAngle(thighrightback, -0.0524F, 0.0F, 0.0F);
		thighrightback.setTextureOffset(8, 25).addBox(-1.0F, 0.8F, -2.0F, 2.0F, 3.0F, 4.0F, -0.1F, false);
		thighrightback.setModelRendererName("thighrightback");
		this.registerModelRenderer(thighrightback);

		legrightback = new AnimatedModelRenderer(this);
		legrightback.setRotationPoint(-0.9F, 3.6F, 0.0F);
		thighrightback.addChild(legrightback);
		setRotationAngle(legrightback, 0.3752F, 0.0F, 0.0F);
		legrightback.setTextureOffset(19, 27).addBox(0.4F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		legrightback.setModelRendererName("legrightback");
		this.registerModelRenderer(legrightback);

		rightpawback = new AnimatedModelRenderer(this);
		rightpawback.setRotationPoint(0.9F, 1.1579F, -0.0583F);
		legrightback.addChild(rightpawback);
		setRotationAngle(rightpawback, -0.192F, 0.0F, 0.0F);
		rightpawback.setTextureOffset(27, 27).addBox(-0.5F, -0.5085F, -1.2249F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		rightpawback.setModelRendererName("rightpawback");
		this.registerModelRenderer(rightpawback);

		rightpawbaseback = new AnimatedModelRenderer(this);
		rightpawbaseback.setRotationPoint(0.0F, -0.5794F, -0.9072F);
		rightpawback.addChild(rightpawbaseback);
		setRotationAngle(rightpawbaseback, -0.0349F, 0.0F, 0.0F);
		rightpawbaseback.setTextureOffset(2, 5).addBox(-0.5F, 0.8932F, -0.7961F, 1.0F, 0.0F, 1.0F, 0.3F, false);
		rightpawbaseback.setModelRendererName("rightpawbaseback");
		this.registerModelRenderer(rightpawbaseback);

		rightbackclawright = new AnimatedModelRenderer(this);
		rightbackclawright.setRotationPoint(-0.5F, -0.0527F, -0.6367F);
		rightpawback.addChild(rightbackclawright);
		setRotationAngle(rightbackclawright, 0.0F, 0.1309F, -0.2094F);
		rightbackclawright.setTextureOffset(14, 11).addBox(-0.5591F, 0.0626F, -2.2873F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		rightbackclawright.setModelRendererName("rightbackclawright");
		this.registerModelRenderer(rightbackclawright);

		rightbackclawleft = new AnimatedModelRenderer(this);
		rightbackclawleft.setRotationPoint(0.4F, -0.0527F, -0.6367F);
		rightpawback.addChild(rightbackclawleft);
		setRotationAngle(rightbackclawleft, 0.0F, -0.1309F, 0.2094F);
		rightbackclawleft.setTextureOffset(14, 11).addBox(-0.3439F, 0.044F, -2.3032F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		rightbackclawleft.setModelRendererName("rightbackclawleft");
		this.registerModelRenderer(rightbackclawleft);

		rightbackclawmiddle = new AnimatedModelRenderer(this);
		rightbackclawmiddle.setRotationPoint(0.0F, -0.1485F, -0.0616F);
		rightpawback.addChild(rightbackclawmiddle);
		rightbackclawmiddle.setTextureOffset(0, 0).addBox(-0.5F, 0.0512F, -3.0765F, 1.0F, 0.0F, 4.0F, -0.1F, false);
		rightbackclawmiddle.setModelRendererName("rightbackclawmiddle");
		this.registerModelRenderer(rightbackclawmiddle);

		thighleftback = new AnimatedModelRenderer(this);
		thighleftback.setRotationPoint(2.8F, 18.5F, 4.4F);
		setRotationAngle(thighleftback, -0.0524F, 0.0F, 0.0F);
		thighleftback.setTextureOffset(24, 0).addBox(-1.0F, 0.8F, -2.0F, 2.0F, 3.0F, 4.0F, -0.1F, false);
		thighleftback.setModelRendererName("thighleftback");
		this.registerModelRenderer(thighleftback);

		legleftback = new AnimatedModelRenderer(this);
		legleftback.setRotationPoint(0.9F, 3.6F, 0.0F);
		thighleftback.addChild(legleftback);
		setRotationAngle(legleftback, 0.3752F, 0.0F, 0.0F);
		legleftback.setTextureOffset(16, 26).addBox(-1.4F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		legleftback.setModelRendererName("legleftback");
		this.registerModelRenderer(legleftback);

		leftpawback = new AnimatedModelRenderer(this);
		leftpawback.setRotationPoint(-0.9F, 1.1579F, -0.0583F);
		legleftback.addChild(leftpawback);
		setRotationAngle(leftpawback, -0.192F, 0.0F, 0.0F);
		leftpawback.setTextureOffset(0, 2).addBox(-0.5F, -0.5085F, -1.2249F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		leftpawback.setModelRendererName("leftpawback");
		this.registerModelRenderer(leftpawback);

		leftpawbaseback = new AnimatedModelRenderer(this);
		leftpawbaseback.setRotationPoint(0.0F, -0.5794F, -0.9072F);
		leftpawback.addChild(leftpawbaseback);
		setRotationAngle(leftpawbaseback, -0.0349F, 0.0F, 0.0F);
		leftpawbaseback.setTextureOffset(0, 5).addBox(-0.5F, 0.8932F, -0.7961F, 1.0F, 0.0F, 1.0F, 0.3F, false);
		leftpawbaseback.setModelRendererName("leftpawbaseback");
		this.registerModelRenderer(leftpawbaseback);

		leftbackclawright = new AnimatedModelRenderer(this);
		leftbackclawright.setRotationPoint(0.5F, -0.0527F, -0.6367F);
		leftpawback.addChild(leftbackclawright);
		setRotationAngle(leftbackclawright, 0.0F, -0.1309F, 0.2094F);
		leftbackclawright.setTextureOffset(14, 11).addBox(-0.4409F, 0.0626F, -2.2873F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		leftbackclawright.setModelRendererName("leftbackclawright");
		this.registerModelRenderer(leftbackclawright);

		leftbackclawleft = new AnimatedModelRenderer(this);
		leftbackclawleft.setRotationPoint(-0.4F, -0.0527F, -0.6367F);
		leftpawback.addChild(leftbackclawleft);
		setRotationAngle(leftbackclawleft, 0.0F, 0.1309F, -0.2094F);
		leftbackclawleft.setTextureOffset(0, 11).addBox(-0.6561F, 0.044F, -2.3032F, 1.0F, 0.0F, 3.0F, -0.1F, false);
		leftbackclawleft.setModelRendererName("leftbackclawleft");
		this.registerModelRenderer(leftbackclawleft);

		leftbackclawmiddle = new AnimatedModelRenderer(this);
		leftbackclawmiddle.setRotationPoint(0.0F, -0.1485F, -0.0616F);
		leftpawback.addChild(leftbackclawmiddle);
		leftbackclawmiddle.setTextureOffset(0, 0).addBox(-0.5F, 0.0512F, -3.0765F, 1.0F, 0.0F, 4.0F, -0.1F, false);
		leftbackclawmiddle.setModelRendererName("leftbackclawmiddle");
		this.registerModelRenderer(leftbackclawmiddle);

		tailbase = new AnimatedModelRenderer(this);
		tailbase.setRotationPoint(-0.15F, 20.3F, 7.65F);
		tailbase.setTextureOffset(24, 0).addBox(-0.45F, -0.3F, -0.25F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		tailbase.setModelRendererName("tailbase");
		this.registerModelRenderer(tailbase);

		tailtwo = new AnimatedModelRenderer(this);
		tailtwo.setRotationPoint(0.0F, 0.0F, 0.7F);
		tailbase.addChild(tailtwo);
		tailtwo.setTextureOffset(15, 21).addBox(-0.45F, -0.3F, -0.25F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		tailtwo.setModelRendererName("tailtwo");
		this.registerModelRenderer(tailtwo);

		tailthree = new AnimatedModelRenderer(this);
		tailthree.setRotationPoint(0.0F, 0.0F, 0.7F);
		tailtwo.addChild(tailthree);
		tailthree.setTextureOffset(18, 4).addBox(-0.45F, -0.3F, -0.25F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		tailthree.setModelRendererName("tailthree");
		this.registerModelRenderer(tailthree);

		tailfour = new AnimatedModelRenderer(this);
		tailfour.setRotationPoint(0.0F, 0.0F, 0.7F);
		tailthree.addChild(tailfour);
		tailfour.setTextureOffset(0, 13).addBox(-0.45F, -0.3F, -0.25F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		tailfour.setModelRendererName("tailfour");
		this.registerModelRenderer(tailfour);

		tailfive = new AnimatedModelRenderer(this);
		tailfive.setRotationPoint(0.0F, 0.0F, 0.6F);
		tailfour.addChild(tailfive);
		tailfive.setTextureOffset(0, 0).addBox(-0.45F, -0.3F, -0.25F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		tailfive.setModelRendererName("tailfive");
		this.registerModelRenderer(tailfive);

		tailtipbig = new AnimatedModelRenderer(this);
		tailtipbig.setRotationPoint(0.5F, 0.0F, 0.4F);
		tailfive.addChild(tailtipbig);
		tailtipbig.setTextureOffset(22, 16).addBox(-1.45F, -0.3F, -0.25F, 2.0F, 1.0F, 2.0F, -0.3F, false);
		tailtipbig.setModelRendererName("tailtipbig");
		this.registerModelRenderer(tailtipbig);

		tailtipsmall = new AnimatedModelRenderer(this);
		tailtipsmall.setRotationPoint(0.0F, 0.0F, 0.9F);
		tailtipbig.addChild(tailtipsmall);
		setRotationAngle(tailtipsmall, -0.1309F, 0.0F, 0.0F);
		tailtipsmall.setTextureOffset(9, 21).addBox(-1.45F, -0.3F, -0.25F, 2.0F, 1.0F, 2.0F, -0.7F, false);
		tailtipsmall.setModelRendererName("tailtipsmall");
		this.registerModelRenderer(tailtipsmall);

		neckfur = new AnimatedModelRenderer(this);
		neckfur.setRotationPoint(-0.2F, 18.5F, -7.3F);
		setRotationAngle(neckfur, 1.0647F, 0.0F, 0.0F);
		neckfur.setTextureOffset(0, 21).addBox(-1.4F, -0.6123F, -1.9798F, 3.0F, 5.0F, 3.0F, -0.5F, false);
		neckfur.setModelRendererName("neckfur");
		this.registerModelRenderer(neckfur);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(-2.9F, 18.4F, -4.3F);
		head.setTextureOffset(10, 32).addBox(1.3F, -1.8F, -2.5F, 3.0F, 3.0F, 2.0F, 0.3F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		headfront = new AnimatedModelRenderer(this);
		headfront.setRotationPoint(-0.5F, 0.0F, -2.2F);
		head.addChild(headfront);
		headfront.setTextureOffset(20, 34).addBox(2.3F, -0.7F, -2.3F, 2.0F, 2.0F, 2.0F, 0.1F, false);
		headfront.setModelRendererName("headfront");
		this.registerModelRenderer(headfront);

		snout = new AnimatedModelRenderer(this);
		snout.setRotationPoint(1.0F, 0.6F, -1.7F);
		headfront.addChild(snout);
		setRotationAngle(snout, 0.1745F, 0.0F, 0.0F);
		snout.setTextureOffset(18, 0).addBox(1.3F, -1.1F, -1.6F, 2.0F, 2.0F, 2.0F, -0.2F, false);
		snout.setModelRendererName("snout");
		this.registerModelRenderer(snout);

		headdiag = new AnimatedModelRenderer(this);
		headdiag.setRotationPoint(2.0F, 0.8F, -1.1F);
		headfront.addChild(headdiag);
		setRotationAngle(headdiag, 0.6545F, 0.0F, 0.0F);
		headdiag.setTextureOffset(32, 0).addBox(0.3F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		headdiag.setModelRendererName("headdiag");
		this.registerModelRenderer(headdiag);

    this.rootBones.add(bigbodyfront);
		this.rootBones.add(thighleftfront);
		this.rootBones.add(thighrightfront);
		this.rootBones.add(thighrightback);
		this.rootBones.add(thighleftback);
		this.rootBones.add(tailbase);
		this.rootBones.add(neckfur);
		this.rootBones.add(head);
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
        return new ResourceLocation("pawprints", "models/animations/pinkfairyentity.json");
    }
}
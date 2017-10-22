// Date: 28.09.2016 16:16:17
// Template version 1.1
// Java generated by Techne
package pokefenn.totemic.client.rendering.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;

public class ModelBaykok extends ModelBiped
{
    public ModelBaykok()
    {
        this(0.0F, false);
    }

    public ModelBaykok(float modelSize, boolean isArmor)
    {
        super(modelSize, 0.0F, 64, isArmor ? 32 : 64);

        rightArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;

        bipedHead = new ModelRenderer(this, 0, 0);
        bipedHead.addBox(-4F, -9F, -4F, 8, 8, 8, modelSize);
        bipedHead.setRotationPoint(0F, 0F, 0F);
        bipedHead.mirror = true;
        setRotation(bipedHead, 0F, 0F, 0F);
        bipedHeadwear = new ModelRenderer(this, 0, 0);
        bipedHeadwear.setRotationPoint(0F, 0F, 0F);
        bipedHeadwear.mirror = true;
        setRotation(bipedHeadwear, 0F, 0F, 0F);

        if(!isArmor)
        {
            ModelRenderer headdress1 = new ModelRenderer(this, 32, 0);
            headdress1.addBox(-0.5F, -14F, -1F, 2, 6, 2, modelSize);
            headdress1.setRotationPoint(0F, 0F, 0F);
            headdress1.mirror = true;
            setRotation(headdress1, -0.1745329F, 0F, -0.4712389F);
            bipedHead.addChild(headdress1);
            ModelRenderer headdress2 = new ModelRenderer(this, 32, 0);
            headdress2.addBox(-1F, -14F, -1F, 2, 6, 2, modelSize);
            headdress2.setRotationPoint(0F, 0F, 0F);
            headdress2.mirror = true;
            setRotation(headdress2, -0.1745329F, 0F, -0.2268928F);
            bipedHead.addChild(headdress2);
            ModelRenderer headdress3 = new ModelRenderer(this, 32, 0);
            headdress3.addBox(-1F, -14F, -1F, 2, 6, 2, modelSize);
            headdress3.setRotationPoint(0F, 0F, 0F);
            headdress3.mirror = true;
            setRotation(headdress3, -0.1745329F, 0F, 0F);
            bipedHead.addChild(headdress3);
            ModelRenderer headdress4 = new ModelRenderer(this, 32, 0);
            headdress4.addBox(-1F, -14F, -1F, 2, 6, 2, modelSize);
            headdress4.setRotationPoint(0F, 0F, 0F);
            headdress4.mirror = true;
            setRotation(headdress4, -0.1745329F, 0F, 0.2268928F);
            bipedHead.addChild(headdress4);
            ModelRenderer headdress5 = new ModelRenderer(this, 32, 0);
            headdress5.addBox(-1.5F, -14F, -1F, 2, 6, 2, modelSize);
            headdress5.setRotationPoint(0F, 0F, 0F);
            headdress5.mirror = true;
            setRotation(headdress5, -0.1745329F, 0F, 0.4712389F);
            bipedHead.addChild(headdress5);

            bipedBody = new ModelRenderer(this);

            ModelRenderer ribs = new ModelRenderer(this, 0, 16);
            ribs.addBox(-3F, -1F, -2F, 6, 8, 4, modelSize);
            ribs.setRotationPoint(0F, 0F, 0F);
            ribs.mirror = true;
            setRotation(ribs, 0F, 0F, 0F);
            bipedBody.addChild(ribs);
            ModelRenderer quiver = new ModelRenderer(this, 24, 20);
            quiver.addBox(-5F, -2F, 2F, 4, 11, 2, modelSize);
            quiver.setRotationPoint(0F, 0F, 0F);
            quiver.mirror = true;
            setRotation(quiver, 0F, 0F, -0.5235988F);
            bipedBody.addChild(quiver);
            ModelRenderer spine = new ModelRenderer(this, 0, 28);
            spine.addBox(-1.5F, 7F, -2F, 3, 5, 4, modelSize);
            spine.setRotationPoint(0F, 0F, 0F);
            spine.mirror = true;
            setRotation(spine, 0F, 0F, 0F);
            bipedBody.addChild(spine);
            ModelRenderer pelvis = new ModelRenderer(this, 0, 37);
            pelvis.addBox(-4F, 11F, -2F, 8, 1, 4, modelSize);
            pelvis.setRotationPoint(0F, 0F, 0F);
            pelvis.mirror = true;
            setRotation(pelvis, 0F, 0F, 0F);
            bipedBody.addChild(pelvis);

            bipedLeftArm = new ModelRenderer(this, 42, 0);
            bipedLeftArm.addBox(-2F, -2F, -0.5F, 3, 13, 3, modelSize);
            bipedLeftArm.setRotationPoint(5F, 2F, 0F);
            bipedLeftArm.mirror = true;
            setRotation(bipedLeftArm, 0F, 0F, 0F);
            bipedRightArm = new ModelRenderer(this, 42, 0);
            bipedRightArm.addBox(-1F, -2F, -0.5F, 3, 13, 3, modelSize);
            bipedRightArm.setRotationPoint(-5F, 2F, 0F);
            bipedRightArm.mirror = true;
            setRotation(bipedRightArm, 0F, 0F, 0F);
            bipedLeftLeg = new ModelRenderer(this, 42, 16);
            bipedLeftLeg.addBox(-1F, 0F, -1.5F, 3, 12, 3, modelSize);
            bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
            bipedLeftLeg.setTextureSize(64, 64);
            bipedLeftLeg.mirror = true;
            setRotation(bipedLeftLeg, 0F, 0F, 0F);
            bipedRightLeg = new ModelRenderer(this, 42, 16);
            bipedRightLeg.addBox(-2F, 0F, -1.5F, 3, 12, 3, modelSize);
            bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
            bipedRightLeg.mirror = true;
            setRotation(bipedRightLeg, 0F, 0F, 0F);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, Entity entity)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

        bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F);
        bipedLeftArm.rotateAngleY = 0.35F;

        bipedRightArm.rotateAngleX = -((float)Math.PI / 2F);
        bipedRightArm.rotateAngleY = -0.1F;
    }

    @Override
    public void postRenderArm(float scale, EnumHandSide side)
    {
        super.postRenderArm(scale, side);
        if(side == EnumHandSide.RIGHT)
            GlStateManager.translate(0.04F, 0.0F, 0.085F);
        else
            GlStateManager.translate(-0.04F, 0.0F, 0.085F);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

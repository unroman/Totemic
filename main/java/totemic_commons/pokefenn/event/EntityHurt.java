package totemic_commons.pokefenn.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import totemic_commons.pokefenn.entity.spirit.EntitySpiritBase;
import totemic_commons.pokefenn.totem.TotemUtil;

/**
 * Created by Pokefenn.
 * Licensed under MIT (If this is one of my Mods)
 */
public class EntityHurt
{

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onEntityHurt(LivingHurtEvent event)
    {
        Entity sourceDamageEntity = event.source.getSourceOfDamage();

        if(event.entityLiving instanceof EntityPlayer && sourceDamageEntity != null)
        {
            if(TotemUtil.getArmourAmounts((EntityPlayer) event.entityLiving) == 4)
                sourceDamageEntity.attackEntityFrom(DamageSource.generic, event.ammount % 2);
        }

        if(event.entityLiving instanceof EntitySpiritBase && event.source != DamageSource.outOfWorld)
        {
            event.setCanceled(true);
        }
    }

}

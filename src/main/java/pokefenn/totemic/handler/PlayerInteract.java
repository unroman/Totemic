package pokefenn.totemic.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pokefenn.totemic.init.ModBlocks;
import pokefenn.totemic.init.ModItems;
import pokefenn.totemic.item.equipment.ItemTotemWhittlingKnife;
import pokefenn.totemic.network.NetworkHandler;
import pokefenn.totemic.network.client.PacketMouseWheel;

public class PlayerInteract
{
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onMouse(MouseEvent event)
    {
        if(event.isCanceled())
            return;

        if(event.getDwheel() != 0)
        {
            EntityPlayer player = Minecraft.getMinecraft().player;
            if(player.isSneaking() && player.getHeldItemMainhand().getItem() == ModItems.totem_whittling_knife)
            {
                boolean direction = (event.getDwheel() > 0);
                NetworkHandler.sendToServer(new PacketMouseWheel(direction));
                player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, ItemTotemWhittlingKnife.changeIndex(player.getHeldItemMainhand(), direction));
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event)
    {
        //Workaround to make left-clicking the Totem Base with a Totemic Staff work in creative mode
        if(!event.getWorld().isRemote && event.getEntityPlayer().isCreative() && event.getUseBlock() != Result.DENY)
        {
            if(event.getItemStack().getItem() == ModItems.totemic_staff && event.getWorld().getBlockState(event.getPos()).getBlock() == ModBlocks.totem_base)
            {
                ModBlocks.totem_base.onBlockClicked(event.getWorld(), event.getPos(), event.getEntityPlayer());
            }
        }
    }
}

package matteroverdrive.handler;

import com.brsanthu.googleanalytics.GoogleAnalyticsRequest;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Simeon on 1/7/2016.
 */
@SideOnly(Side.CLIENT)
public class GoogleAnalyticsClient extends GoogleAnalyticsCommon {
    @Override
    public GoogleAnalyticsRequest changeUserID(GoogleAnalyticsRequest request, EntityPlayer entityPlayer) {
        if (entityPlayer == null && Minecraft.getMinecraft().player != null) {
            request.userId(Minecraft.getMinecraft().player.getGameProfile().getId().toString());
            return request;
        }
        return super.changeUserID(request, entityPlayer);
    }
}

package mcjty.hologui.api.components;

import mcjty.hologui.api.IEvent;
import mcjty.hologui.api.IGuiComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public interface IStackToggle extends IGuiComponent<IStackToggle> {

    IStackToggle itemStack(@Nonnull ItemStack stack);

    IStackToggle getter(Function<PlayerEntity, Boolean> getter);

    IStackToggle hitEvent(IEvent event);

    IStackToggle scale(float scale);

    IStackToggle tooltipHandler(BiConsumer<ItemStack, List<String>> tooltipHandler);
}

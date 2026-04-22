package professorsalmon.fishingplus;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItems {
    private static final ResourceKey<Item> GOLDEN_SALMON_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath("fishing_plus", "golden_salmon")
    );

    public static final Item GOLDEN_SALMON = Registry.register(
            BuiltInRegistries.ITEM,
            GOLDEN_SALMON_KEY,
            new Item(new Item.Properties().setId(GOLDEN_SALMON_KEY))
    );

    public static void register() {}
}
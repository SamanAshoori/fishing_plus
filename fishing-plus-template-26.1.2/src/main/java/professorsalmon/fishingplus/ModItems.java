package professorsalmon.fishingplus;

import java.util.function.Function;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModItems {
    public static final Consumable GOLDEN_SALMON_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0),
                    1.0f
            ))
            .build();

    public static final FoodProperties GOLDEN_SALMON_FOOD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.2f)
            .build();

    public static final Item GOLDEN_SALMON = register(
            "golden_salmon",
            Item::new,
            new Item.Properties().food(GOLDEN_SALMON_FOOD, GOLDEN_SALMON_CONSUMABLE)
    );

    public static <T extends Item> T register(String name, Function<Item.Properties, T> factory, Item.Properties props) {
        ResourceKey<Item> key = ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath("fishing_plus", name)
        );
        T item = factory.apply(props.setId(key));
        Registry.register(BuiltInRegistries.ITEM, key, item);
        return item;
    }

    public static void register() {}
}
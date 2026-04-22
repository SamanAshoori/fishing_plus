package professorsalmon.fishingplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingPlus implements ModInitializer {
	public static final String MOD_ID = "fishing_plus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		registerLootModifications();
		LOGGER.info("Fishing Plus initialised!");
	}

	private void registerLootModifications() {
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
			if (key.equals(BuiltInLootTables.FISHING)) {
				tableBuilder.pool(LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.when(LootItemRandomChanceCondition.randomChance(0.5f)) //set to 50% for testing to see if it works
						.add(LootItem.lootTableItem(ModItems.GOLDEN_SALMON))
						.build());
			}
		});
	}
}
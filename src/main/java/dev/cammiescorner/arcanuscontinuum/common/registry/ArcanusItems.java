package dev.cammiescorner.arcanuscontinuum.common.registry;

import dev.cammiescorner.arcanuscontinuum.Arcanus;
import dev.cammiescorner.arcanuscontinuum.common.items.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.LinkedHashMap;

public class ArcanusItems {
	//-----Item Map-----//
	public static final LinkedHashMap<Item, Identifier> ITEMS = new LinkedHashMap<>();

	//-----Items-----//
	public static final Item COMPENDIUM_ARCANUS = create("compendium_arcanus", new CompendiumItem());
	public static final Item WOODEN_STAFF = create("wooden_staff", new StaffItem());
	public static final Item AMETHYST_SHARD_STAFF = create("amethyst_shard_staff", new StaffItem());
	public static final Item QUARTZ_SHARD_STAFF = create("quartz_shard_staff", new StaffItem());
	public static final Item ENDER_SHARD_STAFF = create("ender_shard_staff", new StaffItem());
	public static final Item ECHO_SHARD_STAFF = create("echo_shard_staff", new StaffItem());
	public static final Item WIZARD_HAT = create("wizard_hat", new WizardArmorItem(ArcanusArmourMaterials.WIZARD, EquipmentSlot.HEAD, 0.21));
	public static final Item WIZARD_ROBES = create("wizard_robes", new WizardArmorItem(ArcanusArmourMaterials.WIZARD, EquipmentSlot.CHEST, 0.34));
	public static final Item WIZARD_PANTS = create("wizard_pants", new WizardArmorItem(ArcanusArmourMaterials.WIZARD, EquipmentSlot.LEGS, 0.29));
	public static final Item WIZARD_BOOTS = create("wizard_boots", new WizardArmorItem(ArcanusArmourMaterials.WIZARD, EquipmentSlot.FEET, 0.16));
	public static final Item SPELL_BOOK = create("spell_book", new SpellBookItem());
	public static final Item SCROLL_OF_KNOWLEDGE = create("scroll_of_knowledge", new ScrollOfKnowledgeItem());
	public static final Item OPOSSUM_SPAWN_EGG = create("opossum_spawn_egg", new SpawnEggItem(ArcanusEntities.OPOSSUM, 0x131317, 0xBDBDBD, new QuiltItemSettings().group(Arcanus.ITEM_GROUP)));

	//-----Registry-----//
	public static void register() {
		ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
	}

	private static <T extends Item> T create(String name, T item) {
		ITEMS.put(item, Arcanus.id(name));
		return item;
	}
}

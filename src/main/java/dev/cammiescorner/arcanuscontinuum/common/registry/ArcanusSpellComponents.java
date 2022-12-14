package dev.cammiescorner.arcanuscontinuum.common.registry;

import dev.cammiescorner.arcanuscontinuum.Arcanus;
import dev.cammiescorner.arcanuscontinuum.api.spells.SpellComponent;
import dev.cammiescorner.arcanuscontinuum.api.spells.SpellEffect;
import dev.cammiescorner.arcanuscontinuum.api.spells.SpellShape;
import dev.cammiescorner.arcanuscontinuum.api.spells.Weight;
import dev.cammiescorner.arcanuscontinuum.common.spellcomponents.effects.DamageSpellEffect;
import dev.cammiescorner.arcanuscontinuum.common.spellcomponents.effects.HealSpellEffect;
import dev.cammiescorner.arcanuscontinuum.common.spellcomponents.shapes.SelfSpellShape;
import dev.cammiescorner.arcanuscontinuum.common.spellcomponents.shapes.TouchSpellShape;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;

public class ArcanusSpellComponents {
	//-----Spell Map-----//
	public static final LinkedHashMap<SpellComponent, Identifier> COMPONENTS = new LinkedHashMap<>();

	//-----Empty Spell-----//
	public static final SpellComponent EMPTY = create("empty", SpellShape.EMPTY);

	//-----Spell Forms-----//
	public static final SpellShape SELF = create("self_shape", new SelfSpellShape(Weight.VERY_LIGHT, 0, 1, 1));
	public static final SpellShape TOUCH = create("touch_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape PROJECTILE = create("projectile_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape LOB = create("lob_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape BOLT = create("bolt_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape BEAM = create("beam_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape RUNE = create("rune_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape SMITE = create("smite_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape AOE = create("aoe_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));
	public static final SpellShape VOID = create("void_shape", new TouchSpellShape(Weight.VERY_LIGHT, 0.5, 5, 1));

	//-----Spell Effects-----//
	public static final SpellEffect DAMAGE = create("damage_effect", new DamageSpellEffect(ParticleTypes.DAMAGE_INDICATOR, Weight.NONE, 3, 5, 1));
	public static final SpellEffect HEAL = create("heal_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect FIRE = create("fire_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect ELECTRIC = create("electric_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect ICE = create("ice_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect PUSH = create("push_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect PULL = create("pull_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect TELEPORT = create("teleport_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect EXCHANGE = create("exchange_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect DISPEL = create("dispel_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect MANA_LOCK = create("mana_lock_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect WITHERING = create("withering_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect REGENERATE = create("regenerate_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect VULNERABILITY = create("vulnerability_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect BOUNCY = create("bouncy_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect FEATHER = create("feather_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect POWER = create("power_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect NECROMANCY = create("necromancy_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect MANA_SPLIT = create("mana_split_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect ANONYMITY = create("anonymity_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect MINE = create("mine_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect BUILD = create("build_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect LEVITATE = create("levitate_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect TRANSMUTATE = create("transmutate_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));
	public static final SpellEffect GROWTH = create("growth_effect", new HealSpellEffect(ParticleTypes.HEART, Weight.NONE, 5, 5, 1));

	//-----Registry-----//
	public static void register() {
		COMPONENTS.keySet().forEach(item -> Registry.register(Arcanus.SPELL_COMPONENTS, COMPONENTS.get(item), item));
	}

	private static <T extends SpellComponent> T create(String name, T component) {
		COMPONENTS.put(component, Arcanus.id(name));

		return component;
	}
}

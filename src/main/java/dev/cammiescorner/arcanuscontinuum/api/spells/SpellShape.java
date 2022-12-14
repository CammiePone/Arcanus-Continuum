package dev.cammiescorner.arcanuscontinuum.api.spells;

import dev.cammiescorner.arcanuscontinuum.common.items.StaffItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public abstract class SpellShape extends SpellComponent {
	public static final SpellShape EMPTY = new SpellShape(Weight.NONE, 0, 20, 0) { @Override public void cast(LivingEntity caster, Vec3d castFrom, World world, StaffItem staffItem, List<SpellEffect> effects, List<SpellGroup> spellGroups, int groupIndex) { } };

	public SpellShape(Weight weight, double manaCost, int coolDown, int minLevel) {
		super(weight, manaCost, coolDown, minLevel);
	}

	public abstract void cast(LivingEntity caster, Vec3d castFrom, World world, StaffItem staffItem, List<SpellEffect> effects, List<SpellGroup> spellGroups, int groupIndex);
}

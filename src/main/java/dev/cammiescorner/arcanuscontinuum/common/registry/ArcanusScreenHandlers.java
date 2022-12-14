package dev.cammiescorner.arcanuscontinuum.common.registry;

import dev.cammiescorner.arcanuscontinuum.Arcanus;
import dev.cammiescorner.arcanuscontinuum.common.screens.SpellcraftScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;

public class ArcanusScreenHandlers {
	//-----Screen Handler Map-----//
	public static final LinkedHashMap<ScreenHandlerType<?>, Identifier> SCREEN_HANDLERS = new LinkedHashMap<>();

	//-----Screen Handlers-----//
	public static final ScreenHandlerType<SpellcraftScreenHandler> SPELLCRAFT_SCREEN_HANDLER = create("research_screen_handler", new ExtendedScreenHandlerType<>((syncId, inventory, buf) -> new SpellcraftScreenHandler(syncId, inventory, buf.readItemStack())));

	//-----Registry-----//
	public static void register() {
		SCREEN_HANDLERS.keySet().forEach(type -> Registry.register(Registry.SCREEN_HANDLER, SCREEN_HANDLERS.get(type), type));
	}

	private static <T extends ScreenHandlerType<?>> T create(String name, T type) {
		SCREEN_HANDLERS.put(type, Arcanus.id(name));
		return type;
	}
}

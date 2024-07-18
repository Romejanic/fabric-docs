package com.example.docs.component;

import com.mojang.serialization.Codec;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.example.docs.FabricDocsReference;

//::1
public class ModComponents {
	//::1

	//::2
	public static final ComponentType<Integer> CLICK_COUNT_COMPONENT = Registry.register(
		Registries.DATA_COMPONENT_TYPE,
		Identifier.of(FabricDocsReference.MOD_ID, "click_count"),
		ComponentType.<Integer>builder().codec(Codec.INT).build()
	);
	//::2

	//::3
	public static final ComponentType<MyCustomComponent> MY_CUSTOM_COMPONENT = Registry.register(
		Registries.DATA_COMPONENT_TYPE,
		Identifier.of(FabricDocsReference.MOD_ID, "custom"),
		ComponentType.<MyCustomComponent>builder().codec(MyCustomComponent.CODEC).build()
	);
	//::3

	//::1
	public static void initialize() {}
}
//::1

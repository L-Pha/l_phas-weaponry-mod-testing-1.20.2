package net.lpha.lphas_weaponry_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lpha.lphas_weaponry_mod.L_PhasWeaponryMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item IRON_BLOB = registerItem("iron_blob", new Item(new FabricItemSettings()));
    public static final Item IRON_STICK = registerItem("iron_stick", new Item(new FabricItemSettings()));

    public static final Item GOLD_BLOB = registerItem("gold_blob", new Item(new FabricItemSettings()));
    public static final Item GOLD_STICK = registerItem("gold_stick", new Item(new FabricItemSettings()));

    public static final Item COPPER_BLOB = registerItem("copper_blob", new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item COPPER_STICK = registerItem("copper_stick", new Item(new FabricItemSettings()));
    public static final Item REINFORCED_IRON_BLOB = registerItem("reinforced_iron_blob", new Item(new FabricItemSettings()));
    public static final Item REINFORCED_IRON_INGOT = registerItem("reinforced_iron_ingot", new Item(new FabricItemSettings()));
    public static final Item REINFORCED_IRON_NUGGET = registerItem("reinforced_iron_nugget", new Item(new FabricItemSettings()));
    public static final Item REINFORCED_IRON_STICK = registerItem("reinforced_iron_stick", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_BLOB = registerItem("steel_blob", new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));
    public static final Item STEEL_STICK = registerItem("steel_stick", new Item(new FabricItemSettings()));
    public static final Item COKE = registerItem("coke", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(L_PhasWeaponryMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        L_PhasWeaponryMod.LOGGER.info("Registering ModItems for " + L_PhasWeaponryMod.MOD_ID);


    }


}

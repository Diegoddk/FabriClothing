package com.software.ddk.fabriclothing;

import com.software.ddk.fabriclothing.common.blocks.ClothingDyevatBlock;
import com.software.ddk.fabriclothing.common.items.*;
import com.software.ddk.fabriclothing.common.items.clothes.checkered.CheckeredBoots;
import com.software.ddk.fabriclothing.common.items.clothes.checkered.CheckeredLeggings;
import com.software.ddk.fabriclothing.common.items.clothes.crossed.CrossedCoat;
import com.software.ddk.fabriclothing.common.items.clothes.crossed.CrossedShirt;
import com.software.ddk.fabriclothing.common.items.clothes.dotted.DottedBoots;
import com.software.ddk.fabriclothing.common.items.clothes.dotted.DottedCoat;
import com.software.ddk.fabriclothing.common.items.clothes.dotted.DottedLeggings;
import com.software.ddk.fabriclothing.common.items.clothes.dotted.DottedShirt;
import com.software.ddk.fabriclothing.common.items.clothes.generic.BaseBoots;
import com.software.ddk.fabriclothing.common.items.clothes.generic.BaseCoat;
import com.software.ddk.fabriclothing.common.items.clothes.generic.BaseLeggings;
import com.software.ddk.fabriclothing.common.items.clothes.generic.BaseShirt;
import com.software.ddk.fabriclothing.common.items.clothes.halfA.HalfACoat;
import com.software.ddk.fabriclothing.common.items.clothes.halfA.HalfALeggings;
import com.software.ddk.fabriclothing.common.items.clothes.halfA.HalfAShirt;
import com.software.ddk.fabriclothing.common.items.clothes.lines.LinesCoat;
import com.software.ddk.fabriclothing.common.items.clothes.lines.LinesLeggings;
import com.software.ddk.fabriclothing.common.items.clothes.lines.LinesShirt;
import com.software.ddk.fabriclothing.common.items.clothes.stripped.StrippedBoots;
import com.software.ddk.fabriclothing.common.items.clothes.checkered.CheckeredCoat;
import com.software.ddk.fabriclothing.common.items.clothes.stripped.StrippedLeggings;
import com.software.ddk.fabriclothing.common.items.clothes.checkered.CheckeredShirt;
import com.software.ddk.fabriclothing.common.items.clothes.simple.SimpleCoat;
import com.software.ddk.fabriclothing.common.items.clothes.simple.SimpleShirt;
import com.software.ddk.fabriclothing.common.items.clothes.stripped.StrippedCoat;
import com.software.ddk.fabriclothing.common.items.clothes.stripped.StrippedShirt;
import com.software.ddk.fabriclothing.integration.TrinketsClothingHats;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Contents {

    public static final Item FABRIC_ITEM = new FabricItem();
    public static final Item FABRIC_PATTERN_STRIPPED = new Item(new Item.Settings().group(FabriClothing.GROUP));
    public static final Item FABRIC_PATTERN_LINE = new Item(new Item.Settings().group(FabriClothing.GROUP));
    public static final Item FABRIC_PATTERN_CHECKERED = new Item(new Item.Settings().group(FabriClothing.GROUP));
    public static final Item FABRIC_PATTERN_CROSSED = new Item(new Item.Settings().group(FabriClothing.GROUP));
    public static final Item FABRIC_PATTERN_DOTTED = new Item(new Item.Settings().group(FabriClothing.GROUP));
    public static final Item FABRIC_PATTERN_HALFA = new Item(new Item.Settings().group(FabriClothing.GROUP));

    public static final Item BASE_SHIRT = new BaseShirt();
    public static final Item BASE_COAT = new BaseCoat();
    public static final Item BASE_LEGGINGS = new BaseLeggings();
    public static final Item BASE_BOOTS = new BaseBoots();

    public static final Item SIMPLE_SHIRT = new SimpleShirt();
    public static final Item SIMPLE_COAT = new SimpleCoat();
    //public static final Item SIMPLE_LEGGINGS = new SimpleLeggings();
    //public static final Item SIMPLE_BOOTS = new SimpleBoots();

    public static final Item STRIPPED_COAT = new StrippedCoat();
    public static final Item STRIPPED_SHIRT = new StrippedShirt();
    public static final Item STRIPPED_LEGGINGS = new StrippedLeggings();
    public static final Item STRIPPED_BOOTS = new StrippedBoots();

    public static final Item LINES_COAT = new LinesCoat();
    public static final Item LINES_SHIRT = new LinesShirt();
    public static final Item LINES_LEGGINGS = new LinesLeggings();

    public static final Item CHECKERED_COAT = new CheckeredCoat();
    public static final Item CHECKERED_SHIRT = new CheckeredShirt();
    public static final Item CHECKERED_LEGGINGS = new CheckeredLeggings();
    public static final Item CHECKERED_BOOTS = new CheckeredBoots();

    public static final Item CROSSED_COAT = new CrossedCoat();
    public static final Item CROSSED_SHIRT = new CrossedShirt();

    public static final Item DOTTED_COAT = new DottedCoat();
    public static final Item DOTTED_SHIRT = new DottedShirt();
    public static final Item DOTTED_LEGGINGS = new DottedLeggings();
    public static final Item DOTTED_BOOTS = new DottedBoots();

    public static final Item HALF_A_SHIRT = new HalfAShirt();
    public static final Item HALF_A_COAT = new HalfACoat();
    public static final Item HALF_A_LEGGINGS = new HalfALeggings();

    public static final Block CLOTHING_DYEVAT_BLOCK = new ClothingDyevatBlock();


    public static void registerAll(){
        registerBlock("clothing_dyevat_block", CLOTHING_DYEVAT_BLOCK, new Item.Settings().group(FabriClothing.GROUP));
        register("fabric_item", FABRIC_ITEM);

        //patterns
        register("fabric_pattern_stripped", FABRIC_PATTERN_STRIPPED);
        register("fabric_pattern_line", FABRIC_PATTERN_LINE);
        register("fabric_pattern_checkered", FABRIC_PATTERN_CHECKERED);
        register("fabric_pattern_crossed", FABRIC_PATTERN_CROSSED);
        register("fabric_pattern_dotted", FABRIC_PATTERN_DOTTED);
        register("fabric_pattern_halfa", FABRIC_PATTERN_HALFA);

        //clothes
        register("base_shirt_item", BASE_SHIRT);
        register("base_coat_item", BASE_COAT);
        register("base_leggings_item", BASE_LEGGINGS);
        register("base_boots_item", BASE_BOOTS);

        register("simple_shirt_item", SIMPLE_SHIRT);
        register("simple_coat_item", SIMPLE_COAT);
        //register("simple_leggings_item", SIMPLE_LEGGINGS);
        //register("simple_boots_item", SIMPLE_BOOTS);
        
        register("stripped_shirt_item", STRIPPED_SHIRT);
        register("stripped_coat_item", STRIPPED_COAT);
        register("stripped_leggings_item", STRIPPED_LEGGINGS);
        register("stripped_boots_item", STRIPPED_BOOTS);

        register("line_coat_item", LINES_COAT);
        register("line_shirt_item", LINES_SHIRT);
        register("line_leggings_item", LINES_LEGGINGS);

        register("type3_coat_item", CHECKERED_COAT);
        register("type3_shirt_item", CHECKERED_SHIRT);
        register("type3_leggings_item", CHECKERED_LEGGINGS);
        register("type3_boots_item", CHECKERED_BOOTS);

        register("type4_coat_item", CROSSED_COAT);
        register("type4_shirt_item", CROSSED_SHIRT);

        register("type5_coat_item", DOTTED_COAT);
        register("type5_shirt_item", DOTTED_SHIRT);
        register("type5_leggings_item", DOTTED_LEGGINGS);
        register("type5_boots_item", DOTTED_BOOTS);

        register("type6_shirt_item", HALF_A_SHIRT);
        register("type6_coat_item", HALF_A_COAT);
        register("type6_leggings_item", HALF_A_LEGGINGS);

        //hats integration with trinkets test.
        //hats
        if (FabricLoader.getInstance().isModLoaded("trinkets")){
            //load slots.
            TrinketsClothingHats.registerHats();
        }

    }

    public static Item register(String id, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FabriClothing.MOD_ID, id), item);
    }

    private static Item registerBlock(String id, Block block, Item.Settings settings){
        BlockItem item = new BlockItem(block, settings);
        Registry.register(Registry.BLOCK, new Identifier(FabriClothing.MOD_ID, id), block);
        return Registry.register(Registry.ITEM, new Identifier(FabriClothing.MOD_ID, id), item);
    }

}

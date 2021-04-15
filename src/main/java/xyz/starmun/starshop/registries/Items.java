package xyz.starmun.starshop.registries;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.starmun.starshop.Starshop;
// The value here should match an entry in the META-INF/mods.toml file
public class Items 
{
   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Starshop.MODID);
   public static final RegistryObject<Item> STAR_COIN = ITEMS.register("starcoin", 
   () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}

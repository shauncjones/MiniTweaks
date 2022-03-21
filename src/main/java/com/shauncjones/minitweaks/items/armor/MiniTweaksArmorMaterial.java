package com.shauncjones.minitweaks.items.armor;

import com.shauncjones.minitweaks.MiniTweaks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MiniTweaksArmorMaterial implements IArmorMaterial {

    //Leather
    //Max Damage Factor: 5, Damage Reduction Array: {1,2,3,1}, Enchantability: 15, Toughness: 0.0F, Knockback Resistance: 0.0F, Ingredient: Leather
    //Chain
    //Max Damage Factor: 15, Damage Reduction Array: {1,4,5,2}, Enchantability: 12, Toughness: 0.0F, Knockback Resistance: 0.0F, Ingredient: Iron Ingot
    //Iron
    //Max Damage Factor: 15, Damage Reduction Array: {1,4,5,2}, Enchantability: 9, Toughness: 0.0F, Knockback Resistance: 0.0F, Ingredient: Iron Ingot
    //Gold
    //Max Damage Factor: 7, Damage Reduction Array: {1,3,5,2}, Enchantability: 25, Toughness: 0.0F, Knockback Resistance: 0.0F, Ingredient: Gold Ingot
    //Diamond
    //Max Damage Factor: 33, Damage Reduction Array: {3,6,8,3}, Enchantability: 10, Toughness: 2.0F, Knockback Resistance: 0.0F, Ingredient: Diamond
    //Turtle
    //Max Damage Factor: 25, Damage Reduction Array: {2,5,6,2}, Enchantability: 9, Toughness: 0.0F, Knockback Resistance: 0.0F, Ingredient: Scute
    //Netherite
    //Max Damage Factor: 37, Damage Reduction Array: {3,6,8,3}, Enchantability: 15, Toughness: 3.0F, Knockback Resistance: 0.1F, Ingredient: Netherite Ingot

    EMERALD("emerald", 33, new int[]{2, 6, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),
    GOGGLES("goggles", 15, new int[]{1, 4, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F, 0.0F, () -> {
        return Ingredient.fromItems(Items.IRON_INGOT);
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    private MiniTweaksArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return MiniTweaks.MODID +":"+ this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

package com.shauncjones.minitweaks.materials;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum MiniTweaksToolTiers implements IItemTier {

    //WOOD
    //Harvest Level: 0, Max Uses: 59, Efficiency: 2.0f, Attack Damage: 0.0f, Enchantability: 15, Ingredients: Planks
    //STONE
    //Harvest Level: 1, Max Uses: 131, Efficiency: 4.0f, Attack Damage: 1.0f, Enchantability: 5, Ingredients: Stone
    //IRON
    //Harvest Level: 2, Max Uses: 250, Efficiency: 6.0f, Attack Damage: 2.0f, Enchantability: 14, Ingredients: Iron
    //GOLD
    //Harvest Level: 0, Max Uses: 32, Efficiency: 12.0f, Attack Damage: 0.0f, Enchantability: 22, Ingredients: Gold
    //Diamond
    //Harvest Level: 3, Max Uses: 1561, Efficiency: 8.0f, Attack Damage: 3.0f, Enchantability: 10, Ingredients: Diamond
    //NETHERITE
    //Harvest Level: 4, Max Uses: 2031, Efficiency: 9.0f, Attack Damage: 4.0f, Enchantability: 15, Ingredients: Netherite

    FLINT(2,200,3.0f,1.0f,5,
            () -> Ingredient.fromItems(Items.FLINT.getItem())),
    LAPIS(2,200,3.0f,1.0f,5,
            () -> Ingredient.fromItems(Items.FLINT.getItem())),
    EMERALD(3,1750,12.0f,2.0f,22,
            () -> Ingredient.fromItems(Items.EMERALD.getItem()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    MiniTweaksToolTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}

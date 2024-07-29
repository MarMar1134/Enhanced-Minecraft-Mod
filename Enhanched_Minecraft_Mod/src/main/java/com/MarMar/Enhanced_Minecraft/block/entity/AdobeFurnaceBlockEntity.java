package com.MarMar.Enhanced_Minecraft.block.entity;

import com.MarMar.Enhanced_Minecraft.recipe.BasicSmeltingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class AdobeFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public AdobeFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.Adobe_furnace.get(), pPos, pBlockState, BasicSmeltingRecipe.Type.Instance);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.enhanced_minecraft.adobe_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new FurnaceMenu(i, inventory, this, this.dataAccess);
    }


}

package io.github.thebusybiscuit.dough.inventory.implementation;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import io.github.thebusybiscuit.dough.inventory.InventoryLayout;

public class InventoryLayoutBuilder {
    
    private final int size;
    
    public InventoryLayoutBuilder(int size) {
        // TODO: Validate size input
        this.size = size;
    }

    @ParametersAreNonnullByDefault
    public @Nonnull InventoryLayoutBuilder newSlotGroup(char key, String name, int... slots) {
        // TODO: Create slot group
        return this;
    }

    public @Nonnull InventoryLayout build() {
        // TODO: Implement builder
        return null;
    }

}

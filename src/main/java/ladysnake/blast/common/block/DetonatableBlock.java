package ladysnake.blast.common.block;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface DetonatableBlock {
    public void detonate(World world, BlockPos pos);
}

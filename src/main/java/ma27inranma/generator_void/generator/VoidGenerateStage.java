package ma27inranma.generator_void.generator;

import cn.nukkit.level.format.ChunkState;
import cn.nukkit.level.format.IChunk;
import cn.nukkit.level.generator.ChunkGenerateContext;
import cn.nukkit.level.generator.GenerateStage;

public class VoidGenerateStage extends GenerateStage {
  public static final String NAME = "void_generate";

  @Override
  public String name() {
    return NAME;
  }

  @Override
  public void apply(ChunkGenerateContext context) {
    IChunk chunk = context.getChunk();

    chunk.setChunkState(ChunkState.POPULATED);
  }
};
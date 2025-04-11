package ma27inranma.generator_void;

import cn.nukkit.Server;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.registry.Registries;
import cn.nukkit.utils.Logger;
import ma27inranma.generator_void.generator.VoidGenerateStage;
import ma27inranma.generator_void.generator.VoidGenerator;

public class GeneratorVoid extends PluginBase {
  public static Logger logger;
  public static GeneratorVoid instance;
  public static Server server;

  @Override
  public void onLoad() {
    instance = this;
    logger = getLogger();
    server = getServer();

    try{
      Registries.GENERATE_STAGE.register(VoidGenerateStage.NAME, VoidGenerateStage.class);
      Registries.GENERATOR.register("void", VoidGenerator.class);
    }catch(Throwable t){
      t.printStackTrace();
    }
  }
}

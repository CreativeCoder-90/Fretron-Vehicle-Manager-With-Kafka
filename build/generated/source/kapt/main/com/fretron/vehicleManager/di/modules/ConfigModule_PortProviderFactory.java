package com.fretron.vehicleManager.di.modules;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConfigModule_PortProviderFactory implements Factory<Integer> {
  private final ConfigModule module;

  public ConfigModule_PortProviderFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return portProvider(module);
  }

  public static ConfigModule_PortProviderFactory create(ConfigModule module) {
    return new ConfigModule_PortProviderFactory(module);
  }

  public static int portProvider(ConfigModule instance) {
    return instance.portProvider();
  }
}

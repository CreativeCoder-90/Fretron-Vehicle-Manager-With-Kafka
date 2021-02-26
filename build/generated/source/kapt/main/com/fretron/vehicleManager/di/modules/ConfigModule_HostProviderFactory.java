package com.fretron.vehicleManager.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConfigModule_HostProviderFactory implements Factory<String> {
  private final ConfigModule module;

  public ConfigModule_HostProviderFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return hostProvider(module);
  }

  public static ConfigModule_HostProviderFactory create(ConfigModule module) {
    return new ConfigModule_HostProviderFactory(module);
  }

  public static String hostProvider(ConfigModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.hostProvider());
  }
}

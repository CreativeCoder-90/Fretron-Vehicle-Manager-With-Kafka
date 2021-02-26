package com.fretron.vehicleManager.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HttpModule_ProvideServerFactory implements Factory<HttpServer> {
  private final HttpModule module;

  private final Provider<String> hostProvider;

  private final Provider<Integer> portProvider;

  private final Provider<ResourceConfig> configProvider;

  public HttpModule_ProvideServerFactory(HttpModule module, Provider<String> hostProvider,
      Provider<Integer> portProvider, Provider<ResourceConfig> configProvider) {
    this.module = module;
    this.hostProvider = hostProvider;
    this.portProvider = portProvider;
    this.configProvider = configProvider;
  }

  @Override
  public HttpServer get() {
    return provideServer(module, hostProvider.get(), portProvider.get(), configProvider.get());
  }

  public static HttpModule_ProvideServerFactory create(HttpModule module,
      Provider<String> hostProvider, Provider<Integer> portProvider,
      Provider<ResourceConfig> configProvider) {
    return new HttpModule_ProvideServerFactory(module, hostProvider, portProvider, configProvider);
  }

  public static HttpServer provideServer(HttpModule instance, String host, int port,
      ResourceConfig config) {
    return Preconditions.checkNotNullFromProvides(instance.provideServer(host, port, config));
  }
}

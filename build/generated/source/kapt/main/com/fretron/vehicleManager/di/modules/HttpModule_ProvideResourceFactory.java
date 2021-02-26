package com.fretron.vehicleManager.di.modules;

import com.fretron.vehicleManager.resources.VehicleResource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HttpModule_ProvideResourceFactory implements Factory<ResourceConfig> {
  private final HttpModule module;

  private final Provider<VehicleResource> vehicleResourceProvider;

  public HttpModule_ProvideResourceFactory(HttpModule module,
      Provider<VehicleResource> vehicleResourceProvider) {
    this.module = module;
    this.vehicleResourceProvider = vehicleResourceProvider;
  }

  @Override
  public ResourceConfig get() {
    return provideResource(module, vehicleResourceProvider.get());
  }

  public static HttpModule_ProvideResourceFactory create(HttpModule module,
      Provider<VehicleResource> vehicleResourceProvider) {
    return new HttpModule_ProvideResourceFactory(module, vehicleResourceProvider);
  }

  public static ResourceConfig provideResource(HttpModule instance,
      VehicleResource vehicleResource) {
    return Preconditions.checkNotNullFromProvides(instance.provideResource(vehicleResource));
  }
}

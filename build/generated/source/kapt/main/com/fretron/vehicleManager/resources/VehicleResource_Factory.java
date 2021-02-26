package com.fretron.vehicleManager.resources;

import com.fretron.vehicleManager.services.VehicleService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VehicleResource_Factory implements Factory<VehicleResource> {
  private final Provider<VehicleService> vehicleServiceProvider;

  public VehicleResource_Factory(Provider<VehicleService> vehicleServiceProvider) {
    this.vehicleServiceProvider = vehicleServiceProvider;
  }

  @Override
  public VehicleResource get() {
    return newInstance(vehicleServiceProvider.get());
  }

  public static VehicleResource_Factory create(Provider<VehicleService> vehicleServiceProvider) {
    return new VehicleResource_Factory(vehicleServiceProvider);
  }

  public static VehicleResource newInstance(VehicleService vehicleService) {
    return new VehicleResource(vehicleService);
  }
}

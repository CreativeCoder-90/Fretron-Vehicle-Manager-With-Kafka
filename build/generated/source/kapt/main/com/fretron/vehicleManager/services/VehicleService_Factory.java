package com.fretron.vehicleManager.services;

import com.fretron.vehicleManager.repositories.VehicleRepository;
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
public final class VehicleService_Factory implements Factory<VehicleService> {
  private final Provider<VehicleRepository> vehicleRepositoryProvider;

  public VehicleService_Factory(Provider<VehicleRepository> vehicleRepositoryProvider) {
    this.vehicleRepositoryProvider = vehicleRepositoryProvider;
  }

  @Override
  public VehicleService get() {
    return newInstance(vehicleRepositoryProvider.get());
  }

  public static VehicleService_Factory create(
      Provider<VehicleRepository> vehicleRepositoryProvider) {
    return new VehicleService_Factory(vehicleRepositoryProvider);
  }

  public static VehicleService newInstance(VehicleRepository vehicleRepository) {
    return new VehicleService(vehicleRepository);
  }
}

package com.fretron.vehicleManager.repositories;

import com.mongodb.client.MongoDatabase;
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
public final class VehicleRepository_Factory implements Factory<VehicleRepository> {
  private final Provider<MongoDatabase> databaseProvider;

  public VehicleRepository_Factory(Provider<MongoDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public VehicleRepository get() {
    return newInstance(databaseProvider.get());
  }

  public static VehicleRepository_Factory create(Provider<MongoDatabase> databaseProvider) {
    return new VehicleRepository_Factory(databaseProvider);
  }

  public static VehicleRepository newInstance(MongoDatabase database) {
    return new VehicleRepository(database);
  }
}

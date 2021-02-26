package com.fretron.vehicleManager.di.components;

import com.fretron.vehicleManager.di.modules.ConfigModule;
import com.fretron.vehicleManager.di.modules.ConfigModule_HostProviderFactory;
import com.fretron.vehicleManager.di.modules.DatabaseModule;
import com.fretron.vehicleManager.di.modules.DatabaseModule_ProvideMongoDatabaseFactory;
import com.fretron.vehicleManager.di.modules.HttpModule;
import com.fretron.vehicleManager.di.modules.HttpModule_ProvideResourceFactory;
import com.fretron.vehicleManager.di.modules.HttpModule_ProvideServerFactory;
import com.fretron.vehicleManager.repositories.VehicleRepository;
import com.fretron.vehicleManager.resources.VehicleResource;
import com.fretron.vehicleManager.services.VehicleService;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
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
public final class DaggerVehicleAppComponent implements VehicleAppComponent {
  private final ConfigModule configModule;

  private final DatabaseModule databaseModule;

  private final HttpModule httpModule;

  private DaggerVehicleAppComponent(DatabaseModule databaseModuleParam,
      ConfigModule configModuleParam, HttpModule httpModuleParam) {
    this.configModule = configModuleParam;
    this.databaseModule = databaseModuleParam;
    this.httpModule = httpModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static VehicleAppComponent create() {
    return new Builder().build();
  }

  private VehicleRepository vehicleRepository() {
    return new VehicleRepository(DatabaseModule_ProvideMongoDatabaseFactory.provideMongoDatabase(databaseModule));
  }

  private VehicleService vehicleService() {
    return new VehicleService(vehicleRepository());
  }

  private VehicleResource vehicleResource() {
    return new VehicleResource(vehicleService());
  }

  private ResourceConfig resourceConfig() {
    return HttpModule_ProvideResourceFactory.provideResource(httpModule, vehicleResource());
  }

  @Override
  public HttpServer server() {
    return HttpModule_ProvideServerFactory.provideServer(httpModule, ConfigModule_HostProviderFactory.hostProvider(configModule), configModule.portProvider(), resourceConfig());
  }

  public static final class Builder {
    private DatabaseModule databaseModule;

    private ConfigModule configModule;

    private HttpModule httpModule;

    private Builder() {
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public Builder configModule(ConfigModule configModule) {
      this.configModule = Preconditions.checkNotNull(configModule);
      return this;
    }

    public Builder httpModule(HttpModule httpModule) {
      this.httpModule = Preconditions.checkNotNull(httpModule);
      return this;
    }

    public VehicleAppComponent build() {
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (configModule == null) {
        this.configModule = new ConfigModule();
      }
      if (httpModule == null) {
        this.httpModule = new HttpModule();
      }
      return new DaggerVehicleAppComponent(databaseModule, configModule, httpModule);
    }
  }
}

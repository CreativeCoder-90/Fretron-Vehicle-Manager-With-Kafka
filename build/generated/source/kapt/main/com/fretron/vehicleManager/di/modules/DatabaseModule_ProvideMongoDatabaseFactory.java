package com.fretron.vehicleManager.di.modules;

import com.mongodb.client.MongoDatabase;
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
public final class DatabaseModule_ProvideMongoDatabaseFactory implements Factory<MongoDatabase> {
  private final DatabaseModule module;

  public DatabaseModule_ProvideMongoDatabaseFactory(DatabaseModule module) {
    this.module = module;
  }

  @Override
  public MongoDatabase get() {
    return provideMongoDatabase(module);
  }

  public static DatabaseModule_ProvideMongoDatabaseFactory create(DatabaseModule module) {
    return new DatabaseModule_ProvideMongoDatabaseFactory(module);
  }

  public static MongoDatabase provideMongoDatabase(DatabaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMongoDatabase());
  }
}

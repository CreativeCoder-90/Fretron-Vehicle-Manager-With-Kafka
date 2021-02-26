package com.fretron.vehicleManager.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/fretron/vehicleManager/repositories/VehicleRepository;", "", "database", "Lcom/mongodb/client/MongoDatabase;", "(Lcom/mongodb/client/MongoDatabase;)V", "collectionName", "", "createNewVehicle", "Lcom/fretron/vehicleManager/model/Vehicle;", "v", "isRegistrationNumberDuplicate", "", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
public final class VehicleRepository {
    private final java.lang.String collectionName = "vehicle_info";
    private final com.mongodb.client.MongoDatabase database = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.fretron.vehicleManager.model.Vehicle createNewVehicle(@org.jetbrains.annotations.Nullable()
    com.fretron.vehicleManager.model.Vehicle v) {
        return null;
    }
    
    private final boolean isRegistrationNumberDuplicate(com.fretron.vehicleManager.model.Vehicle v) {
        return false;
    }
    
    @javax.inject.Inject()
    public VehicleRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoDatabase database) {
        super();
    }
}
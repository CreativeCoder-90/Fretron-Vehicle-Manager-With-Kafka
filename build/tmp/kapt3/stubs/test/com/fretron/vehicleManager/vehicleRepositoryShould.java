package com.fretron.vehicleManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/fretron/vehicleManager/vehicleRepositoryShould;", "", "()V", "database", "Lcom/mongodb/client/MongoDatabase;", "embeddedMongoDb", "Lcom/fretron/vehicleManager/helpers/EmbeddedMongoDb;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "vehicleRepository", "Lcom/fretron/vehicleManager/repositories/VehicleRepository;", "closeConnections", "", "configure", "startMongoDb", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
public final class vehicleRepositoryShould {
    private com.fretron.vehicleManager.helpers.EmbeddedMongoDb embeddedMongoDb;
    private com.mongodb.client.MongoDatabase database;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    private com.fretron.vehicleManager.repositories.VehicleRepository vehicleRepository;
    
    @org.junit.Before()
    public final void configure() {
    }
    
    @org.junit.After()
    public final void closeConnections() {
    }
    
    private final void startMongoDb() {
    }
    
    public vehicleRepositoryShould() {
        super();
    }
}
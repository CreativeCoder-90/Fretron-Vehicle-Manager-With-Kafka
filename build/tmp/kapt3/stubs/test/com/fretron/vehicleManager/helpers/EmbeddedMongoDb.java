package com.fretron.vehicleManager.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\fR\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/fretron/vehicleManager/helpers/EmbeddedMongoDb;", "", "()V", "port", "", "(I)V", "<set-?>", "getPort", "()I", "process", "Lde/flapdoodle/embed/mongo/MongodProcess;", "start", "", "stop", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
public final class EmbeddedMongoDb {
    private int port;
    private de.flapdoodle.embed.mongo.MongodProcess process;
    
    public final int getPort() {
        return 0;
    }
    
    public final void start(int port) throws java.io.IOException {
    }
    
    public final void start() throws java.io.IOException {
    }
    
    public final void stop() {
    }
    
    public EmbeddedMongoDb() {
        super();
    }
    
    public EmbeddedMongoDb(int port) {
        super();
    }
}
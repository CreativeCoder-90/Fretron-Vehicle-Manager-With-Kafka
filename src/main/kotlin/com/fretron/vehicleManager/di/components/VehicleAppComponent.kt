package com.fretron.vehicleManager.di.components

import com.fretron.vehicleManager.di.modules.ConfigModule
import com.fretron.vehicleManager.di.modules.DatabaseModule
import com.fretron.vehicleManager.di.modules.HttpModule
import dagger.Component
import org.glassfish.grizzly.http.server.HttpServer
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class, ConfigModule::class, HttpModule::class])
interface VehicleAppComponent {
    fun server():HttpServer

}
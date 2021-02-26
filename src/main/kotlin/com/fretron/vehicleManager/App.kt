package com.fretron.vehicleManager

import com.fretron.vehicleManager.di.components.DaggerVehicleAppComponent
import org.glassfish.grizzly.http.server.HttpServer

fun main() {
    var server:HttpServer = DaggerVehicleAppComponent.builder().build().server()
    server.start()
}
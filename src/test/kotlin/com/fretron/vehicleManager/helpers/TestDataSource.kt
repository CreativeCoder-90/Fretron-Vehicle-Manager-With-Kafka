package com.fretron.vehicleManager.helpers

import com.fretron.vehicleManager.model.Vehicle
import org.codehaus.jackson.map.ObjectMapper

object TestDataSource {
    fun createVehicleRequest():String{      //This is a Json string which is needed to create a vehicle
        return "{" +
                "\"uuid\":\"1a1c5fe5-3ee0-453d-8425-5fec44961029\"," +
                "\"registrationNumber\":\"11\"," +
                "\"driverName\": \"Driver Name\"," +
                "\"carryingCapacity\":\"40\"," +
                "\"bodyType\": \"Type-1\"," +
                "\"chassisType\": \"Type-2\"" +
                " }"
    }

    fun getVehicle():Vehicle{
        var jsonString = "{\n" +
                "    \"uuid\": \"1a1c5fe5-3ee0-453d-8425-5fec44961029\",\n" +
                "    \"registrationNumber\": \"11\",\n" +
                "    \"driverName\": \"Driver Name\",\n" +
                "    \"bodyType\": \"Type-1\",\n" +
                "    \"chassisType\": \"Type-2\",\n" +
                "    \"carryingCapacity\": \"40\"\n" +
                "}"
        return ObjectMapper().readValue(jsonString,Vehicle::class.java)
    }

    fun updateVehicleRequest(): String {
        return "{\n" +
                "    \"uuid\": \"c70034f9-10fe-41d6-afbc-863d1994c68d\",\n" +
                "    \"registrationNumber\": \"11\",\n" +
                "    \"driverName\": \"Driver Name\",\n" +
                "    \"bodyType\": \"Type-1\",\n" +
                "    \"chassisType\": \"Type-2\",\n" +
                "    \"carryingCapacity\": \"40\"\n" +
                "}"
    }

    fun getUpdatedVehicle(): Vehicle {
        val jsonString = "{\n" +
                "    \"uuid\": \"1a1c5fe5-3ee0-453d-8425-5fec44961029\",\n" +
                "    \"registrationNumber\": \"11\",\n" +
                "    \"driverName\": \"updated Name\",\n" +
                "    \"bodyType\": \"Type-11\",\n" +
                "    \"chassisType\": \"Type-2\",\n" +
                "    \"carryingCapacity\": \"40\"\n" +
                "}"
        return ObjectMapper().readValue(jsonString, Vehicle::class.java)
    }


}
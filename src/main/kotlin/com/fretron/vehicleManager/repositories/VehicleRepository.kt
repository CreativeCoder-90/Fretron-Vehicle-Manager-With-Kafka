package com.fretron.vehicleManager.repositories

import com.fretron.vehicleManager.exceptions.vehicleExceptions.DuplicateRegistrationNumException
import com.fretron.vehicleManager.model.Vehicle
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import org.bson.Document
import javax.inject.Inject

class VehicleRepository @Inject constructor(private val database:MongoDatabase){
    private val collectionName:String = "vehicle_info"

    fun createNewVehicle(v: Vehicle?): Vehicle? {
        var collection = database.getCollection(collectionName)   //creating a collection
        var document = Document.parse(v.toString())     //creating a document //here parse() method converts json string to corresponding Document object
        if(isRegistrationNumberDuplicate(v)){
            throw DuplicateRegistrationNumException("Duplicate registration number: ${v?.getRegistrationNumber()}")
        }
        collection.insertOne(document)
        println(v.toString())
        return v
    }

    private fun isRegistrationNumberDuplicate(v: Vehicle?): Boolean {
        var cursor = database.getCollection(collectionName).find(
            Filters.eq("registrationNumber", v?.getRegistrationNumber())).limit(1).iterator()
        return cursor.hasNext()
    }

}

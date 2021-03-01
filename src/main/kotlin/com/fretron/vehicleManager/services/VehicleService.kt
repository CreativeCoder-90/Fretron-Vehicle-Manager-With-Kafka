package com.fretron.vehicleManager.services

import com.fretron.vehicleManager.exceptions.vehicleExceptions.InvalidVehicleException
import com.fretron.vehicleManager.exceptions.vehicleExceptions.InvalidVehicleRegNumException
import com.fretron.vehicleManager.exceptions.vehicleExceptions.VehicleNotFoundException
import com.fretron.vehicleManager.model.Vehicle
import com.fretron.vehicleManager.repositories.VehicleRepository
import javax.inject.Inject

class VehicleService @Inject constructor(var vehicleRepository: VehicleRepository){
    fun createNewVehicle(v: Vehicle?): Vehicle? {
        validateVehicle(v)
        return vehicleRepository.createNewVehicle(v)
    }

    private fun validateVehicle(v: Vehicle?) {
        if(v==null){
            throw InvalidVehicleException("vehicle can't be null")
        }
        else if (v.getRegistrationNumber().equals("") || v.getRegistrationNumber().equals(null)){
            throw InvalidVehicleRegNumException("invalid vehicle registration number")
        }
        else if (v.getChassisType().equals("") || v.getChassisType().equals(null)){
            throw InvalidVehicleRegNumException("invalid vehicle chassis type")
        }
    }


    @Throws(VehicleNotFoundException::class)
    fun getVehicleById(id: String): Vehicle? {
        var vehicleFromRepo:Vehicle? = null
        if(id!=null) {
            vehicleFromRepo = vehicleRepository.getVehicleById(id)
        }
        return vehicleFromRepo
    }

    fun getAllVehicles(): ArrayList<Vehicle> {
        return vehicleRepository.getAllVehicles()
    }

    fun deleteVehicleById(id: String): Vehicle? {
        var vehicleDeletedFromRepo:Vehicle? = vehicleRepository.deleteVehicleById(id)
        return vehicleDeletedFromRepo
    }

    fun updateGivenVehicle(vehicleToBeUpdated: Vehicle): Vehicle? {
        var vehicleUpdatedByRepository:Vehicle? = vehicleRepository.updateGivenVehicle(vehicleToBeUpdated)
        if(vehicleUpdatedByRepository== null){
            throw VehicleNotFoundException("vehicle not found with id: ${vehicleToBeUpdated.getUuid()}, so can't update")
        }
        return vehicleUpdatedByRepository
    }

}

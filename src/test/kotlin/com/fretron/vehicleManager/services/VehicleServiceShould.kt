package com.fretron.vehicleManager.services

import com.fretron.vehicleManager.exceptions.vehicleExceptions.InvalidVehicleChasisTypeException
import com.fretron.vehicleManager.exceptions.vehicleExceptions.InvalidVehicleException
import com.fretron.vehicleManager.exceptions.vehicleExceptions.InvalidVehicleRegNumException
import com.fretron.vehicleManager.helpers.TestDataSource
import com.fretron.vehicleManager.model.Vehicle
import com.fretron.vehicleManager.repositories.VehicleRepository
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import com.nhaarman.mockito_kotlin.any
import org.junit.Assert.*

class VehicleServiceShould {

    var vehicleRepository:VehicleRepository = mock(VehicleRepository::class.java)
    var vehicleService:VehicleService = VehicleService(vehicleRepository)

    @Before
    fun result_of_required_method_of_mocked_classes(){
        whenever(vehicleRepository.createNewVehicle(any())).thenReturn(TestDataSource.getVehicle())
    }

    @Test
    fun createNewVehicleTest(){
        var requestedVehicle = TestDataSource.getVehicle()
        var vehicleReturnedByRepo:Vehicle? = vehicleService.createNewVehicle(requestedVehicle)
        if(vehicleReturnedByRepo!=null){
            assertTrue(requestedVehicle.getUuid()==vehicleReturnedByRepo.getUuid())
        }
    }

    @Test
    fun throw_exception_on_invalid_data(){
        var requestedVehicle:Vehicle? = TestDataSource.getVehicle()     //vehicle to be created

        assertThrows(InvalidVehicleRegNumException::class.java){
            requestedVehicle?.setRegistrationNumber("")
            vehicleService.createNewVehicle(requestedVehicle)
        }

//        assertThrows(InvalidVehicleChasisTypeException::class.java){
//            requestedVehicle?.setChassisType("")
//            vehicleService.createNewVehicle(requestedVehicle)
//        }
//
//        assertThrows(InvalidVehicleException::class.java){
//            requestedVehicle = null
//            vehicleService.createNewVehicle(requestedVehicle)
//        }
    }


}
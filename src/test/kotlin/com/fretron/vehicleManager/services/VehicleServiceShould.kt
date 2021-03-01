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
    private val uuid:String = "1a1c5fe5-3ee0-453d-8425-5fec44961029"      //uuid from TestDataSource

    @Before
    fun result_of_required_method_of_mocked_classes(){
        whenever(vehicleRepository.createNewVehicle(any())).thenReturn(TestDataSource.getVehicle())
        whenever(vehicleRepository.getVehicleById(any())).thenReturn(TestDataSource.getVehicle())
        whenever(vehicleRepository.getAllVehicles()).thenReturn(arrayListOf(TestDataSource.getVehicle()))
        whenever(vehicleRepository.deleteVehicleById(any())).thenReturn(TestDataSource.getVehicle())
        whenever(vehicleRepository.updateGivenVehicle(any())).thenReturn(TestDataSource.getUpdatedVehicle())
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

    @Test
    fun get_vehicle_by_uuid_Test(){
        assertNotNull(uuid)
        var vehicleFromRepo:Vehicle? = vehicleService.getVehicleById(uuid)    //see line no. 27
        assertNotNull(vehicleFromRepo)
        assertTrue(uuid.equals(vehicleFromRepo?.getUuid()))
        println("vehicleFromRepo uuid: ${vehicleFromRepo?.getUuid()}")
    }

    @Test
    fun get_list_of_All_vehicles_Test(){
        var vehiclesFromRepository:ArrayList<Vehicle> = vehicleService.getAllVehicles()
        println(vehiclesFromRepository)
        assertNotNull(vehiclesFromRepository)
    }

    @Test
    fun delete_vehicle_by_Id_Test(){
        assertNotNull(uuid)
        var vehicleDeletedFromRepo:Vehicle? = vehicleService.deleteVehicleById(uuid)
        println("uuid of deleted vehicle: ${vehicleDeletedFromRepo?.getUuid()}")
        assertTrue(uuid==vehicleDeletedFromRepo?.getUuid())
    }

    @Test
    fun update_given_vehicle_Test(){
        var vehicleToBeUpdated = TestDataSource.getVehicle()    //lets assume this is the vehicle to be updated
        var vehicleUpdatedByRepository = vehicleService.updateGivenVehicle(vehicleToBeUpdated)
        println(vehicleUpdatedByRepository?.getUuid())
        assertNotNull(vehicleUpdatedByRepository)
        assertTrue(vehicleToBeUpdated.getDriverName()!=vehicleUpdatedByRepository?.getDriverName())
    }


}
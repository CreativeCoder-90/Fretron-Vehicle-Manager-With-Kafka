package com.fretron.vehicleManager.resources

import com.fretron.vehicleManager.helpers.TestDataSource
import com.fretron.vehicleManager.services.VehicleService
import com.nhaarman.mockito_kotlin.whenever
import org.codehaus.jettison.json.JSONObject
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.test.JerseyTest
import org.junit.Test
import javax.ws.rs.client.Entity
import javax.ws.rs.core.Application
import javax.ws.rs.core.MediaType
import org.junit.Assert.*
import org.mockito.Mockito.*
import com.nhaarman.mockito_kotlin.any
import org.junit.Before

class VehicleResourceShould :JerseyTest(){

    private val baseURI: String="vehicle/v1"
    private lateinit var vehicleService: VehicleService

    override fun configure(): Application {
        vehicleService = mock(VehicleService::class.java)
        return ResourceConfig().register(VehicleResource(vehicleService))
    }

    @Before
    fun result_of_required_method_of_mocked_classes(){
        whenever(vehicleService.createNewVehicle(any())).thenReturn(TestDataSource.getVehicle())
    }

    @Test
    fun return_200_after_create_new_vehicle(){
        var requestedVehicle = TestDataSource.createVehicleRequest()
       var response = target("$baseURI/vehicle").request().post(Entity.entity(requestedVehicle, MediaType.APPLICATION_JSON))
        println("response status: ${response.status}")
        assertTrue(response.status==200)
        assertNotNull(response)
        var responseJson = JSONObject(response.readEntity(String::class.java))
       var uuid = responseJson.get("uuid").toString()
        println("response uuid check: $uuid")
    }
}
package com.fretron.vehicleManager

import com.fasterxml.jackson.databind.ObjectMapper
import com.fretron.vehicleManager.helpers.EmbeddedMongoDb
import com.fretron.vehicleManager.repositories.VehicleRepository
import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import org.junit.After
import org.junit.Before
import java.util.*

class vehicleRepositoryShould {

    private lateinit var embeddedMongoDb: EmbeddedMongoDb
    private lateinit var database: MongoDatabase
    private val objectMapper = ObjectMapper()
    private lateinit var  vehicleRepository: VehicleRepository

    @Before
    fun configure() {

        startMongoDb()
        val mongoClient = MongoClient("localhost", embeddedMongoDb.port)
        var database = mongoClient.getDatabase("vehicle")
        vehicleRepository = VehicleRepository(database)
    }

    @After
    fun closeConnections() {
        embeddedMongoDb.stop()
    }

    private fun startMongoDb() {
        val rand = Random()
        val n = rand.nextInt(99) + 9900
        embeddedMongoDb = EmbeddedMongoDb(n)
        embeddedMongoDb.start()
    }
}
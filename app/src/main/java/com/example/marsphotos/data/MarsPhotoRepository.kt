package com.example.marsphotos.data

//No se necesita import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsPhoto
import com.example.marsphotos.network.MarsApiService

interface MarsPhotoRepository {
    suspend fun getMarsPhotos():List<MarsPhoto>
}

class NetworkMarsPhotosRepository(private val marsApiService: MarsApiService) : MarsPhotoRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotosPerro()
}


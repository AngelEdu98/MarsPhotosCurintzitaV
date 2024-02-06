package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {
    suspend fun getMarsPhotos():List<MarsPhoto>
}

class NetworkMarsPhotosRepository() : MarsPhotoRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotosPerro()
    }
}


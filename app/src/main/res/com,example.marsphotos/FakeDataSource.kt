package com.example.marsphotos

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto
import org.junit.Test

object FakeDataSource {
    object FakeDataSource {

        const val idOne = "img1"
        const val idTwo = "img2"
        const val imgOne = "url.1"
        const val imgTwo = "url.2"
        val photosList = listOf(
            MarsPhoto(
                id = idOne,
                imgSrc = imgOne
            ),
            MarsPhoto(
                id = idTwo,
                imgSrc = imgTwo
            )
        )
    }
}

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotosPerro(): List<MarsPhoto> {
        return FakeDataSource.FakeDataSource.photosList
    }
}

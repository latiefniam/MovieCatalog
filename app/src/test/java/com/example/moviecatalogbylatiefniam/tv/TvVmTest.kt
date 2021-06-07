package com.example.moviecatalogbylatiefniam.tv

import com.example.moviecatalogbylatiefniam.utils.Data
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvVmTest {
    private lateinit var model: TvVm


    @Before
    fun setUp(){
        model = TvVm()

    }
    @Test
    fun getTvShows() {

        val tvShowEntity = model.getTvShows()
        assertNotNull(tvShowEntity)
        assertEquals(11,tvShowEntity.size)

    }
}
package com.example.moviecatalogbylatiefniam.movie

import com.example.moviecatalogbylatiefniam.tv.TvVm
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MoviesVmTest {
    private lateinit var model: MoviesVm


    @Before
    fun setUp(){
        model = MoviesVm()

    }

    @Test
    fun getMovies() {
        val movieEntity = model.getMovies()
        assertNotNull(movieEntity)
        assertEquals(11, movieEntity.size)

    }
}
package com.example.moviecatalogbylatiefniam.detail

import com.example.moviecatalogbylatiefniam.utils.Data
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Test
import org.junit.Before

class DetailVMTest {
    private lateinit var model: DetailVM
    private val dataMovie = Data.generateMovie()[0]
    private val dataTvShow = Data.generateTv()[0]
    private val MovieId = dataMovie.movieId
    private val TvId = dataTvShow.tvId
    @Before
    fun setUp(){
    model = DetailVM()
        model.tvSelected(TvId.toString())
        model.movSelected(MovieId.toString())
        }

    @Test
    fun getMovies() {
        model.movSelected(dataMovie.movieId.toString())
        val movieEntity = model.getMovies()
        assertNotNull(movieEntity)
        assertEquals(dataMovie.movieId, movieEntity.movieId)
        assertEquals(dataMovie.movieTitle, movieEntity.movieTitle)
        assertEquals(dataMovie.movieDescription, movieEntity.movieDescription)
        assertEquals(dataMovie.movieGenre, movieEntity.movieGenre)
        assertEquals(dataMovie.movieDuration, movieEntity.movieDuration)
        assertEquals(dataMovie.moviePicture, movieEntity.moviePicture)
    }

    @Test
    fun getTvShow() {
        model.movSelected(dataTvShow.tvId.toString())
        val tvEntity = model.getTvShow()
        assertNotNull(tvEntity)
        assertEquals(dataTvShow.tvId, tvEntity.tvId)
        assertEquals(dataTvShow.tvTitle, tvEntity.tvTitle)
        assertEquals(dataTvShow.tvDescription, tvEntity.tvDescription)
        assertEquals(dataTvShow.tvGenre, tvEntity.tvGenre)
        assertEquals(dataTvShow.tvDuration, tvEntity.tvDuration)
        assertEquals(dataTvShow.tvPicture, tvEntity.tvPicture)


    }
}
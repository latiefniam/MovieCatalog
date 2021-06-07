package com.example.moviecatalogbylatiefniam.detail

import androidx.lifecycle.ViewModel
import com.example.moviecatalogbylatiefniam.data.MovieEntity
import com.example.moviecatalogbylatiefniam.data.TvEntity
import com.example.moviecatalogbylatiefniam.utils.Data

class DetailVM: ViewModel() {

    private lateinit var movId: String
    private lateinit var tvId : String

    fun movSelected (movId: String){
        this.movId= movId
    }
    fun tvSelected(tvId: String){
        this.tvId = tvId
    }
    fun getMovies(): MovieEntity{
        lateinit var movie : MovieEntity
        val movieEntities = Data.generateMovie()
        for (movieEntity in movieEntities) {
            if (movieEntity.movieId== movId){
                movie = movieEntity
        }
        }
        return movie
    }
    fun getTvShow (): TvEntity{
        lateinit var tvShow : TvEntity
        val tvEntities= Data.generateTv()
        for (tvEntity in tvEntities){
            if(tvEntity.tvId == tvId){
                tvShow = tvEntity
            }
        }
        return tvShow
    }
}
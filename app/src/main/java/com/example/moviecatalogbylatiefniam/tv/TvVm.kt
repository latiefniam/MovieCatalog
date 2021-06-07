package com.example.moviecatalogbylatiefniam.tv

import androidx.lifecycle.ViewModel
import com.example.moviecatalogbylatiefniam.data.MovieEntity
import com.example.moviecatalogbylatiefniam.data.TvEntity
import com.example.moviecatalogbylatiefniam.utils.Data

class TvVm: ViewModel() {
    fun getTvShows(): List<TvEntity> = Data.generateTv()
}
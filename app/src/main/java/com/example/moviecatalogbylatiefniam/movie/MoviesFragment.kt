package com.example.moviecatalogbylatiefniam.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviecatalogbylatiefniam.databinding.FragmentMoviesBinding


class MoviesFragment: Fragment(){

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesBinding.inflate(layoutInflater,container,false)
        return binding.root  }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val viewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[MoviesVm::class.java]
        val movies = viewModel.getMovies()

            val adapterMovie = MoviesAdapter()
            adapterMovie.setMovie(movies)
            with(binding.recyclerviewmovie){
                layoutManager =LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = adapterMovie
            }
        }
    }

}
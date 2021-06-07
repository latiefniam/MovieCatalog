package com.example.moviecatalogbylatiefniam.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.moviecatalogbylatiefniam.R
import com.example.moviecatalogbylatiefniam.utils.Data
import kotlinx.coroutines.delay
import org.junit.Test


import org.junit.Before
import org.junit.Rule

class HomeActivityTest {
    private val dataMovie = Data.generateMovie()
    private val dataTvShow = Data.generateTv()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)
    @Test
    fun loadMovie() {
        onView(withId(R.id.recyclerviewmovie)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerviewmovie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dataMovie.size
            )
        )
    }
    @Test
    fun detailMovie(){
        onView(withId(R.id.recyclerviewmovie)).check(matches(isDisplayed()))
       //onView(withText("MOVIES")).perform(ViewActions.click())
        onView(withId(R.id.recyclerviewmovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0, click()
            )
        )
        onView(withId(R.id.title)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(withText(dataMovie[0].movieTitle)))
        onView(withId(R.id.duration)).check(matches(isDisplayed()))
        onView(withId(R.id.duration)).check(matches(withText(dataMovie[0].movieDuration)))
        onView(withId(R.id.genre)).check(matches(isDisplayed()))
        onView(withId(R.id.genre)).check(matches(withText(dataMovie[0].movieGenre)))

    }
    @Test
    fun loadTv() {

        onView(withText("TV SHOWS")).perform(ViewActions.click())
        onView(withId(R.id.recyclerviewtv)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerviewtv)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dataTvShow.size
            )
        )
    }
    @Test
    fun detailTv(){
        onView(withText("TV SHOWS")).perform(ViewActions.click())
        onView(withId(R.id.recyclerviewtv)).check(matches(isDisplayed()))

        onView(withId(R.id.recyclerviewtv)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0, click()
            )
        )
        onView(withId(R.id.title)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(withText(dataTvShow[0].tvTitle)))
        onView(withId(R.id.duration)).check(matches(isDisplayed()))
        onView(withId(R.id.duration)).check(matches(withText(dataTvShow[0].tvDuration)))
        onView(withId(R.id.genre)).check(matches(isDisplayed()))
        onView(withId(R.id.genre)).check(matches(withText(dataTvShow[0].tvGenre)))

    }
}
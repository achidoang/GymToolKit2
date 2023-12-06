package com.dicoding.gymtoolkit.presentation.nvgraph

sealed class Route (
    val route: String
){

    object OnBoardingScreen : Route(route = "onBoardingScreen")
    object LoginScreen : Route(route = "loginScreen")
    object HomeScreen : Route(route = "homeScreen")
    object SearchScreen : Route(route = "searchScreen")
    object BookmarkScreen : Route(route = "bookmarkScreen")
    object DetailScreen : Route(route = "DetailScreen")
    object AppStartNavigation : Route(route = "appStartNavigation")
    object ScanNavigation : Route(route = "ScanNavigation")
    object GymNavigation : Route(route = "GymNavigation")
    object GymNavigatorScreen : Route(route = "GymNavigatorScreen")



}
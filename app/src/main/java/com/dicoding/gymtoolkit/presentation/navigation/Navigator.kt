package com.dicoding.gymtoolkit.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.kamera.PermissionScreen
import com.dicoding.gymtoolkit.presentation.home.HomeScreen
import com.dicoding.gymtoolkit.presentation.home.HomeViewModel
import com.dicoding.gymtoolkit.presentation.navigation.components.BottomNavigation
import com.dicoding.gymtoolkit.presentation.navigation.components.BottomNavigationItem
import com.dicoding.gymtoolkit.presentation.nvgraph.Route
import com.dicoding.gymtoolkit.presentation.profil.ProfileScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigator() {

    val bottomNavigationItems = remember {
        listOf(
            BottomNavigationItem(icon = R.drawable.ic_home, text = "Home"),
            BottomNavigationItem(icon = R.drawable.ic_camera, text = "Camera"),
            BottomNavigationItem(icon = R.drawable.ic_profil, text = "Profil"),
        )
    }

    val navController = rememberNavController()
    val backStackState = navController.currentBackStackEntryAsState().value
    var selectedItem by rememberSaveable {
        mutableStateOf(0)
    }
    selectedItem = when (backStackState?.destination?.route) {
        Route.HomeScreen.route -> 0
        Route.CameraScreen.route -> 1
        Route.ProfilScreen.route -> 2
        else -> 0
    }

    Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = {
        BottomNavigation(
            items = bottomNavigationItems,
            selectedItem = selectedItem,
            onItemClick = { index ->
                when (index) {
                    0 -> navigateToTab(
                        navController = navController,
                        route = Route.HomeScreen.route
                    )

                    1 -> navigateToTab(
                        navController = navController,
                        route = Route.CameraScreen.route
                    )

                    2 -> navigateToTab(
                        navController = navController,
                        route = Route.ProfilScreen.route
                    )
                }
            }
        )
    }) {
        val bottomPadding = it.calculateBottomPadding()
        NavHost(
            navController = navController,
            startDestination = Route.HomeScreen.route,
            modifier = Modifier.padding(bottom = bottomPadding)
        ) {
            composable(route = Route.HomeScreen.route) {
                val viewModel: HomeViewModel = hiltViewModel()
                val articles = viewModel.news.collectAsLazyPagingItems()
                HomeScreen(
//                    articles = articles,
//                    navigate = { navigateToTab(navController = navController, route = it) }
                )
            }
            composable(route = Route.CameraScreen.route) {
                PermissionScreen()
            }
            composable(route = Route.DetailScreen.route) {

            }
            composable(route = Route.ProfilScreen.route) {
                ProfileScreen()

            }
        }
    }
}

private fun navigateToTab(navController: NavController, route: String) {
    navController.navigate(route) {
        navController.graph.startDestinationRoute?.let { screen_route ->
            popUpTo(screen_route) {
                saveState = true
            }
        }
        launchSingleTop = true
        restoreState = true
    }
}
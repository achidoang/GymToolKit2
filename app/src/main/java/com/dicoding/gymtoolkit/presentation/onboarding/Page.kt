package com.dicoding.gymtoolkit.presentation.onboarding

import androidx.annotation.DrawableRes
import com.dicoding.gymtoolkit.R

data class Page(
    val title: String,
//    val description: String,
    @DrawableRes val image: Int
)

// Data Onboarding
val pages = listOf(
    Page(
        title = "Lorem ipsum is simply dummy",
//        description = "Lorem ipsum is simply dummy text of",
        image = R.drawable.onboarding4 //image onboarding
    ),
    Page(
        title = "Lorem ipsum is simply dummy",
//        description = "Lorem ipsum is simply dummy text of",
        image = R.drawable.onboarding5 //image onboarding
    ),
    Page(
        title = "Lorem ipsum is simply dummy",
//        description = "Lorem ipsum is simply dummy text of",
        image = R.drawable.onboarding6 //image onboarding
    )
)
package com.example.cmpmemecreator

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource

import cmpmemecreator.shared.generated.resources.Res
import cmpmemecreator.shared.generated.resources.compose_multiplatform
import com.example.cmpmemecreator.core.presentation.NavigationRoot
import com.example.cmpmemecreator.core.theme.MemeCreatorTheme
import com.example.cmpmemecreator.meme_gallery.presentation.MemeGalleryScreen

@Composable
@Preview
fun App() {
    MemeCreatorTheme {
        NavigationRoot()
    }
}
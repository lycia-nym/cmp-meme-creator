package com.example.cmpmemecreator.meme_editor.presentation

data class MemeText(
    val id: String,
    val text: String,
    val fontSize: Float = 36f,
    val offsetRationX: Float = 0f,
    val offsetRationY: Float = 0f,
    val scale: Float = 1f
)

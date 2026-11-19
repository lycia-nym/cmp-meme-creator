package com.example.cmpmemecreator.meme_editor.domain

import androidx.compose.ui.unit.IntSize
import com.example.cmpmemecreator.meme_editor.presentation.MemeText
import kotlin.uuid.Uuid

interface MemeExporter {
    suspend fun exportMeme(
        backgroundImageBytes: ByteArray,
        memeTexts: List<MemeText>,
        templateSize: IntSize,
        saveToStorageStrategy: SaveToStorageStrategy,
        // png support transparent, so export as jpg reduce file size
        fileName: String = "meme_${Uuid.random()}.jpg"
    ): Result<String>
}
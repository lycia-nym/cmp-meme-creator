package com.example.cmpmemecreator.meme_editor.data

import androidx.compose.ui.unit.IntSize
import com.example.cmpmemecreator.meme_editor.domain.MemeExporter
import com.example.cmpmemecreator.meme_editor.domain.SaveToStorageStrategy
import com.example.cmpmemecreator.meme_editor.presentation.MemeText
import kotlin.uuid.Uuid

expect class PlatformMemeExporter: MemeExporter {
    override suspend fun exportMeme(
        backgroundImageBytes: ByteArray,
        memeTexts: List<MemeText>,
        templateSize: IntSize,
        saveToStorageStrategy: SaveToStorageStrategy,
        // png support transparent, so export as jpg reduce file size
        fileName: String
    ): Result<String>
}
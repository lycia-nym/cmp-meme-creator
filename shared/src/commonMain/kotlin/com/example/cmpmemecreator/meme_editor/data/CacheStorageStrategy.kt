package com.example.cmpmemecreator.meme_editor.data

import com.example.cmpmemecreator.meme_editor.domain.SaveToStorageStrategy

expect class CacheStorageStrategy: SaveToStorageStrategy {
    override fun getFilePath(fileName: String): String
}
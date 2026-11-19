package com.example.cmpmemecreator.meme_editor.data

import com.example.cmpmemecreator.meme_editor.domain.SaveToStorageStrategy

actual class CacheStorageStrategy :
    SaveToStorageStrategy {
    actual override fun getFilePath(fileName: String): String {
        TODO("Not yet implemented")
    }
}
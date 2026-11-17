package com.example.cmpmemecreator.meme_editor.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cmpmemecreator.core.theme.MemeCreatorTheme
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MemeEditorRoot(
    viewModel: MemeEditorViewModel = koinViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    MemeEditorScreen(
        state = state,
        onAction = viewModel::onAction
    )
}

@Composable
fun MemeEditorScreen(
    state: MemeEditorState,
    onAction: (MemeEditorAction) -> Unit,
) {

}

@Preview
@Composable
private fun Preview() {
    MemeCreatorTheme {
        MemeEditorScreen(
            state = MemeEditorState(),
            onAction = {}
        )
    }
}
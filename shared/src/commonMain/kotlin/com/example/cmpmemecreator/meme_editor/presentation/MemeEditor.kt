package com.example.cmpmemecreator.meme_editor.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import cmpmemecreator.shared.generated.resources.Res
import cmpmemecreator.shared.generated.resources.meme_template_01
import coil3.Image
import com.example.cmpmemecreator.core.presentation.MemeTemplate
import com.example.cmpmemecreator.core.presentation.memeTemplates
import com.example.cmpmemecreator.core.theme.MemeCreatorTheme
import com.example.cmpmemecreator.meme_editor.presentation.components.MemeTextBox
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MemeEditorRoot(
    template: MemeTemplate,
    viewModel: MemeEditorViewModel = koinViewModel(),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    MemeEditorScreen(
        template = template,
        state = state,
        onAction = viewModel::onAction
    )
}

@Composable
fun MemeEditorScreen(
    template: MemeTemplate,
    state: MemeEditorState,
    onAction: (MemeEditorAction) -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(template.drawable),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        state.memeTexts.forEach { memeText ->
            MemeTextBox(
                memeText = memeText,
                textBoxInteractionState = state.textBoxInteractionState,
                maxWidth = 500.dp,
                maxHeight = 500.dp,
                onClick = {
                    onAction(MemeEditorAction.OnSelectMemeTextClick(memeText.id))
                },
                onDoubleClick = {
                    onAction(MemeEditorAction.OnEditMemeTextClick(memeText.id))
                },
                onDeleteClick = {
                    onAction(MemeEditorAction.OnDeleteMemeTextClick(memeText.id))
                },
                onTextChange = {
                    onAction(MemeEditorAction.OnMemeTextChange(memeText.id, it))
                }
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    MemeCreatorTheme {
        MemeEditorScreen(
            template = MemeTemplate(
                id = "meme_template_01",
                drawable = Res.drawable.meme_template_01
            ),
            state = MemeEditorState(
                templateSize = TODO(),
                isLeavingWithoutSaving = TODO(),
                textBoxInteractionState = TODO(),
                memeTexts = TODO()
            ),
            onAction = {}
        )
    }
}
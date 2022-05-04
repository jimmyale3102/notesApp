package dev.alejo.mylist.feature_note.presentation.notes

import androidx.lifecycle.ViewModel
import dev.alejo.mylist.feature_note.domain.use_case.NoteUseCases
import javax.inject.Inject

class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
): ViewModel() {

}
package dev.alejo.mylist.feature_note.presentation.notes

import dev.alejo.mylist.feature_note.domain.model.Note
import dev.alejo.mylist.feature_note.domain.util.NoteOrder

sealed interface NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent
    data class DeleteNote(val note: Note): NotesEvent
    object RestoreNote: NotesEvent
    object ToggleOrderSection: NotesEvent
}
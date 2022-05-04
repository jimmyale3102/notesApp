package dev.alejo.mylist.feature_note.presentation.notes

import dev.alejo.mylist.feature_note.domain.model.Note
import dev.alejo.mylist.feature_note.domain.util.NoteOrder
import dev.alejo.mylist.feature_note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

package uz.texnopos.cleanarchitecturenoteapp.feature_note.domain.use_cases

import uz.texnopos.cleanarchitecturenoteapp.feature_note.domain.model.Note
import uz.texnopos.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
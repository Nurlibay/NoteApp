package uz.texnopos.cleanarchitecturenoteapp.feature_note.domain.use_cases

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
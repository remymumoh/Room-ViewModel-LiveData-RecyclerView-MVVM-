package com.example.roomdb;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteReposiroty repository;
    private LiveData<List<Note>> allNotes;
    public NoteViewModel(@NonNull Application application) {
        super(application);
        repository = new NoteReposiroty(application);
        allNotes = repository.getAllNotes();
    }

    public void insert(Note note) {
        repository.update(note);
    }

    public void update(Note note) {
        repository.update(note);
    }

    public void delete(Note note) {
        repository.delete(note);
    }

    public LiveData<List<Note>> deleteAllNotes(){
        return allNotes;
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }
}

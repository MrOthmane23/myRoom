package com.app.myroomdata;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WordDAO {
    @Insert
    void insert(Word word);

    @Update
    void updateWords(Word... words);

    @Delete
    void deleteWord(Word word);

    @Query("DELETE FROM word_table WHERE word = :name")
    void deleteId(String name);


    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}

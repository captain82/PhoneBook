package com.captain.ak.phonebook;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ContactDao {

    @Query("SELECT * FROM ContactModel")
    List<ContactModel> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ContactModel contactModel);

    @Update
    void update(ContactModel contactModel);

    @Delete
    void delete(ContactModel contactModel);


}

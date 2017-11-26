package com.maksymenko.epam.external.practice.curatorjournalentry.model;

import com.maksymenko.epam.external.practice.curatorjournalentry.view.IOtherStrings;

import java.util.LinkedList;
import java.util.List;

public enum Storage implements IOtherStrings{
    INSTANCE;

    List<Entry> journal = new LinkedList<>();

    public void addNewEntry(Entry newest) {
        journal.add(newest);
    }

    public List<Entry> getJournal() {
        if(journal.isEmpty()){
            System.out.println(STORAGE_NO_RECORDS);
            return journal;
        }
        return journal;
    }

}

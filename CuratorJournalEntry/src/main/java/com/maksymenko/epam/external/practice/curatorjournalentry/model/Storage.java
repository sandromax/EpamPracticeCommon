package com.maksymenko.epam.external.practice.curatorjournalentry.model;

import com.maksymenko.epam.external.practice.curatorjournalentry.view.IOtherStrings;

import static com.maksymenko.epam.external.practice.curatorjournalentry.controller.Internationalization.RESOURCE;

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
            System.out.println(RESOURCE.getValue(STORAGE_NO_RECORDS));
            return journal;
        }
        return journal;
    }

}

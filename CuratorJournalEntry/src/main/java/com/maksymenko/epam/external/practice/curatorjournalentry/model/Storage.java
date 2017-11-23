package com.maksymenko.epam.external.practice.curatorjournalentry.model;

import java.util.LinkedList;
import java.util.List;

public class Storage {

    List<Entry> journal = new LinkedList<>();

    public void addNewEntry(Entry newest){
        journal.add(newest);
    }

    public List<Entry> getJournal(){
        return journal;
    }

}

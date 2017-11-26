package com.maksymenko.epam.external.practice.curatorjournalentry.controller;

public class InternatioalizationSingle {
    private static InternatioalizationSingle ourInstance = new InternatioalizationSingle();

    public static InternatioalizationSingle getInstance() {
        return ourInstance;
    }

    private InternatioalizationSingle() {
    }
}

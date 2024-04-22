package org.assignment_4.data.sequencer;

public class PersonIdSequencer{
    private static int currentId;

    public static int nextId(){
        return ++currentId;
    }

    public int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonIdSequencer.currentId = currentId;
    }
}

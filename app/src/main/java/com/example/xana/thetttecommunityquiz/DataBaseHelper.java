package com.example.xana.thetttecommunityquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * The purpose of this class is to create a Database Helper that will contain
 * the TTTECommunityQuiz app's question data.
 *
 * Created by Michael Abercrombie on 12/29/2015.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    /* Name of DataBaseHelper */

    private static final String NAME = "TTTE_QUIZ";

    /* Version Number of Database Helper */

    private static final int VERSION = 1;

    /* Constructor for Database Helper */

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, NAME, factory, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

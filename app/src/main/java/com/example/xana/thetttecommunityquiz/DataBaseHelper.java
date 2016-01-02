package com.example.xana.thetttecommunityquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The purpose of this class is to create a Database Helper that will contain
 * the TTTECommunityQuiz app's question data.
 *
 * Created by Michael Abercrombie on 12/29/2015.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    /* This ListofQuestions contains each of the quiz questions and their respective
    *  answer choices
    */

    private static ListofQuestions temp = new ListofQuestions("EE93 Questions.txt");

    /* Name of DataBaseHelper */

    private static final String NAME = "TTTE_QUIZ";

    /* Version Number of Database Helper */

    private static final int VERSION = 1;

    /* Constructor for Database Helper */

    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD = "optd"; //option d
    private SQLiteDatabase dbase;

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, NAME, factory, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        dbase = db;

        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_OPTD + " TEXT)";
        db.execSQL(sql);
            /*addQuestions();*/

        for (Map.Entry<Integer, Questions> mapEntry: temp.globalQuestions.entrySet() ) {
            insertQuestion(mapEntry.getValue());
        }

        db.close();

            /*New Comment*/
    }

    public void insertQuestion(Questions q) {

        /*
        This is the database that will hold the question and answers
        */

        SQLiteDatabase thisDB = this.getWritableDatabase();

            /* Create an object to put the question and
            *  answers in.
            */

        ContentValues toInsert = new ContentValues();

            /* Insert the question */

        toInsert.put(KEY_QUES, q.askQuestion());

            /*Insert the answers*/

        toInsert.put(KEY_ANSWER, q.getCorrectanswer());
        toInsert.put(KEY_OPTA, q.getFalseanswer1());
        toInsert.put(KEY_OPTB, q.getFalseanswer2());
        toInsert.put(KEY_OPTC, q.getFalseanswer3());

            /* Insert this row to dbase */
        thisDB.insert(TABLE_QUEST, null, toInsert);
    }


    public List<Questions> getEachQuestion() {

        List<Questions> questionsList = new ArrayList<Questions>();

        String select = "SELECT * FROM" + TABLE_QUEST;
        dbase = this.getReadableDatabase();

        for (Map.Entry<Integer, Questions> mapEntry :
                temp.globalQuestions.entrySet() ) {

            questionsList.add(mapEntry.getValue());

        }

        return questionsList;

    }







    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        onCreate(db);
    }
}

package com.thetttecommunity.thetttecommunityquizgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Shawn Idahosa on 12/19/2015.
 * <p>
 * This java file will scan appropriate textfile (textfile is filled with questions an answers)
 * and store these questions with the answers into a Questions Object. Then is stored into a treemap
 * that will be accessed at random in .....
 */
public class ListofQuestions {
    private TreeMap<Integer, Questions> questionsTreeMap = new TreeMap<>();
    int counter = 0;                  // Integer used for randomizing the questions
    private String YouTuberSelected;  // YouTube Admin selected from selection screen

    /*
    Main Constructor
    Sends a youtubename.txt
     */
    public ListofQuestions(String YouTuber) {
        YouTuberSelected = YouTuber;
        try {
            Scanner fileRead = new Scanner(new File(YouTuberSelected));
            filereader(fileRead);
        } catch (FileNotFoundException e) {
        }
    }

    /**
     * Reads a textfile from either EnterprisingEngine93 30 Questions, DieselD199 30 Question,
     * Sidekickjason 30 Questions, or Percyengine619 30 Questions.
     * <p>
     * This method will store lines of strings till the array is full meaning both the question
     * and the four possible answers have been read. The method will now store the array of strings
     * into the a Question object and finally store that into a Treemap.
     * <p>
     * The count will reset after a Question object is made and stored to be able to store the next
     * set of questions with answers.
     *
     * @param t Textfile.txt
     */
    public void filereader(Scanner t) {

        int count = 0;
        String[] questionwithanswers = new String[5];

        while (t.hasNextLine()) {

            String words = t.nextLine();
            questionwithanswers[count] = words;

            /* When there are five lines read, both the question and four answers are read */
            if (count == 4) {
                Questions temp = new Questions(questionwithanswers[0],
                        questionwithanswers[1], questionwithanswers[2],
                        questionwithanswers[3], questionwithanswers[4]);
                count = 0;
                questionsTreeMap.put(counter, temp);
                counter++;
            } else {
                count++;
            }
        }

        int size = 30;

        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        int numofquestions = 10;
        while (numofquestions > 0) {
            int index = rand.nextInt(list.size());
            Questions ask = questionsTreeMap.get(list.remove(index));
            printquestion(ask);
            numofquestions--;
        }
    }

    /**
     * This method will randomly move the answers for the questions into corresponding alphabets
     * which are A, B, C, and D. This makes sure the answers are not in the same order if the
     * player decides to play again.
     *
     * This method also has a random number generator tha makes sures no number is called twice.
     * @param t One of the 10 questions being asked (Question Object)
     */
    public void printquestion(Questions t) {
        int size = 4;
        System.out.print(t.askQuestion() + "\n");

        ArrayList<Integer> list = new ArrayList<>(size);
        ArrayList<Integer> list2 = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        String[] temp = t.getListofanswers();
        while (list.size() > 0) {
            int index = rand.nextInt(list.size());
            list2.add(list.remove(index));
        }
        System.out.println("A. " + temp[list2.get(0)]);
        System.out.println("B. " + temp[list2.get(1)]);
        System.out.println("C. " + temp[list2.get(2)]);
        System.out.println("D. " + temp[list2.get(3)]);
        System.out.println();
    }
}




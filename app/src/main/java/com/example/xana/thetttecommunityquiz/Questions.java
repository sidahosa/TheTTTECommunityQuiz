package com.example.xana.thetttecommunityquiz;

/**
 * Created by Shawn Idahosa on 12/19/2015.
 *
 * Questions object class used to store the questions and the four possible answers the user
 * can choose from.
 *
 */
public class Questions {
    private String question;
    private String correctanswer;
    private String falseanswer1;
    private String falseanswer2;
    private String falseanswer3;
    private String falseanswer4;
    private String[] listofanswers;

    /*Each question needs some type of identifier - MA */
    private int ID;

    public Questions(){
        ID = 0;
        question = "";
        correctanswer = "";
        falseanswer1 = "";
        falseanswer2 = "";
        falseanswer3 = "";
        falseanswer4 = "";
    }

    public Questions(String ques, String correct, String false1, String false2, String false3){

        /*Default value = 0
        *  - MA
        */

        ID = 0;
        question = ques;
        correctanswer = correct;
        falseanswer1 = false1;
        falseanswer2 = false2;
        falseanswer3 = false3;
        falseanswer4 = correctanswer;
        listofanswers = new String[4];
        organizedanswers();
    }

    /*Get the identifier - MA*/

    public int getID() {
        return ID;
    }

    /**
     * Organizes the potential answers with the correct answer always being the first
     */
    private void organizedanswers(){
        listofanswers[0] = correctanswer;
        listofanswers[1] = falseanswer1;
        listofanswers[2] = falseanswer2;
        listofanswers[3] = falseanswer3;
    }

    /**
     * Returns the question that is being asked to the user
     * @return question
     */
    public String askQuestion(){
        return question;
    }

    /**
     * Return the list of possible answers as an String array
     */
    public String[] getListofanswers() {
        return listofanswers;
    }
    /*Make/Change the ID - MA*/

    public void makeID(int IDNo) {
        ID = IDNo;
    }

    /* Need to access each answer field  - MA */

    public String getFalseanswer1() {
        return falseanswer1;
    }

    public String getFalseanswer2() {
        return falseanswer2;
    }

    public String getFalseanswer3() { return falseanswer3; }
    /* Returns the actual correct answer */
    public String getCorrectanswer(){
        return correctanswer;
    }

    public void setQuestion(String q){
        question = q;
    }

    public void setID(int i){
        ID = i;
    }

    public void setCorrectanswer(String correct){
        correctanswer = correct;
    }

    public void setFalseanswer1(String false1){
        falseanswer1 = false1;
    }

    public void setFalseanswer2(String false2){
        falseanswer2 = false2;
    }

    public void setFalseanswer3(String false3){
        falseanswer3 = false3;
    }
    public void setFalseanswer4(String false4){
        falseanswer4 = false4;
    }

    public String getFalseanswer4(){
        return falseanswer4;
    }



}

package com.example.xana.thetttecommunityquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

    public DataBaseHelper(Context c) {
        super(c, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        dbase = db;

        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_OPTD + " TEXT)";

        db.execSQL(sql);

    }

    public List<Questions> getAllAdminsQuestions(){
        List<Questions> quesList = new ArrayList<>();
        quesList.add(new Questions( "For Community Remakes, what is EE93’s usual role? ", "Writing up the scripts", "Setting up lights", "Giving DieselD199 great advice on how to use Google Drive", "Editing all the clips "));
        quesList.add(new Questions( "What was EE93’s first project as project director?", "Pop Goes the Diesel", "Down the Mine", "The Adventure Begins", "Misty Island Rescue Gritty Live Action Reboot starring Tom Hardy as Ferdinand "));
        quesList.add(new Questions( "The same reasons smart people do", "Why do fools fall in love?", "Whoa wasn’t ready for this", "The medulla ublongata", "The slings and arrows of outrageous fortune"));
        quesList.add(new Questions( "What is EE93’s product of choice for making Thomas and Friends stories?", "Wooden Railway", "Trackmaster", "Bachmann and Hornby", "Play Doh "));
        quesList.add(new Questions( "EE93 is known for filming…", "Outside", "Under the cover of darkness", "With or without socks on", "Tropical Birds"));
        quesList.add(new Questions( "If EE93 could have the rights to any song to use in his videos, what song would it be? ", "Earth Wind and Fire’s “September”", "Bittersweet Symphony by the Verve", "Beethoven’s 9th Symphony", "The sound giraffe’s make"));
        quesList.add(new Questions( "What does EE93 use to pull the engines in his videos?", "Fishing wire", "The tears of a mermaid", "Telekinesis ", "He takes a deep breath and exhales in the hopes the air of his breath will move the trains"));
        quesList.add(new Questions( "What is the name of EE93’s dog in real life?", "Watson", "Clarence ", "Shane Dooiney", "Waffles"));
        quesList.add(new Questions( "EE93’s series “Enterprising Engines”, features what character as a reappearing ghost?", "Proteus", "Lord Callan", "Timothy", "Bertram"));
        quesList.add(new Questions( "EE93’s favorite role in fan work so far is:", "Robert Stewart in turtlesandthomas’ “Sudrian Conflict”", "Poe Dameron in “Star Wars” ", "All of the women’s roles in “Hamlet", "Neville"));
        quesList.add(new Questions( "EE93’s favorite breakfast sandwich is: ", "Taylor Ham and Egg with salt pepper and ketchup", "Egg McMuffin", "Two pieces of french toast with bacon and syrup in between", "Scrambled eggs, bacon, and hashbrowns on a bagel"));
        quesList.add(new Questions( "Who is EE93’s favorite character from the Railway Series?", "Edward", "Bear", "The Flying Scotsman", "Diesel 199"));
        quesList.add(new Questions( "Who is EE93’s favorite character from the model era? ", "Arthur", "The Logging Losers", "Murdoch", "Derek"));
        quesList.add(new Questions( "Who is EE93’s favorite character from the CGI era?", "Marion", "Stephen", "Charlie", "Ryan"));
        quesList.add(new Questions( "What comedian has EE93 met in real life?", "Demetri Martin", "Louis C.K ", "George Carlin", "Chelsea Peretti "));
        quesList.add(new Questions( "What is EE93’s favorite video game?", "Pokemon Crystal", "Pokemon Red and Blue", "Lego Indiana Jones", "Dance Dance Revolution"));
        quesList.add(new Questions( "EE93 is…", "All answers listed", "An International Man of Mystery", "Easily confused", "Not taking This quiz seriously At times"));
        quesList.add(new Questions( "Best Bond?", "Sean Connery", "Nope", "Nope", "Nope"));
        quesList.add(new Questions( "EE93 always cries when: ", "When the main characters in a film defeat the villain by holding hands", "Trees fall on defenseless woodland creatures", "Some paint on his trains is chipped ", "The first 10 minutes of “Up” start playing"));
        quesList.add(new Questions( "EE93’s favorite director?", "Wes Anderson", "Michael Bay", "Edgar Wright ", "J.J Abrams"));
        quesList.add(new Questions( "Could EE93 find Sodor on a map?", "No because it’s not a real place", "Yes. I am confident in EE93’s ability to use maps. ", "No, because E got lost in his own house this morning", "Maybe, though I’d be more assured if he was using a globe."));
        quesList.add(new Questions( "What is EE93’s favorite season of TTTE?", "Season 4", "Season 13 ", "Season 5", "Season 2"));
        quesList.add(new Questions( "EE93’s favorite song is: ", "“You are the Apple” by Lady Lamb", "“Wally Wilder” by Delicate Steve", "“Why Does Love Always Feel like a Battlefield?” by Jordin Sparks", "The sounds giraffes make"));
        quesList.add(new Questions( "What Episode in EE93’s series uses Go-Pro Footage?", "Culdee Fell", "Lift Bridge", "Cannon Fodder", "Aura of Menace"));
        quesList.add(new Questions( "What users inspired EE93 to make his own stories and videos?", "Captain Punjab, Sparkshot, Sacredwolfie, MOAB, Trainlover476, flameamigo619, and ThomasWooden123", "Bo Burnham and Smosh", "The Nostalgia Critic and MOAB", "Anyone who makes videos of puppies with ice cubes stuck to them"));
        quesList.add(new Questions( "Who has EE93 frequently enlisted to help him make customized characters?", "Calebtrain", "Sidekickjason, who literally carves them with his teeth", "TwistedTom", "Leokimvideo"));
        quesList.add(new Questions( "What character in EE93’s series has endured the most catastrophic accidents?", "BoCo", "The Thin Controller", "Edward", "Moxie Balderdash"));
        quesList.add(new Questions( "What character has appeared in “Enterprising Engines” the least?", "Thomas", "Bertram", "Derek", "Proteus"));

        quesList.add(new Questions( "Who is Percyengine619's favorite character? ", "Percy", "Edward", "Diesel 10", "Oliver"));
        quesList.add(new Questions( "What colors is the sky for the PE619's layout?", "Light Blue", "Dark Blue", "Yellow", "White"));
        quesList.add(new Questions( "Which season has Percyengine619 completed?", "Season 1", "Season 3", "Season 11", "Season 5"));
        quesList.add(new Questions( "What was Percyengine619's first movie remake?", "Thomas & The Magic Railroad", "Hero of The Rails", "Star Wars: The Force Awakens", "The Adventure Begins"));
        quesList.add(new Questions( "What was Percyengine619's first remake?", "Percy, James, & The Fruitful Day", "Thomas and Gordon", "Percy’s Ghostly Trick", "Thomas & The Carnival "));
        quesList.add(new Questions( "What remake was the collaboration of DieselD199 and Percyengine619?", "Edward Strikes Out", "Edward & The Mail", "Edward’s Exploit", "Edward and Gordon"));
        quesList.add(new Questions( "What year was PE619's Tomy Thomas & The Magic Railroad released?", "2012", "2010", "2008", "2015"));
        quesList.add(new Questions( "How many versions of Percyengine619's Tomy James in a Mess are there?", "3", "2", "1", "4"));
        quesList.add(new Questions( "How many Percyengine619 remakes have there been with snow on the layout?", "6", "3", "10", "2"));
        quesList.add(new Questions( "Who is Percyengine619's favorite narrator?", "George Carlin", "Ringo Starr", "Alec Baldwin", "Michael Angelis "));
        quesList.add(new Questions( "What was the first Percyengine619 Sodor Race match?", "Thomas vs Percy", "Gordon vs Spencer", "Ben vs Douglas", "Oliver vs Henry"));
        quesList.add(new Questions( "When did Angry Gordon make his debut in Percyengine619's remakes?", "Tomy TAB: Thomas & Gordon", "Tomy The Trouble With The Mud", "Tomy Old Reliable Edward", "Tomy Gordon & Spencer"));
        quesList.add(new Questions( "What is Percyengine619's most-viewed video?", "Tomy Best of Gordon DVD", "Tomy Thomas & The Magic Railroad Chase Scene", "Tomy Hero of The Rails Full Movie", "Greatest Tomy Percy Accident "));
        quesList.add(new Questions( "Which of the following PE619 videos did WoollyBearNO6Films' themes make an appearance in?", "Tomy Thomas and Friends Henry's Accident Short ", "Tomy Sodor Races: Thomas vs Percy ", "Greatest Tomy Thomas Accident", "Tomy Sodor Races: Gordon vs Henry"));
        quesList.add(new Questions( "Who was the ghost engine from Percyengine619's Tomy Duncan gets Spooked?", "Peter Sam", "Skarloey", "Sir Handel", "Duncan"));
        quesList.add(new Questions( "When did Tomy Hero of The Rails come out?", "July 2014", "June 2014", "July 2015", "August 1986"));
        quesList.add(new Questions( "Who was the main influence to PE619's channel?", "jjschepis3", "skullzproductions", "leokimvideo", "trainlover476"));
        quesList.add(new Questions( "What is the bonus remake at the end of the Tomy Complete Collection Season 1?", "Tomy Thomas & Stepney", "Tomy Edward Strikes Out", "Tomy Better Late Than Never", "Tomy Rusty to The Rescue"));
        quesList.add(new Questions( "What is the longest running joke in PE619's Tomy remakes?", "Sir Topham Hatt being bigger than all the humans.", "The tracks being blue rather than silver.", "The drivers being the same four drivers for all the engines.", "Bertie being bus"));
        quesList.add(new Questions( "What was the last remake of PE619's “The Dark Blue Walls Era”?", "Tomy Gordon & Spencer", "Tomy The Trouble With The Mud", "Tomy Educate Gordon Day", "Tomy Old Iron"));
        quesList.add(new Questions( "Who was the ghost train in PE619's Tomy Percy’s Ghostly Trick?", "Percy", "Thomas", "Stepney", "Oliver"));
        quesList.add(new Questions( "Why did PE619 choose UK Dub instead of US Dub for Tomy Thomas & The Birthday Mail?", "ITS MEEEEEEEEEE!!", "US Dub wasn’t available", "DieselD199 requested for UK dub", "Editing Accident"));
        quesList.add(new Questions( "Percyengine619 owns a rare Horrid Lorry", "True", "False", "Silly Engine!", "Pick me!"));
        quesList.add(new Questions( "What was the only PE619 remake done outside in the snow?", "Tomy Snow Engine", "Tomy Thomas Christmas Party", "Tomy Terence the Tractor", "Tomy Deputation"));
        quesList.add(new Questions( "PE619's Tomy Bye George features an ____ George", "Ertl", "Tomy", "Wooden", "HO-Scale"));
        quesList.add(new Questions( "Who is Percyengine619's second favorite character?", "Diesel 10", "Edward", "Henry", "Duck"));
        quesList.add(new Questions( "What is the rarest TOMY item PE619 owns?", "Tomy Old Slow Coach", "Tomy Gordon", "Tomy Angry Face Thomas", "Tomy Oliver"));
        quesList.add(new Questions( "How many express coaches does PE619 own?", "Too many to count", "2", "0", "1"));
        quesList.add(new Questions( "What color is Spencer in PE619's Tomy Gordon and Spencer (2015)?", "Silver", "Golden", "Bronze", "Gray"));
        quesList.add(new Questions( "Are there any Ho-Scale animals on PE619's layout?", "Yes", "No", "Maybe", "I Don’t Know"));
        quesList.add(new Questions( "What did PE619 use for the wall in Tomy Come Out, Henry!?", "Sticks of gum", "Newspaper and a pair of bootlaces", "Sir Topham Hatt Trousers", "Legoes"));

        quesList.add(new Questions( "What year did DieselD199 create his channel?", "2007", "2006", "2005", "2008"));
        quesList.add(new Questions( "What year did DieselD199 upload his first video?", "2008", "2007", "2006", "2009"));
        quesList.add(new Questions( "What year did DieselD199 upload the first TOMICA Thomas & Friends Short?", "2010", "2008", "2009", "2007"));
        quesList.add(new Questions( "As of 2015, what is DieselD199’s most viewed video?", "TOMICA Thomas & Friends Short 35: Full Dream Ahead", "TOMICA Thomas & Friends Short 40: Unstoppable", "TOMICA Thomas & Friends Music Video: Engine Roll Call! (with Sing-A-Long Lyrics)", "TOMICA Thomas & Friends Short 16: Neville Gets Bumped"));
        quesList.add(new Questions( "What country is DieselD199 from?", "Australia", "USA", "Island of Sodor", "UK"));
        quesList.add(new Questions( "DieselD199 has more than 65 million total views", "True", "False", "Trick Question, it’s 619", "It’s really 25"));
        quesList.add(new Questions( "DieselD199 has more than 45 000 subscribers", "True", "False", "Over 9000", "More than 1 Million"));
        quesList.add(new Questions( "How many remakes has DieselD199 created?", "Two", "One", "Three", "Four"));
        quesList.add(new Questions( "DieselD199 plays which character in the Thomas Creator Collective?", "Thomas", "Percy", "Henry", "Edward"));
        quesList.add(new Questions( "DieselD199 plays which character in the Thomas Creator Collective?", "Gordon", "James", "Ryan", "Duck"));
        quesList.add(new Questions( "DieselD199 created the Slender Engine", "True", "False", "Percyengine619 did : )", "Enterprisingengine93 created him"));
        quesList.add(new Questions( "What year did DieselD199 release the first Slender Engine video?", "2012", "2011", "2013", "2014"));
        quesList.add(new Questions( "Which TOMICA Thomas & Friends Short was uploaded in three languages?", "Short 13: Coal For Henry", "Short 3: Something’s Up With Thomas", "Short 10: Things That Go Bump In The Night", "Short 29: April Fools’ Day"));
        quesList.add(new Questions( "TOMICA Thomas & Friends has more than 40 shorts", "True", "False", "39", "1738"));
        quesList.add(new Questions( "DieselD199 has uploaded a Halloween video in every year except", "2011", "2014", "2013", "2012"));
        quesList.add(new Questions( "DieselD199 uploaded a Halloween video in 2009", "False", "True", "Maybe", "IDK"));
        quesList.add(new Questions( "What is DieselD199’s favourite holiday?", "Halloween", "April Fools Day", "Easter", "Christmas"));
        quesList.add(new Questions( "Which of the following holidays has DieselD199 never made a video for?", "New Year’s Eve", "Valentine’s Day", "Christmas", "Easter"));
        quesList.add(new Questions( "DieselD199 was nominated for a Nickelodeon Kids’ Choice Award in what year?", "2015", "2013", "2014", "2012"));
        quesList.add(new Questions( "DieselD199 did his first livestream in what year?", "2015", "2014", "2013", "2016"));
        quesList.add(new Questions( "What year did DieselD199 upload his first 360º video?", "2015", "2014", "2013", "2016"));
        quesList.add(new Questions( "What year did TOMICA Thomas & Friends switch to CGI?", "2015", "2014", "2013", "2016"));
        quesList.add(new Questions( "What year did DieselD199 do his (first) Q&A video series?", "2014", "2013", "2015", "2016"));
        quesList.add(new Questions( "Which of the following YouTubers did NOT appear in DieselD199’s KCA Live Stream?", "Calebtrain", "Percyengine619", "Sidekickjason", "Enterprisingengine93"));
        quesList.add(new Questions( "As of 2015, which of the following is the longest TOMICA Thomas & Friends Short?", "Short 36: Trick or Treat", "Short 9: Attack of the Wooden Box on Wheels", "Short 19: An Average Day for Thomas", "Short 32: Diesels, Ducks & Demons"));
        quesList.add(new Questions( "DieselD199 primarily uses which Thomas & Friends merchandising range in his videos?", "TOMY Motor Road & Rail", "Thomas Wooden Railway", "Bachmann", "Take-n-Play"));
        quesList.add(new Questions( "What is DieselD199’s favourite Thomas & Friends episode?", "Haunted Henry", "The Flying Kipper", "Escape!", "Thomas & Gordon"));
        quesList.add(new Questions( "DieselD199’s first iTunes release was in what year?", "2014", "2013", "2012", "2015"));
        quesList.add(new Questions( "The first TOMICA Thomas & Friends Short was", "An Easter Eye-Opener", "Emo Engines", "Tender Engines United", "Something’s Up With Thomas"));
        quesList.add(new Questions( "TOMICA Thomas & Friends has featured Thomas Wooden Railway models before", "True", "False", "Actually it was ERTL", "Actually it was EE93’s Wooden trains."));

        quesList.add(new Questions( "In Signals and Scrapes, which engine wanted to try and run a signal at danger?", "Percy", "Thomas", "Toby", "Mavis "));
        quesList.add(new Questions( "What seasons of the SKJ Productions series cover?", "Seasons 1-4", "Seasons 1-6", "Seasons 2-19", "Seasons 17-19 "));
        quesList.add(new Questions( "In ''The Plumbers Express'', who takes the special train?", "Henry.", "Gordon.", "James.", "Thomas."));
        quesList.add(new Questions( "In ''The Farmers Visitor'' Who gets tricked into taking the 'special' train?", "Gordon.", "James.", "Percy.", "Edward. "));
        quesList.add(new Questions( "Which one of these characters is NOT in SKJ productions series?", "Emily.", "Bertie the bus.", "George the steamroller.", "Sir Topham Hatt. "));
        quesList.add(new Questions( "In ''Oliver's Mail Train'', who does Oliver meet for the first time?", "Tom Tipper the postman.", "Annie and Clarabel", "James with the mainline mail train.", "Toad the brake van."));
        quesList.add(new Questions( "In ''The New Fuel'' Who brags he is ''better than diesels!'' and gets learns that not all diesels are bad?", "Gordon.", "BoCo.", "James.", "Thomas."));
        quesList.add(new Questions( "In ''Market Day'' who ignores Toby's advice?", "Thomas.", "Percy.", "Edward.", "Henry. "));
        quesList.add(new Questions( "Which branch line is known as the ''Little Western''?", "Duck and Oliver’s", "Thomas, Percy and Toby's.", "Edward's.", "Henry's."));
        quesList.add(new Questions( "Who saved the day with their Moaning and weeshing?", "Duck.", "Oliver.", "Toby.", "Thomas. "));
        quesList.add(new Questions( "In ''The Pride of Sodor'' who mistakes Sir Topham Hatts compliment?", "Thomas.", "Gordon.", "Duck", "Bertie the bus."));
        quesList.add(new Questions( "What year did Season 1 of SKJ Productions begin?", "2013", "2012", "2014", "2015"));
        quesList.add(new Questions( "Which character is NOT in SKJ Productions series?", "Fearless Freddie", "Skarloey", "Bertram", "Duke"));
        quesList.add(new Questions( "How long was the break between Seasons 1 and 2 of SKJ Productions?", "2.5 Years", "2 Years", "1.5 Years", "1 Year"));
        quesList.add(new Questions( "How many Sodor Scenes videos are there currently?", "20 Sodor Scenes", "30 Sodor Scenes", "25 Sodor Scenes", "15 Sodor Scenes"));
        quesList.add(new Questions( "Which character currently has the most episodes to themself in SKJ Productions?", "Gordon", "Thomas", "James", "Percy"));
        quesList.add(new Questions( "What type of toy track does SKJ Productions film on?", "Blue Plarail/Tomica Track", "New gray TrackMaster Track", "Wooden Railway Track", "Tan TrackMaster Track"));
        quesList.add(new Questions( "Which country is Sidekickjason from?", "United States", "Great Britian", "Australia", "Sodor"));
        quesList.add(new Questions( "Which YouTuber greatly inspired Sidekickjason a long time ago to begin producing his series?", "DieselD199", "EnterprisingEngine93", "Percyengine619", "The Official Thomas & Friends Channel"));
        quesList.add(new Questions( "Currently, how often are new full episodes being released?", "Once every other week", "Twice a week", "Once a week", "Once a month"));
        quesList.add(new Questions( "Which YouTuber has written future stories that will be included in Seasons 3 and 4?", "Thomas&Friends47", "EnterprisingEngine93", "DieselD199", "Calebtrain"));
        quesList.add(new Questions( "In Inspector Troubles, which engines run into problems with a railway inspector?", "Bill & Ben", "Thomas & Percy", "Donald & Douglas", "Peter Sam & Sir Handel"));
        quesList.add(new Questions( "What type of video has SKJ Productions NOT yet produced?", "Music Video Remakes", "Audio Commentary", "Sneak Peeks", "Full Episode Remakes"));
        quesList.add(new Questions( "When did Season 2 begin airing?", "November 2015", "March 2014", "June 2014", "June 2015"));
        quesList.add(new Questions( "When did promotional videos for Season 2 begin airing?", "June 2015", "March 2014", "November 2015", "June 2014"));
        quesList.add(new Questions( "Who is the main character in the first episode of Season 2?", "BoCo", "Donald", "Mavis", "Skarloey"));
        quesList.add(new Questions( "After this quiz, I’m sure you will go to http://www.facebook.com/sidekickjason", "For sure! (Best choice)", "Maybe", "Nah", "I don’t have Facebook"));
        quesList.add(new Questions( "Where is Brendam Docks located in SKJ Productions series?", "Edward’s Branchline", "Thomas’ Branchline", "The Mainline", "Duck’s Branchline"));
        quesList.add(new Questions( "Which one of these characters is NOT in SKJ productions series?", "Jack", "Bertie ", "Harold", "Horrid Lorries"));
        quesList.add(new Questions( "Which editing Software does Sidekickjason edit on?", "Adobe Premiere", "Final Cut Pro", "Sony Vegas", "Windows Movie Maker"));
        quesList.add(new Questions( "What is the name of the teacher Thomas helps out in a calculus video?", "Mr. Parker", "Mr. Rawlins", "Mr. Miller", "Mr. Reeder"));

        Collections.shuffle(quesList);
        return quesList;
    }


    public List<Questions> getAllEE93Questions(){
        List<Questions> quesList = new ArrayList<>();

        quesList.add(new Questions( "For Community Remakes, what is EE93’s usual role? ", "Writing up the scripts", "Setting up lights", "Giving DieselD199 great advice on how to use Google Drive", "Editing all the clips "));
        quesList.add(new Questions( "What was EE93’s first project as project director?", "Pop Goes the Diesel", "Down the Mine", "The Adventure Begins", "Misty Island Rescue Gritty Live Action Reboot starring Tom Hardy as Ferdinand "));
        quesList.add(new Questions( "The same reasons smart people do", "Why do fools fall in love?", "Whoa wasn’t ready for this", "The medulla ublongata", "The slings and arrows of outrageous fortune"));
        quesList.add(new Questions( "What is EE93’s product of choice for making Thomas and Friends stories?", "Wooden Railway", "Trackmaster", "Bachmann and Hornby", "Play Doh "));
        quesList.add(new Questions( "EE93 is known for filming…", "Outside", "Under the cover of darkness", "With or without socks on", "Tropical Birds"));
        quesList.add(new Questions( "If EE93 could have the rights to any song to use in his videos, what song would it be? ", "Earth Wind and Fire’s “September”", "Bittersweet Symphony by the Verve", "Beethoven’s 9th Symphony", "The sound giraffe’s make"));
        quesList.add(new Questions( "What does EE93 use to pull the engines in his videos?", "Fishing wire", "The tears of a mermaid", "Telekinesis ", "He takes a deep breath and exhales in the hopes the air of his breath will move the trains"));
        quesList.add(new Questions( "What is the name of EE93’s dog in real life?", "Watson", "Clarence ", "Shane Dooiney", "Waffles"));
        quesList.add(new Questions( "EE93’s series “Enterprising Engines”, features what character as a reappearing ghost?", "Proteus", "Lord Callan", "Timothy", "Bertram"));
        quesList.add(new Questions( "EE93’s favorite role in fan work so far is:", "Robert Stewart in turtlesandthomas’ “Sudrian Conflict”", "Poe Dameron in “Star Wars” ", "All of the women’s roles in “Hamlet", "Neville"));
        quesList.add(new Questions( "EE93’s favorite breakfast sandwich is: ", "Taylor Ham and Egg with salt pepper and ketchup", "Egg McMuffin", "Two pieces of french toast with bacon and syrup in between", "Scrambled eggs, bacon, and hashbrowns on a bagel"));
        quesList.add(new Questions( "Who is EE93’s favorite character from the Railway Series?", "Edward", "Bear", "The Flying Scotsman", "Diesel 199"));
        quesList.add(new Questions( "Who is EE93’s favorite character from the model era? ", "Arthur", "The Logging Losers", "Murdoch", "Derek"));
        quesList.add(new Questions( "Who is EE93’s favorite character from the CGI era?", "Marion", "Stephen", "Charlie", "Ryan"));
        quesList.add(new Questions( "What comedian has EE93 met in real life?", "Demetri Martin", "Louis C.K ", "George Carlin", "Chelsea Peretti "));
        quesList.add(new Questions( "What is EE93’s favorite video game?", "Pokemon Crystal", "Pokemon Red and Blue", "Lego Indiana Jones", "Dance Dance Revolution"));
        quesList.add(new Questions( "EE93 is…", "All answers listed", "An International Man of Mystery", "Easily confused", "Not taking This quiz seriously At times"));
        quesList.add(new Questions( "Best Bond?", "Sean Connery", "Nope", "Nope", "Nope"));
        quesList.add(new Questions( "EE93 always cries when: ", "When the main characters in a film defeat the villain by holding hands", "Trees fall on defenseless woodland creatures", "Some paint on his trains is chipped ", "The first 10 minutes of “Up” start playing"));
        quesList.add(new Questions( "EE93’s favorite director?", "Wes Anderson", "Michael Bay", "Edgar Wright ", "J.J Abrams"));
        quesList.add(new Questions( "Could EE93 find Sodor on a map?", "No because it’s not a real place", "Yes. I am confident in EE93’s ability to use maps. ", "No, because E got lost in his own house this morning", "Maybe, though I’d be more assured if he was using a globe."));
        quesList.add(new Questions( "What is EE93’s favorite season of TTTE?", "Season 4", "Season 13 ", "Season 5", "Season 2"));
        quesList.add(new Questions( "EE93’s favorite song is: ", "“You are the Apple” by Lady Lamb", "“Wally Wilder” by Delicate Steve", "“Why Does Love Always Feel like a Battlefield?” by Jordin Sparks", "The sounds giraffes make"));
        quesList.add(new Questions( "What Episode in EE93’s series uses Go-Pro Footage?", "Culdee Fell", "Lift Bridge", "Cannon Fodder", "Aura of Menace"));
        quesList.add(new Questions( "What users inspired EE93 to make his own stories and videos?", "Captain Punjab, Sparkshot, Sacredwolfie, MOAB, Trainlover476, flameamigo619, and ThomasWooden123", "Bo Burnham and Smosh", "The Nostalgia Critic and MOAB", "Anyone who makes videos of puppies with ice cubes stuck to them"));
        quesList.add(new Questions( "Who has EE93 frequently enlisted to help him make customized characters?", "Calebtrain", "Sidekickjason, who literally carves them with his teeth", "TwistedTom", "Leokimvideo"));
        quesList.add(new Questions( "What character in EE93’s series has endured the most catastrophic accidents?", "BoCo", "The Thin Controller", "Edward", "Moxie Balderdash"));
        quesList.add(new Questions( "What character has appeared in “Enterprising Engines” the least?", "Thomas", "Bertram", "Derek", "Proteus"));
        quesList.add(new Questions( "What was Enterprisingengine93 first remake as sound-director?", "The Adventure Begins", "Down The Mine", "Thomas and Gordon/Thomas Gets Tricked", "Gordon Goes Super Saiyan"));
        quesList.add(new Questions( "What are the last two number in Enterprising's name?", "93", "619", "199", "39"));

        Collections.shuffle(quesList);
        return quesList;
    }

    public List<Questions> getAllSKJQuestions(){
        List<Questions> quesList = new ArrayList<>();
        quesList.add(new Questions( "In Signals and Scrapes, which engine wanted to try and run a signal at danger?", "Percy", "Thomas", "Toby", "Mavis "));
        quesList.add(new Questions( "What seasons of the SKJ Productions series cover?", "Seasons 1-4", "Seasons 1-6", "Seasons 2-19", "Seasons 17-19 "));
        quesList.add(new Questions( "In ''The Plumbers Express'', who takes the special train?", "Henry.", "Gordon.", "James.", "Thomas."));
        quesList.add(new Questions( "In ''The Farmers Visitor'' Who gets tricked into taking the 'special' train?", "Gordon.", "James.", "Percy.", "Edward. "));
        quesList.add(new Questions( "Which one of these characters is NOT in SKJ productions series?", "Emily.", "Bertie the bus.", "George the steamroller.", "Sir Topham Hatt. "));
        quesList.add(new Questions( "In ''Oliver's Mail Train'', who does Oliver meet for the first time?", "Tom Tipper the postman.", "Annie and Clarabel", "James with the mainline mail train.", "Toad the brake van."));
        quesList.add(new Questions( "In ''The New Fuel'' Who brags he is ''better than diesels!'' and gets learns that not all diesels are bad?", "Gordon.", "BoCo.", "James.", "Thomas."));
        quesList.add(new Questions( "In ''Market Day'' who ignores Toby's advice?", "Thomas.", "Percy.", "Edward.", "Henry. "));
        quesList.add(new Questions( "Which branch line is known as the ''Little Western''?", "Duck and Oliver’s", "Thomas, Percy and Toby's.", "Edward's.", "Henry's."));
        quesList.add(new Questions( "Who saved the day with their Moaning and weeshing?", "Duck.", "Oliver.", "Toby.", "Thomas. "));
        quesList.add(new Questions( "In ''The Pride of Sodor'' who mistakes Sir Topham Hatts compliment?", "Thomas.", "Gordon.", "Duck", "Bertie the bus."));
        quesList.add(new Questions( "What year did Season 1 of SKJ Productions begin?", "2013", "2012", "2014", "2015"));
        quesList.add(new Questions( "Which character is NOT in SKJ Productions series?", "Fearless Freddie", "Skarloey", "Bertram", "Duke"));
        quesList.add(new Questions( "How long was the break between Seasons 1 and 2 of SKJ Productions?", "2.5 Years", "2 Years", "1.5 Years", "1 Year"));
        quesList.add(new Questions( "How many Sodor Scenes videos are there currently?", "20 Sodor Scenes", "30 Sodor Scenes", "25 Sodor Scenes", "15 Sodor Scenes"));
        quesList.add(new Questions( "Which character currently has the most episodes to themself in SKJ Productions?", "Gordon", "Thomas", "James", "Percy"));
        quesList.add(new Questions( "What type of toy track does SKJ Productions film on?", "Blue Plarail/Tomica Track", "New gray TrackMaster Track", "Wooden Railway Track", "Tan TrackMaster Track"));
        quesList.add(new Questions( "Which country is Sidekickjason from?", "United States", "Great Britian", "Australia", "Sodor"));
        quesList.add(new Questions( "Which YouTuber greatly inspired Sidekickjason a long time ago to begin producing his series?", "DieselD199", "EnterprisingEngine93", "Percyengine619", "The Official Thomas & Friends Channel"));
        quesList.add(new Questions( "Currently, how often are new full episodes being released?", "Once every other week", "Twice a week", "Once a week", "Once a month"));
        quesList.add(new Questions( "Which YouTuber has written future stories that will be included in Seasons 3 and 4?", "Thomas&Friends47", "EnterprisingEngine93", "DieselD199", "Calebtrain"));
        quesList.add(new Questions( "In Inspector Troubles, which engines run into problems with a railway inspector?", "Bill & Ben", "Thomas & Percy", "Donald & Douglas", "Peter Sam & Sir Handel"));
        quesList.add(new Questions( "What type of video has SKJ Productions NOT yet produced?", "Music Video Remakes", "Audio Commentary", "Sneak Peeks", "Full Episode Remakes"));
        quesList.add(new Questions( "When did Season 2 begin airing?", "November 2015", "March 2014", "June 2014", "June 2015"));
        quesList.add(new Questions( "When did promotional videos for Season 2 begin airing?", "June 2015", "March 2014", "November 2015", "June 2014"));
        quesList.add(new Questions( "Who is the main character in the first episode of Season 2?", "BoCo", "Donald", "Mavis", "Skarloey"));
        quesList.add(new Questions( "After this quiz, I’m sure you will go to http://www.facebook.com/sidekickjason", "For sure! (Best choice)", "Maybe", "Nah", "I don’t have Facebook"));
        quesList.add(new Questions( "Where is Brendam Docks located in SKJ Productions series?", "Edward’s Branchline", "Thomas’ Branchline", "The Mainline", "Duck’s Branchline"));
        quesList.add(new Questions( "Which one of these characters is NOT in SKJ productions series?", "Jack", "Bertie ", "Harold", "Horrid Lorries"));
        quesList.add(new Questions( "Which editing Software does Sidekickjason edit on?", "Adobe Premiere", "Final Cut Pro", "Sony Vegas", "Windows Movie Maker"));
        quesList.add(new Questions( "What is the name of the teacher Thomas helps out in a calculus video?", "Mr. Parker", "Mr. Rawlins", "Mr. Miller", "Mr. Reeder"));

        Collections.shuffle(quesList);
        return quesList;
    }

    public List<Questions> getAllPe619Questions(){
        List<Questions> quesList = new ArrayList<>();
        quesList.add(new Questions( "Who is Percyengine619's favorite character? ", "Percy", "Edward", "Diesel 10", "Oliver"));
        quesList.add(new Questions( "What colors is the sky for the PE619's layout?", "Light Blue", "Dark Blue", "Yellow", "White"));
        quesList.add(new Questions( "Which season has Percyengine619 completed?", "Season 1", "Season 3", "Season 11", "Season 5"));
        quesList.add(new Questions( "What was Percyengine619's first movie remake?", "Thomas & The Magic Railroad", "Hero of The Rails", "Star Wars: The Force Awakens", "The Adventure Begins"));
        quesList.add(new Questions( "What was Percyengine619's first remake?", "Percy, James, & The Fruitful Day", "Thomas and Gordon", "Percy’s Ghostly Trick", "Thomas & The Carnival "));
        quesList.add(new Questions( "What remake was the collaboration of DieselD199 and Percyengine619?", "Edward Strikes Out", "Edward & The Mail", "Edward’s Exploit", "Edward and Gordon"));
        quesList.add(new Questions( "What year was PE619's Tomy Thomas & The Magic Railroad released?", "2012", "2010", "2008", "2015"));
        quesList.add(new Questions( "How many versions of Percyengine619's Tomy James in a Mess are there?", "3", "2", "1", "4"));
        quesList.add(new Questions( "How many Percyengine619 remakes have there been with snow on the layout?", "6", "3", "10", "2"));
        quesList.add(new Questions( "Who is Percyengine619's favorite narrator?", "George Carlin", "Ringo Starr", "Alec Baldwin", "Michael Angelis "));
        quesList.add(new Questions( "What was the first Percyengine619 Sodor Race match?", "Thomas vs Percy", "Gordon vs Spencer", "Ben vs Douglas", "Oliver vs Henry"));
        quesList.add(new Questions( "When did Angry Gordon make his debut in Percyengine619's remakes?", "Tomy TAB: Thomas & Gordon", "Tomy The Trouble With The Mud", "Tomy Old Reliable Edward", "Tomy Gordon & Spencer"));
        quesList.add(new Questions( "What is Percyengine619's most-viewed video?", "Tomy Best of Gordon DVD", "Tomy Thomas & The Magic Railroad Chase Scene", "Tomy Hero of The Rails Full Movie", "Greatest Tomy Percy Accident "));
        quesList.add(new Questions( "Which of the following PE619 videos did WoollyBearNO6Films' themes make an appearance in?", "Tomy Thomas and Friends Henry's Accident Short ", "Tomy Sodor Races: Thomas vs Percy ", "Greatest Tomy Thomas Accident", "Tomy Sodor Races: Gordon vs Henry"));
        quesList.add(new Questions( "Who was the ghost engine from Percyengine619's Tomy Duncan gets Spooked?", "Peter Sam", "Skarloey", "Sir Handel", "Duncan"));
        quesList.add(new Questions( "When did Tomy Hero of The Rails come out?", "July 2014", "June 2014", "July 2015", "August 1986"));
        quesList.add(new Questions( "Who was the main influence to PE619's channel?", "jjschepis3", "skullzproductions", "leokimvideo", "trainlover476"));
        quesList.add(new Questions( "What is the bonus remake at the end of the Tomy Complete Collection Season 1?", "Tomy Thomas & Stepney", "Tomy Edward Strikes Out", "Tomy Better Late Than Never", "Tomy Rusty to The Rescue"));
        quesList.add(new Questions( "What is the longest running joke in PE619's Tomy remakes?", "Sir Topham Hatt being bigger than all the humans.", "The tracks being blue rather than silver.", "The drivers being the same four drivers for all the engines.", "Bertie being bus"));
        quesList.add(new Questions( "What was the last remake of PE619's “The Dark Blue Walls Era”?", "Tomy Gordon & Spencer", "Tomy The Trouble With The Mud", "Tomy Educate Gordon Day", "Tomy Old Iron"));
        quesList.add(new Questions( "Who was the ghost train in PE619's Tomy Percy’s Ghostly Trick?", "Percy", "Thomas", "Stepney", "Oliver"));
        quesList.add(new Questions( "Why did PE619 choose UK Dub instead of US Dub for Tomy Thomas & The Birthday Mail?", "ITS MEEEEEEEEEE!!", "US Dub wasn’t available", "DieselD199 requested for UK dub", "Editing Accident"));
        quesList.add(new Questions( "Percyengine619 owns a rare Horrid Lorry", "True", "False", "Silly Engine!", "Pick me!"));
        quesList.add(new Questions( "What was the only PE619 remake done outside in the snow?", "Tomy Snow Engine", "Tomy Thomas Christmas Party", "Tomy Terence the Tractor", "Tomy Deputation"));
        quesList.add(new Questions( "PE619's Tomy Bye George features an ____ George", "Ertl", "Tomy", "Wooden", "HO-Scale"));
        quesList.add(new Questions( "Who is Percyengine619's second favorite character?", "Diesel 10", "Edward", "Henry", "Duck"));
        quesList.add(new Questions( "What is the rarest TOMY item PE619 owns?", "Tomy Old Slow Coach", "Tomy Gordon", "Tomy Angry Face Thomas", "Tomy Oliver"));
        quesList.add(new Questions( "How many express coaches does PE619 own?", "Too many to count", "2", "0", "1"));
        quesList.add(new Questions( "What color is Spencer in PE619's Tomy Gordon and Spencer (2015)?", "Silver", "Golden", "Bronze", "Gray"));
        quesList.add(new Questions( "Are there any Ho-Scale animals on PE619's layout?", "Yes", "No", "Maybe", "I Don’t Know"));
        quesList.add(new Questions( "What did PE619 use for the wall in Tomy Come Out, Henry!?", "Sticks of gum", "Newspaper and a pair of bootlaces", "Sir Topham Hatt Trousers", "Legoes"));

        Collections.shuffle(quesList);
        return quesList;
    }
    public List<Questions> getAllDieselD199Questions() {
        List<Questions> quesList = new ArrayList<>();

        quesList.add(new Questions( "What year did DieselD199 create his channel?", "2007", "2006", "2005", "2008"));
        quesList.add(new Questions( "What year did DieselD199 upload his first video?", "2008", "2007", "2006", "2009"));
        quesList.add(new Questions( "What year did DieselD199 upload the first TOMICA Thomas & Friends Short?", "2010", "2008", "2009", "2007"));
        quesList.add(new Questions( "As of 2015, what is DieselD199’s most viewed video?", "TOMICA Thomas & Friends Short 35: Full Dream Ahead", "TOMICA Thomas & Friends Short 40: Unstoppable", "TOMICA Thomas & Friends Music Video: Engine Roll Call! (with Sing-A-Long Lyrics)", "TOMICA Thomas & Friends Short 16: Neville Gets Bumped"));
        quesList.add(new Questions( "What country is DieselD199 from?", "Australia", "USA", "Island of Sodor", "UK"));
        quesList.add(new Questions( "DieselD199 has more than 65 million total views", "True", "False", "Trick Question, it’s 619", "It’s really 25"));
        quesList.add(new Questions( "DieselD199 has more than 45 000 subscribers", "True", "False", "Over 9000", "More than 1 Million"));
        quesList.add(new Questions( "How many remakes has DieselD199 created?", "Two", "One", "Three", "Four"));
        quesList.add(new Questions( "DieselD199 plays which character in the Thomas Creator Collective?", "Thomas", "Percy", "Henry", "Edward"));
        quesList.add(new Questions( "DieselD199 plays which character in the Thomas Creator Collective?", "Gordon", "James", "Ryan", "Duck"));
        quesList.add(new Questions( "DieselD199 created the Slender Engine", "True", "False", "Percyengine619 did : )", "Enterprisingengine93 created him"));
        quesList.add(new Questions( "What year did DieselD199 release the first Slender Engine video?", "2012", "2011", "2013", "2014"));
        quesList.add(new Questions( "Which TOMICA Thomas & Friends Short was uploaded in three languages?", "Short 13: Coal For Henry", "Short 3: Something’s Up With Thomas", "Short 10: Things That Go Bump In The Night", "Short 29: April Fools’ Day"));
        quesList.add(new Questions( "TOMICA Thomas & Friends has more than 40 shorts", "True", "False", "39", "1738"));
        quesList.add(new Questions( "DieselD199 has uploaded a Halloween video in every year except", "2011", "2014", "2013", "2012"));
        quesList.add(new Questions( "DieselD199 uploaded a Halloween video in 2009", "False", "True", "Maybe", "IDK"));
        quesList.add(new Questions( "What is DieselD199’s favourite holiday?", "Halloween", "April Fools Day", "Easter", "Christmas"));
        quesList.add(new Questions( "Which of the following holidays has DieselD199 never made a video for?", "New Year’s Eve", "Valentine’s Day", "Christmas", "Easter"));
        quesList.add(new Questions( "DieselD199 was nominated for a Nickelodeon Kids’ Choice Award in what year?", "2015", "2013", "2014", "2012"));
        quesList.add(new Questions( "DieselD199 did his first livestream in what year?", "2015", "2014", "2013", "2016"));
        quesList.add(new Questions( "What year did DieselD199 upload his first 360º video?", "2015", "2014", "2013", "2016"));
        quesList.add(new Questions( "What year did TOMICA Thomas & Friends switch to CGI?", "2015", "2014", "2013", "2016"));
        quesList.add(new Questions( "What year did DieselD199 do his (first) Q&A video series?", "2014", "2013", "2015", "2016"));
        quesList.add(new Questions( "Which of the following YouTubers did NOT appear in DieselD199’s KCA Live Stream?", "Calebtrain", "Percyengine619", "Sidekickjason", "Enterprisingengine93"));
        quesList.add(new Questions( "As of 2015, which of the following is the longest TOMICA Thomas & Friends Short?", "Short 36: Trick or Treat", "Short 9: Attack of the Wooden Box on Wheels", "Short 19: An Average Day for Thomas", "Short 32: Diesels, Ducks & Demons"));
        quesList.add(new Questions( "DieselD199 primarily uses which Thomas & Friends merchandising range in his videos?", "TOMY Motor Road & Rail", "Thomas Wooden Railway", "Bachmann", "Take-n-Play"));
        quesList.add(new Questions( "What is DieselD199’s favourite Thomas & Friends episode?", "Haunted Henry", "The Flying Kipper", "Escape!", "Thomas & Gordon"));
        quesList.add(new Questions( "DieselD199’s first iTunes release was in what year?", "2014", "2013", "2012", "2015"));
        quesList.add(new Questions( "The first TOMICA Thomas & Friends Short was", "An Easter Eye-Opener", "Emo Engines", "Tender Engines United", "Something’s Up With Thomas"));
        quesList.add(new Questions( "TOMICA Thomas & Friends has featured Thomas Wooden Railway models before", "True", "False", "Actually it was ERTL", "Actually it was EE93’s Wooden trains."));
        Collections.shuffle(quesList);
        return quesList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        onCreate(db);
    }
}

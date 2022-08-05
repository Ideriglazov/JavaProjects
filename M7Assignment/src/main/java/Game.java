import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
Create Class "Game" with static method and enum

The enum "GameType" will list three types of games: soccer, hockey, and rugby.

The method

public static void writeNumOfPlayersPerTeam(GameType game){}

will check the type and create a new file with the name of the game as the name of the file

In the file, it will print 11 in the case of Soccer, 6 if it is Hockey, and 15 for Rugby.

Please use a switch case.
 */
public class Game {
    enum GameType{
        soccer,
        hockey,
        rugby
    }
    public static void writeNumOfPlayersPerTeam(GameType game){
        try {
            switch (game){
                case soccer:
                    Game.createFile(game);
                    Game.writeToFile(game, "11");
                    break;
                case hockey:
                    Game.createFile(game);
                    Game.writeToFile(game, "6");
                    break;
                case rugby:
                    Game.createFile(game);
                    Game.writeToFile(game, "15");
                    break;
                default:
                    System.out.println("The game type is not provided");
            }
        }

        catch (Exception err){
            System.out.println("Error occurred during the game selection");
        }
    }
    public static void createFile(GameType fileName) {
        File file = new File(String.valueOf(fileName));

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(GameType filename, String text) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(String.valueOf(filename));
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

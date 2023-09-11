package com.ashifshadab.saveToDisk;

import com.ashifshadab.utils.PathConstant;
import com.ashifshadab.utils.ReadObjectFromFile;
import com.ashifshadab.utils.WriteObjectToFile;

/**
 * This is the Test class which test bellow scenarios :-
 *      1. Can we persist object state to a file and read back to it?
 *      2. If a class does not implement Serializable Interface, then can we still persist it's state to a file?
 *      Finding:-
 *          If We are going to persist object of that class which doesn't implements Serializable interface
 *          then it will throw java.io.NotSerializableException, here Game Class doesn't implement
 *          the Serializable Interface.
 *          Apart from above scenarios we can persist it and read back.
 */

public class Test {

    /**Local File Path, we can change it according to individual system
     * **/

    public static void main(String[] args) {
        Test test = new Test();
        test.write();
        test.read();
    }

    private void write() {
        WriteObjectToFile writeObjectToFile = new WriteObjectToFile();
        persistAddressObject(writeObjectToFile);
        persistGameObject(writeObjectToFile);
    }

    private void read() {
        ReadObjectFromFile readObjectFromFile = new ReadObjectFromFile();
        readAddressObject(readObjectFromFile);
        readGameObject(readObjectFromFile);
    }

    /**
     * Going to save state of Address Object to file "MyAddress.ser"
     * **/
    private void persistAddressObject(WriteObjectToFile writeObjectToFile) {
        Address address = init_address();
        writeObjectToFile.persist(address, PathConstant.LOCAL_FILE_PATH+ "MyAddress.ser");
    }

    /**
     * Going to save state of Game Object to file "MyGame.ser"
     * Here Game is not a serializable class, because it doesn't implement Serializable Interface
     * **/
    private void persistGameObject(WriteObjectToFile writeObjectToFile) {
        Game game = init_game();
        writeObjectToFile.persist(game, PathConstant.LOCAL_FILE_PATH+ "MyGame.ser");
    }

    /**
     * Going to Read Address object from "MyAddress.ser" file
     * **/
    private void readAddressObject(ReadObjectFromFile readObjectFromFile) {
        Address address = (Address) readObjectFromFile.getObjectFromDisk(PathConstant.LOCAL_FILE_PATH + "MyAddress.ser");
        System.out.println(address);
    }

    /**
     * Going to Read Game object from "MyGame.ser" file
     * **/
    private void readGameObject(ReadObjectFromFile readObjectFromFile) {
        Game game = (Game) readObjectFromFile.getObjectFromDisk(PathConstant.LOCAL_FILE_PATH + "MyGame.ser");
        System.out.println(game);
    }

    /**
     * Create Address Object and
     * initialize Address Object
     **/
    private Address init_address() {
        Address address = new Address();
        address.setStreet("Laxmi Nagar");
        address.setCountry("India");
        return address;
    }

    /**
     * Create Game Object and
     * initialize Game Object
     **/
    private Game init_game() {
        Game game = new Game();
        game.setGameId(1);
        game.setGameName("Cricket");
        return game;
    }
}

package com.ashifshadab.saveToDisk;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {

    private  Address init_address() {

        Address address = new Address();

        address.setStreet("Laxmi Nagar");
        address.setCountry("India");

        return address;
    }

    private  Game init_game() {
        Game game = new Game();

        game.setGameId(1);
        game.setGameName("Cricket");

        return game;

    }

    public  void persist(){
        Address address = init_address();
        write(address,"Address");

        // Persist Object which does not implements Serializable interface
        /*Game game = init_game();
        write(game,"Game");*/
    }



    private  void write(Object object,String objectName){
        try {

            System.out.println("Writing "+objectName+ " Object Start");

            String FILE_PATH = "/home/ashif/PERSONAL/Repository/Github/ashifshadab/java-serialization/out/data/data.ser";
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(object);

            objectOutputStream.close();

            System.out.println("Writing "+objectName+ " Object Over");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

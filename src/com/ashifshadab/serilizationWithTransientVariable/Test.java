package com.ashifshadab.serilizationWithTransientVariable;

import com.ashifshadab.utils.PathConstant;
import com.ashifshadab.utils.ReadObjectFromFile;
import com.ashifshadab.utils.WriteObjectToFile;

/**
 * When we mark any variable as transient, then that variable is not serialized.
 * Since transient fields aren't present in the serialized form of an object,
 * the deserialization process would use the default values for such fields when
 * creating an object out of the serialized form.

 * The final modifier makes no difference – because the field is transient, no
 * value is saved for that field. During deserialization, the new Friend object
 * gets the default value 100 that’s defined in the Person class height field, but that value
 * doesn’t come from the serialization data.
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.write();
        test.read();
    }

    private void read() {
        ReadObjectFromFile readObjectFromFile = new ReadObjectFromFile();
        Friend friend = (Friend) readObjectFromFile.getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"MyFriend.ser");
        System.out.println(friend);
    }

    private void write() {
        Friend friend= init();
        WriteObjectToFile writeObjectToFile = new WriteObjectToFile();
        writeObjectToFile.persist(friend,PathConstant.LOCAL_FILE_PATH+"MyFriend.ser");
    }

    private Friend init(){
        Friend friend = new Friend();
        friend.setFirstName("MD");
        friend.setMiddleName("Ashif");
        friend.setLastName("Shadab");
        friend.setPetName("Boss");
        return friend;
    }
}

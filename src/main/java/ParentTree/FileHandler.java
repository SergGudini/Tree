package ParentTree;

import java.io.*;

public class FileHandler implements Writable {


    @Override
    public boolean write(Serializable serializable, String file) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(serializable);
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public Object read(String file){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            return objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        }
}

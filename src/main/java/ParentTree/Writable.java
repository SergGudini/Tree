package ParentTree;
import java.io.*;
public interface Writable {
    boolean write(Serializable serializable, String file);
    Object read(String file);
}

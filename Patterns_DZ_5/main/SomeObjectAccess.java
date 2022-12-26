
import java.io.File;

public class SomeObjectAccess implements ObjectAccess{
    private String path_to_file_to_access;
    public SomeObjectAccess(String _path){
        path_to_file_to_access = _path;
    }
    @Override
    public File access() {
        return new File(path_to_file_to_access);
    }
}

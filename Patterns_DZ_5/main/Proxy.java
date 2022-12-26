
import java.io.File;

public class Proxy implements ObjectAccess{
    private ObjectAccess someObj;

    public Proxy(String path)
    {
        someObj = new SomeObjectAccess(path);
    }
    @Override
    public File access() {
        User user = User.getUser();
        if(user.role == userRole.admin) {
            return someObj.access();
        }
        else return null;
    }
}

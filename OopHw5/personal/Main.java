package OopHw5.personal;

import OopHw5.personal.controllers.UserController;
import OopHw5.personal.model.FileOperation;
import OopHw5.personal.model.FileOperationImpl;
import OopHw5.personal.model.Repository;
import OopHw5.personal.model.RepositoryFile;
import OopHw5.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

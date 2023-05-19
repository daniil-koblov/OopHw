package OopHw5.personal.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveAllUsers(users);
        return id;
    }

    @Override
    public void updateUser(User updatedUser) {
        List<User> users = this.getAllUsers();
        for (User user : users) {
            if(user.getId().equals(updatedUser.getId())){
                user.setFirstName(updatedUser.getFirstName());
                user.setLastName(updatedUser.getLastName());
                user.setPhone(updatedUser.getPhone());
            }
        }
        saveAllUsers(users);
    }

    @Override
    public void deleteUser(String id) {
        List<User> users = this.getAllUsers();
        for(User user: users){
            if (user.getId().equals(id)) {
                users.remove(user);
            }
            saveAllUsers(users);
        }
    }



    private void saveAllUsers(List<User> users){
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);

    }


}
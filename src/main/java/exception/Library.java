package exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private String address;
    private List<User> users;

    public Library(String address) {
        this.address = address;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) throws UserLoginIsInDataBaseException {
        for(User existedUser : users) {
            if(existedUser.getLogin().equals(user.getLogin())) {
                throw new UserLoginIsInDataBaseException();
            }
        }
       this.users.add(user);
    }

    public String getAddress() {
        return address;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<User> retrieveCreatedUsersBefore(LocalDateTime date) {// metoda sprawdza użytkowników wpisanych na listę przed podaną datą
        List<User> resultList = new ArrayList<>();
        for(User user : users) {
            if (user.getCreationData().isBefore(date)) {
                resultList.add(user);
            }
        }
        return resultList;
    }
}

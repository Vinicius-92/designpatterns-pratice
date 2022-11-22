package estructural.bridge.services;

import estructural.bridge.dao.UserDao;
import estructural.bridge.model.User;

public class UserEJB extends UserService {

    public UserEJB(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through EJB Protocol!");
        dao.save(user);
    }
}
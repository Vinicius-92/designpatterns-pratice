package estructural.bridge.services;

import estructural.bridge.dao.UserDao;
import estructural.bridge.model.User;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public abstract class UserService {
    protected UserDao dao;
    public abstract void save(User user);
}

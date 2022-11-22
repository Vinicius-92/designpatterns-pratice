package estructural.bridge;

import estructural.bridge.dao.UserMongoDao;
import estructural.bridge.dao.UserMysqlDao;
import estructural.bridge.dao.UserOracleDao;
import estructural.bridge.dao.UserPostgresqlDao;
import estructural.bridge.model.User;
import estructural.bridge.services.UserEJB;
import estructural.bridge.services.UserRest;
import estructural.bridge.services.UserService;
import estructural.bridge.services.UserSoap;

public class Client {
    public static void main(String[] args) {
        User user = new User("user", "user@email.com", "passwd");

        UserService userRestOracleService = new UserRest(new UserOracleDao());
        userRestOracleService.save(user);

        UserService userEJBMongoService = new UserEJB(new UserMongoDao());
        userEJBMongoService.save(user);

        UserService userSoapPostgresService = new UserSoap(new UserPostgresqlDao());
        userSoapPostgresService.save(user);

        //.......

        UserService userRestMysqlService = new UserRest(new UserMysqlDao());
        userRestMysqlService.save(user);
    }
}

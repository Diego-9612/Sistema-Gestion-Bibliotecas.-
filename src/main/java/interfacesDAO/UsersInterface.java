package interfacesDAO;

import java.util.List;
import models.Users;

/**
 *
 * @author Diego Guerrero
 */
public interface UsersInterface {

    public void registerUser(Users user) throws Exception;

    public void modifyUser(Users user) throws Exception;

    public void deleteUser(int userId) throws Exception;

    public List<Users> listUsers(String names) throws Exception;
    
    public Users getUserByID(int userId) throws Exception;

}



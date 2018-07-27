package dao;

import edu.msg.ro.persistence.user.entity.Role;
import edu.msg.ro.persistence.user.entity.User;

import javax.annotation.Resource;
import javax.ejb.Remote;
import java.io.Serializable;
import java.util.List;

@Remote
public interface UserManagement extends Serializable {

    void addUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
    User getUserForUsername(String username);
    void deactivateUser(User user);
    void addRole(Role role);
    void removeRole(Role role);
    Role updateRole(Role role);
    Role getRoleForId(int id);
    List<Role> getAllRoles();


}

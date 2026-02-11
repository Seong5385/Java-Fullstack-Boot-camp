package service.userManage;

import dto.UserDTO;
import java.util.List;

public interface UserManage {
    boolean userAdd(UserDTO user);

    boolean modUser(UserDTO user);

    UserDTO searchData(String userEmail);

    List<UserDTO> searchAll();

    boolean userDel(UserDTO user);
}

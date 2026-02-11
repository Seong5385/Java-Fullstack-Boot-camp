package service.userManage;

import dto.UserDTO;

import java.io.IOException;
import java.util.List;

public interface UserManage {
    boolean userAdd(UserDTO user) throws IOException;

    boolean modUser(UserDTO user, String oldUserId) throws IOException;

    List<UserDTO> searchUserEmail(String userEmail);

    List<UserDTO> searchUserIdName() throws IOException;

    List<UserDTO> searchAll();

    boolean userDel() throws IOException;

    boolean userLogin(String userId, String userPw) throws IOException;
}

package service.userManage;

import java.util.List;

import java.io.IOException;

import dto.UserDTO;
import repository.UserDAOImpl;
import repository.Users;

public class UserManageImpl implements UserManage {

    Users userRepository = new UserDAOImpl();

    @Override
    public boolean userAdd(UserDTO user) throws IOException {
        userRepository.userAdd(user);
        return true;
    }

    @Override
    public boolean modUser(UserDTO user, String oldUserId) throws IOException {
        userRepository.userMod(user, oldUserId);
        return true;
    }

    @Override
    public List<UserDTO> searchUserEmail(String userEmail) {
        return userRepository.userSearchEmail(userEmail);
    }

    @Override
    public List<UserDTO> searchUserIdName() throws IOException {
        return userRepository.userSearchIdName();
    }

    @Override
    public List<UserDTO> searchAll() {
        return userRepository.userAll();
    }

    @Override
    public boolean userDel() throws IOException {
        userRepository.userDel();
        return true;
    }

    @Override
    public boolean userLogin(String userId, String userPw) throws IOException {
        if (userRepository.login(userId, userPw))
            return true;

        return false;
    }
}

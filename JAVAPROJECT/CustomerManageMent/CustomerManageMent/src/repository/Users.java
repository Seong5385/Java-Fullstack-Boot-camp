package repository;

import java.io.IOException;
import java.util.*;

import dto.UserDTO;

public interface Users {

    int userAdd(UserDTO dto);

    int userMod(UserDTO dto, String oldUserId);

    int userDel() throws IOException;

    List<UserDTO> userAll();

    List<UserDTO> userSearchIdName() throws IOException;

    List<UserDTO> userSearchEmail(String email);

    boolean login(String id, String pw) throws IOException;
}

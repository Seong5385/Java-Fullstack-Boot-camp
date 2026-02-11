package repository;

import java.io.IOException;
import java.util.*;

import domain.Entity.UsersVO;

public interface Users {

    int userAdd(UsersVO vo);

    int userMod(UsersVO before, UsersVO after);

    int userDel(UsersVO user) throws IOException;

    List<UsersVO> userAll();

    List<UsersVO> userSearchIdName() throws IOException;

    List<UsersVO> userSearchEmail(String email);
}

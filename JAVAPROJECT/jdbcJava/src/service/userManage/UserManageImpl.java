package service.userManage;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

import dto.UserDTO;
import repository.UserDAOImpl;
import repository.Users;

import domain.Entity.UsersVO;

public class UserManageImpl implements UserManage {

    Users userRepository = new UserDAOImpl();

    @Override
    public boolean userAdd(UserDTO user) {
        List<UserDTO> userDTOList = new ArrayList<>();
        List<UsersVO> userVOList = userRepository.userAll();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");

        for (UsersVO vo : userVOList) {
            UserDTO dto = UserDTO.builder().id(vo.getId()).userId(vo.getUserId()).userPw(vo.getUserPw())
                    .userName(vo.getUserName()).userEmail(vo.getUserEmail()).phone1(vo.getPhone1())
                    .phone2(vo.getPhone2()).age(vo.getAge()).addr1(vo.getAddr1()).addr2(vo.getAddr2())
                    .regDate(sf.format(vo.getRegDate())).modDate(sf.format(vo.getModDate())).build();
            userDTOList.add(dto);
        }
        return true;
    }

    @Override
    public boolean modUser(UserDTO user) {
        return true;
    }

    @Override
    public UserDTO searchData(String userEmail) {
        return (UserDTO) userRepository.userSearchEmail(userEmail);
    }

    @Override
    public List<UserDTO> searchAll() {
        return null;
    }

    @Override
    public boolean userDel(UserDTO user) {
        return true;
    }

}

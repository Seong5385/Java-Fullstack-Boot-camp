package domain.ex;

import java.util.Date;

import lombok.Builder;

@Builder
public record PersonRe(
        Long id, String userId, String userPw, String userName, String userEmail,
        String phone1, String phone2, int age, String addr1, String addr2,
        Date regDate, Date modDate) {

}

package domain.Entity;

import java.sql.Timestamp;

import lombok.*;

@Getter
@Setter
@ToString(exclude = "userPw") // 제외하고 toString 생성
@Builder
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 사용 생성자
public class UsersVO {
    private long id;
    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
    private String phone1;
    private String phone2;
    private byte age;
    private String addr1;
    private String addr2;
    private Timestamp regDate;
    private Timestamp modDate;
}

package dto;

import lombok.*;

@Getter
@Setter
@ToString(exclude = { "userPw", "regDate", "modDate" })
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private long id;
    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
    private String phone1;
    private String phone2;
    private int age;
    private String addr1;
    private String addr2;
    private String regDate;
    private String modDate;
}

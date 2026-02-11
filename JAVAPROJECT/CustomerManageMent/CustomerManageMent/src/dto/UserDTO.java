package dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private long id;
    private String userId; //
    private String userPw; //
    private String userName; //
    private String userEmail; //
    private String phone1; //
    private String phone2; //
    private int age; //
    private String addr1; //
    private String addr2; //
    private String regDate;
    private String modDate;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userPw='******'" +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", phone='" + phone1 + "-" + phone2 + '\'' +
                ", age=" + age +
                ", addr='" + addr1 + " " + addr2 + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modDate='" + modDate + '\'' +
                '}';
    }

}

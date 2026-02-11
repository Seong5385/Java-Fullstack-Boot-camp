package domain.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.stream.IntStream;

public class PersonVO2 {

    private long id;
    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
    private String phone1;
    private String phone2;
    private byte age;
    private String address1;
    private String address2;
    private Timestamp regDate;
    private Timestamp modifyDate;

    public PersonVO2() {
    }

    private PersonVO2(Builder b) {
        this.id = b.id;
        this.userId = b.userId;
        this.userPw = b.userPw;
        this.userName = b.userName;
        this.userEmail = b.userEmail;
        this.phone1 = b.phone1;
        this.phone2 = b.phone2;
        this.age = b.age;
        this.address1 = b.address1;
        this.address2 = b.address2;
        this.regDate = b.regDate;
        this.modifyDate = b.modifyDate;
    }

    // DB가 생성하는 값(id/regDate/modifyDate)을 제외한 생성자
    public PersonVO2(String userId, String userPw, String userName, String userEmail,
            String phone1, String phone2, byte age, String address1, String address2) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userEmail = userEmail;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.age = age;
        this.address1 = address1;
        this.address2 = address2;
    }

    // ✅ builder는 static으로 두는 게 정석 (new PersonVO2().builder() 이런거 안하게)
    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private long id;
        private String userId;
        private String userPw;
        private String userName;
        private String userEmail;
        private String phone1;
        private String phone2;
        private byte age;
        private String address1;
        private String address2;
        private Timestamp regDate;
        private Timestamp modifyDate;

        private Builder() {
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder userPw(String userPw) {
            this.userPw = userPw;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder phone1(String phone1) {
            this.phone1 = phone1;
            return this;
        }

        public Builder phone2(String phone2) {
            this.phone2 = phone2;
            return this;
        }

        // ✅ int 받아서 byte로 캐스팅하는건 위험할 수 있으니 체크
        public Builder age(int age) {
            if (age < 0 || age > 127)
                throw new IllegalArgumentException("age out of range: " + age);
            this.age = (byte) age;
            return this;
        }

        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Builder regDate(Timestamp regDate) {
            this.regDate = regDate;
            return this;
        }

        public Builder modifyDate(Timestamp modifyDate) {
            this.modifyDate = modifyDate;
            return this;
        }

        public PersonVO2 build() {
            // 최소 필수값 검증(원하면 더 추가)
            Objects.requireNonNull(userId, "userId");
            Objects.requireNonNull(userPw, "userPw");
            Objects.requireNonNull(userName, "userName");
            return new PersonVO2(this);
        }
    }

    // getters/setters (필요한 것만 남겨도 됨)
    public long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public byte getAge() {
        return age;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    @Override
    public String toString() {
        // ✅ 보기 좋게 + null에도 안전하게
        return """
                PersonVO2 {
                  id=%d,
                  userId='%s',
                  userName='%s',
                  userEmail='%s',
                  phone='%s-%s',
                  age=%d,
                  address1='%s',
                  address2='%s',
                  regDate=%s,
                  modifyDate=%s
                }""".formatted(
                id,
                userId,
                userName,
                userEmail,
                phone1,
                phone2,
                age,
                address1,
                address2,
                String.valueOf(regDate),
                String.valueOf(modifyDate));
    }
}

class PersonVO2Main {

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(i -> {
            PersonVO2 vo = PersonVO2.builder()
                    .userId("user" + (5 + i))
                    .userPw("userPw" + i)
                    .userName("user" + (i + 5))
                    .userEmail("user" + (5 + i) + "@naver.com")
                    .age(30 + i)
                    .phone1("02")
                    .phone2("99" + (i % 9) + "-123" + (i % 10))
                    .address1("서울 마포구 성산동")
                    .address2("23번지 " + (1 + i))
                    .build();

            insertDB(vo);
        });
    }

    public static void insertDB(PersonVO2 vo) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "jdbcuser";
        String password = "jdbcuser";

        String sql = """
                INSERT INTO persons
                (userId, userPw, userName, userEmail, phone1, phone2, age, addr1, addr2)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, vo.getUserId());
            pstmt.setString(2, vo.getUserPw());
            pstmt.setString(3, vo.getUserName());
            pstmt.setString(4, vo.getUserEmail());
            pstmt.setString(5, vo.getPhone1());
            pstmt.setString(6, vo.getPhone2());
            pstmt.setByte(7, vo.getAge());
            pstmt.setString(8, vo.getAddress1());
            pstmt.setString(9, vo.getAddress2());

            int result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "레코드 추가 성공" : "레코드 추가 실패");

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }
    }
}

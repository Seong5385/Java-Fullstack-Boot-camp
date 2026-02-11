package domain.ex;

import java.util.Date;
import java.io.*;
import java.sql.*;

public class PersonVO {
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
    private Date regDate;
    private Date modDate;

    public PersonVO(String name) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "jdbcuser";
        String pw = "jdbcuser";

        try (Connection conn = DriverManager.getConnection(url, userName, pw)) {

            String sql = "select * from persons where userName = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                this.id = rs.getLong("id");
                this.userId = rs.getString("userId");
                this.userPw = rs.getString("userPw");
                this.userName = rs.getString("userName");
                this.userEmail = rs.getString("userEmail");
                this.phone1 = rs.getString("phone1");
                this.phone2 = rs.getString("phone2");
                this.age = rs.getByte("age");
                this.addr1 = rs.getString("addr1");
                this.addr2 = rs.getString("addr2");
                this.regDate = rs.getTimestamp("regDate");
                this.modDate = rs.getTimestamp("modDate");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (pstmt != null)
                    pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

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

    public int getAge() {
        return age;
    }

    public String getAddr1() {
        return addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public Date getRegDate() {
        return regDate;
    }

    public Date getModDate() {
        return modDate;
    }

    @Override
    public String toString() {
        return """
                PersonVO {
                    id       = %d
                    userId   = %s
                    userPw   = %s
                    userName = %s
                    email    = %s
                    phone    = %s-%s
                    age      = %d
                    address  = %s %s
                    regDate  = %s
                    modDate  = %s
                }
                """.formatted(
                id, userId, userPw, userName, userEmail,
                phone1, phone2,
                age, addr1, addr2,
                regDate, modDate);
    }

    public static class Builder {
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
        private Date regDate;
        private Date modDate;

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

        public Builder age(byte age) {
            this.age = age;
            return this;
        }

        public Builder addr1(String addr1) {
            this.addr1 = addr1;
            return this;
        }

        public Builder addr2(String addr2) {
            this.addr2 = addr2;
            return this;
        }

        public Builder regDate(Date regDate) {
            this.regDate = regDate;
            return this;
        }

        public Builder modDate(Date modDate) {
            this.modDate = modDate;
            return this;
        }

        public Builder builder() {
            return new Builder();
        }

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

        public String getAddr1() {
            return addr1;
        }

        public String getAddr2() {
            return addr2;
        }

        public Date getRegDate() {
            return regDate;
        }

        public Date getModDate() {
            return modDate;
        }

    }
}

class InsertData {
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
    private Date regDate;
    private Date modDate;

    public InsertData(String userId, String userPw, String userName, String userEmail, String phone1,
            String phone2, byte age, String addr1, String addr2) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userEmail = userEmail;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.age = age;
        this.addr1 = addr1;
        this.addr2 = addr2;
    }

    public void insert() {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "jdbcuser";
        String pw = "jdbcuser";

        try (Connection conn = DriverManager.getConnection(url, userName, pw)) {

            String sql = "insert into persons (userId, userPw, userName, userEmail, phone1, phone2, age, addr1, addr2) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, this.userId);
            pstmt.setString(2, this.userPw);
            pstmt.setString(3, this.userName);
            pstmt.setString(4, this.userEmail);
            pstmt.setString(5, this.phone1);
            pstmt.setString(6, this.phone2);
            pstmt.setInt(7, this.age);
            pstmt.setString(8, this.addr1);
            pstmt.setString(9, this.addr2);

            int rows = pstmt.executeUpdate();
            System.out.println("입력 완료 " + rows + "개");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (pstmt != null)
                    pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

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

    public int getAge() {
        return age;
    }

    public String getAddr1() {
        return addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public Date getRegDate() {
        return regDate;
    }

    public Date getModDate() {
        return modDate;
    }
}

class DbConnectionManager {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        while (true) {
            System.out.print("(i: 입력, p: 출력, q: 종료): ");
            String cmd = br.readLine();

            switch (cmd) {
                case "i" -> insertDb(br);
                case "p" -> printData(br);
                case "q" -> {
                    return;
                }
            }
        }
    }

    public static void insertDb(BufferedReader br) throws IOException {
        System.out.print("아이디를 입력하세요: ");
        String userId = br.readLine();

        System.out.print("비밀번호를 입력하세요: ");
        String userPw = br.readLine();

        System.out.print("이름을 입력하세요: ");
        String userName = br.readLine();

        System.out.print("이메일을 입력하세요: ");
        String userEmail = br.readLine();

        System.out.print("지역번호를 입력하세요: ");
        String phone1 = br.readLine();

        System.out.print("전화번호를 입력하세요: ");
        String phone2 = br.readLine();

        System.out.print("나이를 입력하세요: ");
        byte age = Byte.parseByte(br.readLine());

        System.out.print("지역을 입력하세요: ");
        String addr1 = br.readLine();

        System.out.print("주소를 입력하세요: ");
        String addr2 = br.readLine();

        new InsertData(userId, userPw, userName, userEmail, phone1, phone2, age, addr1, addr2)
                .insert();
    }

    public static void printData(BufferedReader br) throws IOException {
        System.out.print("출력 할 이름을 입력하세요: ");
        String name = br.readLine();
        System.out.println(new PersonVO(name));
    }
}

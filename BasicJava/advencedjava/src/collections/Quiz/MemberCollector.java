package collections.quiz;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class MemberCollector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Member> members = new HashSet<>();

        while (true) {
            System.out.print("이름을 입력하세요: ");
            String name = br.readLine();

            System.out.print("주민번호를 입력하세요: ");
            String ssn = br.readLine();

            Stream.of(new Member(name, ssn)).filter(m -> !m.getSsn().equals(ssn)).forEach(members::add);

            System.out.print("계속 입력하시겠습니까?(Y/N): ");
            String cmd = br.readLine();

            if (cmd.toUpperCase().equals("N"))
                break;

        }

        members.forEach(System.out::println);
    }

}

class Member {
    private String name;
    private String ssn;

    public Member(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", ssn=" + ssn + "]";
    }
}

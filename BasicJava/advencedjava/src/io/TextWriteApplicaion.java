package io;

import java.io.FileOutputStream;

public class TextWriteApplicaion {

   public static void main(String[] args) {
      String data1 = "홍길동,M,hkd@test.com,30";
      String data2 = "길남,F,hkn@test.com,25";
      FileOutputStream fos = null;
      try {
         fos = new FileOutputStream("customer.txt");
         fos.write(data1.getBytes());
         fos.write('\n');
         fos.write(data2.getBytes());
         System.out.println("File Saved");
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (fos != null)
               fos.close();
         } catch (Exception e2) {
         }
      }

   }

}

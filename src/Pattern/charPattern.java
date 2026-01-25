package Pattern;

public class charPattern {
    public static void main(String[] args) {
        char ch='A';
        for (int line = 1; line <=4 ; line++) {
            for (int character = 1; character <=line ; character++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }    
}

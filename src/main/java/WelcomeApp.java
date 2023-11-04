import java.util.Scanner;

public class WelcomeApp {
    public static void main(String[] args) {
        // 创建一个Scanner对象来接受用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入姓名
        System.out.print("请输入您的姓名: ");
        String name = scanner.nextLine();

        // 打印欢迎消息
        System.out.println("欢迎, " + name + "!");

        // 关闭Scanner对象
        scanner.close();
    }
}

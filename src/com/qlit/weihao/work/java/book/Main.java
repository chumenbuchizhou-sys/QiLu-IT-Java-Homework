package com.qlit.weihao.work.java.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 初始化图书管理器
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        // 2. 预置几本图书，方便直接测试和演示
        manager.addBook(new Book("1001", "Java核心技术", "Cay S. Horstmann"));
        manager.addBook(new Book("1002", "算法(第4版)", "Robert Sedgewick"));
        manager.addBook(new Book("1003", "计算机网络", "谢希仁"));

        // ✨ 这里已经改成了你的专属系统名称！
        System.out.println("\n🌟 欢迎使用伟昊的图书借阅系统 🌟");

        // 3. 进入主菜单循环
        while (true) {
            System.out.println("\n========= 【功能菜单】 =========");
            System.out.println("【1】上架新书");
            System.out.println("【2】显示所有图书");
            System.out.println("【3】借阅图书");
            System.out.println("【4】归还图书"); // ✨ 顺手帮你修掉了这里的多余斜杠
            System.out.println("【5】退出系统");
            System.out.println("===============================");
            System.out.print("请选择操作（1-5）：");

            String choice = scanner.next(); // 接收用户输入的菜单选项

            switch (choice) {
                case "1":
                    System.out.print("请输入新书编号: ");
                    String id = scanner.next();
                    System.out.print("请输入新书书名: ");
                    String title = scanner.next();
                    System.out.print("请输入新书作者: ");
                    String author = scanner.next();

                    Book newBook = new Book(id, title, author);
                    manager.addBook(newBook);
                    break;

                case "2":
                    manager.showAllBooks();
                    break;

                case "3":
                    System.out.print("请输入您想借阅的图书编号: ");
                    String borrowId = scanner.next();
                    manager.borrowBook(borrowId);
                    break;

                case "4":
                    System.out.print("请输入您想归还的图书编号: ");
                    String returnId = scanner.next();
                    manager.returnBook(returnId);
                    break;

                case "5":
                    System.out.println("感谢使用图书管理系统，再见！");
                    scanner.close();
                    System.exit(0); // 优雅地退出程序

                default:
                    System.out.println("【⚠】输入有误，请输入数字 1-5 之间的选项！");
                    break;
            }
        }
    }
}
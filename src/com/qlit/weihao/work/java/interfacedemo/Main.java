package com.qlit.weihao.work.java.interfacedemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== 伟昊的多态与接口实验 ======\n");

        // ✨ 核心：多态的体现！
        // 父类（接口）类型的变量，分别指向了不同的子类对象
        Borrowable book1 = new PhysicalBook("Java核心技术(纸质版)", "A区3楼05排");
        Borrowable book2 = new EBook("算法(第4版)电子书", "https://qlit.edu.cn/download/1002");

        // 相同的变量类型，调用同一个方法名
        // 却在控制台打印出了完全不同的两种业务逻辑提示！
        System.out.println("--- 尝试借阅第一本书 ---");
        book1.borrowAction();

        System.out.println("\n--- 尝试借阅第二本书 ---");
        book2.borrowAction();

        System.out.println("\n================================");
    }
}
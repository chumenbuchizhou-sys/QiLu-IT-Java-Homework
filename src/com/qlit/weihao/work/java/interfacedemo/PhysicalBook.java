package com.qlit.weihao.work.java.interfacedemo;

// 这里的 implements Borrowable 意思就是：实体书类必须遵守 Borrowable 接口制定的借阅规范
public class PhysicalBook implements Borrowable {
    private String title;          // 书名
    private String shelfLocation;  // 实体书特有属性：书架位置

    // 构造方法：用来初始化实体书的名字和它的书架位置
    public PhysicalBook(String title, String shelfLocation) {
        this.title = title;
        this.shelfLocation = shelfLocation;
    }

    // @Override 表示重写接口里的 borrowAction 方法，写上实体书独有的借书逻辑
    @Override
    public void borrowAction() {
        System.out.println("【实体书借阅】《" + title + "》借阅成功！");
        System.out.println("👉 提示：请前往库房 [" + shelfLocation + "] 号书架取书，阅读时请勿折损纸张。");
    }
}
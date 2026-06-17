package com.qlit.weihao.work.java.interfacedemo;

// 电子书类同样遵守 Borrowable 接口制定的借阅规范
public class EBook implements Borrowable {
    private String title;       // 书名
    private String downloadUrl; // 电子书特有属性：下载链接

    // 构造方法：用来初始化电子书的名字和下载链接
    public EBook(String title, String downloadUrl) {
        this.title = title;
        this.downloadUrl = downloadUrl;
    }

    // 重写接口里的 borrowAction 方法，写上电子书独有的无实体借阅逻辑
    @Override
    public void borrowAction() {
        System.out.println("【电子书借阅】《" + title + "》在线授权成功！");
        System.out.println("🔗 提示：您的专属在线阅读链接为: " + downloadUrl + " （有效期限30天）。");
    }
}
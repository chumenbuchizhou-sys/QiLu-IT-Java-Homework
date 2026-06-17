package com.qlit.weihao.work.java.book;

public class Book {
    // 1. 定义图书的属性
    private String id;          // 图书编号
    private String title;       // 书名
    private String author;      // 作者
    private boolean isBorrowed; // 借阅状态

    // 2. 构造方法
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // 新书默认处于“未借出”状态
    }

    // 3. Getter 和 Setter 方法
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    // 4. 重写 toString 方法
    @Override
    public String toString() {
        String status = isBorrowed ? "【已借出】" : "【在馆】";
        return "编号: " + id + "\t 书名: 《" + title + "》\t 作者: " + author + "\t 状态: " + status;
    }
}

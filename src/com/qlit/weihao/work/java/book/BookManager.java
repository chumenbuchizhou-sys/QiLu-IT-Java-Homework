package com.qlit.weihao.work.java.book;

import java.util.ArrayList;

public class BookManager {
    // 使用 ArrayList 集合来存储书库中的所有图书
    private ArrayList<Book> bookList = new ArrayList<>();

    // 1. 上架新书
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("【系统】成功上架新书：《" + book.getTitle() + "》！");
    }

    // 2. 显示所有图书
    public void showAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("【提示】当前书库空空如也~");
            return;
        }
        System.out.println("\n=================== 图书列表 ===================");
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println("===============================================");
    }

    // 3. 借阅图书
    public void borrowBook(String id) {
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("【错误】未找到编号为 " + id + " 的图书！");
            return;
        }
        if (book.isBorrowed()) {
            System.out.println("【提示】抱歉，这本《" + book.getTitle() + "》已经被别人借走啦！");
        } else {
            book.setBorrowed(true);
            System.out.println("【成功】您已成功借出《" + book.getTitle() + "》，请按时归还！");
        }
    }

    // 4. 归还图书
    public void returnBook(String id) {
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("【错误】未找到编号为 " + id + " 的图书！");
            return;
        }
        if (!book.isBorrowed()) {
            System.out.println("【提示】这本《" + book.getTitle() + "》本来就在馆内，不需要归还。");
        } else {
            book.setBorrowed(false);
            System.out.println("【成功】成功归还《" + book.getTitle() + "》，谢谢！");
        }
    }

    // 🛠️ 辅助方法：根据编号在集合中查找图书
    private Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
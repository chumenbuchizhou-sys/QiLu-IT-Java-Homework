package com.qlit.weihao.work.polymorphism;

// 1. 抽象父类 Pet
abstract class Pet {
    protected String name;

    // 无参构造
    public Pet() {}
    // 有参构造
    public Pet(String name) {
        this.name = name;
    }

    // 抽象方法：无方法体，必须由子类重写
    public abstract void shout();

    // 普通方法：输出动物名称
    public void showInfo() {
        System.out.println("动物名称：" + name);
    }
}

// 2. 子类 Dog，继承抽象类
class Dog extends Pet {
    // 有参构造，调用父类构造
    public Dog(String name) {
        super(name);
    }

    // 必须重写抽象方法 shout
    @Override
    public void shout() {
        System.out.println(name + "：汪汪汪");
    }
}

// 2. 子类 Cat，继承抽象类
class Cat extends Pet {
    // 有参构造，调用父类构造
    public Cat(String name) {
        super(name);
    }

    // 必须重写抽象方法 shout
    @Override
    public void shout() {
        System.out.println(name + "：喵喵喵");
    }
}

// 3. 测试类 Test
class Test {
    public static void main(String[] args) {
        // 多态：父类引用指向子类对象
        Pet dog = new Dog("旺财");
        Pet cat = new Cat("橘猫");

        // 调用普通方法和重写的抽象方法
        dog.showInfo();
        dog.shout();

        cat.showInfo();
        cat.shout();
    }
}
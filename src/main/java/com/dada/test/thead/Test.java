package com.dada.test.thead;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();
        // 因为bird是抽象内，所以不能实例为一个具体对象，所以使用内部类来调用它的方法。
        // 这样做的话该对象不能多次使用，使用完成后对象就消失了
        // 当然也可以再写一个类来实现brid，然后实例化，就可以多次使用实例化后的对象了
        test.InnerTest(new Bird() {
            @Override
            public int fly() {
                return 100000;
            }

            @Override
            public String getName() {
                return "大雁";
            }

            StringBuilder sb = new StringBuilder();
        });
    }

    private void InnerTest(Bird bird) {
        System.out.println(bird.getName() + "能飞" + bird.fly() + "米");
    }
}

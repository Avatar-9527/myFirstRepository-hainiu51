package com.hainiuxy.oop7;



public class Test {
    public static void main(String[] args) {
        BasketballCoash bc = new BasketballCoash("姚明",30,"508929489@qq.com");
        System.out.println(bc.getName());
        System.out.println(bc.getAge());
        System.out.println(bc.getEmail());

        bc.eat();
        bc.work();

        System.out.println("--------------------------");
        PingPangCoach pingPangCoach = new PingPangCoach("刘国梁",20,"qidian@163.com");
        System.out.println(pingPangCoach.getAge());
        System.out.println(pingPangCoach.getEmail());
        System.out.println(pingPangCoach.getName());

        pingPangCoach.eat();
        pingPangCoach.work();
        pingPangCoach.StudyEnglish();

        System.out.println("----------------------------------");

        BasketballPlayer basketballPlayer = new BasketballPlayer("梅西",35,"meixi@q163.com");
        System.out.println(basketballPlayer.getName());
        System.out.println(basketballPlayer.getAge());
        System.out.println(basketballPlayer.getEmail());

        basketballPlayer.eat();
        basketballPlayer.work();

        System.out.println("----------------------------------");

        PingPangPlayer pingPangPlayer = new PingPangPlayer("张继科",29,"178731501@qq.com");
        System.out.println(pingPangPlayer.getName());
        System.out.println(pingPangPlayer.getAge());
        System.out.println(pingPangPlayer.getEmail());

        pingPangPlayer.eat();
        pingPangPlayer.work();
        System.out.println("----------------------------------");



    }




}

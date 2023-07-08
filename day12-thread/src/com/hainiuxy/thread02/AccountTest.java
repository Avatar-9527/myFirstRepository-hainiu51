package com.hainiuxy.thread02;


/*


                        可见性！
 */
public class AccountTest {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        //一条线程检测余额的变化

        new Thread(()->{
//            while(account.getMoney()<=0){
//                System.out.println("没钱了------");
//            }
            while(true){
                if(account.getMoney()>0){
                }else {
                    System.out.println("没钱了");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();

        Thread.sleep(100);
        //一条线程取钱
        new Thread(()->{
            while(true){
                try {
                    account.takeMoney(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();



    }
}

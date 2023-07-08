package com.hainiuxy.objio;



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*


     *  read():
     *      读取到文件末尾返回值是 -1
     *  readLine():
     *      读取到文件的末尾返回值 null
     *  readObject():
     *      读取到文件的末尾 直接抛出异常
     *  如果要序列化的对象有多个,不建议直接将多个对象序列化到文件中,因为反序列化时容易出异常
     *      建议: 将要序列化的多个对象存储到集合中,然后将集合序列化到文件中
 */


public class Demo01_ObjectOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();

//        read();

//        write1();

        read1();




        }



    //序列化
    //write();
    //要一个流参数
    public static void write() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("day011-basic\\obj.obj"));

        Student s1 =new Student("龙傲天",20,18888);
        Student s2 =new Student("龙傲",20,18888);
        Student s3 =new Student("龙",20,18888);

        objectOutputStream.writeObject(s1);
        objectOutputStream.writeObject(s2);
        objectOutputStream.writeObject(s3);


        objectOutputStream.close();


    }
    public static void write1() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("day011-basic\\obj.obj"));

        Student s1 =new Student("龙傲天",20,18888);
        Student s2 =new Student("龙傲",20,18888);
        Student s3 =new Student("龙",20,18888);



        //将多个对象放入  ArrayList  只读写一次

        ArrayList<Student> student = new ArrayList<>();
        Collections.addAll(student,s1,s2,s3);

        objectOutputStream.writeObject(student);
        objectOutputStream.close();



        objectOutputStream.close();


    }


    //反序列化
    //从包装流中读取对象
    public static void read() throws IOException, ClassNotFoundException {

        ObjectInputStream inputStream =new ObjectInputStream(new FileInputStream("day011-basic\\obj.obj"));

//        //如何判断  读到末尾
//       //读的是对象
//        Object obj;
//
//        //到达文件末尾  抛出异常  EOFException end  of file
//        while((obj = inputStream.readObject())!=null){
//            Student student = (Student) obj;
//            System.out.println(student);
//        }

        while(true){

            try {
                Student student = (Student)inputStream.readObject();
                System.out.println(student);
            } catch (EOFException e) { //捕获到EOFException 异常  说明到达文件末尾
                break;  //跳出

            }

        }


        inputStream.close();

    }
    public static void read1() throws IOException, ClassNotFoundException {

        //反序列化
        ObjectInputStream inputStream =new ObjectInputStream(new FileInputStream("day011-basic\\obj.obj"));

        //只读一次
        ArrayList<Student> students = (ArrayList<Student>)inputStream.readObject();

        for (Student student:students){

            System.out.println(student);
        }

        inputStream.close();

    }
}

package com.example.demo.myThread;


import com.example.demo.pojo.Users;

public class MyThread implements Runnable {
  /*  private Users user;*/
    @Override
    public void run() {
        for (int i=1;i<=4;i++){
            System.out.println(111);
          /*  System.out.println(this.user.toString());*/
        }
    }

    public MyThread() {

    }

    /*public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }*/
}

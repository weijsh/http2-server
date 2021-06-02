package com.capitek.controller;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPTest {
    public static void main(String[] args) {
        /**
         * 接受客户端发送的数据
         */
        try {
            //1.创建服务器端DatagramSocket，并且指定端口
            DatagramSocket socket = new DatagramSocket(9877);
            //2.创建数据报，用于接收客户端发送的数据
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);//接受信息的数组以及接收的长度
            //3.接收客户端发送的数据
            System.out.println("***服务器端已经启动，等待客户端发送数据***");
            socket.receive(packet);//此方法在接收到数据报之前会一直阻塞
            //4.读取这个数据
            //实际上信息已经保存在字节数组当中，所以这个时候直接转化就好了
            String info = new String(data, 0, packet.getLength());
            System.out.println("我是服务器，客户端说：" + info);
            //4.关闭相应的资源信息
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

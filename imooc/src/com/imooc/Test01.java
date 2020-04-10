package com.imooc;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();
        System.out.println("计算机" + address.getHostName());
        System.out.println("IP地址" + address.getHostAddress());
        byte[] bytes = address.getAddress();
        System.out.println("字节数组形式的ip" + Arrays.toString(bytes));
        System.out.println(address);


        // InetAddress address2=InetAddress.getByName("laurenyang");
        InetAddress address2 = InetAddress.getByName("1.1.1.10");
        System.out.println("计算机" + address2.getHostName());
        System.out.println("IP地址" + address2.getHostAddress());
    }

}
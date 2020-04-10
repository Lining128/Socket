package com.imooc;

import java.net.MalformedURLException;
import java.net.URL;


public class Test02 {
    public static void main(String[] args) {
        try {

            URL imooc=new URL("http://www.imooc.com");
            //?后面表示参数#表示锚点
            URL url=new URL(imooc, "/index.html?username=tom#test");
            System.out.println("协议"+url.getProtocol());
            System.out.println("主机"+url.getHost());
            //未指定端口号，使用默认的端口号
            System.out.println("端口"+url.getPort());
            System.out.println("文件路径"+url.getPath());
            System.out.println("文件名称"+url.getFile());
            System.out.println("相对路径"+url.getRef());
            System.out.println("查询字符串"+url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

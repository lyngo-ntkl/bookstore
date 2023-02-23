/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lyngo.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Dell
 */
//xai Web App: localhost:PORT/bookstore
//xai Web API: localhost:PORT/bookstore/api
@ApplicationPath("api")
public class BookApplication extends ResourceConfig{
    //đây là hàm main of API
    //lúc deploy app này lên tomcat, tomcat sẽ quét qua 1 lượt các
    //class ở các package, thấy class nào bà con vs ResourceConfig
    //thì nó hiểu rằng:
    //ai mà gọi url có /api thì class này sẽ phụ trách
    //mapping giữa url /api vs class này (web.xml làm nhiệm vụ tương ứng)
    //class này nó đứng đón url có /api, chứ thực sự nó k xử lí
    //data từ db & json
    //nó là đầu mối để kính chuyển các request sau /api
    //đến các class tương ứng để xử lí tài nguyên tương ứng được liệt kê trong url /api
    //vd: /api/books: em muốn GET hết các cuốn sách trong db
    //vd: /api/orders: em muốn GET hết các đơn hàng trong db
    //vd: /api/authors/nguyen-nhat-anh: em muốn GET thông tin của tác giả nguyễn nhật ánh
    // có quá trời những class
    
    public BookApplication(){
        packages("org.lyngo.bookstore.resource"); //hàm thừa kế từ class cha RESOURCE CONFIG
        //tên các package cách nhau dấu , để phục vụ các request
        //có url .../api/...
        //đang xài package cha org.lyngo.bookstore.resource
        //thì 2 thằng con là .v1, .v2 tự động bị ép theo
    }
}

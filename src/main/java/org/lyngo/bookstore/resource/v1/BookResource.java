/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lyngo.bookstore.resource.v1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.lyngo.bookstore.dto.Book;

/**
 *
 * @author Dell
 */
@Path("v1/books")
//ai đó mà gõ: localhost:6969/bookstore -> vào web app môn java web
//ai đó mà gõ: localhost:6969/bookstore/api/v1/books -> chắc chắn
//đến đc class này rồi!!!
//đến class lại bị bối rối:
//CLASS LẠI CÓ NHIỀU HÀM, LẤY HÀM NÀO ĐỂ XÀI?
//CÓ KHI LẠI PHẢI THÊM 1 TẦNG ÁNH XẠ NỮA, CHO MỖI HÀM 1 NICKNAME RIÊNG
//THÊM 1 TẦNG /
public class BookResource {
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello(){
//        return "One small mesage returned from my own 1st apt" + ", one giant leap for IT career";
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook(){
        return new Book("8935235226272", "Nhà Giả Kim", "Paulo Coelho", 2, 2020);
    }
}

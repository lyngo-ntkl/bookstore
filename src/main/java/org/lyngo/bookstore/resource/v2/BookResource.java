/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lyngo.bookstore.resource.v2;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;
import org.lyngo.bookstore.dto.Book;

/**
 *
 * @author Dell
 */
@Path("v2/books")
public class BookResource {
    //API kiểu GET, trả về data qua URL gõ trực tiếp trên trình duyệt
    //hay URL đưa trong code
    //trả vê: tất cả các sách
    //trả về 1 cuốn bất kì, nếu đưa vào mã số cuốn sách
    //các cuốn sách có thể lấy từ DB lên - lát hồi làm ở v3
    //hard code data trước
    private List<Book> list = new ArrayList();
    public BookResource(){
        list.add(new Book("1", "Nhà Giả Kim", "Paulo Coelho", 2, 2020));
        list.add(new Book("2", "Hoàng Tử Bé", "Antoine De Saint-Exupéry", 2, 2019));
        list.add(new Book("3", "Dế Mèn Phiêu Lưu Ký", "Paulo Coelho", 10, 2020));
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll(){
        return list;
    }
    
    //đưa tham số trên url để map vào biến isbn trong hàm
    //hàm có isbn hàm biết cách lọc/filter/where cuốn sách cần tìm
    @GET
    //api/v2/books/mã-số-sách-cần-tìm //path param
    //tham số đưa trực tiếp vào đường dẫn API
    
    //api/v2/books?mã-số-sách-cần-tìm=1 //query param bên Java web
    @Path("{isbn}")// url sẽ nhận isbn là các gtri thay đổi {isbn} như này k phải hard code
                   // đường dẫn url linh hoạt tùy mã sách gõ vào
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("isbn") String isbn){
        //search trong list 3 cuon coi co cuon nao trung mã isbn đưa vào hay k
        for (Book book : list) {
            if(book.getIsbn().equalsIgnoreCase(isbn))
                return book;
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lyngo.bookstore.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Dell
 */
//Serializable là 1 interface đặc biệt, ko có hàm nào ta cần phải
//viết code cho nó. Nó k chứa hàm abstract
//Nó dùng làm gì:
//DÙNG ĐỂ ĐÁNH DẤU 1 CLASS CÓ ĐIỀU ĐẶC BIỆT GÌ ĐÓ
//DÙNG ĐỂ RA HIỆU, BÁO HIỆU CHO JVM BIẾT
//LÀ JVM NÀY CÓ LÚC NÀO ĐÓ SẼ PHẢI CHẺ CÁI OBJECT
//BOOK NÀY THÀNH CÁC LUỒNG/DÃY/DÒNG CHẢY BIT/BYTE
//

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Serializable{
    private String isbn; // mã số cuốn sách
    private String tittle; // tựa đề cuốn sách
    private String author; //tác giả cuốn sách
    private int edition; //lần xuất bản
    private int publishedYear; //năm xuất bản
    
    
}

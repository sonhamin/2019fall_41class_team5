package com.example.arit;

import java.util.HashMap;
import java.util.Map;

public class ProductItem {
    private String title;       // 제목
    private String pname;       // 제품명
    private String uname;       // 작성자
    private String price;       // 가격
    private String how;         // 거래방식
    private String contact;     // 연락처
    private String detail;      // 상세정보
    private String category;    // 카테고리
    private String imagename; // 이미지
    private double length_size, height_size, width_size;

    public ProductItem(){}

    public ProductItem(String title, String pname, String uname, String price, String how, String contact, String detail, String category, String imagename, double length_size, double height_size, double width_size){
        this.title = title;
        this.pname = pname;
        this.uname = uname;
        this.price = price;
        this.how = how;
        this.contact = contact;
        this.detail = detail;
        this.category = category;
        this.imagename = imagename;
        this.length_size = length_size;
        this.height_size = height_size;
        this.width_size = width_size;
    }

    public String getTitle() {
        return title;
    }

    public String getPname() {
        return pname;
    }

    public String getUname() {
        return uname;
    }

    public String getPrice() {
        return price;
    }

    public String getHow() {
        return how;
    }

    public String getContact() {
        return contact;
    }

    public String getDetail() {
        return detail;
    }

    public String getCategory() {
        return category;
    }

    public String getImagename() {
        return imagename;
    }
    
    public double getLength_size() { return length_size; }

    public double getHeight_size() { return height_size; }

    public double getWidth_size(){ return width_size; }    

    public Map<String, Object> toMap(){
        HashMap<String, Object> res = new HashMap<>();
        res.put("title", title);
        res.put("pname", pname);
        res.put("uname", uname);
        res.put("price", price);
        res.put("how", how);
        res.put("contact", contact);
        res.put("detail", detail);
        res.put("category", category);
        res.put("imagename", imagename);
        res.put("length", length_size);
        res.put("height", height_size);
        res.put("width", width_size);        
        return res;
    }
}

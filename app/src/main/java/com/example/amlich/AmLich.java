package com.example.amlich;

public class AmLich {
    private String[] can = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
    private String[] chi = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mẹo", "Thìn", "Tỵ", "Nhọ", "Mùi"};
    private int namDL;
    public AmLich(int namDL){
        this.namDL = namDL;
    }
    public String getNamAL(){
        String can = this.can[namDL%10];
        String chi = this.chi[namDL%12];
        return can + " " +chi;
    }
}

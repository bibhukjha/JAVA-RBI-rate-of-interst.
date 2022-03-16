package com.harman.batch4;

public interface Rbi_roi {
    void setIntrestRate();

}

class SBI implements Rbi_roi{
    public void setIntrestRate(){
        System.out.println("7% rate of Intrest");
    }
}

class ICICI implements Rbi_roi{
    public void setIntrestRate(){
        System.out.println("7.5% rate of Intrest");
    }
}

class Person{
    public static void main(String[] args) {
        Rbi_roi ob_sbi=new SBI();
        Rbi_roi ob_icici=new ICICI();
        System.out.println("SBI bank: ");
        ob_sbi.setIntrestRate();
        ob_icici.setIntrestRate();
        System.out.println("ICICI Bank: ");
    }
}

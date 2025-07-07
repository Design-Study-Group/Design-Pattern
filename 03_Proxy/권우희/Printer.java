package proxy;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Printer implements Printable {
    private String name;

    //생성자
    public Printer() {
        heavyJob("Printer 인스턴스 생성 중");
    }

    //생성자
     public Printer(String name) {
        this.name = name;
        heavyJob("Printer 인스턴스(" + name + ")생성중");
    }

    @Override
    public void setPrinterName(String name) {
        //이름설정
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String String) {
        System.out.println("====" + name + "====");
        System.out.println(String);
    }

    //무거운 작업
    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(".");
        }
        System.out.println("완료");
    }
}

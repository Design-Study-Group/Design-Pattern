interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}

class Printer implements Printable{
    private String name;

    public Printer(){
        heavyJob("heavyJob");
    }

    public Printer(String name){
        this.name = name;
        heavyJob("heavyJob");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Job done.");
    }
}

class PrinterProxy implements Printable {
    private String name;
    private Printer realPrinter;

    public PrinterProxy() {
        this.name = "Default name";
        this.realPrinter = null;
    }

    public PrinterProxy(String name) {
        this.name = name;
        this.realPrinter = null;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (realPrinter != null) {
            realPrinter.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        realPrinter.print(string);
    }

    private synchronized void realize() {
        if (realPrinter == null) {
            realPrinter = new Printer(name);
        }
    }

    // 더블 체크드 락킹
    // private void realize() {
    // if (realPrinter == null) {
    //     synchronized (this) {
    //         if (realPrinter == null) {
    //             realPrinter = new Printer(name);
    //         }
    //     }
    // }
}

public class Main {
    public static void main(String[] args) {
        Printable printer = new PrinterProxy("PrinterLee");
        printer.print("Hello, World!");
        
        printer.setPrinterName("Printer2");
        printer.print("Hello, Proxy!");
    }
}

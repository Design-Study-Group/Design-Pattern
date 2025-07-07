package proxy;

public class PrinterProxy implements Printable{
    //이름
    private String name;

    //본인
    private Printer real;

    public PrinterProxy() {
        this.name = "No Name";
        this.real = null;
    }

    public PrinterProxy(String name) {
        this.name = name;
        this.real = null;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            //본인에게도 설정한다.
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String String) {
        realize();
        real.print(String);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}

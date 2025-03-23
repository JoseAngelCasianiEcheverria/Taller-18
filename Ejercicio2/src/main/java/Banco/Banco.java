
package Banco;


public class Banco implements OperacionBancaria, PagosFactura, Retiro, Transferencia{
     
    @Override
    public void transferencia(double monto) {
        System.out.println("Transfiriendo: " + monto);
    }

    @Override
    public void retiro(double monto) {
        System.out.println("Retirando: " + monto);
    }

    @Override
    public void pagosFactura(String factura, double monto) {
        System.out.println("Pagando la factura " + factura + ": por " + monto);
    }
}


package contenidoSerializado;

import java.io.Serializable;
import java.util.Arrays;

public class PagosVentas implements Serializable {
    Pagos[] pagos;
    Ventas[] ventas;
    private int contVentas;
    private int contPagos;

    public PagosVentas(Pagos[] pagos, Ventas[] ventas) {
        this.pagos = pagos;
        this.ventas = ventas;
    }

    public PagosVentas() {}

    public Pagos[] getPagos() {
        return pagos;
    }

    public Pagos getPago(int posicion) {
        return pagos[posicion];
    }

    public void setPagos(Pagos[] pagos) {
        this.pagos = pagos;
    }

    public Ventas[] getVentas() {
        return ventas;
    }

    public Ventas getVenta(int posicion) {
        return ventas[posicion];
    }

    public void setVentas(Ventas[] ventas) {
        this.ventas = ventas;
    }

    public int getContVentas() {
        return contVentas;
    }

    public void setContVentas(int contVentas) {
        this.contVentas = contVentas;
    }

    public int getContPagos() {
        return contPagos;
    }

    public void setContPagos(int contPagos) {
        this.contPagos = contPagos;
    }

    public void nuevoPago(int posicion, Pagos pago){
        this.pagos[posicion]=pago;
    }
    public void nuevoVentas(int posicion,Ventas venta){
        this.ventas[posicion]=venta;
    }

    @Override
    public String toString() {
        return "PagosVentas{" +
                "pagos=" + Arrays.toString(pagos) +
                ", ventas=" + Arrays.toString(ventas) +
                '}';
    }
}

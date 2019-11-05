/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

/**
 *
 * @author sdist
 */
public class Prod 
{
   String codigo;
   String descripcion;
   String precioUnitario;
   
   Prod( String unCodigo, String unaDescripcion, String unPU)
   {
       this.codigo         = unCodigo;
       this.descripcion    = unaDescripcion;
       this.precioUnitario = unPU;
   }
   
   @Override
   public String toString()
   {
       StringBuffer sb = new StringBuffer("Producto: ").append(codigo).append(", ").append(descripcion).append(", PU:").append(precioUnitario);
       return new String(sb);
   }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }
}

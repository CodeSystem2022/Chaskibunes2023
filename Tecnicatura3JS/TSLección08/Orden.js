class Orden extends Producto {

    constructor(idOrden) {
        super(); // Llama al constructor de la clase padre (Producto)
        this.idOrden = idOrden;
        this.productos = [];
        this.contadorProductosAgregados = 0;
    }

    agregarProducto(producto) {
        if (this.contadorProductosAgregados < Orden.MAX_PRODUCTOS) {
            this.productos.push(producto);
        this.contadorProductosAgregados++;
        } else {
            console.log("Se ha alcanzado el límite máximo de productos en la orden.");
        }
    }

    calcularTotal() {
        let total = 0;
        for (let producto of this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    mostrarOrden() {
        console.log(`Orden # ${this.idOrden}`);
        console.log("Productos:");
        for (let producto of this.productos) {
            console.log(producto.toString());
        }
        console.log(`Total: $${this.calcularTotal()}`);
    }
}

Orden.MAX_PRODUCTOS = 5;

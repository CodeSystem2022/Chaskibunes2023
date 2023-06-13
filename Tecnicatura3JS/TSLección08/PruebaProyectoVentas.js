// Definición del objeto Producto
class Producto {
    constructor(idProducto, nombre, precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    getIdProducto() {
        return this.idProducto;
    }

    getNombre() {
        return this.nombre;
    }

    setNombre(nombre) {
        this.nombre = nombre;
    }

    getPrecio() {
        return this.precio;
    }

    setPrecio(precio) {
        this.precio = precio;
    }

    toString() {
        return `${this.nombre} - $${this.precio}`;
    }
}

// Definición del objeto Orden
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

// Propiedades estáticas de la clase Orden
Orden.MAX_PRODUCTOS = 5;


const producto1 = new Producto(1, 'Fanta', 600);
const producto2 = new Producto(2, 'Mouse', 5000);

const orden = new Orden(1);
console.log(orden.agregarProducto(producto1));
console.log(orden.agregarProducto(producto2));
console.log(orden.mostrarOrden());


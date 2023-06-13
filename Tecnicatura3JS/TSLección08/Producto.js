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
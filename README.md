"# Proyecto Tienda POO con interfaces" 
# 🛒 Proyecto Tienda POO con Interfaces y Herencia

Este proyecto simula el funcionamiento básico de una tienda, implementado en Java siguiendo el paradigma de Programación Orientada a Objetos (POO).  
Incluye clases abstractas, herencia, interfaces y manejo de listas dinámicas (`ArrayList`).

## 🚀 Descripción

El programa permite:
- Ver el inventario de productos disponibles en la tienda.
- Realizar la compra de productos, actualizando el stock y el saldo del comprador.
- Tramitar devoluciones de productos, añadiendo nuevamente al inventario y devolviendo el dinero al comprador.
- Ver un resumen final del estado de la tienda, ingresos, y datos de comprador y dependiente.

Todo se gestiona mediante un menú interactivo desde la consola.

## 🧩 Tecnologías utilizadas

- Java 17+
- IntelliJ IDEA (desarrollo)
- Git y GitHub para control de versiones

## 📂 Estructura del proyecto

- `Producto.java` → Clase abstracta para los productos.
- `ProductoConcreto.java` → Clase concreta de producto.
- `Tienda.java` → Gestión del inventario y ventas.
- `Persona.java` → Clase abstracta base para personas.
- `Dependiente.java` → Gestiona las devoluciones.
- `Comprador.java` → Gestiona las compras.
- `Comerciar.java` → Interfaz que define las transacciones.
- `Main.java` → Contiene el menú principal del programa.

## ⚙️ Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/Tienda-POO-Interfaces.git

from Excepciones.Leccion03.catalogo_peliculas.pelicula import Pelicula

opcion = None
while opcion != 4:
    try:
        print('Opciones: ')
        print('1. Agregar pelicula')
        print('2. Listar las peliculas')
        print('3. Eliminar catálogos de peliculas')
        print('4. Salir')
        opcion = int(int('Digite una opción de menú (1-4): '))
        if opcion == 1:
            nombre_pelicula = input('Digite el nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()
    except Exception as e:
        print(f'Ocurrio un error de tipo: {e}')
        opcion = None
    else:
        print('Salimos del programa')
        
        

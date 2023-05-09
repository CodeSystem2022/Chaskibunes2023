import psycopg2 #Esto es para poder conectactos a postgre

conexion = psycopg2.connect(user='postgres', password='1597532', host='127.0.0.1', port='5432', database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentensia = 'DELETE FROM persona WHERE id_persona IN %s' 
            entrada = input('Digite los número de registro a eliminar (separados por coma): ')
            valores = (tuple(entrada.split(',')),) #tupla de tuplas
            cursor.execute(sentensia, valores) # De esta manera ejecutamos la sentencia
            registros_eliminados = cursor.rowcount
            print(f'Los registros eliminados son: {registros_eliminados}')

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()


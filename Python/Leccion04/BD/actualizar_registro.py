import psycopg2 #Esto es para poder conectactos a postgre

conexion = psycopg2.connect(user='postgres', password='1597532', host='127.0.0.1', port='5432', database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentensia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s' 
            valores = ('Juan Carlos', 'Roldan', 'rcarlos@mail.com', 1) # Es una tupla
            cursor.execute(sentensia, valores) # De esta manera ejecutamos la sentencia
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()


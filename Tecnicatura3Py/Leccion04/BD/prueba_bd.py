import psycopg2 #Esto es para poder conectactos a postgre

conexion = psycopg2.connect(user='postgres', password='1597532', host='127.0.0.1', port='5432', database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentensia = 'SELECT * FROM persona WHERE id_persona = %s' # Placeholder
            id_persona = input('Digite un número para el id_persona: ')
            cursor.execute(sentensia, (id_persona,)) # De esta manera ejecutamos la sentencia
            registros = cursor.fetchone() # Recuperamos todos los registros que serán una lista
            print(registros)

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()

#https://www.psycopg.org/docs/usage.html
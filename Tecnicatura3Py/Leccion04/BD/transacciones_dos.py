import psycopg2 #Esto es para poder conectactos a postgre

conexion = psycopg2.connect(user='postgres', password='1597532', host='127.0.0.1', port='5432', database='test_bd')
try:
    conexion.autocommit = False #esto directamente no deberia estar, inicia la transacción 
    cursor = conexion.cursor();
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'    
    valores = ('Jorge', 'Prol', 'jprol@gmail.com')
    cursor.execute(sentencia, valores)

    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Juan Carlos', 'Perez', 'jcperez@gmail.com')
    cursor.execute(sentencia, valores)


    conexion.commit() #Hacemos el commit manualmente, se cierra la transacción
    print('Termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()


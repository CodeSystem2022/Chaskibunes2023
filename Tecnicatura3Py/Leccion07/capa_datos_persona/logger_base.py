import logging as logi

#doc.python.org/3/howto/loggin.html
# Llamamos una configuración básica

logi.basicConfig(level=logi.DEBUG,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                datefmt='%I:%M:%S %p',
                handlers=[
                    logi.FileHandler('capa_datos.log'),
                    logi.StreamHandler()
                ])
if __name__ == '__main__' :
    logi.debug('Mensaje a nivel debug')                 
    logi.info('Mensaje a nivel info')           
    logi.warning('Mensaje a nivel error')           
    logi.error('Mensaje a nivel error')             
    logi.critical('Mensaje a nivel critical')           

#language:es
Característica: Iniciar Sesion

  Escenario: Inicio de sesion exitoso
    Dado que David ingresa a la pagina Home de NewTours
    Cuando ingresa las siguientes credenciales
      | dagan01 | dag1996 |
    Entonces valida que aparezca el boton SING-OFF

Escenario: Inicio de sesion exitoso segundo
    Dado que David ingresa a la pagina Home de NewTours
    Cuando ingresa las siguientes credenciales
      | dagan01 | dag1996 |
    Entonces valida que aparezca el boton SING-OFF

 # Esquema del escenario: Inicios de sesion fallidos
  #  Dado que David ingresa a la pagina Home de NewTours
  #  Cuando ingresa las siguientes credenciales
  #    | <usuario> | <clave> |
 #   Entonces valida que aparezca el boton SING-ON

#    Ejemplos: 
 #     | usuario | clave  |
#      | dagan01 | asdada |

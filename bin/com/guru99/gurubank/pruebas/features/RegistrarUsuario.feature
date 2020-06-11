#language:es
Característica: Registrar Usuario

  Escenario: Registro de usuario exitoso
    Dado que David ingresa a la pagina Home de NewTours
    Y ingresa al formulario de Register
    Cuando ingresa la siguiente informacion del usuario nuevo:
      | Santana | Rodriguez |santana|clave|clave|
    Entonces valida que aparezca un mensaje de bienvenida
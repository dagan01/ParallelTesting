#language:es
Característica: Inicio de sesion

  Esquema del escenario: Inicios de sesion fallidos
    Dado que estoy en la pagina de inicio de GuruBank
    Cuando ingreso mis credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces valido la presencia de una alerta

    Ejemplos: 
      | Usuario         | Clave         |
      | mngr255781      | claveInvalida |
      | usuarioInvalido | YjuvAjU       |
      | usuarioInvalido | claveInvalida |

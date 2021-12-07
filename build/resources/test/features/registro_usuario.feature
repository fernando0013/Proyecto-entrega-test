#Autor: Luis fernando
  @stories
  Feature: Registro de usuario en la plataforma Utest
    @scenario1
    Scenario: Registro de Luis en la pagina de Utest
      Given Luis desea registrarse en la plataforma Utest

      When El usuario ingresa los datos requeridos por el sistema Utest
        | strNombre | strApellido | strEmail                      | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strZip | strPais   | strDispositivoMovil | strModeloMovil | strSistemaOperativoMovil | strClave     |
        | fernando  | nustes      | luisfernando0961013@gmail.com | October          |13                | 1996             | Bogota    | 250000 | Colombia  | Apple               | iPhone 5S      | iOS 11.0                 | LuisL@129870 |

      Then El registro se completa al ver el boton de complete Setup
        | strTextoFinal  |
        | Complete Setup |
package com.api.client.util.response;

import org.springframework.http.HttpStatus;

public class ConstUtil {

  /**
   *
   * CODIGOS DE RESPUESTA
   */
  public static final int CODE_OK = HttpStatus.OK.value();
  public static final int CODE_ERROR = HttpStatus.CONFLICT.value();
  public static final int CODE_NOT_FOUND = HttpStatus.NOT_FOUND.value();
  public static final int CODE_INTERNAL_ERROR = HttpStatus.INTERNAL_SERVER_ERROR.value();

  /**
   *
   * CODIGOS DE RESPUESTA USUARIO
   */
  public static final String USUARIO_CODE_OK = "200-U";
  public static final String USUARIO_CODE_ERROR = "400-U";
  public static final String EMAIL_NOT_FOUND = "400-E";
  public static final String USUARIO_NOT_FOUND = "404-U";

  /**
   * MSG - GENERALES
   */
  public static final String MSG_EXITO = "Operación Exitosa.";
  public static final String MSG_FALLIDO = "Operación fallida.";

  /**
   * MSG - USUARIO
   */
  public static final String MSG_USUARIO_NO_ENCONTRADO = "Usuario o Contraseña no valida";
  public static final String MSG_USUARIO_ENCONTRADO = "Verificación Exitosa";
  public static final String MSG_EMAIL_NO_ENCONTRADO = "Usuario no encontrado";
  public static final String MSG_CONTRASENA_ACTUALIZADA = "Contraseña actualizada con exito";
  public static final String MSG_CONTRASENA_EXISTENTE = "Esta contraseña ya existe en el sistema";
  public static final String MSG_CORREO_ENVIADO = "Correo enviado con exito";

  public static final String ESTUDIANTE_CODE = "EST01";

  /**
   * MSG - CODE EMAIL TEMPLATE
   */
  public static final String TEMPLATE_RECUPERAR_CONTRASENA_CODIGO = "2";

  /**
   * MSG - ESTADOS
   */
  public static final String ESTADO_ACTIVO = "ACTIVO";
  public static final String ESTADO_INACTIVO = "INACTIVO";

  /**
   * MSG - ROL PROCESO
   */
  public static final String PROCESO_GENERAR_USUARIO_ESTUDIANTE = "GENERAR_USUARIO_ESTUDIANTE";

  /**
   * MSG - MENU_ACCION
   */
  public static final String MSG_NO_MENU_PRESENT = "No se presenta menú dentro de la asociación";

  /**
   * CLAIMS
   */
  public static final String CLAIMS_USUARIO_ROL = "USUARIO_ROL";
  public static final String CLAIMS_SEDES = "SEDES";

}

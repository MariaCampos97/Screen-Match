package com.aluracursos.screenmatch.excepción;

public class ErrorEnConversionDeDuracionExcepcion extends Throwable {
    private String mensaje;

    public ErrorEnConversionDeDuracionExcepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}

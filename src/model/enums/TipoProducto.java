package model.enums;

public enum TipoProducto {


    PERECEDERO(0), REFRIGERADO(1), ENVASADO(2);

    int identificador;

    TipoProducto(int identificador) {
        this.identificador = identificador;
    }
}

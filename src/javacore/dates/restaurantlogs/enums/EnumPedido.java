package javacore.dates.restaurantlogs.enums;

import javacore.dates.restaurantlogs.exceptions.InvalidPedidoException;

public enum EnumPedido {
    POLVO(1),
    MACARRONADA(2),
    FILE(3),
    COSTELA(4);

    private final int value;

    EnumPedido(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static EnumPedido fromValue(int value) {
        for (EnumPedido e : EnumPedido.values()) {
            if (e.getValue() == value) {
                return e;
            }
        }

        return null;
    }
}

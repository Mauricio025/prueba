package edu.jdc.parcialMauricioRivera.Interfaces;

import java.util.List;

public interface Operacion<T> {

    public List<T> consultar(String oden);

    public Boolean registrar(T objRegistrar);

    public Integer cantidaRegistros();
}

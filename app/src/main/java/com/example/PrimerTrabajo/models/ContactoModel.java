package com.example.PrimerTrabajo.models;

import java.io.Serializable;

public class ContactoModel implements Serializable {
    private int _id;
    private String _nombre;
    private String _mensaje;
    private String _estado;
    private boolean _activo;


    public ContactoModel(String _nombre, String _mensaje, String _estado) {
        this._nombre = _nombre;
        this._mensaje = _mensaje;
        this._estado = _estado;
    }


    public ContactoModel(int _id, String _nombre, String _mensaje, String _estado) {
        this._id = _id;
        this._nombre = _nombre;
        this._mensaje = _mensaje;
        this._estado = _estado;
    }

    public ContactoModel(int _id, String _nombre, String _mensaje, String _estado, boolean _activo) {
        this._id = _id;
        this._nombre = _nombre;
        this._mensaje = _mensaje;
        this._estado = _estado;
        this._activo = _activo;
    }
    public ContactoModel(String nombre, String estado) {
        this._nombre = _nombre;
        this._estado = _estado;

    }
    public ContactoModel() {
        this._activo = true;
    }

    @Override
    public String toString() {
        return "Nombre: " + _nombre + " - " + _mensaje + "\n" + "Estado: " + _estado;
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_mensaje() {
        return _mensaje;
    }

    public void set_mensaje(String _mensaje) {
        this._mensaje = _mensaje;
    }

    public String get_estado() {
        return _estado;
    }

    public void set_estado(String _estado) {
        this._estado = _estado;
    }

    public boolean is_activo() {
        return _activo;
    }

    public void set_activo(boolean _activo) {
        this._activo = _activo;
    }
}

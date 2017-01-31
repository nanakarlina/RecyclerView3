package model;

/**
 * Created by Iitutsa on 31/01/2017.
 */

import android.graphics.drawable.Drawable;

public class Hotel {
    public String judul, deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}

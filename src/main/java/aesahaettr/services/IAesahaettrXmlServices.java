package aesahaettr.services;

import aesahaettr.xml.bean.Aesahaettr;

public interface IAesahaettrXmlServices {

    Aesahaettr load();

    void save(Aesahaettr aesahaettr);

}

package aesahaettr.services.ref;

import java.util.Collection;

import aesahaettr.ui.bean.ref.PaysDto;

public interface IPaysServices {

    Collection<PaysDto> findAll();

    PaysDto getById(String id);

    void save(PaysDto paysDto);

}

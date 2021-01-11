package aesahaettr.services.ref.type;

import java.util.Collection;

public interface IRefTypeServices<DTO> {

    Collection<DTO> findAll();

    void save(DTO dto);

}

package aesahaettr.factories;

import java.util.UUID;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.EvenementDto;
import aesahaettr.xml.bean.Evenement;

@Component
public class EvenementsFactoryImpl implements IEvenementsFactory {

    @Override
    public Evenement mapDtoToNewBean(EvenementDto dto) {
        Evenement evenement = new Evenement();

        evenement.setDateDebut(dto.getDateDebut());
        evenement.setDateEvt(dto.getDateEvenement());
        evenement.setDateFin(dto.getDateFin());
        evenement.setDescription(dto.getDescription());
        evenement.setId(UUID.randomUUID().toString());
        evenement.setResume(dto.getResume());

        return evenement;
    }

    @Override
    public EvenementDto mapToDto(Evenement bean, String id) {
        EvenementDto dto = new EvenementDto();

        dto.setDateDebut(bean.getDateDebut());
        dto.setDateEvenement(bean.getDateEvt());
        dto.setDateFin(bean.getDateFin());
        dto.setDescription(bean.getDescription());
        dto.setElementId(id);
        dto.setId(bean.getId());
        dto.setResume(bean.getResume());

        return dto;
    }

    @Override
    public void updateBean(Evenement bean, EvenementDto dto) {
        bean.setDateDebut(dto.getDateDebut());
        bean.setDateEvt(dto.getDateEvenement());
        bean.setDateFin(dto.getDateFin());
        bean.setDescription(dto.getDescription());
        bean.setResume(dto.getResume());
    }

}

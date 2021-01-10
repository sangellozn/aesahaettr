package aesahaettr.factories;

public interface ISimpleDtoFactory<DTO, BEAN> {

    DTO mapToDto(BEAN bean);

    BEAN mapToBean(DTO bean);

}

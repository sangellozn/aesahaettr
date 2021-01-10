package aesahaettr.factories;

public interface ISimpleDtoFactory<DTO, BEAN> {

    DTO map(BEAN bean);

}

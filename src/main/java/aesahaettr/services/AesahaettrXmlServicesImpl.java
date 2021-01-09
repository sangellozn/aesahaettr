package aesahaettr.services;

import java.io.File;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import aesahaettr.xml.bean.Aesahaettr;

public class AesahaettrXmlServicesImpl implements IAesahaettrXmlServices {

    @Override
    public Aesahaettr load() {
        try {
            InitialContext context = new InitialContext();
            Context xmlNode = (Context) context.lookup("java:comp/env");
            String dataFilePath = (String) xmlNode.lookup("data-file");

            JAXBContext jaxbContext = JAXBContext.newInstance(Aesahaettr.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (Aesahaettr) jaxbUnmarshaller.unmarshal(new File(dataFilePath));
        } catch (NamingException | JAXBException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void save(Aesahaettr aesahaettr) {
        try {
            InitialContext context = new InitialContext();
            Context xmlNode = (Context) context.lookup("java:comp/env");
            String dataFilePath = (String) xmlNode.lookup("data-file");

            JAXBContext jaxbContext = JAXBContext.newInstance(Aesahaettr.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.marshal(aesahaettr, new File(dataFilePath));
        } catch (NamingException | JAXBException e) {
            throw new RuntimeException(e);
        }

    }

}
